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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.lcoUcia;
import com.empresa.entity.lcoUciaPk;
import com.empresa.service.confiUsuarioService;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/rest/confiUsuario")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })

public class confiUsuarioController {
	@Autowired
	private confiUsuarioService service;

	@GetMapping(value = "/swListarUsr")
	@ResponseBody
	public ResponseEntity<List<Map<String, Object[]>>> swListarUsr() throws Exception {
		List<Map<String, Object[]>> lista;
		try {
			lista = service.swListarUsr(0);
			System.out.println(lista.toString());
			return ResponseEntity.ok().body(lista);

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + " HUR1087" + e.getMessage());
		}
	}

	@GetMapping(value = "/swListUsrCia/{cod_usr}")
	@ResponseBody
	public ResponseEntity<List<Map<String, Object[]>>> swListUsrCia(
			@PathVariable("cod_usr") String cod_usr) throws Exception {

		lcoUciaPk pk = new lcoUciaPk();
		pk.setUl_codusr(cod_usr);
		pk.setUl_codcia("");
		List<Map<String, Object[]>> lista;

		try {
			lcoUcia objE = new lcoUcia(pk, "", LocalDate.now(), LocalTime.now(), "", LocalDate.now(), LocalTime.now());
			lista = service.swListUsrCia(0, objE);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + " HUR1087" + e.getMessage());
		}
	}

	// eliminar
	@DeleteMapping(value = "/swLimpiarUsrCia/{cod_usr}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> swLimpiarUsrCia(
			@PathVariable("cod_usr") String cod_usr) {
				
		Map<String, Object> response = new HashMap<>();
		lcoUciaPk pk = new lcoUciaPk();
		pk.setUl_codusr(cod_usr);
		pk.setUl_codcia("");
		lcoUcia objE = new lcoUcia(pk, "", LocalDate.now(), LocalTime.now(), "", LocalDate.now(), LocalTime.now());

		try {
			service.swLimpiarUsrCia(1, objE);
			response.put("mensaje", "Eliminado Correctamente");

		} catch (Exception e) {
			response.put("mensaje", "Ocurrio un error al eliminar con id ");
			response.put("mensaje", "Error HUR1087_B " + e.getMessage());
		}
		return ResponseEntity.ok(response);
	}

	// grabar
	@PostMapping(value = { "/swGrabarUsrCia" })
	@ResponseBody
	public ResponseEntity<Map<String, Object>> swGrabarUsrCia(
			@RequestBody lcoUcia objE) {
		Map<String, Object> salida = new HashMap<>();

		try {

			objE.setUl_feccrea(LocalDate.now());
			objE.setUl_hracrea(LocalTime.now());
			objE.setUl_fecact(LocalDate.now());
			objE.setUl_hraact(LocalTime.now());
			service.swGrabarUsrCia(2, objE);
			salida.put("mensaje", "Registrado correctamente");

		} catch (Exception e) {
			e.printStackTrace();
			/*
			 * String[] parts = e.getMessage().split(";");
			 * if (parts.length > 2) {
			 * salida.put("error", parts[2]);
			 * }
			 */
			salida.put("mensaje", "Error HUR1087_B " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
}