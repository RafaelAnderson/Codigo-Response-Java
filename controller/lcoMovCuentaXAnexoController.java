package com.empresa.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.empresa.service.lcoMovCuentaXAnexoServiceImpl;

@RestController
@RequestMapping("/rest/lcoMovCuentaXAnexo")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
		"http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
		"http://192.168.1.213" })

public class lcoMovCuentaXAnexoController {

	@Autowired
	lcoMovCuentaXAnexoServiceImpl service;

	@GetMapping(value = {
			"/swListarDetCtaAnex/{cia}/{ejer}/{fecInicial}/{fecFinal}/{ctaInicial}/{ctaFinal}/{tipoAnexo}/{codAnexoInicial}/{codAnexoFinal}/{orden}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object[]>>> swListarDetCtaAnex(
			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "ejer") String ejer,
			@PathVariable(value = "fecInicial") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecInicial,
			@PathVariable(value = "fecFinal") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecFinal,
			@PathVariable(value = "ctaInicial") String ctaInicial,
			@PathVariable(value = "ctaFinal") String ctaFinal,
			@PathVariable(value = "tipoAnexo", required = false) String tipoAnexo,
			@PathVariable(value = "codAnexoInicial", required = false) String codAnexoInicial,
			@PathVariable(value = "codAnexoFinal", required = false) String codAnexoFinal,
			@PathVariable(value = "orden") String orden) throws Exception {
		// Map<String, Object[]> response = new HashMap<>();

		List<Map<String, Object[]>> lista;
		try {
			if (tipoAnexo == null) {
				tipoAnexo = "";
			}
			if (codAnexoInicial == null) {
				codAnexoInicial = "";
			}
			if (codAnexoFinal == null) {
				codAnexoFinal = "";
			}
			lista = service.swListarDetCtaAnex(1, cia, ejer, fecInicial, fecFinal, ctaInicial, ctaFinal, tipoAnexo,
					codAnexoInicial, codAnexoFinal, "1", "1");
		} catch (Exception e) {
			throw new Exception("Error HUR1069_B 1° + " + e.getMessage());
		}
		return ResponseEntity.ok(lista);
	}

	@GetMapping(value = {
			"/swListarResuCtaAnex/{cia}/{ejer}/{fecInicial}/{fecFinal}/{ctaInicial}/{ctaFinal}/{tipoAnexo}/{codAnexoInicial}/{codAnexoFinal}/{tipo}",
	})
	@ResponseBody
	public ResponseEntity<List<Map<String, Object[]>>> swListarResuCtaAnex(
			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "ejer") String ejer,
			@PathVariable(value = "fecInicial") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecInicial,
			@PathVariable(value = "fecFinal") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecFinal,
			@PathVariable(value = "ctaInicial") String ctaInicial,
			@PathVariable(value = "ctaFinal") String ctaFinal,
			@PathVariable(value = "tipoAnexo", required = false) String tipoAnexo,
			@PathVariable(value = "codAnexoInicial", required = false) String codAnexoInicial,
			@PathVariable(value = "codAnexoFinal", required = false) String codAnexoFinal,
			@PathVariable(value = "tipo") String tipo) throws Exception {
		// Map<String, Object[]> response = new HashMap<>();

		List<Map<String, Object[]>> lista;
		try {
			if (tipoAnexo == null || tipoAnexo == " ") {
				tipoAnexo = "";
			}
			if (codAnexoInicial == null || codAnexoInicial == " ") {
				codAnexoInicial = "";
			}
			if (codAnexoFinal == null || codAnexoFinal == " ") {
				codAnexoFinal = "";
			}
			lista = service.swListarResuCtaAnex(2, cia, ejer, fecInicial, fecFinal, ctaInicial, ctaFinal, tipoAnexo,
					codAnexoInicial, codAnexoFinal, "1", tipo);
		} catch (Exception e) {
			throw new Exception("Error HUR1069_B 2° + " + e.getMessage());
		}
		return ResponseEntity.ok(lista);
	}

	@GetMapping(value = {
			"/swListarDetCta/{cia}/{ejer}/{fecInicial}/{fecFinal}/{ctaInicial}/{ctaFinal}/{tipoAnexo}/{codAnexoInicial}/{codAnexoFinal}/{orden}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object[]>>> swListarDetCta(
			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "ejer") String ejer,
			@PathVariable(value = "fecInicial") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecInicial,
			@PathVariable(value = "fecFinal") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecFinal,
			@PathVariable(value = "ctaInicial") String ctaInicial,
			@PathVariable(value = "ctaFinal") String ctaFinal,
			@PathVariable(value = "tipoAnexo") String tipoAnexo,
			@PathVariable(value = "codAnexoInicial", required = false) String codAnexoInicial,
			@PathVariable(value = "codAnexoFinal", required = false) String codAnexoFinal,
			@PathVariable(value = "orden") String orden) throws Exception {
		// Map<String, Object[]> response = new HashMap<>();

		System.out.println(LocalDate.now());
		List<Map<String, Object[]>> lista;
		try {
			if (tipoAnexo == null) {
				tipoAnexo = "";
			}
			if (codAnexoInicial == null) {
				codAnexoInicial = "";
			}
			if (codAnexoFinal == null) {
				codAnexoFinal = "";
			}
			lista = service.swListarDetCta(3, cia, ejer, fecInicial, fecFinal, ctaInicial, ctaFinal, tipoAnexo,
					codAnexoInicial, codAnexoFinal, orden, "0");
		} catch (Exception e) {
			throw new Exception("Error HUR1069_B 3° + " + e.getMessage());
		}
		return ResponseEntity.ok(lista);
	}
}
