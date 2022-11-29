package com.empresa.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.format.annotation.DateTimeFormat;
import com.empresa.entity.lcoCabV;
import com.empresa.service.LibroDiarioAdicionalesService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/rest/LibroDiarioAdicionales")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
		"http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
		"http://192.168.1.213" })
public class LibroDiarioAdicionalesController {

	@Autowired
	private LibroDiarioAdicionalesService service;

	@GetMapping(value = "/swListarOmi/{base}/{cia}/{ejercicio}/{Periodo}")
	@RequestBody
	public ResponseEntity<List<Map<String, Object[]>>> swListarOmi(
			@PathVariable("base") String base,
			@PathVariable("cia") String cia,
			@PathVariable("ejercicio") String ejercicio,
			@PathVariable("Periodo") String Periodo)
			throws Exception {

		List<Map<String, Object[]>> lista;
		lcoCabV objE = new lcoCabV();

		// lcoCabVPk pk = new lcoCabVPk();
		try {

			System.out.println(objE.toString());
			// objE.setPk(pk);
			lista = service.swListarOmi(base, 1, cia, ejercicio, Periodo, "", "", objE);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + " HUR1078_B – Libro Diario 5.1 - Adicionales" + e.getMessage());
		}
	}

	@PutMapping(value = "/swEliOmi/{base}/{cia}/{ejercicio}/{SD}/{Asiento}")

	@ResponseBody
	public ResponseEntity<Map<String, Object>> swEliOmi(

			@PathVariable("base") String base,

			@PathVariable("cia") String cia,

			@PathVariable("ejercicio") String ejercicio,

			@PathVariable("SD") String SD,

			@PathVariable("Asiento") String Asiento) {
		Map<String, Object> salida = new HashMap<>();
		lcoCabV objE = new lcoCabV();
		try {
			System.out.println(objE.toString());
			service.swEliOmi(base, 2, cia, ejercicio, "", SD, Asiento, objE);
			salida.put("mensaje", "Actualizado correctamente");
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1078_B – Libro Diario 5.1 - Adicionales " +
					e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@GetMapping(value = "/swCrearOmi/{base}/{cia}/{ejercicio}/{SD}/{Asiento}/{cl_fecret}/{cl_tipret}/{cl_perrea}/{cl_perpre}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> swCrearOmi(

			@PathVariable(value = "base") String base,

			@PathVariable(value = "cia") String cia,

			@PathVariable(value = "ejercicio") String ejercicio,

			// @PathVariable(value = "Periodo") String Periodo,

			@PathVariable(value = "SD") String SD,

			@PathVariable(value = "Asiento") String Asiento,
			@PathVariable(value = "cl_fecret") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate cl_fecret,

			@PathVariable(value = "cl_tipret") String cl_tipret,

			@PathVariable(value = "cl_perrea") String cl_perrea,
			@PathVariable(value = "cl_perpre") String cl_perpre) {
		Map<String, Object> salida = new HashMap<>();
		try {
			// System.out.println(obj.toString());
			service.swCrearOmi(base, 3, cia, ejercicio, "", SD, Asiento, cl_fecret, cl_tipret, cl_perrea,
					cl_perpre);
			salida.put("mensaje", "Actualizado correctamente");
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1078_B – Libro Diario 5.1 - Adicionales " +
					e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@GetMapping(value = "/swListarAyuOmi/{base}/{cia}/{ejercicio}/{Periodo}/{SD}")
	@RequestBody
	public ResponseEntity<List<Map<String, Object[]>>> swListarAyuOmi(
			@PathVariable("base") String base,
			@PathVariable("cia") String cia,
			@PathVariable("ejercicio") String ejercicio,
			@PathVariable("Periodo") String Periodo,
			@PathVariable("SD") String SD)
			throws Exception {

		List<Map<String, Object[]>> lista;
		lcoCabV objE = new lcoCabV();
		try {

			System.out.println(objE.toString());
			lista = service.swListarOmi(base, 4, cia, ejercicio, Periodo, SD, "", objE);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + " HUR1078_B – Libro Diario 5.1 - Adicionales" + e.getMessage());
		}
	}
}
