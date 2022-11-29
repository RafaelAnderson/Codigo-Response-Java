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

import com.empresa.entity.lconume;
import com.empresa.entity.lconumePk;
import com.empresa.entity.lcotgen;
import com.empresa.entity.lcotgenPk;
import com.empresa.service.lcogenService;
import com.empresa.service.lconumeService;

@RestController
@RequestMapping("/rest/lconume")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
		"http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
		"http://192.168.1.213" })
public class lconumeController {

	@Autowired
	private lconumeService service;

	@Autowired
	private lcogenService serviceGeneral;

	/*
	 * METODO GET PARA LISTAR LOS REGISTROS SEGUN EL p_codcia(NUMERO DE LA COMPAÑIA)
	 * PARAMETROS:
	 * p_codcia, NUMERO DE LA COMPAÑIA
	 */

	@GetMapping(value = "/Listarlconume/{p_ejer}/{p_codcia}", produces = "application/json")
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> lista(@PathVariable("p_ejer") String ejer,
			@PathVariable("p_codcia") String p_codcia) throws Exception {
		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		lconume objSalida = new lconume();
		// CREAMOS UN OBJETO QUE SERA LA LLAVE PRIMARIA
		lconumePk pk = new lconumePk();
		// SETEAMOS LOS VALORES, ESTOS NO SERAN REQUERIDOS DESDE EL FRONT
		// SON REQUERIDOS PARA EL PROCEDURE
		pk.setNl_subdia("");
		pk.setNl_anio("");
		pk.setNl_mes("");
		objSalida.setNl_nume(5);
		objSalida.setPkID(pk);
		objSalida.setNl_usrcrea("");
		objSalida.setNl_feccrea(LocalDate.now());
		objSalida.setNl_hracrea(LocalTime.now());
		objSalida.setNl_usract("");
		objSalida.setNl_fecact(LocalDate.now());
		objSalida.setNl_hraact(LocalTime.now());

		try {
			// CREAMOS UNA LISTA Y LA LLENAMOS CON LA DATA QUE NOS LLEGA DE LA BASE DE DATOS
			// TAMBIEN LLAMAMOS AL OBJETO SERVICE E INVOCAMOS A SU METODO LISTA REGISTROS
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 0, QUE REALIZARA EL METODO GET
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL p_codcia
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO DE SALIDA, REQUERIDO POR EL
			// PROCEDURE
			List<Map<String, Object>> lista = service.listaNume(0, p_codcia, ejer, objSalida);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1002 + " + e.getMessage());
		}

	}

	@GetMapping("/Listarlconume/{p_ejer}/{p_codcia}/{nl_subdia}/{nl_anio}/{nl_mes}")
	@ResponseBody
	public ResponseEntity<List<lconume>> listaEspecifico(@PathVariable("p_codcia") String p_codcia,
			@PathVariable("p_ejer") String ejer,
			@PathVariable("nl_subdia") String nl_subdia,
			@PathVariable("nl_anio") String nl_anio,
			@PathVariable("nl_mes") String nl_mes) throws Exception {
		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		lconume objSalida = new lconume();
		// CREAMOS UN OBJETO QUE SERA LA LLAVE PRIMARIA
		lconumePk pk = new lconumePk();
		// SETEAMOS LOS VALORES, ESTOS NO SERAN REQUERIDOS DESDE EL FRONT
		// SON REQUERIDOS PARA EL PROCEDURE
		pk.setNl_subdia(nl_subdia);
		pk.setNl_anio(nl_anio);
		pk.setNl_mes(nl_mes);
		objSalida.setNl_nume(5);
		objSalida.setPkID(pk);
		objSalida.setNl_usrcrea("");
		objSalida.setNl_feccrea(LocalDate.now());
		objSalida.setNl_hracrea(LocalTime.now());
		objSalida.setNl_usract("");
		objSalida.setNl_fecact(LocalDate.now());
		objSalida.setNl_hraact(LocalTime.now());
		try {
			// CREAMOS UNA LISTA Y LA LLENAMOS CON LA DATA QUE NOS LLEGA DE LA BASE DE DATOS
			// TAMBIEN LLAMAMOS AL OBJETO SERVICE E INVOCAMOS A SU METODO LISTA REGISTROS
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 0, QUE REALIZARA EL METODO GET
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL p_codcia
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO DE SALIDA, REQUERIDO POR EL
			// PROCEDURE
			List<lconume> lista = service.listaUnNume(0, p_codcia, ejer, objSalida);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1002 + " + e.getMessage());
		}

	}

