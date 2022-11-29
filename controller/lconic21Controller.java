package com.empresa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.empresa.entity.lconic21;
import com.empresa.entity.lconic21Pk;
import com.empresa.service.lconic21Service;

@RestController
@RequestMapping("/rest/lconic21")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
		"http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
		"http://192.168.1.213" })
public class lconic21Controller {

	@Autowired
	private lconic21Service service;

	@GetMapping(value = { "/asientoRegularizacion/{cia}/{ejercicio}/{periodo}/{tpventa}/{tpcompra}/{usu}" })
	public ResponseEntity<?> asientoRegularizacion(
			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "ejercicio") String ejercicio,
			@PathVariable(value = "periodo") String periodo,
			@PathVariable(value = "tpventa") double tpventa,
			@PathVariable(value = "tpcompra") double tpcompra,
			@PathVariable(value = "usu") String usu) {
		Map<String, Object> response = new HashMap<>();
		if (cia != null && ejercicio != null && periodo != null && tpventa != 0.00 && tpcompra != 0.00 && usu != null) {
			try {
				service.asientoRegularizacion(cia, ejercicio, periodo, tpventa, tpcompra, usu);
				response.put("mensaje", "Resultado Extitoso");
			} catch (Exception e) {
				// TODO: handle exception
				e.getMessage();
			}
		} else {
			response.put("mensaje", "Resultado Fallido");

		}

		return ResponseEntity.ok(response);

	}

	@GetMapping(value = { "/listarlcoNic21/{cia}/{ejercicio}/{ni_codper}" })

	public ResponseEntity<List<Map<String, Object[]>>> listarlcoNic21(
			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "ejercicio") String ejercicio,
			@PathVariable(value = "ni_codper") String ni_codper

	) throws Exception {

		lconic21 objSalida = new lconic21();
		lconic21Pk pk = new lconic21Pk();
		objSalida.setPk(pk);

		try {

			pk.setNi_codper(ni_codper);
			pk.setNi_cuenta("");
			pk.setNi_tipane("");
			pk.setNi_codane("");
			pk.setNi_tipdoc("");
			pk.setNi_numdoc("");
			List<Map<String, Object[]>> lista = service.listarlcoNic21(0, cia, ejercicio, ni_codper, "", "", "", "",
					"");
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Error HUR1033_F  + " + e.getMessage());
		}
	}

	@DeleteMapping("/eliminarlconic21/{cia}/{ejercicio}/{ni_codper}/{ni_cuenta}/{ni_tipane}/{ni_codane}/{ni_tipdoc}/{ni_numdoc}")

	public ResponseEntity<Map<String, Object>> eliminarlcoNic21(
			@PathVariable("cia") String cia,
			@PathVariable("ejercicio") String ejercicio,
			@PathVariable(value = "ni_codper") String ni_codper,
			@PathVariable(value = "ni_cuenta") String ni_cuenta,
			@PathVariable(value = "ni_tipane") String ni_tipane,
			@PathVariable(value = "ni_codane") String ni_codane,
			@PathVariable(value = "ni_tipdoc") String ni_tipdoc,
			@PathVariable(value = "ni_numdoc") String ni_numdoc) {

		Map<String, Object> response = new HashMap<>();
		lconic21 objSalida = new lconic21();
		lconic21Pk pk = new lconic21Pk();
		objSalida.setPk(pk);
		;

		// response.put("mensaje","Eliminado Correctamente")
		// response.put("mensaje", "No se encontro los datos con el id
		// ".concat(periodo));

		try {
			pk.setNi_codper(ni_codper);
			pk.setNi_cuenta(ni_cuenta);
			pk.setNi_tipane(ni_tipane);
			pk.setNi_codane(ni_codane);
			pk.setNi_tipdoc(ni_tipdoc);
			pk.setNi_numdoc(ni_numdoc);
			service.eliminarlcoNic(1, cia, ejercicio, ni_codper, ni_cuenta, ni_tipane, ni_codane, ni_tipdoc, ni_numdoc);
			response.put("mensaje", "Eliminado correctamente");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			response.put("Mensaje", "Ocurrio un error al eliminar con id ".concat(ni_codper));
			// throw new Exception("Error HUR1033_F + " + e.getMessage());
		}

		return ResponseEntity.ok(response);
	}

}
