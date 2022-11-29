package com.empresa.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
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
import com.empresa.entity.lcocied;
import com.empresa.entity.lcociedPk;
import com.empresa.service.lcociedService;

@RestController
@RequestMapping("/rest/lcocied")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcociedController {
	@Autowired
	private lcociedService lcociedServ;

	@GetMapping("/listarlcocied/listDetXCab/{p_ciacont}/{dl_asien}")
	public ResponseEntity<List<Map<String,Object[]>>> listByDetAndCab(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("dl_asien") String dl_asien) throws Exception {
		// Map<String, Object[]> response = new HashMap<>();
		lcociedPk pk = new lcociedPk();
		lcocied objSalida = new lcocied();

		// List<Object[]> lista;
		try {
			pk.setDl_asien(dl_asien);
			pk.setDl_secue("g");
			objSalida.setPk(pk);
			objSalida.setDl_usrcrea("scc");
			objSalida.setDl_feccrea(LocalDate.now());
			objSalida.setDl_hracrea(LocalTime.now());
			objSalida.setDl_usract("a");
			objSalida.setDl_fecact(LocalDate.now());
			objSalida.setDl_hraact(LocalTime.now());

			List<Map<String,Object[]>> lista = lcociedServ.listByDetAndCab(4, p_ciacont, objSalida);
			return ResponseEntity.ok(lista);

		} catch (Exception e) {
			throw new Exception("Error HUR1003_F  + " + e.getMessage());
		}

	}

//=============================================================================================================================

	@GetMapping("/listarlcocied/{p_ciacont}/{dl_asien}/{dl_secue}")
	public ResponseEntity<List<lcocied>> ListaDetalle(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("dl_asien") String dl_asien, @PathVariable("dl_secue") String dl_secue) throws Exception {
		// Map<String, Object[]> response = new HashMap<>();
		lcociedPk pk = new lcociedPk();
		lcocied objSalida = new lcocied();

		List<lcocied> lista;
		try {
			pk.setDl_asien(dl_asien);
			pk.setDl_secue(dl_secue);
			objSalida.setPk(pk);
			objSalida.setDl_tipope("g");
			objSalida.setDl_ctasal("2");
			objSalida.setDl_ctatra("2");

			objSalida.setDl_usrcrea("scc");
			objSalida.setDl_feccrea(LocalDate.now());
			objSalida.setDl_hracrea(LocalTime.now());
			objSalida.setDl_usract("a");
			objSalida.setDl_fecact(LocalDate.now());
			objSalida.setDl_hraact(LocalTime.now());
			lista = lcociedServ.listaByDetalle(0, p_ciacont, objSalida);
			;

		} catch (Exception e) {
			throw new Exception("Error HUR1003_F  + " + e.getMessage());
		}
		return ResponseEntity.ok(lista);

	}

	@PostMapping("/registralcocied/{p_ciacont}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> registraDetalle(@PathVariable("p_ciacont") String p_ciacont,
			@RequestBody lcocied obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
			obj.setDl_feccrea(LocalDate.now());
			obj.setDl_hracrea(LocalTime.now());
			obj.setDl_fecact(LocalDate.now());
			obj.setDl_hraact(LocalTime.now());
			lcociedServ.agregarRegistro(1, p_ciacont, obj);
			salida.put("mensaje", "Registrado correctamente");

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR100_B " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@PutMapping("/actulcocied/{p_ciacont}")
	public ResponseEntity<Map<String, Object>> actualizarRegistro(@PathVariable("p_ciacont") String p_ciacont,
			@RequestBody lcocied obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			
			obj.setDl_feccrea(LocalDate.now());
			obj.setDl_hracrea(LocalTime.now());
			obj.setDl_fecact(LocalDate.now());
			obj.setDl_hraact(LocalTime.now());
			lcociedServ.editarRegistro(2, p_ciacont, obj);
			salida.put("mensaje", "Actualizado correctamente");

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1009_B " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@DeleteMapping("elimRegistro/{p_ciacont}/{dl_asien}/{dl_secue}")
	public ResponseEntity<?> eliminarRegistro(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("dl_asien") String dl_asien, @PathVariable("dl_secue") String dl_secue) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> response = new HashMap<>();

		lcociedPk pk = new lcociedPk();
		lcocied objSalida = new lcocied();
		objSalida.setPk(pk);
		pk.setDl_asien(dl_asien);
		pk.setDl_secue(dl_secue);
		List<lcocied> lista = lcociedServ.listaByDetalle(0, p_ciacont, objSalida);
		
		if(lista.size()==1) {
			
		try {

			lcociedServ.eliminarRegistro(3, p_ciacont, objSalida);
			response.put("mensaje", "Eliminado correctamente");

		} catch (DataAccessException e) {
			response.put("Mensaje", "Ocurrio un error al eliminar con id: ".concat(dl_asien).concat(dl_secue));
			response.put("mensaje", "Error HUR1009_B " + e.getMostSpecificCause().getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}else {
			response.put("mensaje", "no existe el id");
		}
		return  ResponseEntity.ok(response);
		}
	
	
		
}
