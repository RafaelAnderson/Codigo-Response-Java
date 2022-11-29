package com.empresa.controller;

import java.time.LocalDate;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.lcoRefv21;
import com.empresa.entity.lcoRefv21Pk;
import com.empresa.service.lcoRefv21Service;

@RestController
@RequestMapping("/rest/lcorefv")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcoRefv21Controller {

	@Autowired
	private lcoRefv21Service lcorefv21Service;

	@GetMapping(value={"/swListarDetaDocRef/{cia}/{anio}/{subdiario}/{asiento}"})
	public ResponseEntity<List<Map<String, Object>>> listar(@PathVariable("cia") String cia ,
												  @PathVariable("anio") String anio,
												  @PathVariable("subdiario") String subdiario,
												  @PathVariable("asiento") String asiento) throws Exception {

		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		lcoRefv21Pk pk = new lcoRefv21Pk(subdiario, asiento, "0");
		lcoRefv21 objSalida = new lcoRefv21(pk, "", "", "", "", "", "", LocalDate.now(), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
		
		List<Map<String, Object>> lista;
		try {
			System.out.println(objSalida.toString());
			 lista = lcorefv21Service.listDetaDocRef(cia, anio, objSalida);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1003_F  + " + e.getMessage());
		}

	}

	@PostMapping(value={"/swCreaDetaRef/{cia}/{anio}"})
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> registraDetaDocRef(@PathVariable("cia") String p_ciacont,
															 @PathVariable("anio") String anio,
															 @RequestBody lcoRefv21 obj) {
			Map<String, Object> salida = new HashMap<>();
			// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
			lcoRefv21Pk pk = new lcoRefv21Pk(obj.getLcoRefv21pk().getrf_subdia(), 
											 obj.getLcoRefv21pk().getrf_compro(),
											 obj.getLcoRefv21pk().getrf_secue());
			lcoRefv21 objSalida = new lcoRefv21(pk, "", "", "", "", "", "", LocalDate.now(), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
			try {
				List<Map<String, Object>> lista = lcorefv21Service.listDetaDocRef(p_ciacont, anio,objSalida);
				if(lista.size() == 1){
					salida.put("mensaje", "El registro ya existe");
				}else{
					lcorefv21Service.registrarDetaRef(p_ciacont, anio, obj);
					salida.put("mensaje", "Registrado correctamente");
				}
					
			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", "Error HUR1022B "+e.getMessage());
			}
			return ResponseEntity.ok(salida);

	}

	@DeleteMapping(value = {"/swEliminarDetRef/{cia}/{anio}/{subdiario}/{asiento}/{tipo_docr}/{ser_doc}/{num_doc}"})
	public ResponseEntity<Map<String,Object>> eliminarDetRef(@PathVariable("cia") String cia,
															 @PathVariable("anio") String anio,
															 @PathVariable("subdiario") String subdiario,
															 @PathVariable("asiento") String asiento,
															 @PathVariable("tipo_docr") String tipo_docr,
															 @PathVariable("ser_doc") String ser_doc,
															 @PathVariable("num_doc") String num_doc){
			Map<String, Object> salida = new HashMap<>();
			lcoRefv21Pk pk = new lcoRefv21Pk(subdiario, 
											 asiento,
											 "");
			lcoRefv21 objSalida = new lcoRefv21(pk, "", "", "", "", "", "", LocalDate.now(), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
			objSalida.setRf_tipdocr(tipo_docr);
			objSalida.setRf_serdoc(ser_doc);
			objSalida.setRf_numdoc(num_doc);

			try {
				List<Map<String, Object>> lista = lcorefv21Service.listDetaDocRef(cia, anio,objSalida);
				if(lista.size() == 1){
					lcorefv21Service.eliminarDetaRef(cia, anio, objSalida);
					salida.put("mensaje", "Eliminado correctamente");
				}else{
					salida.put("mensaje", "No se encontro el registro");
				}
				
			} catch (Exception e) {
				salida.put("mensaje", "Error HUS2022B"+e.getMessage());
			}
			return ResponseEntity.ok(salida);														
	}

	@DeleteMapping(value = {"/swLimpiarDetRef/{cia}/{anio}/{subdiario}/{asiento}"})
	public ResponseEntity<Map<String,Object>> limpiarDetRef(@PathVariable("cia") String cia,
															 @PathVariable("anio") String anio,
															 @PathVariable("subdiario") String subdiario,
															 @PathVariable("asiento") String asiento){
			Map<String, Object> salida = new HashMap<>();
			lcoRefv21Pk pk = new lcoRefv21Pk(subdiario, 
											 asiento,
											 "");
			lcoRefv21 objSalida = new lcoRefv21(pk, "", "", "", "", "", "", LocalDate.now(), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);

			try {
				List<Map<String, Object>> lista = lcorefv21Service.listDetaDocRef(cia, anio,objSalida);
				if(lista.size() == 1){
					lcorefv21Service.limpiarDetaRef(cia, anio, objSalida);
					salida.put("mensaje", "Eliminado correctamente");
				}else{
					salida.put("mensaje", "No se encontro el registro");
				}
				
			} catch (Exception e) {
				salida.put("mensaje", "Error HUS2022B"+e.getMessage());
			}
			return ResponseEntity.ok(salida);														
	}

	@DeleteMapping(value = {"/limpiarReferenciaByDetalle/{cia}/{anio}/{subdiario}/{asiento}/{secue}"})
	public ResponseEntity<Map<String,Object>> limpiarReferenciaByDetalle(@PathVariable("cia") String cia,
															 @PathVariable("anio") String anio,
															 @PathVariable("subdiario") String subdiario,
															 @PathVariable("asiento") String asiento,
															 @PathVariable("secue") String secue){
			Map<String, Object> salida = new HashMap<>();
			lcoRefv21Pk pk = new lcoRefv21Pk(subdiario, 
											 asiento,
											 secue);
			lcoRefv21 objSalida = new lcoRefv21(pk, "", "", "", "", "", "", LocalDate.now(), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);

			try {
				List<Map<String, Object>> lista = lcorefv21Service.listDetaDocRef(cia, anio,objSalida);
				if(lista.size() == 1){
					lcorefv21Service.eliminarDetaRef(cia, anio, objSalida);
					salida.put("mensaje", "Eliminado correctamente");
				}else{
					salida.put("mensaje", "No se encontro el registro");
				}
				
			} catch (Exception e) {
				salida.put("mensaje", "Error HUS2022B"+e.getMessage());
			}
			return ResponseEntity.ok(salida);														
	}


}
