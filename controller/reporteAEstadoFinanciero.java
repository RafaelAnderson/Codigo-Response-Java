package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.service.reporteAEstadoFinancieroService;

@RestController
@RequestMapping("/rest/lcoreportAEstado")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class reporteAEstadoFinanciero {
	@Autowired
	private reporteAEstadoFinancieroService service;

	@GetMapping("/swBalGene/{p_ciacont}/{ejercicio}/{periodo}/{formato}/{apertura}/{rubro}/{cuentas}/{resultados}/{saldMn}/{saldMe}")
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> swBalGene(
			@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio,
			@PathVariable("periodo") String periodo,
			@PathVariable("formato") String formato,
			@PathVariable("apertura") String apertura,
			@PathVariable("rubro") String rubro,
			@PathVariable("cuentas") String cuentas,
			@PathVariable("resultados") String resultados,
			@PathVariable("saldMn") String saldMn,
			@PathVariable("saldMe") String saldMe) throws Exception {

		List<Map<String, Object>> lista = new ArrayList<>();

		try {
			lista = service.swBalGene(p_ciacont, ejercicio, periodo, formato, apertura, rubro, cuentas, "1",
					resultados, saldMn, saldMe);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1038_F  + " + e.getMessage());
		}
	}

	@GetMapping("/swBalGeneG1/{p_ciacont}/{ejercicio}/{periodo}/{formato}/{apertura}/{rubro}/{cuentas}")
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> swBalGeneG1(
			@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio,
			@PathVariable("periodo") String periodo,
			@PathVariable("formato") String formato,
			@PathVariable("apertura") String apertura,
			@PathVariable("rubro") String rubro,
			@PathVariable("cuentas") String cuentas) throws Exception {

		List<Map<String, Object>> lista = new ArrayList<>();

		try {
			lista = service.swBalGene(p_ciacont, ejercicio, periodo, formato, apertura, rubro, cuentas, "2", "", "", "");
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1038_F  + " + e.getMessage());
		}

	}

	@GetMapping("/swBalGeneG2/{p_ciacont}/{ejercicio}/{periodo}/{formato}/{apertura}/{rubro}/{cuentas}/{resultados}/{saldMn}/{saldMe}")
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> swBalGeneG2(
			@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio,
			@PathVariable("periodo") String periodo,
			@PathVariable("formato") String formato,
			@PathVariable("apertura") String apertura,
			@PathVariable("rubro") String rubro,
			@PathVariable("cuentas") String cuentas,
			@PathVariable("resultados") String resultados,
			@PathVariable("saldMn") String saldMn,
			@PathVariable("saldMe") String saldMe) throws Exception {

		List<Map<String, Object>> lista = new ArrayList<>();

		try {
			lista = service.swBalGene(p_ciacont, ejercicio, periodo, formato, apertura, rubro, cuentas, "3",
					resultados, saldMn, saldMe);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1038_F  + " + e.getMessage());
		}
	}

	@GetMapping("/swAnaliEstFina/{p_ciacont}/{ejercicio}/{modForm}/{periodo}/{nSalAnt}/{nSalAct}/{nDebe}/{nHaber}")
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> swAnaliEstFina(
			@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio,
			@PathVariable("modForm") String modForm,
			@PathVariable("periodo") String periodo,
			@PathVariable("nSalAnt") String nSalAnt,
			@PathVariable("nSalAct") String nSalAct,
			@PathVariable("nDebe") String nDebe,
			@PathVariable("nHaber") String nHaber) throws Exception {

		List<Map<String, Object>> lista = new ArrayList<>();

		try {
			lista = service.swAnaliEstFina(p_ciacont, ejercicio, modForm, periodo, nSalAnt, nSalAct, nDebe, nHaber);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1039_F  + " + e.getMessage());
		}

	}

	@GetMapping("/swValFrmBal/{p_ciacont}/{formato}")
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> swValFrmBal(
			@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("formato") String formato) throws Exception {

		List<Map<String, Object>> lista = new ArrayList<>();
		try {
			lista = service.swValFrmBal(p_ciacont, "", "", "", "", "", formato, "4", "", "", "");
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1039_F  + " + e.getMessage());
		}
	}
}
