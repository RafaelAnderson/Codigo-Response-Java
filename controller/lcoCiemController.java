package com.empresa.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.lcoCiem;
import com.empresa.entity.lcoCiemPk;
import com.empresa.service.lcoCiemService;

@RestController
@RequestMapping("/rest/lcoCiem")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcoCiemController {
	
	@Autowired
	private lcoCiemService service;
	
	@GetMapping(value={"/listarCiem/{p_ciacont}/{ejer}/{periodo}/{subdiario}","/listarCiem/{p_ciacont}/{ejer}/{periodo}/"})
	public ResponseEntity<List<lcoCiem>>ListaCiem(@PathVariable("p_ciacont") String p_ciacont,
	@PathVariable("ejer") String ejer,@PathVariable("periodo") String periodo,
	@PathVariable(value="subdiario",required = false) String subdiario
	
			) throws Exception{
		//Map<String, Object[]> response = new HashMap<>();
		lcoCiemPk pk = new lcoCiemPk();
		lcoCiem objSalida = new lcoCiem();
	
		List<lcoCiem> lista;
		
		try {
			if(subdiario==null) {
				subdiario="";
			}
			pk.setCm_periodo(periodo);
			pk.setCm_subdia(subdiario);
			objSalida.setPk(pk);	
			objSalida.setCm_fcierre("a");
			
			
			objSalida.setCm_usrcrea("scc");	
			objSalida.setCm_feccrea(LocalDate.now());
			objSalida.setCm_hracrea(LocalTime.now());
			objSalida.setCm_usract("a");
			objSalida.setCm_fecact(LocalDate.now());
			objSalida.setCm_hraact(LocalTime.now());
			lista=service.listar(0, p_ciacont,ejer,objSalida);;
			
			
		} catch (Exception e) {
			throw new Exception("Error HUR1030_B  + " + e.getMessage());
		}
		return ResponseEntity.ok(lista);
		
	}
	
	@GetMapping(value={"/listarCiemGrilla/{p_ciacont}/{ejer}/{periodo}"})
	public ResponseEntity<List<Object>>ListaCiemGrilla(@PathVariable("p_ciacont") String p_ciacont,
	@PathVariable("ejer") String ejer,@PathVariable("periodo") String periodo
	) throws Exception{
		//Map<String, Object[]> response = new HashMap<>();
		lcoCiemPk pk = new lcoCiemPk();
		lcoCiem objSalida = new lcoCiem();
	
		List<Object> lista;
		
		try {
			
			pk.setCm_periodo(periodo);
			pk.setCm_subdia("");
			objSalida.setPk(pk);	
			objSalida.setCm_fcierre("a");
			
			
			objSalida.setCm_usrcrea("scc");	
			objSalida.setCm_feccrea(LocalDate.now());
			objSalida.setCm_hracrea(LocalTime.now());
			objSalida.setCm_usract("a");
			objSalida.setCm_fecact(LocalDate.now());
			objSalida.setCm_hraact(LocalTime.now());
			lista=service.listarGrilla(4, p_ciacont,ejer,objSalida);;
			
			
		} catch (Exception e) {
			throw new Exception("Error HUR1030_B  + " + e.getMessage());
		}
		return ResponseEntity.ok(lista);
		
	}
	
	@PostMapping(value={"/regCiem/{p_ciacont}/{año}"})
	@ResponseBody
	public ResponseEntity<Map<String, Object>> registrar(@PathVariable("p_ciacont") String p_ciacont,
														@PathVariable(value="año") String año,
														@RequestBody lcoCiem obj) throws Exception{
		
		
		Map<String, Object> salida = new HashMap<>();
		List<lcoCiem> lista = service.listar(0, p_ciacont, año, obj);
		if(lista.size()!=1) {
			try {	
				obj.setCm_feccrea(LocalDate.now());
				obj.setCm_hracrea(LocalTime.now());
				obj.setCm_fecact(LocalDate.now());
				obj.setCm_hraact(LocalTime.now());	
				 service.transaccion(1, p_ciacont, año, obj);
				 salida.put("mensaje", "Registrado correctamente");
				 return ResponseEntity.ok(salida);	
			}
			catch(Exception e) {throw new Exception("Error HUR1030 + " + e.getMessage());}
		}else {
			salida.put("mensaje", "Registro ya existente");
			return ResponseEntity.ok(salida);	
		}
		
	}
	

	@PutMapping(value={"/actuCiem/{p_ciacont}/{año}"})
	@ResponseBody
	public ResponseEntity<Map<String, Object>> actualizar(@PathVariable("p_ciacont") String p_ciacont,
														@PathVariable(value="año",required = false) String año,
														@RequestBody lcoCiem obj) throws Exception{
		
		
		Map<String, Object> salida = new HashMap<>();
		List<lcoCiem> lista = service.listar(0, p_ciacont, año, obj);
		if(lista.size()==1) {
			try {	
				obj.setCm_feccrea(LocalDate.now());
				obj.setCm_hracrea(LocalTime.now());
				obj.setCm_fecact(LocalDate.now());
				obj.setCm_hraact(LocalTime.now());	
				 service.transaccion(2, p_ciacont, año, obj);
				 salida.put("mensaje", "Actualizado correctamente");
				 return ResponseEntity.ok(salida);	
			}
			catch(Exception e) {throw new Exception("Error HUR1030 + " + e.getMessage());}
		}else {
			salida.put("mensaje", "Registro no existe");
			return ResponseEntity.ok(salida);	
		}
		
	}
	
	@DeleteMapping(value={"/deleCiem/{p_ciacont}/{año}/{periodo}/{subdiario}"})
	@ResponseBody
	public ResponseEntity<Map<String, Object>> eliminar(@PathVariable("p_ciacont") String p_ciacont,
	@PathVariable(value="año",required = false) String año,@PathVariable(value="periodo") String periodo,
	@PathVariable(value = "subdiario") String subdiario ) throws Exception{
		
		
		Map<String, Object> salida = new HashMap<>();
		
		lcoCiemPk pk = new lcoCiemPk();
		pk.setCm_subdia(subdiario);
		pk.setCm_periodo(periodo);
		lcoCiem objSalida = new lcoCiem(pk, "a", "user", LocalDate.now(), LocalTime.now(), "user", LocalDate.now(), LocalTime.now());
		
	
		List<lcoCiem> lista = service.listar(0, p_ciacont, año, objSalida);
		
		
		if(lista.size()==1) {
			try {
				 service.transaccion(3, p_ciacont, año, objSalida);
				 salida.put("mensaje", "Eliminado correctamente");
				 return ResponseEntity.ok(salida);	
			}
			catch(Exception e) {throw new Exception("Error HUR1030 + " + e.getMessage());}
		}else {
			salida.put("mensaje", "Registro no existe");
			return ResponseEntity.ok(salida);	
		}
		
	}
	
	@DeleteMapping(value={"/elimiMesCiem/{p_ciacont}/{año}/{periodo}"})
	@ResponseBody
	public ResponseEntity<Map<String, Object>> eliminarCierreMes(@PathVariable("p_ciacont") String p_ciacont,
	@PathVariable(value="año",required = false) String año,@PathVariable(value="periodo") String periodo
	 ) throws Exception{
		
		
		Map<String, Object> salida = new HashMap<>();
		
		lcoCiemPk pk = new lcoCiemPk();
		pk.setCm_subdia("");
		pk.setCm_periodo(periodo);
		lcoCiem objSalida = new lcoCiem(pk, "a", "user", LocalDate.now(), LocalTime.now(), "user", LocalDate.now(), LocalTime.now());
		
	
		List<lcoCiem> lista = service.listar(0, p_ciacont, año, objSalida);
		
		
		if(lista.size()>=1) {
			try {
				
				
				
				 service.transaccion(5, p_ciacont, año, objSalida);
				 salida.put("mensaje", "Eliminado correctamente");
				 return ResponseEntity.ok(salida);	
			}
			catch(Exception e) {throw new Exception("Error HUR1030 + " + e.getMessage());}
		}else {
			salida.put("mensaje", "Registro no existe");
			return ResponseEntity.ok(salida);	
		}
		
	}


}
