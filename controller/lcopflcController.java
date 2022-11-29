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


import com.empresa.entity.lcopflc;
import com.empresa.entity.lcopflcPk;
import com.empresa.service.lcopflcService;


@RestController
@RequestMapping("/rest/lcopflc")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcopflcController {
	
	@Autowired
	private lcopflcService service;
	
	/*
	METODO GET PARA LISTAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA COMPAÑIA)
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
	*/
	
	@GetMapping(value={"/ListarFormatos/{p_ciacont}/{fl_tipformt}/{fl_modelfrmt}",
			"/ListarFormatos/{p_ciacont}/{fl_tipformt}/{fl_modelfrmt}/{fl_codfrmt}"})
	@ResponseBody
	public ResponseEntity<List<lcopflc>> lista(@PathVariable("p_ciacont") String p_ciacont,
											   @PathVariable("fl_tipformt") String fl_tipformt,
											   @PathVariable("fl_modelfrmt") String fl_modelfrmt,
											   @PathVariable(value ="fl_codfrmt", required = false) String fl_codfrmt) throws Exception {
			//CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
			
			//CREAMOS UN OBJETO QUE SERA LA LLAVE PRIMARIA
			lcopflcPk pk = new lcopflcPk();
			//SETEAMOS LOS VALORES, ESTOS NO SERAN REQUERIDOS DESDE EL FRONT
			//SON REQUERIDOS PARA EL PROCEDURE
			
			pk.setFl_tipFrmt(fl_tipformt);
			pk.setFl_modelfrmt(fl_modelfrmt);
			if(fl_codfrmt != null) {
				pk.setFl_codfrmt(fl_codfrmt);
			}else {
				pk.setFl_codfrmt("");
			}
			
			lcopflc objSalida = new lcopflc(pk, "1", "1", "1", "1", "1",
					"1", "1", "1", "1", 1, "1", LocalDate.now(), LocalTime.now(), "1", LocalDate.now(), LocalTime.now());
			

			try {
				//CREAMOS UNA LISTA Y LA LLENAMOS CON LA DATA QUE NOS LLEGA DE LA BASE DE DATOS
				//TAMBIEN LLAMAMOS AL OBJETO SERVICE E INVOCAMOS A SU METODO LISTA REGISTROS
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 0, QUE REALIZARA EL METODO GET
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO DE SALIDA, REQUERIDO POR EL PROCEDURE
				List<lcopflc> lista = service.listar(0, p_ciacont, objSalida);
				//DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
				return ResponseEntity.ok(lista);
			}catch(Exception e) {
				//DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
				throw new Exception("Error HUR1001_MB + " + e.getMessage());
			}
			
			
	}
	
@GetMapping(value={"/ListarFormatosBalGrup/{opcion}/{p_ciacont}/{año}/{per}/{N}/{inc0}/{no0}/{aper}"})
@ResponseBody
public ResponseEntity<List<Object>> listaBalance(@PathVariable("opcion") int opcion,
		@PathVariable("p_ciacont") String p_ciacont,@PathVariable("año") String año,@PathVariable("per") String per,
		@PathVariable("N") String N,@PathVariable("inc0") String inc0,@PathVariable("no0") String no0,@PathVariable("aper") String aper) 
				throws Exception {
	
	
	
	try {
		List<Object> lista = service.listarBalance(opcion, p_ciacont,año ,per,N,inc0,no0,aper);
		return ResponseEntity.ok(lista);
	}catch(Exception e) {
		//DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
		throw new Exception("Error HUR1038_B + " + e.getMessage());
	}
	
}
	
	
	
	@PostMapping("/crearFrm/{p_ciacont}")
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> registraFrm(@PathVariable("p_ciacont") String p_ciacont,
																  @RequestBody lcopflc obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {		
			lcopflcPk pk = new lcopflcPk();
			pk.setFl_tipFrmt(obj.getLcopflcPk().getFl_tipFrmt());
			pk.setFl_modelfrmt(obj.getLcopflcPk().getFl_modelfrmt());
			pk.setFl_codfrmt(obj.getLcopflcPk().getFl_codfrmt());
			lcopflc objUnico = new lcopflc(pk, "1", "1", "1", "1", "1",
					"1", "1", "1", "1", 1, "1", LocalDate.now(), LocalTime.now(), "1", LocalDate.now(), LocalTime.now());
			List<lcopflc> obj2 = service.listar(0, p_ciacont, objUnico);
			if(obj2.size()==0) {
					//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
					//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
					//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
					//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
					obj.setFl_feccrea(LocalDate.now());
					obj.setFl_hracrea(LocalTime.now());
					obj.setFl_fecact(LocalDate.now());
					obj.setFl_hraact(LocalTime.now());
					service.registrar(1, p_ciacont, obj);
					salida.put("mensaje", "Registrado correctamente");
			}else {
					salida.put("mensaje", "El registro ya existe");
			}
				
				
			
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1002 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	
	
	/*
	METODO PUT PARA ACTUALIZAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA COMPAÑIA)
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
	*/
	@PutMapping("ActuFrm/{p_ciacont}")
	public ResponseEntity<Map<String, Object>> actualizaRegistroFrm(@PathVariable("p_ciacont") String p_ciacont,
																 @RequestBody lcopflc obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> salida = new HashMap<>();		
		
		try {		
			lcopflcPk pk = new lcopflcPk();
			pk.setFl_tipFrmt(obj.getLcopflcPk().getFl_tipFrmt());
			pk.setFl_modelfrmt(obj.getLcopflcPk().getFl_modelfrmt());
			pk.setFl_codfrmt(obj.getLcopflcPk().getFl_codfrmt());
			lcopflc objUnico = new lcopflc(pk, "1", "1", "1", "1", "1",
					"1", "1", "1", "1", 1, "1", LocalDate.now(), LocalTime.now(), "1", LocalDate.now(), LocalTime.now());
			List<lcopflc> obj2 = service.listar(0, p_ciacont, objUnico);
			if(obj2.size()==1) {
					//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
					//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
					//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
					//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
					obj.setFl_feccrea(LocalDate.now());
					obj.setFl_hracrea(LocalTime.now());
					obj.setFl_fecact(LocalDate.now());
					obj.setFl_hraact(LocalTime.now());
					service.editar(2, p_ciacont, obj);
					salida.put("mensaje", "Actualizado correctamente");
			}else {
					salida.put("mensaje", "El registro no existe");
			}
				
				
			
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1002 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	
	/*
	METODO PUT PARA ACTUALIZAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA COMPAÑIA)
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
	*/
	@DeleteMapping("EliminaFormatos/{p_ciacont}/{fl_tipFrmt}/{fl_modelfrmt}/{fl_codfrmt}")
	public ResponseEntity<Map<String, Object>> eliminaRegistroFrm(@PathVariable("p_ciacont") String p_ciacont,
																  @PathVariable("fl_tipFrmt") String fl_tipFrmt,
																  @PathVariable("fl_modelfrmt") String fl_modelfrmt,
																  @PathVariable("fl_codfrmt") String fl_codfrmt){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> salida = new HashMap<>();		
		
		try {		
			lcopflcPk pk = new lcopflcPk();
			pk.setFl_tipFrmt(fl_tipFrmt);
			pk.setFl_modelfrmt(fl_modelfrmt);
			pk.setFl_codfrmt(fl_codfrmt);
			lcopflc objUnico = new lcopflc(pk, "1", "1", "1", "1", "1",
					"1", "1", "1", "1", 1, "1", LocalDate.now(), LocalTime.now(), "1", LocalDate.now(), LocalTime.now());
			List<lcopflc> obj2 = service.listar(0, p_ciacont, objUnico);
			if(obj2.size()==1) {
					//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
					//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
					//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
					//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
					lcopflcPk pk2 = new lcopflcPk();
					pk2.setFl_tipFrmt(fl_tipFrmt);
					pk2.setFl_modelfrmt(fl_modelfrmt);
					pk2.setFl_codfrmt(fl_codfrmt);
					lcopflc objSalida = new lcopflc(pk, "1", "1", "1", "1", "1",
							"1", "1", "1", "1", 1, "1", LocalDate.now(), LocalTime.now(), "1", LocalDate.now(), LocalTime.now());
					objSalida.setFl_feccrea(LocalDate.now());
					objSalida.setFl_hracrea(LocalTime.now());
					objSalida.setFl_fecact(LocalDate.now());
					objSalida.setFl_hraact(LocalTime.now());
					service.editar(3, p_ciacont, objSalida);
					salida.put("mensaje", "Eliminado correctamente");
			}else {
					salida.put("mensaje", "El registro no existe");
			}
				
				
			
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1002 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	
	// Listar Todo
	@GetMapping(value={"/ListarLcoPflc/{p_ciacont}"})
	@ResponseBody
	public ResponseEntity<List<lcopflc>> listarLcoPflc(@PathVariable("p_ciacont") String p_ciacont) throws Exception {
			
			lcopflcPk pk = new lcopflcPk();
			
			pk.setFl_tipFrmt("");
			pk.setFl_modelfrmt("");
			pk.setFl_codfrmt("");
			
			lcopflc objSalida = new lcopflc(pk, "1", "1", "1", "1", "1",
					"1", "1", "1", "1", 1, "1", LocalDate.now(), LocalTime.now(), "1", LocalDate.now(), LocalTime.now());
			
			try {
				List<lcopflc> lista = service.listarLcoPflc(4, p_ciacont, objSalida);
				return ResponseEntity.ok(lista);
			}catch(Exception e) {
				throw new Exception("Error HUR1001_MB + " + e.getMessage());
			}
	}
}
