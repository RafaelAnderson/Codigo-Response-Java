package com.empresa.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.lcoDetV;
import com.empresa.entity.lcoDetVPk;
import com.empresa.service.DtaVGrillaService;

@RestController
@RequestMapping("/rest/lcoDtaV")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
		"http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
		"http://192.168.1.213" })

public class DtaVGrillaController {

	Date fecha = new Date();
	LocalDate fechaLocalDate = LocalDate.now();
	@Autowired
	private DtaVGrillaService service;

	@GetMapping("/extornaAsiento")
	public ResponseEntity<?> extornaAsiento(
			@RequestParam("subdia") String subdia,
			@RequestParam("compro") String compro,
			@RequestParam("cia") String cia,
			@RequestParam("ejer") String ejer) {
		Map<String, Object> response = new HashMap<>();

		if (subdia != null && compro != null && cia != null && ejer != null) {
			try {
				service.extornaAsiento(subdia, compro, cia, ejer);
				response.put("Mensaje", "Resultado Exitoso");
				return ResponseEntity.ok(response);
			} catch (Exception e) {
				e.getMessage();
			}
		} else {
			response.put("Mensaje", "Resultado Fallido");
		}
		return ResponseEntity.ok(response);

	}

	@GetMapping("/facturaReferencia")
	public ResponseEntity<List<Map<String, Object>>> facturaReferencia(
			@RequestParam("opcion") String opcion,
			@RequestParam("cia") String cia,
			@RequestParam("ejer") String ejer) throws Exception {

		List<Map<String, Object>> lista = new ArrayList<>();

		try {
			lista = service.listaFacturaReferencia(opcion, cia, ejer);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1037 + " + e.getMessage());
		}
	}

	@GetMapping("/finalizarAsiento")
	public ResponseEntity<?> finalizarAsiento(
			@RequestParam("subdia") String subdia,
			@RequestParam("compro") String compro,
			@RequestParam("cia") String cia,
			@RequestParam("ejer") String ejer,
			@RequestParam("usu") String usu) {
		Map<String, Object> response = new HashMap<>();

		if (subdia != null && compro != null && cia != null && ejer != null && usu != null) {
			try {
				service.finalizarAsiento(subdia, compro, cia, ejer, usu);
				response.put("Mensaje", "Resultado Exitoso");
				return ResponseEntity.ok(response);
			} catch (Exception e) {
				e.getMessage();
			}
		} else {
			response.put("Mensaje", "Resultado Fallido");
		}
		return ResponseEntity.ok(response);

	}

