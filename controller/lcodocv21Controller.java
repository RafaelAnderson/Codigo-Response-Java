package com.empresa.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.lcodocv21;
import com.empresa.entity.lcodocv21Pk;
import com.empresa.service.lcodocv21Service;

@RestController
@RequestMapping("/rest/lcodocv21")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcodocv21Controller {
	@Autowired
	private lcodocv21Service service;

	@GetMapping("/listarlcodocv21/{p_ciacont}/{ejercicio}/{il_subdia}/{il_compro}/{il_secue}")
	@ResponseBody
	public ResponseEntity<List<lcodocv21>> swListaCabAsiento2(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio, @PathVariable("il_subdia") String il_subdia,
			@PathVariable("il_compro") String il_compro, @PathVariable("il_secue") String il_secue) throws Exception {

// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
//Map<String, Object> response = new HashMap<>();
		lcodocv21 objSalida = new lcodocv21();
		lcodocv21Pk pk = new lcodocv21Pk();
		List<lcodocv21> lista = new ArrayList<>();

		try {

			pk.setIl_subdia(il_subdia);
			pk.setIl_compro(il_compro);
			pk.setIl_secue(il_secue);

			objSalida.setPk(pk);

			lista = service.swListaCabAsiento(5, p_ciacont, ejercicio, objSalida);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}
	@GetMapping("/listarlcodocv21/{p_ciacont}/{ejercicio}/{il_subdia}/{il_compro}")
	@ResponseBody
	public ResponseEntity<List<lcodocv21>> swListaCabAsiento(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio, @PathVariable("il_subdia") String il_subdia,
			@PathVariable("il_compro") String il_compro) throws Exception {

// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
//Map<String, Object> response = new HashMap<>();
		lcodocv21 objSalida = new lcodocv21();
		lcodocv21Pk pk = new lcodocv21Pk();
		List<lcodocv21> lista = new ArrayList<>();

		try {

			pk.setIl_subdia(il_subdia);
			pk.setIl_compro(il_compro);
			pk.setIl_secue("");

			objSalida.setPk(pk);

			lista = service.swListaCabAsiento(0, p_ciacont, ejercicio, objSalida);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}

	@GetMapping("/listaUltSecDoc/{p_ciacont}/{ejercicio}/{il_subdia}/{il_compro}")
	@ResponseBody
	public ResponseEntity<List<Object[]>> swObtUltSecDocV(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio, 
			@PathVariable("il_subdia") String il_subdia,
			@PathVariable("il_compro") String il_compro) throws Exception {

// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
//Map<String, Object> response = new HashMap<>();
		lcodocv21 objSalida = new lcodocv21();
		lcodocv21Pk pk = new lcodocv21Pk();
		List<Object[]> lista = new ArrayList<>();

		try {

			pk.setIl_subdia(il_subdia);
			pk.setIl_compro(il_compro);
			pk.setIl_secue("");

			objSalida.setPk(pk);

			lista = service.swObtUltSecDocV(4, p_ciacont, ejercicio, objSalida);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}
	/*
	 * METODO POST PARA LISTAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA
	 * COMPAÑIA), COD_TABLA Y COD_CLAVE PARAMETROS: P_CIACONT, NUMERO DE LA COMPAÑIA
	 * COD_TABLA, CODIGO DE TABLA A BUSCAR, COD_CLAVE, CODIGO CLAVE A
	 * BUSCAR(OPCIONAL)
	 */
	@PostMapping("/registralcodocv21/{p_ciacont}/{ejercicio}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> swCreaDocAsiento(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio, @RequestBody lcodocv21 obj) {
//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		List<lcodocv21> lista = service.swListaCabAsiento(5, p_ciacont, ejercicio, obj);

		if (lista.size() == 0) {
			try {
				// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
				obj.setIl_fecCrea(LocalDate.now());
				obj.setIl_hracrea(LocalTime.now());
				obj.setIl_fecact(LocalDate.now());
				obj.setIl_hraact(LocalTime.now());
				service.swCreaDocAsiento(1, p_ciacont, ejercicio, obj);
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

	/*
	 * METODO PUT PARA ACTUALIZAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA
	 * COMPAÑIA) PARAMETROS: P_CIACONT, NUMERO DE LA COMPAÑIA
	 */
	@PutMapping("actulcodocv21/{p_ciacont}/{ejercicio}")
	public ResponseEntity<Map<String, Object>> swActuaDocAsie(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio, @RequestBody lcodocv21 obj) {
//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> salida = new HashMap<>();
		List<lcodocv21> lista = service.swListaCabAsiento(0, p_ciacont, ejercicio, obj);
		if (lista.size() == 1) {
			try {
				// ACTUALIZAMOS EL DIA Y LA HORA
				obj.setIl_fecact(LocalDate.now());
				obj.setIl_hraact(LocalTime.now());

				// LLAMAMOS AL OBJETO SERVICE E INVOCAMOS AL METODO EDITAR REGISTRO
				// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 2, QUE HARA EL UPDATE DESDE EL
				// PROCEDURE
				// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				// COMO TERCER PARAMETRO LE PASAMOS EL OBJETO CON LOS CAMPOS QUE QUEREMOS
				// ACTUALIZAR
				service.swActuaDocAsie(2, p_ciacont, ejercicio, obj);
				salida.put("mensaje", "Actualizado correctamente");
			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", "Error HUR1021_F " + e.getMessage());
			}
		} else {
			salida.put("mensaje", "No se  encontro datos para Actualizar");
		}
		return ResponseEntity.ok(salida);

	}

	/*
	 * METODO DELETE PARA ELIMINAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA
	 * COMPAÑIA), COD_TABLA Y COD_CLAVE PARAMETROS: P_CIACONT, NUMERO DE LA COMPAÑIA
	 * COD_TABLA, CODIGO DE LA TABLA, CAMPO DE LA PRIMARY KEY COD_CLAVE, CLAVE DE LA
	 * TABLA, CAMPO DE LA PRIMERY KEY
	 */
	@DeleteMapping("elimTablalcodocv21/{p_ciacont}/{ejercicio}/{il_subdia}/{il_compro}/{il_secue}")
	public ResponseEntity<Map<String, Object>> swEliminarDocAsie(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio, @PathVariable("il_subdia") String il_subdia,
			@PathVariable("il_compro") String il_compro, @PathVariable("il_secue") String il_secue) {
		// CREAMOS UN OBJETO DE SALIDA
		lcodocv21 objSalida = new lcodocv21();
		// CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> salida = new HashMap<>();
		lcodocv21Pk pk = new lcodocv21Pk();
		objSalida.setPk(pk);
		pk.setIl_subdia(il_subdia);
		pk.setIl_compro(il_compro);
		pk.setIl_secue(il_secue);
		List<lcodocv21> lista = service.swListaCabAsiento(5, p_ciacont, ejercicio, objSalida);
		if (lista.size() == 1) {
			try {
				

				service.swEliminarDocAsie(3, p_ciacont, ejercicio, objSalida);
				salida.put("mensaje", "Eliminado correctamente");
			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", "Error HUR1021_F " + e.getMessage());
			}
		} else {
			salida.put("mensaje", "No se encontro registro");
		}
		return ResponseEntity.ok(salida);
	}


	@PostMapping("/modificar/{p_ciacont}/{ejercicio}/{il_subdia}/{il_compro}/{il_descri}")
	@ResponseBody
	public ResponseEntity<Object> modificarAsientos(	
		
			@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("ejercicio") String ejercicio,
			@PathVariable("il_subdia") String il_subdia,
			@PathVariable("il_compro") String il_compro,
			@PathVariable("il_descri") String il_descri) throws Exception {

// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
//Map<String, Object> response = new HashMap<>();
		lcodocv21 obj = new lcodocv21();
		lcodocv21Pk pk = new lcodocv21Pk();
		// List<lcodocv21> lista = new ArrayList<>();
		Map<String, Object> salida = new HashMap<>();
		try {
			pk.setIl_subdia(il_subdia);
			pk.setIl_compro(il_compro);

			obj.setPk(pk);
			obj.setIl_descri(il_descri);
            obj.setIl_fecCrea(LocalDate.now());
            obj.setIl_hracrea(LocalTime.now());
            obj.setIl_fecact(LocalDate.now());
            obj.setIl_hraact(LocalTime.now());

			service.modificarAsientos(p_ciacont, ejercicio, obj);
            salida.put("mensaje", "MODIFICADOS correctamente");

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			// return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            e.printStackTrace();
            
			// throw new Exception("Error HUR1021_F  + " + e.getMessage());
				salida.put("mensaje", "ERROR OCURRIDO" + e);
            
        }
        return ResponseEntity.ok(salida);
	}

}
