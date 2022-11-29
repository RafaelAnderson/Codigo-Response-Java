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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.lcoCabV;
import com.empresa.entity.lcoCabVPk;
import com.empresa.entity.lcoDetV;
import com.empresa.entity.lcoDetVPk;
import com.empresa.service.lcoCabVService;

@RestController
@RequestMapping("/rest/lcoCabV")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcoCabVController {

	Date fecha = new Date();
	LocalDate fechaLocalDate = LocalDate.now();

	@Autowired
	lcoCabVService service;

	@GetMapping("/listUltNumReaV2/{cl_subdia}/{p_ciacont}/{ejercicio}/{p_ejer}/{mes}")
	public ResponseEntity<List<Object[]>> listUltimoNumRea_V2(
			@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("p_ejer") String p_ejer,
			@PathVariable("mes") String mes,
			@PathVariable("cl_subdia") String cl_subdia,
			@PathVariable("ejercicio") String ejercicio) throws Exception {
		// Map<String, Object[]> response = new HashMap<>();
		lcoCabV pk = new lcoCabV();
		lcoCabVPk objSalida = new lcoCabVPk();

		// List<Object[]> lista;
		try {

			objSalida.setCl_subdia(cl_subdia);
			objSalida.setCl_compro("");
			pk.setPk(objSalida);

			List<Object[]> lista = service.listUltimoNumReaV2(0, p_ciacont, p_ejer, mes, ejercicio, pk);
			return ResponseEntity.ok(lista);

		} catch (Exception e) {
			throw new Exception("Error HUR1003_F  + " + e.getMessage());
		}
		//pk, "", LocalDate.now(), "", "", 0.0, LocalDate.now(), "", "", 0.0, "", "",
		//"", "", "", null, null, "", null, null, "", ""

	}

	@GetMapping("/listaCabV/{cia}/{p_ejer}/{subida}/{compra}")
	@ResponseBody
	public ResponseEntity<List<lcoCabV>> lista(@PathVariable(value = "subida") String subida,
			@PathVariable(value = "compra") String compra,
			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "p_ejer") String p_ejer) throws Exception {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		// Map<String, Object> salida = new HashMap<>();

		lcoCabVPk pk = new lcoCabVPk(subida, compra);

		lcoCabV obj = new lcoCabV();
				obj.setPk(pk);
		try {

			obj.setCl_fecCrea(LocalDate.now());
			obj.setCl_hracrea(LocalTime.now());
			obj.setCl_fecact(LocalDate.now());
			obj.setCl_hraact(LocalTime.now());
			List<lcoCabV> listado = service.listar(4, cia, p_ejer, obj);
			return ResponseEntity.ok(listado);

		} catch (Exception e) {

			throw new Exception("Error HUR1021 + " + e.getMessage());
		}

	}

	// Devolver asientos segun cia,p_ejer y subdiario
	@GetMapping("/listarAsientosxCbo/{cia}/{p_ejer}/{subdia}")
	@ResponseBody
	public ResponseEntity<List<lcoCabV>> listarAsientosxCbo(
			@PathVariable(value = "subdia") String subida,
			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "p_ejer") String p_ejer) throws Exception {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		// Map<String, Object> salida = new HashMap<>();

		lcoCabVPk pk = new lcoCabVPk(subida, "");

		lcoCabV obj = new lcoCabV(pk, "", LocalDate.now(), "", "", 0.0, LocalDate.now(), "", "", 0.0, "", "",
				"", "", "", null, null, "", null, null, "", "");

		try {

			obj.setCl_fecCrea(LocalDate.now());
			obj.setCl_hracrea(LocalTime.now());
			obj.setCl_fecact(LocalDate.now());
			obj.setCl_hraact(LocalTime.now());
			List<lcoCabV> listado = service.listar(7, cia, p_ejer, obj);
			return ResponseEntity.ok(listado);

		} catch (Exception e) {

			throw new Exception("Error HUR1021 + " + e.getMessage());
		}

	}

	// Devolver asientos segun cia,p_ejer,subdiario,estado
	@GetMapping("/listarAsientosxEstado/{cia}/{p_ejer}/{subdia}/{estado}")
	@ResponseBody
	public ResponseEntity<List<lcoCabV>> listarAsientosxEstado(
			@PathVariable(value = "subdia") String subida,
			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "p_ejer") String p_ejer,
			@PathVariable(value = "estado") String estado) throws Exception {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		// Map<String, Object> salida = new HashMap<>();

		lcoCabVPk pk = new lcoCabVPk(subida, "");

		lcoCabV obj = new lcoCabV(pk, "", LocalDate.now(), "", "", 0.0, LocalDate.now(), "", estado, 0.0, "", "",
				"", "", "", null, null, "", null, null, "", "");

		try {

			obj.setCl_fecCrea(LocalDate.now());
			obj.setCl_hracrea(LocalTime.now());
			obj.setCl_fecact(LocalDate.now());
			obj.setCl_hraact(LocalTime.now());
			List<lcoCabV> listado = service.listar(8, cia, p_ejer, obj);
			return ResponseEntity.ok(listado);

		} catch (Exception e) {

			throw new Exception("Error HUR1021 + " + e.getMessage());
		}

	}

	// Devuelve el detalle (comprobante-detalleComprobante-anexo)de un asiento
	@GetMapping("/listarDetalleAsiento/{cia}/{p_ejer}/{cl_subdia}/{cl_compro}")
	@ResponseBody
	public ResponseEntity<List<Object[]>> listarDetalleAsiento(
			@PathVariable(value = "cl_subdia") String cl_subdia,
			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "p_ejer") String p_ejer,
			@PathVariable(value = "cl_compro") String cl_compro) throws Exception {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		// Map<String, Object> salida = new HashMap<>();

		lcoCabVPk pk = new lcoCabVPk(cl_subdia, cl_compro);
		lcoDetVPk dpk = new lcoDetVPk(cl_subdia, cl_compro, "");
		lcoDetV obj2 = new lcoDetV(dpk, fechaLocalDate, "", "", "", "", "", "",
				"", fechaLocalDate, fechaLocalDate, 0.2, "", "", 0.0, 0.0, 0.0, "", "", "", "", "",
				fechaLocalDate, "", 0.0, 0.0, 0.0, "", "", "", "", "", "", 0.0, 0.0, 0.0, "", "",
				"", "", "", "", 0.0, "", 0.0, fechaLocalDate, "", fechaLocalDate, "", "", 0.0, "", "", LocalDate.now(),
				LocalTime.now(),
				"", LocalDate.now(), LocalTime.now(), "", "", "", "", "", "", LocalDate.now(), "");

		lcoCabV obj = new lcoCabV(pk, "", LocalDate.now(), "", "", 10.5, LocalDate.now(), "", "", 10.5, "", "", "", "",
				"", null, null, "", null, null, "", "");

		try {

			List<Object[]> listado = service.listar2(9, cia, p_ejer, obj, obj2);
			System.out.println(listado);
			return ResponseEntity.ok(listado);

		} catch (Exception e) {

			throw new Exception("Error HUR1021 + " + e.getMessage());
		}

	}

	@GetMapping("/listaGrilla/{cia}/{p_ejer}")
	@ResponseBody
	public ResponseEntity<List<lcoCabV>> grilla(

			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "p_ejer") String p_ejer) throws Exception {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		// Map<String, Object> salida = new HashMap<>();

		lcoCabVPk pk = new lcoCabVPk("a", "a");

		lcoCabV obj = new lcoCabV(pk, "", LocalDate.now(), "", "", 0.0, LocalDate.now(), "", "", 0.0, "", "",
				"", "", "", null, null, "", null, null, "", "");

		try {

			obj.setCl_fecCrea(LocalDate.now());
			obj.setCl_hracrea(LocalTime.now());
			obj.setCl_fecact(LocalDate.now());
			obj.setCl_hraact(LocalTime.now());
			List<lcoCabV> listado = service.listar(0, cia, p_ejer, obj);
			return ResponseEntity.ok(listado);

		} catch (Exception e) {

			throw new Exception("Error HUR1021 + " + e.getMessage());
		}

	}

	@GetMapping("/listaxCuenta/{cia}/{p_ejer}/{cuenta}")
	@ResponseBody
	public ResponseEntity<List<lcoCabV>> listaxCuenta(@PathVariable(value = "cuenta") String cuenta,

			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "p_ejer") String p_ejer) throws Exception {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		// Map<String, Object> salida = new HashMap<>();

		lcoCabVPk pk = new lcoCabVPk("0", cuenta);

		lcoCabV obj = new lcoCabV(pk, "", LocalDate.now(), "", "", 0.0, LocalDate.now(), "", "", 0.0, "", "",
				"", "", "", null, null, "", null, null, "", "");

		try {

			obj.setCl_fecCrea(LocalDate.now());
			obj.setCl_hracrea(LocalTime.now());
			obj.setCl_fecact(LocalDate.now());
			obj.setCl_hraact(LocalTime.now());
			List<lcoCabV> listado = service.listar(5, cia, p_ejer, obj);
			return ResponseEntity.ok(listado);

		} catch (Exception e) {

			throw new Exception("Error HUR1021 + " + e.getMessage());
		}

	}

	@GetMapping("/listaUltimo/{cia}/{p_ejer}/{subdia}")
	@ResponseBody
	public ResponseEntity<List<lcoCabV>> listaUltimo(@PathVariable(value = "subdia") String subdia,

			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "p_ejer") String p_ejer) throws Exception {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		// Map<String, Object> salida = new HashMap<>();

		lcoCabVPk pk = new lcoCabVPk(subdia, "00");

		lcoCabV obj = new lcoCabV(pk, "", LocalDate.now(), "", "", 0.0, LocalDate.now(), "", "", 0.0, "", "",
				"", "", "", null, null, "", null, null, "", "");

		try {

			obj.setCl_fecCrea(LocalDate.now());
			obj.setCl_hracrea(LocalTime.now());
			obj.setCl_fecact(LocalDate.now());
			obj.setCl_hraact(LocalTime.now());
			List<lcoCabV> listado = service.listar(6, cia, p_ejer, obj);
			return ResponseEntity.ok(listado);

		} catch (Exception e) {

			throw new Exception("Error HUR1021 + " + e.getMessage());
		}

	}

	@GetMapping("/listarAMayores/{p_ciacont}/{ejercicio}/{cl_subdia}/{cl_compro}")
	@ResponseBody
	public ResponseEntity<List<lcoCabV>> swListaAsientoMayor(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio, @PathVariable("cl_subdia") String cl_subdia,
			@PathVariable("cl_compro") String cl_compro) throws Exception {

		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		// Map<String, Object> response = new HashMap<>();
		lcoCabV objSalida = new lcoCabV();
		// lcoCabV pk = new lcoCabV();
		List<lcoCabV> lista = new ArrayList<>();

		try {

			lcoCabVPk pk = new lcoCabVPk(cl_subdia, cl_compro);

			objSalida.setPk(pk);

			lista = service.listar(10, p_ciacont, ejercicio, objSalida);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}

	@GetMapping("/listarAMayoresEstado/{p_ciacont}/{ejercicio}/{cl_subdia}/{cl_compro}/{estado}")
	@ResponseBody
	public ResponseEntity<List<lcoCabV>> swListaAsientoMayorxEstado(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio, @PathVariable("cl_subdia") String cl_subdia,
			@PathVariable("cl_compro") String cl_compro, @PathVariable("estado") String estado) throws Exception {

		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		// Map<String, Object> response = new HashMap<>();
		lcoCabV objSalida = new lcoCabV();
		// lcoCabV pk = new lcoCabV();
		List<lcoCabV> lista = new ArrayList<>();

		try {

			lcoCabVPk pk = new lcoCabVPk(cl_subdia, cl_compro);

			objSalida.setPk(pk);
			objSalida.setCl_estado(estado);
			lista = service.listar(11, p_ciacont, ejercicio, objSalida);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}

	@GetMapping("/listarEntreAsientos/{p_ciacont}/{ejercicio}/{cl_subdia}/{cl_compro}/{cl_compro2}")
	@ResponseBody
	public ResponseEntity<List<lcoCabV>> EntreAsientos(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio, @PathVariable("cl_subdia") String cl_subdia,
			@PathVariable("cl_compro") String cl_compro, @PathVariable("cl_compro2") String cl_compro2)
			throws Exception {

		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		// Map<String, Object> response = new HashMap<>();
		// lcoCabV objSalida = new lcoCabV();
		// lcoCabV pk = new lcoCabV();
		List<lcoCabV> lista = new ArrayList<>();

		try {

			lista = service.EntreAsientos(1, p_ciacont, ejercicio, cl_subdia, cl_compro, cl_compro2, "");

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}

	@GetMapping("/listarEntreAsientosxEstado/{p_ciacont}/{ejercicio}/{cl_subdia}/{cl_compro}/{cl_compro2}/{estado}")
	@ResponseBody
	public ResponseEntity<List<lcoCabV>> EntreAsientosxEstado(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio, @PathVariable("cl_subdia") String cl_subdia,
			@PathVariable("cl_compro") String cl_compro, @PathVariable("cl_compro2") String cl_compro2,
			@PathVariable("estado") String estado) throws Exception {

		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		// Map<String, Object> response = new HashMap<>();
		// lcoCabV objSalida = new lcoCabV();
		// lcoCabV pk = new lcoCabV();
		List<lcoCabV> lista = new ArrayList<>();

		try {

			lista = service.EntreAsientos(2, p_ciacont, ejercicio, cl_subdia, cl_compro, cl_compro2, estado);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}

	@GetMapping("/totalImporte/{p_ciacont}/{ejercicio}/{dl_subdia}/{dl_compro}")
	@ResponseBody
	public ResponseEntity<List<Object[]>> TotalImporte(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio, @PathVariable("dl_subdia") String dl_subdia,
			@PathVariable("dl_compro") String dl_compro) throws Exception {

		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		// Map<String, Object> response = new HashMap<>();
		// lcoDetV objSalida = new lcoDetV();

		// lcoCabV pk = new lcoCabV();
		List<Object[]> lista = new ArrayList<>();

		try {
			lista = service.TotalImporte(p_ciacont, ejercicio, dl_subdia, dl_compro);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}

	@PostMapping("/registraCabV/{cia}/{p_ejer}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> registra(@RequestBody lcoCabV obj,
			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "p_ejer") String p_ejer) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();

		if (service.listar(4, cia, p_ejer, obj).size() != 1) {
			try {
				// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
				obj.setCl_fecCrea(LocalDate.now());
				obj.setCl_hracrea(LocalTime.now());
				obj.setCl_fecact(LocalDate.now());
				obj.setCl_hraact(LocalTime.now());

				service.transaccional(1, cia, p_ejer, obj);
				salida.put("mensaje", "Registrado correctamente");

			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", "Error HUR10021_B " + e.getMessage());
			}
			return ResponseEntity.ok(salida);

		} else {
			salida.put("mensaje", "Registro ya existente");
			return ResponseEntity.ok(salida);
		}

	}

	@PutMapping("/actuCabV/{cia}/{p_ejer}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> actualizar(@RequestBody lcoCabV obj,
			@PathVariable(value = "cia") String cia,
			@PathVariable(value = "p_ejer") String p_ejer) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();

		if (service.listar(4, cia, p_ejer, obj).size() == 1) {
			try {
				// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
				obj.setCl_fecCrea(LocalDate.now());
				obj.setCl_hracrea(LocalTime.now());
				obj.setCl_fecact(LocalDate.now());
				obj.setCl_hraact(LocalTime.now());
				service.transaccional(2, cia, p_ejer, obj);
				salida.put("mensaje", "Actualizado correctamente");

			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", "Error HUR10021_B " + e.getMessage());
			}
			return ResponseEntity.ok(salida);

		} else {
			salida.put("mensaje", "No se encontro registro");
			return ResponseEntity.ok(salida);
		}

	}

	@DeleteMapping("/deleCabV/{cia}/{p_ejer}/{subdia}/{compro}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> eliminar(
			@PathVariable(value = "cia") String cia, @PathVariable(value = "p_ejer") String p_ejer,
			@PathVariable(value = "subdia") String subdia, @PathVariable(value = "compro") String compro) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		lcoCabVPk pk = new lcoCabVPk(subdia, compro);

		lcoCabV obj = new lcoCabV(pk, "", LocalDate.now(), "", "", 0.0, LocalDate.now(), "", "", 0.0, "", "",
				"", "", "", LocalDate.now(), LocalTime.now(), "", LocalDate.now(), LocalTime.now(), "", "");

		if (service.listar(4, cia, p_ejer, obj).size() == 1) {
			try {
				// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS

				service.transaccional(3, cia, p_ejer, obj);
				salida.put("mensaje", "Eliminado correctamente");

			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", "Error HUR10021_B " + e.getMessage());
			}
			return ResponseEntity.ok(salida);

		} else {
			salida.put("mensaje", "No se encontro registro");
			return ResponseEntity.ok(salida);
		}

	}

	@GetMapping("/listarLibroMayor/{cia}/{ejer}/{per}/{CTAINI}/{CTAFIN}/{option}")
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> ListarLibroMayor(@PathVariable("cia") String cia,
			@PathVariable("ejer") String ejer, @PathVariable("per") String per,
			@PathVariable("CTAINI") String CTAINI, @PathVariable("CTAFIN") String CTAFIN,
			@PathVariable("option") String option) throws Exception {

		List<Map<String, Object>> lista = new ArrayList<>();

		try {
			lista = service.ListarLibroMayor(cia, ejer, per, CTAINI, CTAFIN, option);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}

	@GetMapping("/generarAsiento/{cia}/{ejer}/{pSD}/{pMes}/{pAnio}")
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> generarAsiento(@PathVariable("cia") String cia,
			@PathVariable("ejer") String ejer, @PathVariable("pSD") String pSD,
			@PathVariable("pMes") String pMes, @PathVariable("pAnio") String pAnio) throws Exception {

		List<Map<String, Object>> lista = new ArrayList<>();

		try {
			lista = service.generarAsiento(cia, ejer, pSD, pMes, pAnio);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}

	@GetMapping("/actualizarBalance/{mes}/{cia}/{periodo}/{ejercicio}")
	public ResponseEntity<Map<String, Object>> actualizarBalance(
		@PathVariable("mes") String mes,
		@PathVariable("cia") String cia,
		@PathVariable("periodo") String periodo,
		@PathVariable("ejercicio") String ejercicio
	) throws Exception {
		Map<String, Object> salida = new HashMap<>();
		

		try {
			service.actualizarBalance(mes, cia, periodo, ejercicio);
			salida.put("mensaje", "Registro exitoso");
			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(salida);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}
	}

}