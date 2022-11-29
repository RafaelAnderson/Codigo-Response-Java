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
import com.empresa.entity.lcotrfc;
import com.empresa.entity.lcotrfcPk;
import com.empresa.service.IcontrfcService;

@RestController
@RequestMapping("/rest/lcotrfc")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
		"http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
		"http://192.168.1.213" })
public class lcotrfcController {
	/*
	 * METODO GET PARA LISTAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA
	 * COMPAÑIA) PARAMETROS: P_CIACONT, NUMERO DE LA COMPAÑIA
	 */
	@Autowired
	private IcontrfcService icontrfcService;

	@GetMapping(value = { "/Listarlcotrfc/{p_ciacont}",
			"/Listarlcotrfc/{p_ciacont}/{tl_cntcst}/{tl_ctacar}/{tl_ctaabo}" })
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> listar(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value = "tl_cntcst", required = false) String tl_cntcst,
			@PathVariable(value = "tl_ctacar", required = false) String tl_ctacar,
			@PathVariable(value = "tl_ctaabo", required = false) String tl_ctaabo) throws Exception {

		// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		lcotrfc objSalida = new lcotrfc();
		lcotrfcPk pk = new lcotrfcPk();
		objSalida.setPk_ID(pk);
		List<Map<String, Object>> lista;
		try {
			if (tl_cntcst == null && tl_ctacar == null && tl_ctaabo == null) {
				pk.setTl_cntcst("");
				pk.setTl_ctacar("");
				pk.setTl_ctaabo("");
			} else {
				pk.setTl_cntcst(tl_cntcst);
				pk.setTl_ctacar(tl_ctacar);
				pk.setTl_ctaabo(tl_ctaabo);
			}
			lista = icontrfcService.listaRegistros(0, p_ciacont, objSalida);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1003_F  + " + e.getMessage());
		}

	}

	/*
	 * METODO POST PARA LISTAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA
	 * COMPAÑIA), COD_TABLA Y COD_CLAVE
	 * PARAMETROS:
	 * P_CIACONT, NUMERO DE LA COMPAÑIA
	 * COD_TABLA, CODIGO DE TABLA A BUSCAR,
	 * COD_CLAVE, CODIGO CLAVE A BUSCAR(OPCIONAL)
	 */
	@PostMapping("/registralcotrfc/{p_ciacont}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> crear(@PathVariable("p_ciacont") String p_ciacont,
			@RequestBody lcotrfc obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
			obj.setTl_feccrea(LocalDate.now());
			obj.setTl_hracrea(LocalTime.now());
			obj.setTl_fecact(LocalDate.now());
			obj.setTl_hraact(LocalTime.now());
			icontrfcService.NuevoRegistro(1, p_ciacont, obj);
			salida.put("mensaje", "Registrado correctamente");

		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1003_F " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

	/*
	 * METODO PUT PARA ACTUALIZAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA
	 * COMPAÑIA)
	 * PARAMETROS:
	 * P_CIACONT, NUMERO DE LA COMPAÑIA
	 */
	@PutMapping("actulcotrfc/{p_ciacont}")
	public ResponseEntity<Map<String, Object>> actualizar(@PathVariable("p_ciacont") String p_ciacont,
			@RequestBody lcotrfc obj) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> salida = new HashMap<>();
		try {
			// ACTUALIZAMOS EL DIA Y LA HORA
			obj.setTl_fecact(LocalDate.now());
			obj.setTl_hraact(LocalTime.now());

			// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS AL METODO EDITAR REGISTRO
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 2, QUE HARA EL UPDATE DESDE EL
			// PROCEDURE
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO CON LOS CAMPOS QUE QUEREMOS
			// ACTUALIZAR
			icontrfcService.editarRegistro(2, p_ciacont, obj);
			salida.put("mensaje", "Actualizado correctamente");
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1003_F " + e.getMessage());
		}
		return ResponseEntity.ok(salida);

	}

	/*
	 * METODO DELETE PARA ELIMINAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA
	 * COMPAÑIA), COD_TABLA Y COD_CLAVE
	 * PARAMETROS:
	 * P_CIACONT, NUMERO DE LA COMPAÑIA
	 * COD_TABLA, CODIGO DE LA TABLA, CAMPO DE LA PRIMARY KEY
	 * COD_CLAVE, CLAVE DE LA TABLA, CAMPO DE LA PRIMERY KEY
	 */
	@DeleteMapping("elimTablalcotrfc/{p_ciacont}/{cod_tbl_lcotrfc}/{cod_tbl_tgen}/{cod_ctaabo}")
	public ResponseEntity<Map<String, Object>> eliminar(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("cod_tbl_lcotrfc") String cod_tbl_lcotrfc,
			@PathVariable("cod_tbl_tgen") String cod_tbl_tgen,
			@PathVariable("cod_ctaabo") String cod_ctaabo) {
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> salida = new HashMap<>();
		try {
			// CREAMOS UN OBJETO DE SALIDA
			lcotrfc objSalida = new lcotrfc();

			// CREAMOS UN OBJETO DE LA LLAVE PRIMARIA
			lcotrfcPk pk = new lcotrfcPk();

			// SETEAMOS LOS VALORES DE LOS CAMPOS DE LA LLAVE PRIMARIA,
			// PARA SABER QUE REGISTRO SE VA A ELIMINAR
			pk.setTl_cntcst(cod_tbl_lcotrfc);
			pk.setTl_ctacar(cod_tbl_tgen);
			pk.setTl_ctaabo(cod_ctaabo);

			// SETEAMOS LOS VALORES DEL OBJETO, QUE ES REQUERIDO POR EL PROCEDURE
			objSalida.setPk_ID(pk);
			objSalida.setTl_factor(10.0);
			objSalida.setTl_usrcrea("a");
			objSalida.setTl_feccrea(LocalDate.now());
			objSalida.setTl_hracrea(LocalTime.now());
			objSalida.setTl_usract("a");
			objSalida.setTl_fecact(LocalDate.now());
			objSalida.setTl_hraact(LocalTime.now());

			// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS AL METODO ELIMINAR REGISTRO
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 3, QUE HARA EL DELETE DESDE EL
			// PROCEDURE
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO REQUERIDO POR EL PROCEDURE
			// DEL OBJETO SOLO TOMARA LA LLAVE PRIMARIA
			icontrfcService.eliminarRegistro(3, p_ciacont, objSalida);
			salida.put("mensaje", "Eliminado correctamente");
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1003_F " + e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}

}
