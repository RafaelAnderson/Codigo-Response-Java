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

import com.empresa.entity.lcotgen;
import com.empresa.entity.lcotgenPk;
import com.empresa.service.lcogenService;

@RestController
@RequestMapping("/rest/lcgen")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcgenController {

	@Autowired
	private lcogenService service;
	/*
	METODO GET PARA LISTAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA COMPAÑIA), tl_codtabla Y tl_clave
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
		tl_codtabla, CODIGO DE TABLA A BUSCAR,
		tl_clave, CODIGO CLAVE A BUSCAR(OPCIONAL)
	*/
	@GetMapping(value={"/listarporclave/{p_ejer}/{p_ciacont}/{tl_codtabla}",
			"/listarporclave/{p_ejer}/{p_ciacont}/{tl_codtabla}/{tl_clave}",
			"/listarporclave/{p_ejer}/{p_ciacont}"})
	@ResponseBody
	public ResponseEntity<List<lcotgen>> listaPorCodigo(@PathVariable("p_ciacont") String p_ciacont,
														@PathVariable("p_ejer") String p_ejer,
														@PathVariable(value="tl_codtabla",required = false) String tl_codtabla,
														@PathVariable(value="tl_clave", required=false) String tl_clave) throws Exception{
		
		//CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		lcotgen objSalida = new lcotgen();
		Map<String, Object> salida = new HashMap<>();
		//CREAMOS UN OBJETO QUE SERA LA LLAVE PRIMARIA
		lcotgenPk pk = new lcotgenPk();
		//SETEAMOS EL CODIGO DE TABLA, CON EL CODIGO DE TABLA QUE VIENE POR PARAMETRO EN LA URL
		if(tl_codtabla != null) {
			//SI VIENE POR PARAMETRO EL CODIGO CLAVE ENTONCES SETEAMOS ESE VALOR
			pk.setTl_codtabla(tl_codtabla);
		}else {
			//EN CASO NO VENGA POR PARAMETRO 
			pk.setTl_codtabla("");
		}		
		//VALIDAMOS SI VIENE O NO EL CODIGO CLAVE
		if(tl_clave != null) {
			//SI VIENE POR PARAMETRO EL CODIGO CLAVE ENTONCES SETEAMOS ESE VALOR
			pk.setTl_clave(tl_clave);
		}else {
			//EN CASO NO VENGA POR PARAMETRO 
			pk.setTl_clave("");
		}
		//Seteamos los campos necesarios para el procedure
		objSalida.setPkID(pk);
		objSalida.setTl_feccrea(LocalDate.now());
		objSalida.setTl_hracrea(LocalTime.now());
		objSalida.setTl_fecact(LocalDate.now());
		objSalida.setTl_hraact(LocalTime.now());
		
		try {
			//CREAMOS UNA LISTA Y LA LLENAMOS CON LA DATA QUE NOS LLEGA DE LA BASE DE DATOS
			//TAMBIEN LLAMAMOS AL OBJETO SERVICE E INVOCAMOS A SU METODO LISTA UN REGISTRO
			//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 4, QUE REALIZARA EL METODO GET PARA UN REGISTRO ESPECIFICO
			//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO DE SALIDA, REQUERIDO POR EL PROCEDURE
			List<lcotgen> lista = service.listaUnRegistro(0, p_ciacont, p_ejer, objSalida);
			
			if(lista.size() == 0) {
				salida.put("mensaje", "No se encontro tabla");
				System.out.println("No hay consulta");
			}else {
				salida.put("mensaje", "No se encontro plan contable");}
		return ResponseEntity.ok(lista);
		}catch(Exception e) {
			throw new Exception("Error HUR1007 + " + e.getMessage());
		}
	}
	
	
	
	@GetMapping(value={"/listarfiltro/{p_ejer}/{p_ciacont}/{tl_codtabla}/{tl_clave}", 
					"/listarfiltro/{p_ejer}/{p_ciacont}/{tl_codtabla}"})
	@ResponseBody
	public ResponseEntity<List<lcotgen>> listaFiltroPorCodigo(@PathVariable("p_ciacont") String p_ciacont,
														@PathVariable("p_ejer") String p_ejer,
														@PathVariable(value="tl_codtabla",required = false) String tl_codtabla,
														@PathVariable(value="tl_clave", required=false) String tl_clave) throws Exception{
		
		//CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		lcotgen objSalida = new lcotgen();
		Map<String, Object> salida = new HashMap<>();
		//CREAMOS UN OBJETO QUE SERA LA LLAVE PRIMARIA
		lcotgenPk pk = new lcotgenPk();
		if(tl_codtabla != null) {
			//SI VIENE POR PARAMETRO EL CODIGO CLAVE ENTONCES SETEAMOS ESE VALOR
			pk.setTl_codtabla(tl_codtabla);
		}else {
			//EN CASO NO VENGA POR PARAMETRO 
			pk.setTl_codtabla("");
		}
		//SETEAMOS EL CODIGO DE TABLA, CON EL CODIGO DE TABLA QUE VIENE POR PARAMETRO EN LA URL
		//VALIDAMOS SI VIENE O NO EL CODIGO CLAVE
		if(tl_clave != null) {
			//SI VIENE POR PARAMETRO EL CODIGO CLAVE ENTONCES SETEAMOS ESE VALOR
			pk.setTl_clave(tl_clave);
		}else {
			//EN CASO NO VENGA POR PARAMETRO 
			pk.setTl_clave("");
		}
		//Seteamos los campos necesarios para el procedure
		objSalida.setPkID(pk);
		objSalida.setTl_feccrea(LocalDate.now());
		objSalida.setTl_hracrea(LocalTime.now());
		objSalida.setTl_fecact(LocalDate.now());
		objSalida.setTl_hraact(LocalTime.now());
		
		try {
			//CREAMOS UNA LISTA Y LA LLENAMOS CON LA DATA QUE NOS LLEGA DE LA BASE DE DATOS
			//TAMBIEN LLAMAMOS AL OBJETO SERVICE E INVOCAMOS A SU METODO LISTA UN REGISTRO
			//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 4, QUE REALIZARA EL METODO GET PARA UN REGISTRO ESPECIFICO
			//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO DE SALIDA, REQUERIDO POR EL PROCEDURE
			List<lcotgen> lista = service.listaUnRegistro(4, p_ciacont, p_ejer, objSalida);
			
			if(lista.size() == 0) {
				salida.put("mensaje", "No se encontro tabla");
				System.out.println("No hay consulta");
			}else {
				salida.put("mensaje", "No se encontro plan contable");}
		return ResponseEntity.ok(lista);
		}catch(Exception e) {
			throw new Exception("Error HUR1007 + " + e.getMessage());
		}
	}
	
	
	
	/*
	METODO POST PARA LISTAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA COMPAÑIA), tl_codtabla Y tl_clave
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
		tl_codtabla, CODIGO DE TABLA A BUSCAR,
		tl_clave, CODIGO CLAVE A BUSCAR(OPCIONAL)
	*/
	@PostMapping("/registralcgen/{p_ejer}/{p_ciacont}")
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> registraProveedor(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable("p_ejer") String p_ejer,  @RequestBody lcotgen obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		
		//Buscamos si existe el registro primero
		List<lcotgen> lista = service.listaUnRegistro(0, p_ciacont, p_ejer, obj);
		
		if (lista.size() ==1 ) {
			salida.put("mensaje", "Registro ya existente");
			
		}else {
			
			
			try {		
				//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
					obj.setTl_feccrea(LocalDate.now());
					obj.setTl_hracrea(LocalTime.now());
			
			
					obj.setTl_fecact(LocalDate.now());
					obj.setTl_hraact(LocalTime.now());
			
				service.registrarNuevoRegistro(1, p_ciacont, p_ejer, obj);
				salida.put("mensaje", "Registrado correctamente");
			
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1007 "+e.getMessage());
		}
			
			
			
		}
		
		
		return ResponseEntity.ok(salida);
	}
	
	
	
	
	/*
	METODO PUT PARA ACTUALIZAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA COMPAÑIA)
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
	*/
	@PutMapping("actuTablaGen/{p_ejer}/{p_ciacont}")
	public ResponseEntity<Map<String, Object>> actualizaRegistro(@PathVariable("p_ciacont") String p_ciacont,
		@PathVariable("p_ejer") String ejer, @RequestBody lcotgen obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> salida = new HashMap<>();
		
		//Evaluamos primero si la tabla existe existe en la bd
		List<lcotgen> lista = service.listaUnRegistro(0, p_ciacont, ejer, obj);
		
		if(lista.size()==1) {
			
			try {
				
				
				
				//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS AL METODO EDITAR REGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 2, QUE HARA EL UPDATE DESDE EL PROCEDURE
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO CON LOS CAMPOS QUE QUEREMOS ACTUALIZAR
				
				//ACTUALIZAMOS EL DIA Y LA HORA 
				obj.setTl_feccrea(LocalDate.now());
				obj.setTl_hracrea(LocalTime.now());
				obj.setTl_fecact(LocalDate.now());
				obj.setTl_hraact(LocalTime.now());
				
				service.editarRegistro(2, p_ciacont, ejer, obj);
				salida.put("mensaje", "Actualizado correctamente");
			}catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", "Error HUR1007 "+ e.getMessage());
			}
			
		}else {
			salida.put("mensaje", "Tabla no encontrada");
		}
		
		return ResponseEntity.ok(salida);
	}
	
	
	
	
	/*
	METODO DELETE PARA ELIMINAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA COMPAÑIA), tl_codtabla Y tl_clave
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
		tl_codtabla, CODIGO DE LA TABLA, CAMPO DE LA PRIMARY KEY
		tl_clave, CLAVE DE LA TABLA, CAMPO DE LA PRIMERY KEY
	*/
	@DeleteMapping("elimTablaGen/{p_ejer}/{p_ciacont}/{tl_codtabla}/{tl_clave}")
	public ResponseEntity<Map<String, Object>> eliminarRegistro(@PathVariable("p_ciacont") String p_ciacont,
																@PathVariable("p_ejer") String ejer,
																@PathVariable(value="tl_codtabla",required = false) String tl_codtabla,
																@PathVariable(value="tl_clave",required = false) String tl_clave){
		
				//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
				Map<String, Object> salida = new HashMap<>();
				//CREAMOS UN OBJETO DE SALIDA
				lcotgen objSalida = new lcotgen();				
				//CREAMOS UN OBJETO DE LA LLAVE PRIMARIA
				lcotgenPk pk = new lcotgenPk();				
				//SETEAMOS LOS VALORES DE LOS CAMPOS DE LA LLAVE PRIMARIA, 
				//PARA SABER QUE REGISTRO SE VA A ELIMINAR
				pk.setTl_codtabla(tl_codtabla);
				pk.setTl_clave(tl_clave);
				//SETEAMOS LOS VALORES DEL OBJETO, QUE ES REQUERIDO POR EL PROCEDURE
				objSalida.setPkID(pk);
				//Evaluamos primero si la tabla existe existe en la bd
				List<lcotgen> lista = service.listaUnRegistro(0, p_ciacont, ejer, objSalida);
				
				if(lista.size()==1) {
					
				try {
					
					objSalida.setTl_feccrea(LocalDate.now());
					objSalida.setTl_hracrea(LocalTime.now());					
					objSalida.setTl_fecact(LocalDate.now());
					objSalida.setTl_hraact(LocalTime.now());
					
					//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS AL METODO ELIMINAR REGISTRO
					//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 3, QUE HARA EL DELETE DESDE EL PROCEDURE
					//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
					//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO REQUERIDO POR EL PROCEDURE
					//DEL OBJETO SOLO TOMARA LA LLAVE PRIMARIA
					service.eliminarRegistro(3, p_ciacont, ejer, objSalida);
					salida.put("mensaje", "Eliminado correctamente");
 				} catch(Exception e){
 					//Si ocurre error devolvera mensaje
 					e.printStackTrace();
 					salida.put("mensaje", "Error HUR1007 "+ e.getMessage());
 				}
				}else {
					//Si no se encuentra la tabla en la bd devolvera mensaje
					salida.put("mensaje", "Tabla no encontrada");
				}
				return ResponseEntity.ok(salida);
	}
	
	
	// Listar Cuentas Nivel 3
	@GetMapping(value={"/swListarAnexos3/{p_ciacont}/{p_ejer}"})
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> swListarAnexos3(@PathVariable("p_ciacont") String p_ciacont,
														@PathVariable("p_ejer") String p_ejer) throws Exception{
		
		Map<String, Object> salida = new HashMap<>();
		
		try {
			List<Map<String, Object>> lista = service.swListarAnexos3(0, p_ciacont, p_ejer);
			
			if(lista.size() == 0) {
				salida.put("mensaje", "No existen datos");
			}else {
				salida.put("mensaje", "Tipos de Anexo Nivel 3");}
		return ResponseEntity.ok(lista);
		}catch(Exception e) {
			throw new Exception("Error HUR1065 Anex Nivel 3 + " + e.getMessage());
		}
	}
}
