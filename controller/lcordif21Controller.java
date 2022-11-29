package com.empresa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.lcordif21;
import com.empresa.entity.lcordif21Pk;
import com.empresa.service.lcordif21Service;

@RestController
@RequestMapping("/rest/lcordif21")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
		"http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
		"http://192.168.1.213" })
public class lcordif21Controller {

	@Autowired
	lcordif21Service serv;

	@GetMapping("/asieReguDifeCamb")
	public ResponseEntity<?> asieReguDifeCamb(@RequestParam("cia") String cia,
			@RequestParam("ejer") String ejer,
			@RequestParam("periodo") String periodo,
			@RequestParam("usu") String usu) {
		Map<String, Object> response = new HashMap<>();
		if (cia != null && ejer != null && periodo != null && usu != null) {
			try {
				serv.asieReguDifeCamb(cia, ejer, periodo, usu);
				response.put("Mensaje", "Resultado Exitoso");
			} catch (Exception e) {
				e.getStackTrace();
			}
		} else {
			response.put("Mensaje", "Resultado Fallido");
		}

		return ResponseEntity.ok(response);

	}

	@GetMapping(value = { "/listarlcordif21/{cia}/{ejercicio}/{periodo}" })

	public ResponseEntity<List<Map<String, Object>>> listarlcoNic21(
			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "ejercicio") String ejercicio,
			@PathVariable(value = "periodo") String periodo) throws Exception {

		lcordif21 objSalida = new lcordif21();
		lcordif21Pk pk = new lcordif21Pk();
		objSalida.setPkId(pk);

		try {

			pk.setRd_codper(periodo);
			pk.setRd_cuenta("");
			pk.setRd_codane("");
			pk.setRd_tipdoc("");
			pk.setRd_numdoc("");

			List<Map<String, Object>> lista = serv.listarlcordif21(0, cia, ejercicio, periodo, "", "", "", "");
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Error HUR1033_F  + " + e.getMessage());
		}
	}

	@DeleteMapping("/eliminarlcordif21/{cia}/{ejercicio}/{periodo}/{clave}/{codane}/{tipdoc}/{numdoc}")

	public ResponseEntity<Map<String, Object>> eliminarlcoNic21(@PathVariable("cia") String cia,
			@PathVariable("ejercicio") String ejercicio,
			@PathVariable("periodo") String periodo,
			@PathVariable("clave") String clave,
			@PathVariable("codane") String codane,
			@PathVariable("tipdoc") String tipdoc,
			@PathVariable("numdoc") String numdoc) {

		Map<String, Object> response = new HashMap<>();
		lcordif21 objSalida = new lcordif21();
		lcordif21Pk pk = new lcordif21Pk();
		objSalida.setPkId(pk);

		// if(lista.size() == 1){
		// response.put("mensaje","Eliminado Correctamente")
		// response.put("mensaje", "No se encontro los datos con el id
		// ".concat(periodo));

		try {
			pk.setRd_codane(codane);
			pk.setRd_codper(periodo);
			pk.setRd_cuenta(clave);
			pk.setRd_numdoc(numdoc);
			pk.setRd_tipdoc(tipdoc);
			serv.eliminarlcordif21(1, cia, ejercicio, periodo, clave, codane, tipdoc, numdoc);
			response.put("mensaje", "Eliminado correctamente");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			response.put("Mensaje", "Ocurrio un error al eliminar con id ".concat(periodo));
			// throw new Exception("Error HUR1033_F + " + e.getMessage());
		}

		// }else{
		// response.put("mensaje", "No se encontro los datos con el id
		// ".concat(periodo));

		// }

		return ResponseEntity.ok(response);
	}

	@GetMapping(value = { "/listarDetallelcordif21/{cia}/{ejercicio}/{periodo}/{cuenta}/{cdanex}/{tpanex}/{numdoc}" })

	public ResponseEntity<List<Map<String, Object>>> listarDetallelcordif21(
			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "ejercicio") String ejercicio,
			@PathVariable(value = "periodo") String periodo,
			@PathVariable(value = "cuenta") String cuenta,
			@PathVariable(value = "cdanex") String cdanex,
			@PathVariable(value = "tpanex") String tpanex,
			@PathVariable(value = "numdoc") String numdoc) throws Exception {

		try {
			List<Map<String, Object>> lista = serv.listarDetallelcordif21(cia, ejercicio, periodo, cuenta, cdanex,
					tpanex, numdoc);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Error HUR1033_B  + " + e.getMessage());
		}
	}
}