	@GetMapping(value = { "/listarGrilla/{p_ciacont}/{año}/{subdia}/{compro}" })
	@ResponseBody
	public ResponseEntity<List<lcoDetV>> listaPorAsiento(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value = "año", required = false) String año,
			@PathVariable(value = "subdia", required = false) String subdia,
			@PathVariable(value = "compro", required = false) String compro) throws Exception {

		lcoDetVPk pk = new lcoDetVPk();
		pk.setDl_subdia(subdia);
		pk.setDl_compro(compro);
		pk.setDl_secue("");

		lcoDetV obj = new lcoDetV(pk, fechaLocalDate, "", "", "", "", "", "",
				"", fechaLocalDate, fechaLocalDate, 0.2, "", "", 0.0, 0.0, 0.0, "", "", "", "", "",
				fechaLocalDate, "", 0.0, 0.0, 0.0, "", "", "", "", "", "", 0.0, 0.0, 0.0, "", "",
				"", "", "", "", 0.0, "", 0.0, fechaLocalDate, "", fechaLocalDate, "", "", 0.0, p_ciacont, año, LocalDate.now(),
				LocalTime.now(),
				subdia, LocalDate.now(), LocalTime.now(), compro, "", "", "", "", "", LocalDate.now(), "");

		try {

			List<lcoDetV> lista = service.listaGrilla(0, p_ciacont, año, obj);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1021 + " + e.getMessage());
		}
	}

	@GetMapping(value = { "/listarxCuenta/{p_ciacont}/{año}/{cuenta}" })
	@ResponseBody
	public ResponseEntity<List<lcoDetV>> listaPorCuenta(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value = "cuenta") String cuenta,
			@PathVariable(value = "año") String año) throws Exception {

		lcoDetVPk pk = new lcoDetVPk();
		pk.setDl_subdia("0");
		pk.setDl_compro("0");
		pk.setDl_secue("");

		lcoDetV obj = new lcoDetV(pk, fechaLocalDate, "", "", "", "", "", "",
				"", fechaLocalDate, fechaLocalDate, 0.2, "", "", 0.0, 0.0, 0.0, "", "", "", "", "",
				fechaLocalDate, "", 0.0, 0.0, 0.0, "", "", "", "", "", "", 0.0, 0.0, 0.0, "", "",
				"", "", "", "", 0.0, "", 0.0, fechaLocalDate, "", fechaLocalDate, "", "", 0.0, p_ciacont, año, LocalDate.now(),
				LocalTime.now(),
				"", LocalDate.now(), LocalTime.now(), "", "", "", "", "", "", LocalDate.now(), "");

		try {

			List<lcoDetV> lista = service.listaGrilla(7, p_ciacont, año, obj);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1021 + " + e.getMessage());
		}
	}

	@GetMapping(value = { "/listarUlt/{p_ciacont}/{año}/{subdia}/{compro}" })
	@ResponseBody
	public ResponseEntity<List<lcoDetV>> listaPorCodigo(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value = "año", required = false) String año,
			@PathVariable(value = "subdia", required = false) String subdia,
			@PathVariable(value = "compro", required = false) String compro) throws Exception {

		lcoDetVPk pk = new lcoDetVPk();
		pk.setDl_subdia(subdia);
		pk.setDl_compro(compro);
		pk.setDl_secue("");

		lcoDetV obj = new lcoDetV(pk, fechaLocalDate, "", "", "", "", "", "",
				"", fechaLocalDate, fechaLocalDate, 0.2, "", "", 0.0, 0.0, 0.0, "", "", "", "", "",
				fechaLocalDate, "", 0.0, 0.0, 0.0, "", "", "", "", "", "", 0.0, 0.0, 0.0, "", "",
				"", "", "", "", 0.0, "", 0.0, fechaLocalDate, "", fechaLocalDate, "", "", 0.0, p_ciacont, año, LocalDate.now(),
				LocalTime.now(),
				subdia, LocalDate.now(), LocalTime.now(), compro, "", "", "", "", "", LocalDate.now(), "");

		try {

			List<lcoDetV> lista = service.listaGrilla(4, p_ciacont, año, obj);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1021 + " + e.getMessage());
		}
	}

	@GetMapping(value = { "/listarTotal/{p_ciacont}/{año}/{subdia}/{compro}" })
	@ResponseBody
	public ResponseEntity<List<Object>> listaTotal(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value = "año", required = false) String año,
			@PathVariable(value = "subdia", required = false) String subdia,
			@PathVariable(value = "compro", required = false) String compro) throws Exception {

		lcoDetVPk pk = new lcoDetVPk();
		pk.setDl_subdia(subdia);
		pk.setDl_compro(compro);
		pk.setDl_secue("");

		lcoDetV obj = new lcoDetV(pk, fechaLocalDate, "", "", "", "", "", "",
				"", fechaLocalDate, fechaLocalDate, 0.2, "", "", 0.0, 0.0, 0.0, "", "", "", "", "",
				fechaLocalDate, "", 0.0, 0.0, 0.0, "", "", "", "", "", "", 0.0, 0.0, 0.0, "", "",
				"", "", "", "", 0.0, "", 0.0, fechaLocalDate, "", fechaLocalDate, "", "", 0.0, p_ciacont, año, LocalDate.now(),
				LocalTime.now(),
				subdia, LocalDate.now(), LocalTime.now(), compro, "", "", "", "", "", LocalDate.now(), "");
		try {

			List<Object> lista = service.listaTotal(6, p_ciacont, año, obj);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1021 + " + e.getMessage());
		}
	}

	@GetMapping(value = { "/SaldosDoc/{cia}/{ejer}/{cuenta}/{cdanex}/{tpdoc}/{feccom}/{nmdoc}",
			"/SaldosDoc/{cia}/{ejer}/{cuenta}/{cdanex}/{tpdoc}/{feccom}" })
	@ResponseBody
	public ResponseEntity<List<Object>> SaldosDoc(@PathVariable("cia") String cia,
			@PathVariable(value = "ejer") String ejer,
			@PathVariable(value = "cuenta") String cuenta,
			@PathVariable(value = "cdanex") String cdanex,
			@PathVariable(value = "tpdoc") String tpdoc,
			@PathVariable(value = "feccom") String feccom,
			@PathVariable(value = "nmdoc", required = false) String nmdoc) throws Exception {

		if (nmdoc == null) {
			nmdoc = "";
		}

		try {

			List<Object> lista = service.Saldos(cia, ejer, cuenta, cdanex, tpdoc, feccom, nmdoc);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1021 + " + e.getMessage());
		}
	}

	/* Consulta de Saldos por Documento RP */

	@GetMapping(value = { "/SaldosxDoc/{cia}/{ejer}/{cuenta}/{tpane}/{codane}/{periodo}/{opcion}",
			"/SaldosxDoc/{cia}/{ejer}/{cuenta}/{tpane}/{periodo}/{opcion}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> SaldosxDoc(
			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "ejer") String ejer,
			@PathVariable(value = "cuenta") String cuenta,
			@PathVariable(value = "tpane") String tpane,
			@PathVariable(value = "codane", required = false) String codane,
			@PathVariable(value = "periodo") String periodo,
			@PathVariable(value = "opcion") String opcion) throws Exception {

		List<Map<String, Object>> lista = new ArrayList<>();

		try {

			lista = service.SaldosDocumento(0, cia, ejer, cuenta, tpane, codane, periodo, opcion, "", "");
			return ResponseEntity.ok(lista);

		} catch (Exception e) {
			throw new Exception("Error HUR1065 + " + e.getMessage());
		}
	}

	/* Consulta Detalle de Documento RP */

	@GetMapping(value = { "/DetDocumento/{cia}/{ejer}/{cuenta}/{tpane}/{codane}/{periodo}/{tipodoc}/{numdoc}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> DetDocumento(
			@PathVariable("cia") String cia,
			@PathVariable(value = "ejer") String ejer,
			@PathVariable(value = "cuenta") String cuenta,
			@PathVariable(value = "tpane") String tpane,
			@PathVariable(value = "codane") String codane,
			@PathVariable(value = "periodo") String periodo,
			@PathVariable(value = "tipodoc") String tipodoc,
			@PathVariable(value = "numdoc") String numdoc) throws Exception {

		List<Map<String, Object>> lista = new ArrayList<>();

		try {

			lista = service.SaldosDocumento(1, cia, ejer, cuenta, tpane, codane, periodo, "", tipodoc, numdoc);
			return ResponseEntity.ok(lista);

		} catch (Exception e) {
			throw new Exception("Error HUR1065 + " + e.getMessage());
		}
	}

	@PostMapping(value = { "/regDeta/{p_ciacont}/{año}" })
	@ResponseBody
	public ResponseEntity<Map<String, Object>> registrar(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value = "año", required = false) String año,
			@RequestBody lcoDetV obj) throws Exception {

		Map<String, Object> salida = new HashMap<>();
		if (obj.getDl_fluefec() == null) {
			obj.setDl_fluefec("");
		}
		System.out.println(obj.toString());
		List<lcoDetV> lista = service.listaGrilla(5, p_ciacont, año, obj);
		if (lista.size() != 0) {
			salida.put("mensaje", "Registro ya existente");
		} else {
			LocalDate dt = LocalDate.of(1111,11,11);
			//new SimpleDateFormat("yyyy-MM-dd").parse("1111-11-11");
			System.out.println(dt);
			try {
				if (obj.getDl_tpdoc() == "") {
					obj.setDl_fecdoc(dt);
				}

				if (obj.getDl_tpdocrf() == "") {
					obj.setDl_fecdocrf(dt);
				}

				obj.setDl_fecCrea(LocalDate.now());
				obj.setDl_hracrea(LocalTime.now());
				obj.setDl_fecact(LocalDate.now());
				obj.setDl_hraact(LocalTime.now());
				System.out.println(obj.toString());
				service.transaccion(1, p_ciacont, año, obj);
				salida.put("mensaje", "Registrado correctamente");
				return ResponseEntity.ok(salida);
			} catch (Exception e) {
				throw new Exception("Error HUR1021 + " + e.getMessage());
			}
		}
		return ResponseEntity.ok(salida);

	}

	@PutMapping(value = { "/ActuDeta/{p_ciacont}/{año}" })
	@ResponseBody
	public ResponseEntity<Map<String, Object>> actualizar(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value = "año", required = false) String año,
			@RequestBody lcoDetV obj) throws Exception {

		Map<String, Object> salida = new HashMap<>();
		List<lcoDetV> lista = service.listaGrilla(5, p_ciacont, año, obj);
		if (lista.size() == 1) {
			try {
				obj.setDl_fecCrea(LocalDate.now());
				obj.setDl_hracrea(LocalTime.now());
				obj.setDl_fecact(LocalDate.now());
				obj.setDl_hraact(LocalTime.now());
				service.transaccion(2, p_ciacont, año, obj);
				salida.put("mensaje", "Actualizado correctamente");
				return ResponseEntity.ok(salida);
			} catch (Exception e) {
				throw new Exception("Error HUR1021 + " + e.getMessage());
			}
		} else {
			salida.put("mensaje", "Registro no se encuentra");
			return ResponseEntity.ok(salida);
		}

	}

	@DeleteMapping(value = { "/ElimDeta/{p_ciacont}/{año}/{subdia}/{compro}/{secuencia}",
			"/ElimDeta/{p_ciacont}/{año}/{subdia}/{compro}" })
	@ResponseBody
	public ResponseEntity<Map<String, Object>> eliminar(@PathVariable(value = "p_ciacont") String p_ciacont,
			@PathVariable(value = "año") String año,
			@PathVariable(value = "subdia") String subdia,
			@PathVariable(value = "compro") String compro,
			@PathVariable(value = "secuencia", required = false) String secuencia) throws Exception {

		lcoDetVPk pk = new lcoDetVPk();
		pk.setDl_subdia(subdia);
		pk.setDl_compro(compro);
		pk.setDl_secue(secuencia);

		lcoDetV obj = new lcoDetV(pk, fechaLocalDate, "", "", "", "", "", "",
				"", fechaLocalDate, fechaLocalDate, 0.2, "", "", 0.0, 0.0, 0.0, "", "", "", "", "",
				fechaLocalDate, "", 0.0, 0.0, 0.0, "", "", "", "", "", "", 0.0, 0.0, 0.0, "", "",
				"", "", "", "", 0.0, "", 0.0, fechaLocalDate, "", fechaLocalDate, "", "", 0.0, p_ciacont, año, LocalDate.now(),
				LocalTime.now(),
				subdia, LocalDate.now(), LocalTime.now(), compro, "", "", "", "", "", LocalDate.now(), "");

		Map<String, Object> salida = new HashMap<>();
		List<lcoDetV> lista = service.listaGrilla(5, p_ciacont, año, obj);
		if (lista.size() == 1) {
			try {
				obj.setDl_fecCrea(LocalDate.now());
				obj.setDl_hracrea(LocalTime.now());
				obj.setDl_fecact(LocalDate.now());
				obj.setDl_hraact(LocalTime.now());
				service.transaccion(3, p_ciacont, año, obj);
				salida.put("mensaje", "Eliminado correctamente");
				return ResponseEntity.ok(salida);
			} catch (Exception e) {
				throw new Exception("Error HUR1021 + " + e.getMessage());
			}
		} else {
			salida.put("mensaje", "Registro no se encuentra");
			return ResponseEntity.ok(salida);
		}

	}

	@DeleteMapping(value = { "/ElimDetalle/{p_ciacont}/{año}/{subdia}/{compro}" })
	@ResponseBody
	public ResponseEntity<Map<String, Object>> eliminardeta(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("año") String año,
			@PathVariable("subdia") String subdia,
			@PathVariable("compro") String compro) throws Exception {

		lcoDetVPk pk = new lcoDetVPk();
		pk.setDl_subdia(subdia);
		pk.setDl_compro(compro);
		pk.setDl_secue("");

		lcoDetV obj = new lcoDetV(pk, fechaLocalDate, "", "", "", "", "", "",
				"", fechaLocalDate, fechaLocalDate, 0.2, "", "", 0.0, 0.0, 0.0, "", "", "", "", "",
				fechaLocalDate, "", 0.0, 0.0, 0.0, "", "", "", "", "", "", 0.0, 0.0, 0.0, "", "",
				"", "", "", "", 0.0, "", 0.0, fechaLocalDate, "", fechaLocalDate, "", "", 0.0, p_ciacont, año, LocalDate.now(),
				LocalTime.now(),
				subdia, LocalDate.now(), LocalTime.now(), compro, "", "", "", "", "", LocalDate.now(), "");

		Map<String, Object> salida = new HashMap<>();

		List<lcoDetV> lista = service.listaGrilla(9, p_ciacont, año, obj);
		if (lista.size() >= 1) {
			try {
				obj.setDl_fecCrea(LocalDate.now());
				obj.setDl_hracrea(LocalTime.now());
				obj.setDl_fecact(LocalDate.now());
				obj.setDl_hraact(LocalTime.now());
				service.transaccion(8, p_ciacont, año, obj);
				salida.put("mensaje", "Eliminado correctamente");
				return ResponseEntity.ok(salida);
			} catch (Exception e) {
				throw new Exception("Error HUR1021 + " + e.getMessage());
			}
		} else {
			salida.put("mensaje", "Registro no se encuentra");
			return ResponseEntity.ok(salida);
		}

	}

	@GetMapping(value = { "/listarDtaGrilla/{cia}/{ejer}/{feini}/{fefin}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> ListDtaGrilla(@PathVariable("cia") String cia,
			@PathVariable(value = "ejer", required = false) String ejer,
			@PathVariable(value = "feini", required = false) String feini,
			@PathVariable(value = "fefin", required = false) String fefin) throws Exception {

		try {
			List<Map<String, Object>> lista = service.ListGrilla("1", cia, ejer, feini, fefin);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			System.out.print(e);
			throw new Exception("Error HUR1037 + " + e.getMessage());
		}
	}

	// kirby
	@GetMapping(value = { "/ListGrillaActualizada/{cia}/{ejer}/{feini}/{fefin}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> ListGrillaActualizada(@PathVariable("cia") String cia,
			@PathVariable(value = "ejer", required = false) String ejer,
			@PathVariable(value = "feini", required = false) String feini,
			@PathVariable(value = "fefin", required = false) String fefin) throws Exception {

		try {
			List<Map<String, Object>> lista = service.ListGrillaActualizada("3", cia, ejer, feini, fefin);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			System.out.print(e);
			throw new Exception("Error HUR1037 + " + e.getMessage());
		}
	}

	@GetMapping(value = { "/generarArchivo/{cia}/{ejer}/{feini}/{fefin}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> GenArchivo(@PathVariable("cia") String cia,
			@PathVariable(value = "ejer", required = false) String ejer,
			@PathVariable(value = "feini", required = false) String feini,
			@PathVariable(value = "fefin", required = false) String fefin) throws Exception {

		try {
			List<Map<String, Object>> lista4 = service.GenArchivo("2", cia, ejer, feini,
					fefin);
			System.out.println("-------------------------");
			System.out.println(lista4);
			return ResponseEntity.ok(lista4);
		} catch (Exception e) {
			throw new Exception("Error HUR1037 + " + e.getMessage());
		}
	}

	@PutMapping(value = { "/ActDocDetra/{p_ciacont}/{año}" })
	@ResponseBody
	public ResponseEntity<Map<String, Object>> actualizarDocDetra(
			@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value = "año") String año,
			@RequestBody lcoDetV obj) throws Exception {

		Map<String, Object> salida = new HashMap<>();
		try {
			/*
			 * Ejemplo de json que debe de mandar el front en, ojo con el pk
			 * {
			 * "dl_fecdoc": "2022-12-23", necesario el formato de fecha
			 * "dl_tpdoc": "FT",
			 * "al_razsoc": null,
			 * "dl_cuenta": "42101",
			 * "dl_codmnd": "MN",
			 * "importe": 1180.00,
			 * "pk": {
			 * "dl_subdia": "11",
			 * "dl_compro": "020001",
			 * "dl_secue": "0001"
			 * },
			 * "dl_nmdoc": "F001-33",
			 * "dl_cdanex": "",
			 * "al_numdetr": null,
			 * "dl_tpanex": "P",
			 * "dl_feccom": "2021-12-01" necesario el formato de fecha
			 * }
			 */
			service.actualizarDocDetra(p_ciacont, año, obj);
			salida.put("mensaje", "Actualizado correctamente");
			return ResponseEntity.ok(salida);
		} catch (Exception e) {
			throw new Exception("Error HUR1021 + " + e.getMessage());
		}

	}

	@GetMapping(value = { "/listarDocSaldo/{cia}/{ejer}/{cuenta}/{anexo}/{tpdoc}/{numdoc}",
			"/listarDocSaldo/{cia}/{ejer}/{cuenta}",
			"/listarDocSaldo/{cia}/{ejer}/{cuenta}/{anexo}",
			"/listarDocSaldo/{cia}/{ejer}/{cuenta}/{anexo}/{tpdoc}",
			"/listarDocSaldo/{cia}/{ejer}"
	})
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> ListDocSaldo(@PathVariable("cia") String cia,
			@PathVariable(value = "ejer", required = false) String ejer,
			@PathVariable(value = "cuenta", required = false) String cuenta,
			@PathVariable(value = "anexo", required = false) String anexo,
			@PathVariable(value = "tpdoc", required = false) String tpdoc,
			@PathVariable(value = "numdoc", required = false) String numdoc) throws Exception {

		if (cuenta == null) {
			cuenta = "";
		}

		if (anexo == null) {
			anexo = "";
		}

		if (tpdoc == null) {
			tpdoc = "";
		}

		if (numdoc == null) {
			numdoc = "";
		}
		try {
			List<Map<String, Object>> lista = service.saldoDocumentoPorAnexo(0, cia, ejer, cuenta, "", anexo, tpdoc,
					numdoc);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			System.out.print(e);
			throw new Exception("Error HUR1037 + " + e.getMessage());
		}
	}

	@GetMapping(value = { "/listCobranza/{cia}/{ejer}/{tipo}/{cuenta}/{anexo}/{tpdoc}/{numdoc}",
			"/listCobranza/{cia}/{ejer}/{tipo}/{cuenta}",
			"/listCobranza/{cia}/{ejer}/{tipo}/{cuenta}/{anexo}",
			"/listCobranza/{cia}/{ejer}/{tipo}/{cuenta}/{anexo}/{tpdoc}",
			"/listCobranza/{cia}/{ejer}/{tipo}"
	})
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> ListCobranza(@PathVariable("cia") String cia,
			@PathVariable(value = "ejer", required = false) String ejer,
			@PathVariable(value = "tipo", required = false) String tipo,
			@PathVariable(value = "cuenta", required = false) String cuenta,
			@PathVariable(value = "anexo", required = false) String anexo,
			@PathVariable(value = "tpdoc", required = false) String tpdoc,
			@PathVariable(value = "numdoc", required = false) String numdoc) throws Exception {

		if (cuenta == null) {
			cuenta = "";
		}

		if (anexo == null) {
			anexo = "";
		}

		if (tpdoc == null) {
			tpdoc = "";
		}

		if (numdoc == null) {
			numdoc = "";
		}
		try {
			List<Map<String, Object>> lista = service.saldoDocumentoCobranza(1, cia, ejer, cuenta, tipo, anexo, tpdoc,
					numdoc);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			System.out.print(e);
			throw new Exception("Error HUR1037 + " + e.getMessage());
		}
	}

	// Procedimiento de SP_EliminancionXMovimiento
	@GetMapping(value = { "/eliXmovimiento/{cia}/{ejercicio}/{TipAnex}/{CodAnexo}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object[]>>> eliminacionXmovimientoAnexo(
			@PathVariable("cia") String cia,
			@PathVariable("ejercicio") String ejercicio,
			@PathVariable("TipAnex") String TipAnex,
			@PathVariable("CodAnexo") String CodAnexo) throws Exception {
		List<Map<String, Object[]>> lista = new ArrayList<>();
		try {
			lista = service.eliminacionXmovimientoAnexo(0, cia, ejercicio, TipAnex, CodAnexo);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1004_F_Tabla_Anexos + " + e.getMessage());
		}
	}

	@GetMapping(value = { "/listaDocReferencia/{cia}/{ejercicio}/{subdiario}/{comprobante}/{secuencia}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> DocReferencia(
			@PathVariable("cia") String cia,
			@PathVariable("ejercicio") String ejercicio,
			@PathVariable("subdiario") String subdiario,
			@PathVariable("comprobante") String comprobante,
			@PathVariable("secuencia") String secuencia) throws Exception {

		List<Map<String, Object>> lista = new ArrayList<>();
		try {
			lista = service.DocReferencia(0, cia, ejercicio, subdiario, comprobante, secuencia);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1004_F_Tabla_Anexos + " + e.getMessage());
		}

	}

	@DeleteMapping(value = { "/eliminarRefs/{cia}/{ejercicio}/{subdiario}/{comprobante}/{secuencia}" })
	@ResponseBody
	public ResponseEntity<Map<String, Object>> eliminarDetRef(
			@PathVariable("cia") String cia,
			@PathVariable("ejercicio") String ejercicio,
			@PathVariable("subdiario") String subdiario,
			@PathVariable("comprobante") String comprobante,
			@PathVariable("secuencia") String secuencia) {
		Map<String, Object> salida = new HashMap<>();
		try {
			List<Map<String, Object>> lista = service.DocReferencia(0, cia, ejercicio, subdiario, comprobante,
					secuencia);
			if (lista.size() > 0) {
				service.EliminarRef(1, cia, ejercicio, subdiario, comprobante, secuencia);
				salida.put("mensaje", "Eliminado correctamente");
			} else {
				salida.put("mensaje", "No se encontro el registro");
			}
		} catch (Exception e) {
			salida.put("mensaje", "Error HUS2022B" + e.getMessage());
		}

		return ResponseEntity.ok(salida);
	}

	@GetMapping(value = { "/listaDocReferencia/{cia}/{ejer}/{tipcmp}/{cuenta}/{dh}/{tpanex}/{cdanex}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> listarDocumentosDeReferencia(
			@PathVariable("cia") String cia,
			@PathVariable("ejer") String ejer,
			@PathVariable("tipcmp") String tipcmp,
			@PathVariable("cuenta") String cuenta,
			@PathVariable("dh") String dh,
			@PathVariable("tpanex") String tpanex,
			@PathVariable("cdanex") String cdanex) throws Exception {
		try {
			List<Map<String, Object>> lista = service.listarDocumentosReferencia(cia, ejer, tipcmp, cuenta, dh,
					tpanex, cdanex);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			System.out.print(e);
			throw new Exception("Error HUR1037 + " + e.getMessage());
		}
	}

	@GetMapping(value = { "/listarAsientoVentas/{p_ciacont}/{año}" })
	@ResponseBody
	public ResponseEntity<List<lcoDetV>> listaPorAsientoVentas(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value = "año", required = false) String año) throws Exception {

		lcoDetVPk pk = new lcoDetVPk();
		pk.setDl_subdia("");
		pk.setDl_compro("");
		pk.setDl_secue("");

		lcoDetV obj = new lcoDetV(pk, fechaLocalDate, "", "", "", "", "", "",
				"", fechaLocalDate, fechaLocalDate, 0.2, "", "", 0.0, 0.0, 0.0, "", "", "", "", "",
				fechaLocalDate, "", 0.0, 0.0, 0.0, "", "", "", "", "", "", 0.0, 0.0, 0.0, "", "",
				"", "", "", "", 0.0, "", 0.0, fechaLocalDate, "", fechaLocalDate, "", "", 0.0, p_ciacont, año, LocalDate.now(),
				LocalTime.now(),
				"", LocalDate.now(), LocalTime.now(), "", "", "", "", "", "", LocalDate.now(), "");

		try {

			List<lcoDetV> lista = service.listaGrilla(10, p_ciacont, año, obj);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1021 + " + e.getMessage());
		}
	}


	@GetMapping(value = { "/listarAsientoCompras/{p_ciacont}/{año}" })
	@ResponseBody
	public ResponseEntity<List<lcoDetV>> listaPorAsientoCompras(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value = "año", required = false) String año) throws Exception {

		lcoDetVPk pk = new lcoDetVPk();
		pk.setDl_subdia("");
		pk.setDl_compro("");
		pk.setDl_secue("");

		lcoDetV obj = new lcoDetV(pk, fechaLocalDate, "", "", "", "", "", "",
				"", fechaLocalDate, fechaLocalDate, 0.2, "", "", 0.0, 0.0, 0.0, "", "", "", "", "",
				fechaLocalDate, "", 0.0, 0.0, 0.0, "", "", "", "", "", "", 0.0, 0.0, 0.0, "", "",
				"", "", "", "", 0.0, "", 0.0, fechaLocalDate, "", fechaLocalDate, "", "", 0.0, p_ciacont, año, LocalDate.now(),
				LocalTime.now(),
				"", LocalDate.now(), LocalTime.now(), "", "", "", "", "", "", LocalDate.now(), "");

		try {

			List<lcoDetV> lista = service.listaGrilla(11, p_ciacont, año, obj);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1021 + " + e.getMessage());
		}
	}
}
