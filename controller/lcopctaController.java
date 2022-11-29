package com.empresa.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.*;

import com.empresa.entity.lcopcta;
import com.empresa.service.lcopctaService;

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

@RestController
@RequestMapping("/rest/lcopcta")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
		"http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
		"http://192.168.1.213" })
public class lcopctaController {

	@Autowired
	lcopctaService service;

	/*
	 * METODO GET PARA LISTAR PLAN DE CUENTA SEGUN EL pl_cuenta(numero de cuenta)
	 * PARAMETROS:
	 * p_codcia, NUMERO DE LA COMPAÑIA
	 */
	@GetMapping(value = { "/ListarCtas/{p_ejer}/{p_codcia}", "/ListarCtas/{p_ejer}/{p_codcia}/{pl_cuenta}" })
	@ResponseBody
	public ResponseEntity<List<lcopcta>> listapcta(@PathVariable("p_ejer") String ejer,
			@PathVariable("p_codcia") String p_codcia,
			@PathVariable(value = "pl_cuenta", required = false) String pl_cuenta) throws Exception {

		if (pl_cuenta == null) {
			pl_cuenta = " ";
		}

		Map<String, Object> salida = new HashMap<>();
		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA

		lcopcta objSalida = new lcopcta(pl_cuenta, "1", "1", "1", "1", "1", "1", "1", "1",
				"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1",
				"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "V", "N", LocalDate.now(), LocalTime.now(), "1",
				LocalDate.now(), LocalTime.now());

		// SETEAMOS LOS VALORES, ESTOS NO SERAN REQUERIDOS DESDE EL FRONT
		// SON REQUERIDOS PARA EL PROCEDURE

		try {
			// CREAMOS UNA LISTA Y LA LLENAMOS CON LA DATA QUE NOS LLEGA DE LA BASE DE DATOS
			// TAMBIEN LLAMAMOS AL OBJETO SERVICE E INVOCAMOS A SU METODO LISTA REGISTROS
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 0, QUE REALIZARA EL METODO GET
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL p_codcia
			// COMO TERCER PARAMETRO LE PASAMOS pl_cuenta en caso se requiera un plan de
			// cuenta en especifico que ira dentro de objsalida
			List<lcopcta> lista = service.listaPlanCtas(0, p_codcia, ejer, objSalida);
			if (lista.size() == 0) {
				salida.put("mensaje", "No se encontro plan contable");
				System.out.println("No hay consulta");
			} else
				salida.put("mensaje", "Consulta exitosa");
			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);

		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1001 + " + e.getMessage());
		}

	}

	@GetMapping(value = { "/BuscaCtas/{p_ejer}/{p_codcia}/{pl_cuenta}" })
	@ResponseBody
	public ResponseEntity<List<lcopcta>> Buscar(@PathVariable("p_ejer") String ejer,
			@PathVariable("p_codcia") String p_codcia,
			@PathVariable(value = "pl_cuenta", required = false) String pl_cuenta) throws Exception {

		if (pl_cuenta == null) {
			pl_cuenta = " ";
		}

		Map<String, Object> salida = new HashMap<>();
		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA

		lcopcta objSalida = new lcopcta(pl_cuenta, "1", "1", "1", "1", "1", "1", "1", "1",
				"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1",
				"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "V", "N", LocalDate.now(), LocalTime.now(), "1",
				LocalDate.now(), LocalTime.now());

		// SETEAMOS LOS VALORES, ESTOS NO SERAN REQUERIDOS DESDE EL FRONT
		// SON REQUERIDOS PARA EL PROCEDURE

		try {
			// CREAMOS UNA LISTA Y LA LLENAMOS CON LA DATA QUE NOS LLEGA DE LA BASE DE DATOS
			// TAMBIEN LLAMAMOS AL OBJETO SERVICE E INVOCAMOS A SU METODO LISTA REGISTROS
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 0, QUE REALIZARA EL METODO GET
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL p_codcia
			// COMO TERCER PARAMETRO LE PASAMOS pl_cuenta en caso se requiera un plan de
			// cuenta en especifico que ira dentro de objsalida
			List<lcopcta> lista = service.listaPlanCtas(5, p_codcia, ejer, objSalida);
			if (lista.size() == 0) {
				salida.put("mensaje", "No se encontro plan contable");
				System.out.println("No hay consulta");
			} else
				salida.put("mensaje", "Consulta exitosa");
			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);

		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1001 + " + e.getMessage());
		}

	}

	/*
	 * METODO POST PARA registrar un plan contable
	 * PARAMETROS:
	 * p_codcia, NUMERO DE LA COMPAÑIA
	 * obj, entidad del plan contable
	 * 
	 */
	@PostMapping("/CreaCta/{p_ejer}/{p_codcia}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> registrapcta(@PathVariable("p_ejer") String ejer,
			@PathVariable("p_codcia") String p_codcia, @RequestBody lcopcta obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {

			// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL p_codcia
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
			List<lcopcta> lista = service.listaPlanCtas(4, p_codcia, ejer, obj);

			if (lista.size() == 1) {
				salida.put("mensaje", "Registro ya existe");
			} else {
				obj.setPl_feccrea(LocalDate.now());
				obj.setPl_hracrea(LocalTime.now());
				obj.setPl_fecact(LocalDate.of(2021, 01, 01));
				obj.setPl_hraact(LocalTime.of(01, 01));
				service.registrarNuevoRegistro(1, p_codcia, ejer, obj);
				salida.put("mensaje", "Registrado correctamente");
			}

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1001 " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	/*
	 * METODO put PARA actualizar un plan contable
	 * PARAMETROS:
	 * p_codcia, NUMERO DE LA COMPAÑIA
	 * obj, entidad del plan contable
	 * 
	 */
	@PutMapping("/ActuCta/{p_ejer}/{p_codcia}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> Actualizapcta(@PathVariable("p_ejer") String ejer,
			@PathVariable("p_codcia") String p_codcia, @RequestBody lcopcta obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();

		try {
			// Consultamos si el objeto a actualizar existe en la base de datos sino le
			// manda mensaje a usuario:
			List<lcopcta> lista = service.listaPlanCtas(4, p_codcia, ejer, obj);
			if (lista.size() != 1) {

				salida.put("mensaje", "Plan contable no existe");

			} else {
				// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				// COMO SEGUNDO PARAMETRO LE PASAMOS EL p_codcia
				// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
				obj.setPl_feccrea(LocalDate.now());
				obj.setPl_hracrea(LocalTime.now());
				obj.setPl_fecact(LocalDate.now());
				obj.setPl_hraact(LocalTime.now());

				service.registrarNuevoRegistro(2, p_codcia, ejer, obj);
				salida.put("mensaje", "Actualizado correctamente");
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1001 " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	// Metodo para cambiar estado los planes contables de 1 a 0
	// Parametros :
	/*
	 * p_codcia = CIA de la compañia
	 * pl_cuenta = ID de plan de cuenta para eliminar
	 */
	@DeleteMapping(value = { "/EliminaCta/{p_ejer}/{p_codcia}/{user_act}/{pl_cuenta}",
			"/EliminaCta/{p_codcia}/{user_act}" })
	@ResponseBody
	public ResponseEntity<Map<String, Object>> Eliminapcta(@PathVariable("p_codcia") String p_codcia,
			@PathVariable("user_act") String user_act, @PathVariable("p_ejer") String ejer,
			@PathVariable(value = "pl_cuenta", required = false) String pl_cuenta) throws SQLException {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();

		lcopcta objSalida = new lcopcta(pl_cuenta, "1", "1", "1", "1", "1", "1", "1", "1",
				"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1",
				"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "V", "N", LocalDate.now(), LocalTime.now(),
				user_act, LocalDate.now(), LocalTime.now());

		// Verificamos si objeto que se quiere eliminar existe en la base de Datos

		/*
		 * Connection con = null;
		 * String query =
		 * "SELECT * FROM lco0001pcta WHERE COLUMN NAME = dl_cuenta AND ";
		 * Statement stmt = con.createStatement();
		 * ResultSet rs = stmt.executeQuery(query);
		 * List<lcoDetV> variable;
		 */
		try {

			List<lcopcta> lista1 = service.listaPlanCtas(5, p_codcia, ejer, objSalida);
			List<lcopcta> lista2 = service.listaPlanCtas(6, p_codcia, ejer, objSalida);

			if (lista1.size() == 0) {
				salida.put("mensaje", "Plan contable no existe");
			} // Correcto
			else {
				if (lista2.size() != 0) {
					salida.put("mensaje", "No se puede eliminar, existe referencia(s) en Asientos Contables");
				} else {
					// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
					// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
					// COMO SEGUNDO PARAMETRO LE PASAMOS EL p_codcia
					// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
					service.registrarNuevoRegistro(3, p_codcia, ejer, objSalida);
					salida.put("mensaje", "Eliminado correctamente");
				}
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1001 a" + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
}
