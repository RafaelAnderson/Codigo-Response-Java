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

import com.empresa.entity.lcoCias;
import com.empresa.service.lcoCiasService;

@RestController
@RequestMapping("/rest/lcoCias")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcoCiasController {

	@Autowired
	private lcoCiasService service;

	@GetMapping(value = { "/ListarCias", "/ListarCias/{cl_codcia}" })
	@ResponseBody
	public ResponseEntity<List<lcoCias>> listaCia(@PathVariable(value = "cl_codcia", required = false) String cl_codcia)
			throws Exception {

		if (cl_codcia == null) {
			cl_codcia = " ";
		}

		Map<String, Object> salida = new HashMap<>();
		lcoCias objSalida = new lcoCias(cl_codcia, "", "", "", "", "", "",
				"", "", "V", "", LocalDate.now(), LocalTime.now(), "",
				LocalDate.now(), LocalTime.now());
		// SETEAMOS LOS VALORES, ESTOS NO SERAN REQUERIDOS DESDE EL FRONT
		// SON REQUERIDOS PARA EL PROCEDURE

		try {
			List<lcoCias> lista = service.listarlcoCias(0, objSalida);

			if (lista.size() == 0) {
				salida.put("mensaje", "No se encontro codigo de compañia");

			} else
				salida.put("mensaje", "Consulta exitosa");
			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);

		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1095 + " + e.getMessage());
		}

	}

	@PostMapping("/registraCias")
	public ResponseEntity<Map<String, Object>> registraCia(@RequestBody lcoCias obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();

		// Buscamos si existe el registro primero
		List<lcoCias> lista = service.swBscCia(2, obj);

		if (lista.size() == 0) {

			try {
				// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
				obj.setCl_feccrea(LocalDate.now());
				obj.setCl_fecact(LocalDate.now());

				obj.setCl_hracrea(LocalTime.now());
				obj.setCl_hraact(LocalTime.now());

				service.registrar(3, obj);
				salida.put("mensaje", "Compañia registrada correctamente");
			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", "Error HUR1095 " + e.getMessage());
			}

		} else {
			salida.put("mensaje", "Registro ya existente");
		}
		return ResponseEntity.ok(salida);

	}

	@PutMapping("/actualizarCias")
	public ResponseEntity<Map<String, Object>> swActualizarCias(@RequestBody lcoCias obj) {

		Map<String, Object> salida = new HashMap<>();
		List<lcoCias> lista = service.swBscCia(2, obj);

		if (lista.size() != 0) {
			try {
				obj.setCl_feccrea(LocalDate.now());
				obj.setCl_fecact(LocalDate.now());
				obj.setCl_hracrea(LocalTime.now());
				obj.setCl_hraact(LocalTime.now());

				service.swActualizarCias(4, obj);
				salida.put("mensaje", "Compañia actualizada correctamente");
			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", "Error HUR1095 " + e.getMessage());
			}
		} else {
			salida.put("mensaje", "No se ha encontrado el registro");
		}
		return ResponseEntity.ok(salida);
	}

	@DeleteMapping("/EliminarCias/{cl_codcia}/{usu_act}")
	public ResponseEntity<Map<String, Object>> EliminarCia(
			@PathVariable(value = "cl_codcia") String cl_codcia,
			@PathVariable(value = "usu_act") String usu_act) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		lcoCias objSalida = new lcoCias(cl_codcia, "", "", "", "", "", "",
				"", "", "V", "", LocalDate.now(), LocalTime.now(), usu_act,
				LocalDate.now(), LocalTime.now());

		// Buscamos si existe el registro primero
		List<lcoCias> lista = service.listarlcoCias(0, objSalida);

		if (lista.size() != 1) {
			salida.put("mensaje", "Registro no se encuentra");

		} else {
			try {
				// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 3, QUE CREARA UN NUEVO REGISTRO
				// COMO SEGUNDO PARAMETRO LE PASAMOS EL objeto

				service.registrar(3, objSalida);
				salida.put("mensaje", "Eliminado correctamente");
			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", "Error HUR1095 " + e.getMessage());
			}

		}
		return ResponseEntity.ok(salida);
	}

	@GetMapping(value = { "/swBscCia", "/swBscCia/{cl_codcia}" })
	@ResponseBody
	public ResponseEntity<List<lcoCias>> swBscCia(@PathVariable(value = "cl_codcia", required = false) String cl_codcia)
			throws Exception {

		// if(cl_codcia==null) {cl_codcia=" ";}

		Map<String, Object> salida = new HashMap<>();

		lcoCias objSalida = new lcoCias(cl_codcia, "1", "1", "1", "1", "1", "1",
		"1", "1", "V", "1", LocalDate.now(), LocalTime.now(), "1",
		LocalDate.now(), LocalTime.now());

		try {
			List<lcoCias> lista = service.swBscCia(2, objSalida);

			if (lista.size() == 0) {
				salida.put("mensaje", "No se encontro codigo de compañia");

			} else
				salida.put("mensaje", "Consulta exitosa");
			return ResponseEntity.ok(lista);

		} catch (Exception e) {
			throw new Exception("Error HUR1095 + " + e.getMessage());
		}
	}

	@GetMapping("/creaTablasCias/{pCias}/{pCiaOrg}")
	public ResponseEntity<?> swCreaTablasCias(@PathVariable("pCias") String pCias, @PathVariable("pCiaOrg") String pCiaOrg) {
		Map<String, Object> salida = new HashMap<>();
		try {
			service.swCreaTablasCias(pCias,pCiaOrg);
			salida.put("mensaje", "Tabla de compañía agregada correctamente.");
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1085 " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@GetMapping("/creaTablasCiasEjer/{pCias}/{pEjer}/{pCiasOrg}/{pEjerO}")
	public ResponseEntity<?> swCreaTablasCiasEjer(@PathVariable("pCias") String pCias,
			@PathVariable("pEjer") String pEjer,@PathVariable("pCiasOrg") String pCiasOrg,@PathVariable("pEjerO") String pEjerO) {
		Map<String, Object> salida = new HashMap<>();
		try {
			service.swCreaTablasCiasEjer(pCias, pEjer,pCiasOrg,pEjerO);
			salida.put("mensaje", "Tabla ejercicio de compañía agregada correctamente.");
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1085 " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@GetMapping("/transferTablas/{pCiaOrig}/{pEjerOrig}/{pCiaDst}/{pEjerDst}/{pfCta}/{pfTbl}/{pfCmp}/{pfEst}/{pfAnx}/{pfCaj}/{pfCie}/{pfCst}")
	public ResponseEntity<?> swTransferTablas(@PathVariable("pCiaOrig") String pCiaOrig,
			@PathVariable("pEjerOrig") String pEjerOrig,
			@PathVariable("pCiaDst") String pCiaDst,
			@PathVariable("pEjerDst") String pEjerDst,
			@PathVariable("pfCta") String pfCta,
			@PathVariable("pfTbl") String pfTbl,
			@PathVariable("pfCmp") String pfCmp,
			@PathVariable("pfEst") String pfEst,
			@PathVariable("pfAnx") String pfAnx,
			@PathVariable("pfCaj") String pfCaj,
			@PathVariable("pfCie") String pfCie,
			@PathVariable("pfCst") String pfCst) {

		Map<String, Object> salida = new HashMap<>();

		try {
			service.swTransferTablas(pCiaOrig, pEjerOrig, pCiaDst, pEjerDst, pfCta, pfTbl, pfCmp, pfEst, pfAnx, pfCaj,
					pfCie, pfCst);
			salida.put("mensaje", "Tablas transferidas correctamente.");
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1085 " + e.getMessage());
		}

		return ResponseEntity.ok(salida);
	}
}
