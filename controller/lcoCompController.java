package com.empresa.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.lcoComp;
import com.empresa.service.lcoCompService;

@RestController
@RequestMapping("/rest/lcocomp21")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcoCompController {

	@Autowired
	lcoCompService service;
	
	@GetMapping("/swValRegCmp/{cia}/{ejer}/{per}")
	@ResponseBody
	public ResponseEntity<List<Map<String,Object>>> swValRegCmp(@PathVariable("cia") String cia,
			@PathVariable("ejer") String ejer, @PathVariable("per") String per) throws Exception {
		
		List<Map<String,Object>> lista = new ArrayList<>();

		try {

			lista = service.swValRegCmp(cia, ejer, per,"1");

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}
	
	@GetMapping("/swRegCmpTbl/{cia}/{ejer}/{per}")
	@ResponseBody
	public ResponseEntity<List<Map<String,Object>>> swRegCmpTbl(@PathVariable("cia") String cia,
			@PathVariable("ejer") String ejer, @PathVariable("per") String per) throws Exception {
		
		List<Map<String,Object>> lista = new ArrayList<>();

		try {

			lista = service.swRegCmpTbl(cia, ejer, per,"2");

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}
	
	@GetMapping("/swRegCmpPLE/{cia}/{ejer}/{per}")
	@ResponseBody
	public ResponseEntity<List<Map<String,Object>>> swRegCmpPLE(@PathVariable("cia") String cia,
			@PathVariable("ejer") String ejer, @PathVariable("per") String per) throws Exception {
		
		List<Map<String,Object>> lista = new ArrayList<>();

		try {

			lista = service.swRegCmpPLE(cia, ejer, per,"3");

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}
	
	@GetMapping("/Listar_p/{cia}/{ejer}/{per}")
	@ResponseBody
	public ResponseEntity<List<Map<String,Object>>> Listar_p(@PathVariable("cia") String cia,
			@PathVariable("ejer") String ejer, @PathVariable("per") String per) throws Exception {
		
		List<Map<String,Object>> lista = new ArrayList<>();

		try {

			lista = service.Listar_p(cia, ejer, per,"4");

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}
	
	@GetMapping("/swLisRecCmp/{cia}/{ejer}/{per}")
	@ResponseBody
	public ResponseEntity<List<Map<String,Object>>> swLisRecCmp(@PathVariable("cia") String cia,
			@PathVariable("ejer") String ejer, @PathVariable("per") String per) throws Exception {
		
		List<Map<String,Object>> lista = new ArrayList<>();

		try {

			lista = service.swLisRecCmp(cia, ejer, per,"5");

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}
	
	@PostMapping("/swGrabaCompras/{cia}/{per}/{opcion}")
	public ResponseEntity<Map<String,Object>> swGrabaCompras(@PathVariable("cia") String cia,
	@PathVariable("per") String per,@PathVariable("opcion") String opcion,@RequestBody lcoComp obj) throws Exception {
		
		Map<String, Object> salida = new HashMap<>();
		try {
			service.swGrabaCompras(cia, per,opcion,obj);
			salida.put("mensaje", "Inserto Correctamente");
			return ResponseEntity.ok(salida);
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1048_F " + e.getMessage());
			return ResponseEntity.ok(salida);
		}
		

	}

	@GetMapping("/swValAsientoGenerados/{cia}/{ejer}/{per}")
	@ResponseBody
	public ResponseEntity<List<Map<String,Object>>> swValAsientoGenerados(@PathVariable("cia") String cia,
			@PathVariable("ejer") String ejer, @PathVariable("per") String per) throws Exception {
		
		List<Map<String,Object>> lista = new ArrayList<>();

		try {

			lista = service.swValRegCmp(cia, ejer, per,"6");

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}
}

	