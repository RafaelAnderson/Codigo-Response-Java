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

import com.empresa.entity.lcopcmp;
import com.empresa.entity.lcopcmpPk;
import com.empresa.service.lcopcmpService;

@RestController
@RequestMapping("/rest/lcopcmp")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
		"http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
		"http://192.168.1.213" })
public class lcopcmpController {

	@Autowired
	private lcopcmpService lcopcmpSer;

	@GetMapping(value = { "/listar/{p_ciacont}/{cl_tipcmp}/{cl_parcmp}" })
	@ResponseBody
	public ResponseEntity<List<lcopcmp>> listaLcoPcmp(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value = "cl_tipcmp") String cl_tipcmp,
			@PathVariable(value = "cl_parcmp") String cl_parcmp) throws Exception {

		// Map<String, Object> response = new HashMap<>();

		lcopcmp objSalida = new lcopcmp();
		lcopcmpPk pk = new lcopcmpPk();
		List<lcopcmp> lista;
		try {
			pk.setCl_tipcmp(cl_tipcmp);
			pk.setCl_parcmp(cl_parcmp);
			objSalida.setPk_ID(pk);

			lista = lcopcmpSer.lista(0, p_ciacont, objSalida);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1010 " + e.getMessage());
		}

	}
	// Listar Parametros varios pero solo para los inputs no las cuentas contables

	@GetMapping(value = { "/swListarPrmVn/{p_ciacont}/{cl_tipcmp}/{cl_parcmp}" })
	@ResponseBody
	public ResponseEntity<List<lcopcmp>> listaParametrosInput(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value = "cl_tipcmp") String cl_tipcmp,
			@PathVariable(value = "cl_parcmp") String cl_parcmp) throws Exception {

		// Map<String, Object> response = new HashMap<>();

		lcopcmp objSalida = new lcopcmp();
		lcopcmpPk pk = new lcopcmpPk();
		List<lcopcmp> lista;
		try {
			pk.setCl_tipcmp(cl_tipcmp);
			pk.setCl_parcmp(cl_parcmp);
			objSalida.setPk_ID(pk);

			lista = lcopcmpSer.lista(8, p_ciacont, objSalida);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1011 " + e.getMessage());
		}

	}

	@GetMapping(value = { "/listarComVar/{p_ciacont}" })
	@ResponseBody
	public ResponseEntity<List<lcopcmp>> listaLcopcmpCom(@PathVariable("p_ciacont") String p_ciacont) throws Exception {

		lcopcmp objSalida = new lcopcmp();
		lcopcmpPk pk = new lcopcmpPk();
		pk.setCl_tipcmp("");
		pk.setCl_parcmp("");
		objSalida.setPk_ID(pk);
		List<lcopcmp> lista;
		try {
			lista = lcopcmpSer.listaCom(4, p_ciacont, objSalida);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1010_B   " + e.getMessage());
		}

	}

	@GetMapping(value = { "/listarVenVar/{p_ciacont}" })
	@ResponseBody
	public ResponseEntity<List<lcopcmp>> listaLcopcmpVen(@PathVariable("p_ciacont") String p_ciacont) throws Exception {

		lcopcmp objSalida = new lcopcmp();
		lcopcmpPk pk = new lcopcmpPk();
		pk.setCl_tipcmp("");
		pk.setCl_parcmp("");
		objSalida.setPk_ID(pk);
		List<lcopcmp> lista;
		try {
			lista = lcopcmpSer.listaCom(5, p_ciacont, objSalida);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1011_B   " + e.getMessage());
		}

	}

	@GetMapping(value = { "/listarHonVar/{p_ciacont}" })
	@ResponseBody
	public ResponseEntity<List<lcopcmp>> listaLcopcmpHon(@PathVariable("p_ciacont") String p_ciacont) throws Exception {

		lcopcmp objSalida = new lcopcmp();
		lcopcmpPk pk = new lcopcmpPk();
		pk.setCl_tipcmp("");
		pk.setCl_parcmp("");
		objSalida.setPk_ID(pk);
		List<lcopcmp> lista;
		try {
			lista = lcopcmpSer.listaCom(6, p_ciacont, objSalida);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1012_B   " + e.getMessage());
		}

	}

	@GetMapping(value = { "/listarUlt/{p_ciacont}/{cl_tipcmp}/{cl_parcmp}" })
	@ResponseBody
	public ResponseEntity<List<lcopcmp>> listaLcoPcmpUlt(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value = "cl_tipcmp") String cl_tipcmp,
			@PathVariable(value = "cl_parcmp") String cl_parcmp) throws Exception {

		lcopcmp objSalida = new lcopcmp();
		lcopcmpPk pk = new lcopcmpPk();

		List<lcopcmp> lista;

		try {
			pk.setCl_tipcmp(cl_tipcmp);
			pk.setCl_parcmp(cl_parcmp);
			objSalida.setPk_ID(pk);

			lista = lcopcmpSer.lista(7, p_ciacont, objSalida);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1010 " + e.getMessage());
		}

	}

	@GetMapping(value = { "/listarComND/{p_ciacont}" })
	@ResponseBody
	public ResponseEntity<List<lcopcmp>> listaLcopcmpComND(@PathVariable("p_ciacont") String p_ciacont)
			throws Exception {

		lcopcmp objSalida = new lcopcmp();
		lcopcmpPk pk = new lcopcmpPk();
		pk.setCl_tipcmp("");
		pk.setCl_parcmp("");
		objSalida.setPk_ID(pk);
		List<lcopcmp> lista;
		try {
			lista = lcopcmpSer.listaCom(9, p_ciacont, objSalida);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1012_B   " + e.getMessage());
		}

	}

	@PostMapping("/registralcopcmp/{p_ciacont}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> registraLccopcmp(@PathVariable("p_ciacont") String p_ciacont,
			@RequestBody lcopcmp obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> objSalida = new HashMap<>();

		List<lcopcmp> lista = lcopcmpSer.lista(8, p_ciacont, obj);
		if (lista.size() == 1) {
			objSalida.put("Mensaje", "Ya existe un registro");
		} else {
			try {

				obj.setCl_feccrea(LocalDate.now());
				obj.setCl_hracrea(LocalTime.now());
				obj.setCl_fecact(LocalDate.now());
				obj.setCl_hraact(LocalTime.now());
				lcopcmpSer.agregarRegistro(1, p_ciacont, obj);
				objSalida.put("mensaje", "Registrado correctamente");

			} catch (Exception e) {
				e.printStackTrace();
				objSalida.put("mensaje", "Error HUR1011_B " + e.getMessage());
			}
		}
		return ResponseEntity.ok(objSalida);
	}

	@PutMapping("/actulcopcmp/{p_ciacont}")
	public ResponseEntity<Map<String, Object>> actualizarRegistro(@PathVariable("p_ciacont") String p_ciacont,
			@RequestBody lcopcmp obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		List<lcopcmp> lista = lcopcmpSer.lista(8, p_ciacont, obj);

		if (lista.size() == 1) {
			try {
				// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
				obj.setCl_fecact(LocalDate.now());
				obj.setCl_hraact(LocalTime.now());
				lcopcmpSer.editarRegistro(2, p_ciacont, obj);
				salida.put("mensaje", "Actualizado correctamente");

			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", "Error HUR1011_B " + e.getMessage());
			}
		} else {
			salida.put("mensaje", "No se encontro datos para Actualizar");
		}
		return ResponseEntity.ok(salida);
	}

	@DeleteMapping("/elimRegistro/{p_ciacont}/{cl_tipcmp}/{cl_parcmp}")
	public ResponseEntity<Map<String, Object>> eliminarRegistro(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("cl_tipcmp") String cl_tipcmp, @PathVariable("cl_parcmp") String cl_parcmp) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> response = new HashMap<>();

		// CREAMOS UN OBJETO DE SALIDA
		lcopcmp objSalida = new lcopcmp();
		lcopcmpPk pk = new lcopcmpPk();
		pk.setCl_tipcmp(cl_tipcmp);
		pk.setCl_parcmp(cl_parcmp);
		objSalida.setPk_ID(pk);
		List<lcopcmp> lista = lcopcmpSer.lista(7, p_ciacont, objSalida);
		// List<lcopcmp> listaCom = lcopcmpSer.listaCom(4, p_ciacont, objSalida);
		if (lista.size() == 1) {
			try {

				lcopcmpSer.eliminarRegistro(3, p_ciacont, objSalida);
				response.put("mensaje", "Eliminado correctamente");

			} catch (Exception e) {

				response.put("mensaje", "Error HUR1011_B " + e.getMessage());
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} else {
			// Si no se encuentra el registro en la bd devolvera mensaje
			response.put("mensaje", "Registro no encontrado con el ID= " + (cl_tipcmp) + "/" + cl_parcmp);
		}
		return ResponseEntity.ok(response);
	}

	// nick Lote
	@GetMapping(value = { "/listarLote/{p_ciacont}/{ejer}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> listarLote(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejer") String ejer) throws Exception {

		try {
			List<Map<String, Object>> lista = lcopcmpSer.listarLote("1", p_ciacont, ejer);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1037_B " + e.getMessage());
		}

	}

	// Listar cuentas gravadas y no gravadas
	@GetMapping(value = { "/swListarPrmCmp/{p_ciacont}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> listarCuentaTipoOperacion(
			@PathVariable("p_ciacont") String p_ciacont) throws Exception {

		try {
			lcopcmp objSalida = new lcopcmp();
			lcopcmpPk pk = new lcopcmpPk();
			pk.setCl_tipcmp("");
			pk.setCl_parcmp("");
			objSalida.setPk_ID(pk);
			List<Map<String, Object>> lista = lcopcmpSer.listarCuentaTipoOperacion(10, p_ciacont, objSalida);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1010_B " + e.getMessage());
		}
	}

	// Listar las cuentas contables por pagar en MN

	@GetMapping(value = { "/swListarPrmVntCtaMN/{p_ciacont}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> listarCuentaContableMN(
			@PathVariable("p_ciacont") String p_ciacont) throws Exception {

		try {
			lcopcmp objSalida = new lcopcmp();
			lcopcmpPk pk = new lcopcmpPk();
			pk.setCl_tipcmp("");
			pk.setCl_parcmp("");
			objSalida.setPk_ID(pk);
			List<Map<String, Object>> lista = lcopcmpSer.listarCuentaTipoOperacion(11, p_ciacont, objSalida);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1011_B " + e.getMessage());
		}
	}

	// Lista las cuentas contables de ventas

	@GetMapping(value = { "/swListarPrmVntCtaV/{p_ciacont}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> listarCuentascontablesVentas(
			@PathVariable("p_ciacont") String p_ciacont) throws Exception {

		try {
			lcopcmp objSalida = new lcopcmp();
			lcopcmpPk pk = new lcopcmpPk();
			pk.setCl_tipcmp("");
			pk.setCl_parcmp("");
			objSalida.setPk_ID(pk);
			List<Map<String, Object>> lista = lcopcmpSer.listarCuentaTipoOperacion(14, p_ciacont, objSalida);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1011_B " + e.getMessage());
		}
	}

	// Lista los subdiarios de compras de la parametrización de comprobantes de
	// compras

	@GetMapping(value = { "/swListarPrmCmpSubCSCF/{p_ciacont}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> listarSubdiariosComprasParam(
			@PathVariable("p_ciacont") String p_ciacont) throws Exception {

		try {
			lcopcmp objSalida = new lcopcmp();
			lcopcmpPk pk = new lcopcmpPk();
			pk.setCl_tipcmp("");
			pk.setCl_parcmp("");
			objSalida.setPk_ID(pk);
			List<Map<String, Object>> lista = lcopcmpSer.listarCuentaTipoOperacion(13, p_ciacont, objSalida);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1010_B " + e.getMessage());
		}
	}

	// Listar las cuentas contables por pagar en ME

	@GetMapping(value = { "/swListarPrmVntCtaME/{p_ciacont}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> listarCuentaContableME(
			@PathVariable("p_ciacont") String p_ciacont) throws Exception {

		try {
			lcopcmp objSalida = new lcopcmp();
			lcopcmpPk pk = new lcopcmpPk();
			pk.setCl_tipcmp("");
			pk.setCl_parcmp("");
			objSalida.setPk_ID(pk);
			List<Map<String, Object>> lista = lcopcmpSer.listarCuentaTipoOperacion(12, p_ciacont, objSalida);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1011_B " + e.getMessage());
		}
	}

	@PostMapping("/registraLote/{cia}/{ejer}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> registraLote(@PathVariable("cia") String cia,
			@PathVariable("ejer") String ejer) {
		Map<String, Object> salida = new HashMap<>();
		try {
			lcopcmpSer.agregarLote("2", cia, ejer);
			salida.put("mensaje", "Registrado correctamente");

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1037_B " + e.getMessage());
		}

		return ResponseEntity.ok(salida);
	}

	@PutMapping("/actulizarLote/{cia}/{ejer}/{lote}")
	public ResponseEntity<Map<String, Object>> actualizarLote(@PathVariable("cia") String cia,
			@PathVariable("ejer") String ejer, @PathVariable("lote") String lote) {

		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			lcopcmpSer.actualizarLote("3", cia, ejer, lote);
			salida.put("mensaje", "Actualizado correctamente");

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1037_B " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	@GetMapping(value = { "/swListarPrmNDCtas/{p_ciacont}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> listarCtaND(
			@PathVariable("p_ciacont") String p_ciacont) throws Exception {

		try {
			lcopcmp objSalida = new lcopcmp();
			lcopcmpPk pk = new lcopcmpPk();
			pk.setCl_tipcmp("");
			pk.setCl_parcmp("");
			objSalida.setPk_ID(pk);
			List<Map<String, Object>> lista = lcopcmpSer.listarCuentaTipoOperacion(15, p_ciacont, objSalida);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1011_B " + e.getMessage());
		}
	}

	@GetMapping(value = { "/swListarPrmCmpXml/{cia}" })
	@ResponseBody
	public ResponseEntity<List<lcopcmp>> swListarPrmCmpXml(
			@PathVariable("cia") String cia) throws Exception {
		try {
			List<lcopcmp> lista = lcopcmpSer.swListarPrmCmpXml(1, cia, "", "", "", "", "", "", "", "");
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1011_B" + e.getMessage());
		}
	}

	@GetMapping(value = { "/swListarPrmCmpCtaMnd/{cia}/{moneda}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> swListarPrmCmpCtaMnd(
			@PathVariable("cia") String cia,
			@PathVariable("moneda") String moneda) throws Exception {
		try {
			List<Map<String, Object>> lista = lcopcmpSer.swListarPrmCmpCtaMnd(2, cia, "", "", "", "", "", "", "",
					moneda);
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1011_B" + e.getMessage());
		}
	}

	@GetMapping(value = { "/swURegPrmCmpXML/{cia}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> swURegPrmCmpXML(
			@PathVariable("cia") String cia) throws Exception {
		try {
			List<Map<String, Object>> lista = lcopcmpSer.swURegPrmCmpXML(3, cia, "", "", "", "", "", "", "", "");
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1011_B" + e.getMessage());
		}
	}

	@GetMapping(value = { "/swPrmCmpVarXml/{cia}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> swPrmCmpVarXml(
			@PathVariable("cia") String cia) throws Exception {
		try {
			List<Map<String, Object>> lista = lcopcmpSer.swPrmCmpVarXml(4, cia, "", "", "", "", "", "", "", "");
			return ResponseEntity.ok().body(lista);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1011_B" + e.getMessage());
		}
	}

}
