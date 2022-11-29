package com.empresa.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.empresa.entity.lcociec;
import com.empresa.service.lcociecService;

@RestController
@RequestMapping("/rest/lcociec")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcociecController {

	@Autowired
	private lcociecService lcociecService;

	@GetMapping(value = { "/listarlcociec/{p_ciacont}", "/listarlcociec/{p_ciacont}/{cl_asien}" })
	public ResponseEntity<List<lcociec>> ListaCiec(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value = "cl_asien", required = false) String cl_asien) throws Exception {
//Map<String, Object[]> response = new HashMap<>();
		lcociec objSalida = new lcociec("01", "e", "d", "hf", LocalDate.now(), LocalTime.now(), "f", LocalDate.now(),
				LocalTime.now());

		List<lcociec> lista;

		try {
			if (cl_asien == null) {
				objSalida.setCl_asien("");
			} else {
				objSalida.setCl_asien(cl_asien);
			}

			lista = lcociecService.listaAllCabecera(0, p_ciacont, objSalida);

		} catch (Exception e) {
			throw new Exception("Error HUR1003_F  + " + e.getMessage());
		}
		return ResponseEntity.ok(lista);

	}

	@PostMapping("/registrarlcociec/{p_ciacont}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> registraCiec(@PathVariable("p_ciacont") String p_ciacont,
			@RequestBody lcociec obj) {
//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
			obj.setCl_feccrea(LocalDate.now());
			obj.setCl_hracrea(LocalTime.now());
			obj.setCl_fecact(LocalDate.now());
			obj.setCl_hraact(LocalTime.now());
			lcociecService.agregarRegistro(1, p_ciacont, obj);
			salida.put("mensaje", "Registrado correctamente");

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR100_B " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@PutMapping("/actulcociec/{p_ciacont}")
	public ResponseEntity<Map<String, Object>> actualizarCiec(@PathVariable("p_ciacont") String p_ciacont,
			@RequestBody lcociec obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			obj.setCl_feccrea(LocalDate.now());
			obj.setCl_hracrea(LocalTime.now());
			obj.setCl_fecact(LocalDate.now());
			obj.setCl_hraact(LocalTime.now());
			lcociecService.editarRegistro(2, p_ciacont, obj);
			salida.put("mensaje", "Actualizado correctamente");

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1009_B " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@DeleteMapping("/elimCiec/{p_ciacont}/{cl_asien}")
	public ResponseEntity<Map<String, Object>> eliminarRegistro(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("cl_asien") String cl_asien) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> response = new HashMap<>();
		lcociec objSalida = new lcociec();
		objSalida.setCl_asien(cl_asien); // el seteo del id se debe colocar aqui
		List<lcociec> lista = lcociecService.listaAllCabecera(0, p_ciacont, objSalida);

		if (lista.size() == 1) {
			try {
				lcociecService.eliminarRegistro(3, p_ciacont, objSalida);
				response.put("mensaje", "Eliminado correctamente");

			} catch (Exception e) {
				response.put("Mensaje", "Ocurrio un error al eliminar con id: ".concat(cl_asien));
				response.put("mensaje", "Error HUR1009_B " + e.getMessage());
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}

		} else {
			response.put("mensaje", "No se encontro datos con el id ".concat(p_ciacont) + "- ".concat(cl_asien));
		}

		return ResponseEntity.ok(response);
	}
	
	
	@DeleteMapping("/elimCabDet/{p_ciacont}/{cl_asien}")
	public ResponseEntity<Map<String, Object>> eliminarDetaCabe(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("cl_asien") String cl_asien) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> response = new HashMap<>();
		lcociec objSalida = new lcociec();
		objSalida.setCl_asien(cl_asien); // el seteo del id se debe colocar aqui
		List<lcociec> lista = lcociecService.listaAllCabecera(0, p_ciacont, objSalida);

		if (lista.size() == 1) {
			try {
				lcociecService.eliminarRegistro(4, p_ciacont, objSalida);
				response.put("mensaje", "Eliminado correctamente");

			} catch (Exception e) {
				response.put("Mensaje", "Ocurrio un error al eliminar con id: ".concat(cl_asien));
				response.put("mensaje", "Error HUR1009_B " + e.getMessage());
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}

		} else {
			response.put("mensaje", "No se encontro datos con el id ".concat(p_ciacont) + "- ".concat(cl_asien));
		}

		return ResponseEntity.ok(response);
	}
	
	

}
