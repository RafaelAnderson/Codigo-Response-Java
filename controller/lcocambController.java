package com.empresa.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
import com.empresa.entity.lcocamb;
import com.empresa.entity.lcocambPk;
import com.empresa.service.lcocambService;

@RestController
@RequestMapping("/rest/lcocamb")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcocambController {

	@Autowired
	private lcocambService lcocambService;

	@GetMapping("/listarlcocambo/{year}/{month}/{cl_tipmon}")
	@ResponseBody
	public ResponseEntity<List<lcocamb>> getByYearMonth(@PathVariable("year") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) int year,@PathVariable("month")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)  int  month,
			@PathVariable("cl_tipmon") String  cl_tipmon) throws Exception {

		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		lcocamb objSalida = new lcocamb();
		// CREAMOS UN OBJETO QUE SERA LA LLAVE PRIMARIA
		lcocambPk pk = new lcocambPk();
		List<lcocamb> lista;
		try {
			pk.setCl_tipmon(cl_tipmon);
			
			
			//pk.setCl_fectcamb(year);

			objSalida.setPk_ID(pk);

			 lista = lcocambService.getByYearMonth(year,month,cl_tipmon);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1008_B  + " + e.getMessage());
		}
		return ResponseEntity.ok(lista);
	}

	
	//========================================================================================================================
	
	@GetMapping("/listarlcocamb/{cl_tipmon}/{cl_fectcamb}")
	@ResponseBody
	public ResponseEntity<List<lcocamb>> lista(@PathVariable("cl_tipmon") String cl_tipmon,
			@PathVariable("cl_fectcamb")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate cl_fectcamb) throws Exception {

		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		lcocamb objSalida = new lcocamb();
		// CREAMOS UN OBJETO QUE SERA LA LLAVE PRIMARIA
		lcocambPk pk = new lcocambPk();
		List<lcocamb> lista;
		try {
			pk.setCl_tipmon(cl_tipmon);
			pk.setCl_fectcamb(cl_fectcamb);

			objSalida.setPk_ID(pk);

			 lista = lcocambService.listaRegistros(0, objSalida);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1008_B  + " + e.getMessage());
		}
		return ResponseEntity.ok(lista);
	}

	@PostMapping("/registralcocamb")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> registraCostos(@RequestBody lcocamb obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
			obj.setCl_feccrea(LocalDate.now());
			obj.setCl_hracrea(LocalTime.now());
			obj.setCl_fecact(LocalDate.now());
			obj.setCl_hraact(LocalTime.now());
			lcocambService.NuevoRegistro(1, obj);
			salida.put("mensaje", "Registrado correctamente");

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1003_B " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@PutMapping("/actulcocamb")
	public ResponseEntity<Map<String, Object>> actualizarRegistro(@RequestBody lcocamb obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS

			obj.setCl_fecact(LocalDate.now());
			obj.setCl_hraact(LocalTime.now());
			lcocambService.editarRegistro(2, obj);
			salida.put("mensaje", "Actualizado correctamente");

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1003_B " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@DeleteMapping("elimTablalcocamb/{cl_tipmon}/{cl_fectcamb}")
	public ResponseEntity<Map<String, Object>> eliminarRegistro(@PathVariable("cl_tipmon") String cl_tipmon,
			@PathVariable("cl_fectcamb")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String cl_fectcamb) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> response = new HashMap<>();

		lcocambPk pk = new lcocambPk();
		// CREAMOS UN OBJETO DE SALIDA
		lcocamb objSalida = new lcocamb();
		// SETEAMOS LOS VALORES DE LOS CAMPOS DE LA LLAVE PRIMARIA,
		// PARA SABER QUE REGISTRO SE VA A ELIMINAR
		pk.setCl_tipmon(cl_tipmon);
		pk.setCl_fectcamb(LocalDate.parse(cl_fectcamb));
		objSalida.setPk_ID(pk);
		List<lcocamb> lista = lcocambService.listaRegistros(0, objSalida);
		if (lista.size() == 0) {
			response.put("mensaje", "No se encontro los datos con el id ".concat(cl_tipmon));
		} else {
			try {
				
				lcocambService.eliminarRegistro(3, objSalida);
				response.put("mensaje", "Eliminado correctamente");

			} catch (Exception e) {
				response.put("Mensaje", "Ocurrio un error al eliminar con id ".concat(cl_tipmon).concat(cl_fectcamb));
				response.put("mensaje", "Error HUR1003_B " + e.getMessage());
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return ResponseEntity.ok(response);
	}


	
	//==============================================================================================================================
	@GetMapping("/listarTcb/{cl_tipmon}/{cl_fectcamb}")
	@ResponseBody
	public ResponseEntity<List<lcocamb>> swListarTcb(@PathVariable("cl_tipmon") String cl_tipmon,
			@PathVariable("cl_fectcamb")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate cl_fectcamb) throws Exception {

		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		lcocamb objSalida = new lcocamb();
		// CREAMOS UN OBJETO QUE SERA LA LLAVE PRIMARIA
		lcocambPk pk = new lcocambPk();
		List<lcocamb> lista;
		try {
			pk.setCl_tipmon(cl_tipmon);
			pk.setCl_fectcamb(cl_fectcamb);

			objSalida.setPk_ID(pk);

			 lista = lcocambService.swListarTcb(0, objSalida);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1008_B  + " + e.getMessage());
		}
		return ResponseEntity.ok(lista);
	}

	@PostMapping("/registrarTcb")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> registrarTcb(@RequestBody lcocamb obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
			obj.setCl_feccrea(LocalDate.now());
			obj.setCl_hracrea(LocalTime.now());
			obj.setCl_fecact(LocalDate.now());
			obj.setCl_hraact(LocalTime.now());
			lcocambService.registrarTcb(1, obj);
			salida.put("mensaje", "Registrado correctamente");

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1003_B " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@PutMapping("/actualizarTcb")
	public ResponseEntity<Map<String, Object>> actualizarTcb(@RequestBody lcocamb obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS

			obj.setCl_fecact(LocalDate.now());
			obj.setCl_hraact(LocalTime.now());
			lcocambService.actualizarTcb(2, obj);
			salida.put("mensaje", "Actualizado correctamente");

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1003_B " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@PutMapping("/actualizarTcbNic")
	public ResponseEntity<Map<String, Object>> actualizarTcbNic(@RequestBody lcocamb obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS

			obj.setCl_fecact(LocalDate.now());
			obj.setCl_hraact(LocalTime.now());
			lcocambService.actualizarTcbNic(4, obj);
			salida.put("mensaje", "Actualizado correctamente");

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1034_B " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@DeleteMapping("eliminarTcb/{cl_tipmon}/{cl_fectcamb}")
	public ResponseEntity<Map<String, Object>> eliminarTcb(@PathVariable("cl_tipmon") String cl_tipmon,
			@PathVariable("cl_fectcamb")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String cl_fectcamb) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> response = new HashMap<>();

		lcocambPk pk = new lcocambPk();
		// CREAMOS UN OBJETO DE SALIDA
		lcocamb objSalida = new lcocamb();
		// SETEAMOS LOS VALORES DE LOS CAMPOS DE LA LLAVE PRIMARIA,
		// PARA SABER QUE REGISTRO SE VA A ELIMINAR
		pk.setCl_tipmon(cl_tipmon);
		pk.setCl_fectcamb(LocalDate.parse(cl_fectcamb));
		objSalida.setPk_ID(pk);
		List<lcocamb> lista = lcocambService.swListarTcb(0, objSalida);
		if (lista.size() == 0) {
			response.put("mensaje", "No se encontro los datos con el id ".concat(cl_tipmon));
		} else {
			try {
				
				lcocambService.eliminarTcb(3, objSalida);
				response.put("mensaje", "Eliminado correctamente");

			} catch (Exception e) {
				response.put("Mensaje", "Ocurrio un error al eliminar con id ".concat(cl_tipmon).concat(cl_fectcamb));
				response.put("mensaje", "Error HUR1003_B " + e.getMessage());
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return ResponseEntity.ok(response);
	}
}
