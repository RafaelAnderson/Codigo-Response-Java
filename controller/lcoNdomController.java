package com.empresa.controller;

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.lcoNdom;
import com.empresa.entity.lcoNdomPk;
import com.empresa.service.lcoNdomService;

@RestController
@RequestMapping("/rest/lcoNdom")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
		"http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
		"http://192.168.1.213" })
public class lcoNdomController {

	@Autowired
	lcoNdomService service;
	Date fecha = new Date();

	@GetMapping(value = { "/ListarNoDomi/{cia}/{año}" })
	@ResponseBody
	public ResponseEntity<List<lcoNdom>> listaCia(@PathVariable(value = "cia", required = false) String cia,
			@PathVariable(value = "año", required = false) String año)
			throws Exception {

		lcoNdomPk pk = new lcoNdomPk("0", "0", "0", "0");
		lcoNdom obj = new lcoNdom(pk, fecha, "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", fecha, fecha, 0, 0, 0,
				"a",
				0, 0, 0, 0, 0, 0, "a", 0, 0, 0, 0, 0, 0, "a", 0, 0, 0, 0, "a", 0, 0, 0, 0, 0, "a", "a", "a", "a", "a",
				"a", "a",
				"a", "a", "a", 0);
		try {
			List<lcoNdom> lista = service.listarTodo(0, cia, año, obj);

			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1095 + " + e.getMessage());
		}

	}

	@GetMapping("/buscarNoDomi/{p_ciacont}/{año}/{periodo}/{subdiario}/{compro}/{tipreg}")
	@ResponseBody
	public ResponseEntity<List<lcoNdom>> buscarNoDomi(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("año") String año, @PathVariable("periodo") String periodo,
			@PathVariable("subdiario") String subdiario,
			@PathVariable("compro") String compro, @PathVariable("tipreg") String tipreg) throws Exception {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES

		lcoNdomPk pk = new lcoNdomPk(periodo, subdiario, compro, tipreg);
		lcoNdom obj = new lcoNdom(pk, fecha, "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", fecha, fecha, 0, 0, 0,
				"a",
				0, 0, 0, 0, 0, 0, "a", 0, 0, 0, 0, 0, 0, "a", 0, 0, 0, 0, "a", 0, 0, 0, 0, 0, "a", "a", "a", "a", "a",
				"a", "a",
				"a", "a", "a", 0);

		try {
			List<lcoNdom> lista = service.listarTodo(4, p_ciacont, año, obj);

			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1095 + " + e.getMessage());
		}

	}

	@PostMapping("/registraNoDomi/{p_ciacont}/{año}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> CreaNoDomi(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("año") String año, @RequestBody lcoNdom obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		List<lcoNdom> lista = service.listarTodo(4, p_ciacont, año, obj);

		if (lista.size() == 0) {
			try {

				service.registrar(1, p_ciacont, año, obj);
				salida.put("mensaje", "Registrado correctamente");

			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", "Error HUR1021_F " + e.getMessage());
			}
		} else {
			salida.put("mensaje", "Ya existe un registro");
		}
		return ResponseEntity.ok(salida);
	}

	@DeleteMapping("/eliminaNoDomi/{p_ciacont}/{año}/{periodo}/{subdiario}/{compro}/{tipreg}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> eliminaNoDomi(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("año") String año, @PathVariable("periodo") String periodo,
			@PathVariable("subdiario") String subdiario,
			@PathVariable("compro") String compro, @PathVariable("tipreg") String tipreg) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();

		lcoNdomPk pk = new lcoNdomPk(periodo, subdiario, compro, tipreg);
		lcoNdom obj = new lcoNdom(pk, fecha, "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", fecha, fecha, 0, 0, 0,
				"a",
				0, 0, 0, 0, 0, 0, "a", 0, 0, 0, 0, 0, 0, "a", 0, 0, 0, 0, "a", 0, 0, 0, 0, 0, "a", "a", "a", "a", "a",
				"a", "a",
				"a", "a", "a", 0);

		List<lcoNdom> lista = service.listarTodo(4, p_ciacont, año, obj);

		if (lista.size() == 1) {
			try {

				service.registrar(3, p_ciacont, año, obj);
				salida.put("mensaje", "Eliminado correctamente");

			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", "Error HUR1021_F " + e.getMessage());
			}
		} else {
			salida.put("mensaje", "No se encontro Registro");
		}
		return ResponseEntity.ok(salida);
	}

}