	@GetMapping("/Listarlconume/{p_ejer}/{p_codcia}/{nl_anio}/{nl_mes}")
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> listaFiltro(@PathVariable("p_codcia") String p_codcia,
			@PathVariable("p_ejer") String ejer,
			@PathVariable("nl_anio") String nl_anio,
			@PathVariable("nl_mes") String nl_mes) throws Exception {
		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		lconume objSalida = new lconume();
		// CREAMOS UN OBJETO QUE SERA LA LLAVE PRIMARIA
		lconumePk pk = new lconumePk();
		// SETEAMOS LOS VALORES, ESTOS NO SERAN REQUERIDOS DESDE EL FRONT
		// SON REQUERIDOS PARA EL PROCEDURE
		pk.setNl_subdia("");
		pk.setNl_anio(nl_anio);
		pk.setNl_mes(nl_mes);
		objSalida.setNl_nume(5);
		objSalida.setPkID(pk);
		objSalida.setNl_usrcrea("");
		objSalida.setNl_feccrea(LocalDate.now());
		objSalida.setNl_hracrea(LocalTime.now());
		objSalida.setNl_usract("");
		objSalida.setNl_fecact(LocalDate.now());
		objSalida.setNl_hraact(LocalTime.now());
		try {
			// CREAMOS UNA LISTA Y LA LLENAMOS CON LA DATA QUE NOS LLEGA DE LA BASE DE DATOS
			// TAMBIEN LLAMAMOS AL OBJETO SERVICE E INVOCAMOS A SU METODO LISTA REGISTROS
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 0, QUE REALIZARA EL METODO GET
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL p_codcia
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO DE SALIDA, REQUERIDO POR EL
			// PROCEDURE
			List<Map<String, Object>> lista = service.listaNume(0, p_codcia, ejer, objSalida);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1002 + " + e.getMessage());
		}
	}

