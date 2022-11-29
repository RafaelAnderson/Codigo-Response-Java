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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.lcoTasa;
import com.empresa.entity.lcoTasaPk;
import com.empresa.service.lcoTasaService;

@RestController
@RequestMapping("/rest/lcoTasa")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
		"http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
		"http://192.168.1.213" })
public class lcoTasaController {

	@Autowired
	lcoTasaService service;

	@GetMapping(value = { "/swListarTASA/{p_ciacont}/{tl_tiptasa}",
			"/swListarTASA/{p_ciacont}/{tl_tiptasa}/{tl_codtasa}" })
	@ResponseBody
	public ResponseEntity<List<lcoTasa>> listaPorCodigo(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("tl_tiptasa") String tl_tiptasa,
			@PathVariable(value = "tl_codtasa", required = false) String tl_codtasa) throws Exception {

		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA

		// CREAMOS UN OBJETO QUE SERA LA LLAVE PRIMARIA
		lcoTasaPk pk = new lcoTasaPk();
		// SETEAMOS EL CODIGO DE TABLA, CON EL CODIGO DE TABLA QUE VIENE POR PARAMETRO
		// EN LA URL
		if (tl_codtasa != null) {
			// SI VIENE POR PARAMETRO EL CODIGO CLAVE ENTONCES SETEAMOS ESE VALOR
			pk.setTl_codtasa(tl_codtasa);
		} else {
			pk.setTl_codtasa("");
		}

		pk.setTl_tiptasa(tl_tiptasa);

		lcoTasa objSalida = new lcoTasa(pk, "", 0, 0, 0, "", "", "",
				"", null, null, "", null, null);
		try {
			// CREAMOS UNA LISTA Y LA LLENAMOS CON LA DATA QUE NOS LLEGA DE LA BASE DE DATOS
			// TAMBIEN LLAMAMOS AL OBJETO SERVICE E INVOCAMOS A SU METODO LISTA UN REGISTRO
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 4, QUE REALIZARA EL METODO GET
			// PARA UN REGISTRO ESPECIFICO
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO DE SALIDA, REQUERIDO POR EL
			// PROCEDURE
			List<lcoTasa> lista = service.listaTasa(0, p_ciacont, objSalida);
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			throw new Exception("Error HUR1014 + " + e.getMessage());
		}
	}

	@PostMapping("/swCreaTASA/{p_ciacont}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> registraTasa(@PathVariable("p_ciacont") String p_ciacont,
			@RequestBody lcoTasa obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
			// Buscamos si existe el registro primero
			List<lcoTasa> lista = service.listaTasa(0, p_ciacont, obj);

			if (lista.size() == 1) {
				salida.put("mensaje", "Tasa ya existe");
			} else {

				obj.setTl_feccrea(LocalDate.now());
				obj.setTl_hracrea(LocalTime.now());
				obj.setTl_fecact(LocalDate.now());
				obj.setTl_hraact(LocalTime.now());

				service.transaccion(1, p_ciacont, obj);
				salida.put("mensaje", "Tasa registrada correctamente");
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1014 " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@PutMapping("/swActuTASA/{p_ciacont}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> actualizaTasa(@PathVariable("p_ciacont") String p_ciacont,
			@RequestBody lcoTasa obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
			// Buscamos si existe el registro primero
			List<lcoTasa> lista = service.listaTasa(0, p_ciacont, obj);

			if (lista.size() != 1) {
				salida.put("mensaje", "Tasa no existe");
			} else {

				obj.setTl_feccrea(LocalDate.now());
				obj.setTl_hracrea(LocalTime.now());
				obj.setTl_fecact(LocalDate.now());
				obj.setTl_hraact(LocalTime.now());

				service.transaccion(2, p_ciacont, obj);
				salida.put("mensaje", "Tasa actualiza correctamente");
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1014 " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@DeleteMapping("/swEliminaTASA/{p_ciacont}/{tl_tiptasa}/{tl_codtasa}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> eliminaTasa(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("tl_tiptasa") String tl_tiptasa, @PathVariable("tl_codtasa") String tl_codtasa) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {

			lcoTasaPk pk = new lcoTasaPk();
			pk.setTl_codtasa(tl_codtasa);
			pk.setTl_tiptasa(tl_tiptasa);

			lcoTasa objSalida = new lcoTasa(pk, "", 0, 0, 0, "", "", "",
					"", null, null, "", null, null);
			// Buscamos si existe el registro primero
			List<lcoTasa> lista = service.listaTasa(0, p_ciacont, objSalida);

			if (lista.size() != 1) {
				salida.put("mensaje", "Tasa no existe");
			} else {

				service.transaccion(3, p_ciacont, objSalida);
				salida.put("mensaje", "Tasa eliminada correctamente");
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1014 " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

}
