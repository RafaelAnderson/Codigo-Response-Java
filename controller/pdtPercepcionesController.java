package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.empresa.service.pdtPercepcionesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/SP_pdt_Percepciones")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
		"http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
		"http://192.168.1.213" })
public class pdtPercepcionesController {
	@Autowired
	private pdtPercepcionesService service;

	@GetMapping(value = { "/swCargaPercepciones/{basedatos}/{opcion}/{cia}/{ejercicio}/{Periodo}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object[]>>> swCargaPercepciones(
			@PathVariable("basedatos") String basedatos,
			@PathVariable("opcion") Integer opcion,
			@PathVariable("cia") String cia,
			@PathVariable("ejercicio") String ejercicio,
			@PathVariable("Periodo") String Periodo) throws Exception {
		List<Map<String, Object[]>> lista = new ArrayList<>();
		try {

			lista = service.swCargaPercepciones(basedatos, opcion, cia, ejercicio, Periodo);
			System.out.println(lista.toString());
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + " HUR1085_B_PDT_Percepciones" + e.getMessage());
		}
	}
}