	/*
	 * METODO POST PARA LISTAR LOS REGISTROS SEGUN EL p_codcia(NUMERO DE LA
	 * COMPAÑIA), COD_TABLA Y COD_CLAVE
	 * PARAMETROS:
	 * p_codcia, NUMERO DE LA COMPAÑIA
	 * COD_TABLA, CODIGO DE TABLA A BUSCAR,
	 * COD_CLAVE, CODIGO CLAVE A BUSCAR(OPCIONAL)
	 */
	@PostMapping("/registraNume/{p_ejer}/{p_codcia}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> registraNume(@PathVariable("p_ejer") String ejer,
			@PathVariable("p_codcia") String p_codcia, @RequestBody lconume obj) {

		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			lcotgenPk listageneralpk = new lcotgenPk();
			listageneralpk.setTl_codtabla("02");
			listageneralpk.setTl_clave("");
			lcotgen listageneral = new lcotgen(listageneralpk, "00", "00", "00", LocalDate.now(), LocalTime.now(),
					"", LocalDate.now(), LocalTime.now());
			List<lcotgen> lista = serviceGeneral.listaUnRegistro(0, p_codcia, ejer, listageneral);

			lconumePk pkNume = new lconumePk();
			pkNume.setNl_subdia(obj.getPkID().getNl_subdia());
			pkNume.setNl_anio(obj.getPkID().getNl_anio());
			pkNume.setNl_mes(obj.getPkID().getNl_mes());
			lconume numeEspecifico = new lconume();
			numeEspecifico.setPkID(pkNume);
			List<lconume> listaTest = service.listaUnNume(0, p_codcia, ejer, numeEspecifico);

			if (lista.size() != 1 && listaTest.size() != 1) {
				// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				// COMO SEGUNDO PARAMETRO LE PASAMOS EL p_codcia
				// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÃ‘ADIREMOS
				obj.setNl_feccrea(LocalDate.now());
				obj.setNl_hracrea(LocalTime.now());
				obj.setNl_fecact(LocalDate.now());
				obj.setNl_hraact(LocalTime.now());
				service.registrarNume(1, p_codcia, ejer, obj);
				salida.put("mensaje", "Registrado correctamente");
			} else {
				salida.put("mensaje", "ya existe");
			}

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1002 " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	/*
	 * METODO PUT PARA ACTUALIZAR LOS REGISTROS SEGUN EL p_codcia(NUMERO DE LA
	 * COMPAÑIA)
	 * PARAMETROS:
	 * p_codcia, NUMERO DE LA COMPAÑIA
	 */
	@PutMapping("actuTablaNume/{p_ejer}/{p_codcia}")
	public ResponseEntity<Map<String, Object>> actualizaRegistroNume(@PathVariable("p_ejer") String ejer,
			@PathVariable("p_codcia") String p_codcia, @RequestBody lconume obj) {

		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> salida = new HashMap<>();

		try {
			lcotgenPk listageneralpk = new lcotgenPk();
			listageneralpk.setTl_codtabla("02");
			listageneralpk.setTl_clave("");
			lcotgen listageneral = new lcotgen(listageneralpk, "00", "00", "00", LocalDate.now(), LocalTime.now(), "",
					LocalDate.now(), LocalTime.now());
			List<lcotgen> lista = serviceGeneral.listaUnRegistro(0, p_codcia, ejer, listageneral);
			if (lista != null) {
				// ACTUALIZAMOS EL DIA Y LA HORA
				obj.setNl_feccrea(LocalDate.now());
				obj.setNl_hracrea(LocalTime.now());
				obj.setNl_fecact(LocalDate.now());
				obj.setNl_hraact(LocalTime.now());

				// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS AL METODO EDITAR REGISTRO
				// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 2, QUE HARA EL UPDATE DESDE EL
				// PROCEDURE
				// COMO SEGUNDO PARAMETRO LE PASAMOS EL p_codcia
				// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO CON LOS CAMPOS QUE QUEREMOS
				// ACTUALIZAR
				service.editarNume(2, p_codcia, ejer, obj);
				salida.put("mensaje", "Actualizado correctamente");
			} else {
				salida.put("mensaje", "No se encontro el registro seleccionado");
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1002 " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	/*
	 * METODO DELETE PARA ELIMINAR LOS REGISTROS SEGUN EL p_codcia(NUMERO DE LA
	 * COMPAÑIA), COD_TABLA Y COD_CLAVE
	 * PARAMETROS:
	 * p_codcia, NUMERO DE LA COMPAÑIA
	 * COD_TABLA, CODIGO DE LA TABLA, CAMPO DE LA PRIMARY KEY
	 * COD_CLAVE, CLAVE DE LA TABLA, CAMPO DE LA PRIMERY KEY
	 */
	@DeleteMapping("elimTablanNume/{p_ejer}/{p_codcia}/{nl_subdia}/{nl_anio}/{nl_mes}")
	public ResponseEntity<Map<String, Object>> eliminarRegistro(@PathVariable("p_codcia") String p_codcia,
			@PathVariable("p_ejer") String ejer, @PathVariable("nl_subdia") String nl_subdia,
			@PathVariable("nl_anio") String nl_anio, @PathVariable("nl_mes") String nl_mes) {

		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> salida = new HashMap<>();
		// String tablanume = "0001";
		try {
			/*
			 * 
			 * // Se ha comentado lo siguiente porque hacia referencia a la tabla
			 * lco0001tgen y no
			 * // ejecutaba la función de eliminar una numeración correctamente
			 * 
			 * 
			 * //CREAMOS UN OBJETO DE LA LLAVE PRIMARIA
			 * lcotgenPk listageneralpk = new lcotgenPk();
			 * listageneralpk.setTl_codtabla("02");
			 * listageneralpk.setTl_clave(nl_subdia);
			 * lcotgen listageneral = new lcotgen(listageneralpk, "00", "00", "00",
			 * LocalDate.now(), LocalTime.now(),
			 * "", LocalDate.now(), LocalTime.now());
			 * List<lcotgen> lista = serviceGeneral.listaUnRegistro(0, p_codcia, ejer,
			 * listageneral);
			 * 
			 */

			lconumePk pk = new lconumePk(nl_subdia, nl_anio, nl_mes);
			lconume objSalida = new lconume(pk, 0, "", LocalDate.now(), LocalTime.now(), "", LocalDate.now(),
					LocalTime.now());
			List<lconume> lista = service.listaUnNume(0, p_codcia, ejer, objSalida);

			if (lista.size() == 1) {
				// CREAMOS UN OBJETO DE SALIDA

				// SETEAMOS LOS VALORES DE LOS CAMPOS DE LA LLAVE PRIMARIA,
				// PARA SABER QUE REGISTRO SE VA A ELIMINAR
				/*
				 * pk.setNl_subdia(nl_subdia);
				 * pk.setNl_anio(nl_anio);
				 * pk.setNl_mes(nl_mes);
				 * 
				 * //SETEAMOS LOS VALORES DEL OBJETO, QUE ES REQUERIDO POR EL PROCEDURE
				 * objSalida.setPkID(pk);
				 * objSalida.setNl_nume(0);
				 * objSalida.setNl_usrcrea("");
				 * objSalida.setNl_feccrea(LocalDate.now());
				 * objSalida.setNl_hraact(LocalTime.now());
				 * objSalida.setNl_usract("");
				 * objSalida.setNl_fecact(LocalDate.now());
				 * objSalida.setNl_hraact(LocalTime.now());
				 */
				// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS AL METODO ELIMINAR REGISTRO
				// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 3, QUE HARA EL DELETE DESDE EL
				// PROCEDURE
				// COMO SEGUNDO PARAMETRO LE PASAMOS EL p_codcia
				// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO REQUERIDO POR EL PROCEDURE
				// DEL OBJETO SOLO TOMARA LA LLAVE PRIMARIA
				service.eliminarNume(3, p_codcia, ejer, objSalida);
				salida.put("mensaje", "Eliminado correctamente");
			} else {
				salida.put("mensaje", "No existe el registro");
			}

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1007 " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
}
