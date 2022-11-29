package com.empresa.controller;

import com.empresa.entity.lcobanc;
import com.empresa.entity.lcobancPk;
import com.empresa.service.lcobancService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest/lcobanc")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcobancController {

    @Autowired
    private lcobancService service;

    @GetMapping("/listarCajGrilla/{p_ciacont}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> listar(@PathVariable("p_ciacont") String p_ciacont) throws Exception{
        //Creamos un objeto para el procedure
    	lcobancPk objPk = new lcobancPk("", "");
        lcobanc obj = new lcobanc();
        obj.setPkID(objPk);
        obj.setBl_nombco("");
        obj.setBl_tipmon("");
        obj.setBl_numcta("");
        obj.setBl_estado("");
        obj.setBl_cuenta("");
        obj.setBl_desccta("");
        obj.setBl_entfina("");
        obj.setBl_tipocta("");
        obj.setBl_fche1("");
        obj.setBl_fche2("");
        obj.setBl_fche3("");
        obj.setBl_nche1("");
        obj.setBl_nche2("");
        obj.setBl_nche3("");
        obj.setBl_frche("");
        obj.setBl_modesdcta("");
        obj.setBl_usrcrea("");
        obj.setBl_feccrea(LocalDate.now());
        obj.setBl_hracrea(LocalTime.now());
        obj.setBl_usract("");
        obj.setBl_fecact(LocalDate.now());
        obj.setBl_hraact(LocalTime.now());
        try{
        	//Llamamos al service para listar las cajas
            List<Map<String, Object[]>> lista = service.listarCaj(0, p_ciacont, obj);
            //Devuelve la lista si la consulta fue exitosa
            return ResponseEntity.ok(lista);
        }catch (Exception e){
            throw new Exception("Error HUR1005 + " + e.getMessage());
        }
    }
    
    @GetMapping("/listarBcoGrilla/{p_ciacont}")
    @ResponseBody
    public ResponseEntity<List<Map<String,Object[]>>> listarBco(@PathVariable("p_ciacont") String p_ciacont) throws Exception{
        //Creamos un objeto para el procedure
    	lcobancPk objPk = new lcobancPk("", "");
        lcobanc obj = new lcobanc();
        obj.setPkID(objPk);
        obj.setBl_nombco("");
        obj.setBl_tipmon("");
        obj.setBl_numcta("");
        obj.setBl_estado("");
        obj.setBl_cuenta("");
        obj.setBl_desccta("");
        obj.setBl_entfina("");
        obj.setBl_tipocta("");
        obj.setBl_fche1("");
        obj.setBl_fche2("");
        obj.setBl_fche3("");
        obj.setBl_nche1("");
        obj.setBl_nche2("");
        obj.setBl_nche3("");
        obj.setBl_frche("");
        obj.setBl_modesdcta("");
        obj.setBl_usrcrea("");
        obj.setBl_feccrea(LocalDate.now());
        obj.setBl_hracrea(LocalTime.now());
        obj.setBl_usract("");
        obj.setBl_fecact(LocalDate.now());
        obj.setBl_hraact(LocalTime.now());
        try{
        	//Llamamos al service para listar los bancos
			List<Map<String,Object[]>> lista = service.listarBco(0, p_ciacont, obj);
            //Devuelve la lista si la consulta fue exitosa
            return ResponseEntity.ok(lista);
        }catch (Exception e){
            throw new Exception("Error HUR1006 + " + e.getMessage());
        }
    }
    
    
    @GetMapping(value={"/listarCaj/{p_ciacont}/{bl_codcaj}", "/listarCaj/{p_ciacont}"})
    @ResponseBody
    public ResponseEntity<List<lcobanc>> listarCaj(@PathVariable("p_ciacont") String p_ciacont,
    													   @PathVariable(value="bl_codcaj", required=false) String bl_codcaj) throws Exception{
        //Creamos un objeto para el procedure
    	List<lcobanc> lista;
        lcobanc obj = new lcobanc();
        lcobancPk objPk = new lcobancPk("", "");
        if(bl_codcaj !=null) {
        	objPk.setBl_codbco(bl_codcaj);
        	objPk.setBl_flcaja("S");
        }else {
        	objPk.setBl_codbco("");
        }
        obj.setPkID(objPk);
        obj.setBl_nombco("");
        obj.setBl_tipmon("");
        obj.setBl_numcta("");
        obj.setBl_estado("");
        obj.setBl_cuenta("");
        obj.setBl_desccta("");
        obj.setBl_entfina("");
        obj.setBl_tipocta("");
        obj.setBl_fche1("");
        obj.setBl_fche2("");
        obj.setBl_fche3("");
        obj.setBl_nche1("");
        obj.setBl_nche2("");
        obj.setBl_nche3("");
        obj.setBl_frche("");
        obj.setBl_modesdcta("");
        obj.setBl_usrcrea("");
        obj.setBl_feccrea(LocalDate.now());
        obj.setBl_hracrea(LocalTime.now());
        obj.setBl_usract("");
        obj.setBl_fecact(LocalDate.now());
        obj.setBl_hraact(LocalTime.now());
        try{
            
            lista = service.listarCajUnica(4, p_ciacont, obj);
            
        	return ResponseEntity.ok(lista);

    
        }catch (Exception e){
            throw new Exception("Error HUR1005 + " + e.getMessage());
        }
    }
    
    @GetMapping(value={"/listarBco/{p_ciacont}/{bl_codbco}", "/listarBco/{p_ciacont}"})
    @ResponseBody
    public ResponseEntity<List<lcobanc>> listarEspecifico(@PathVariable("p_ciacont") String p_ciacont,
    													   @PathVariable(value="bl_codbco", required=false) String bl_codbco) throws Exception{
        //Creamos un objeto para el procedure
    	List<lcobanc> lista;
    	lcobanc obj = new lcobanc();
        lcobancPk objPk = new lcobancPk("", "");
        if(bl_codbco !=null) {
        	objPk.setBl_codbco(bl_codbco);
        }else {
        	objPk.setBl_codbco("");
        }
        obj.setPkID(objPk);
        obj.setBl_nombco("");
        obj.setBl_tipmon("");
        obj.setBl_numcta("");
        obj.setBl_estado("");
        obj.setBl_cuenta("");
        obj.setBl_desccta("");
        obj.setBl_entfina("");
        obj.setBl_tipocta("");
        obj.setBl_fche1("");
        obj.setBl_fche2("");
        obj.setBl_fche3("");
        obj.setBl_nche1("");
        obj.setBl_nche2("");
        obj.setBl_nche3("");
        obj.setBl_frche("");
        obj.setBl_modesdcta("");
        obj.setBl_usrcrea("");
        obj.setBl_feccrea(LocalDate.now());
        obj.setBl_hracrea(LocalTime.now());
        obj.setBl_usract("");
        obj.setBl_fecact(LocalDate.now());
        obj.setBl_hraact(LocalTime.now());
        try{
            
            lista = service.listarBcoUnica(4, p_ciacont, obj);
            
        	return ResponseEntity.ok(lista);

    
        }catch (Exception e){
            throw new Exception("Error HUR1006 + " + e.getMessage());
        }
    }
    
    
    /*
	METODO POST PARA LISTAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA COMPAÑIA), COD_TABLA Y COD_CLAVE
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
		COD_TABLA, CODIGO DE TABLA A BUSCAR,
		COD_CLAVE, CODIGO CLAVE A BUSCAR(OPCIONAL)
	*/
    //Registra Banco
	@PostMapping("/registraBco/{p_ciacont}")
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> registraBco(@PathVariable("p_ciacont") String p_ciacont,
																  @RequestBody lcobanc obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			
			//List<lcobanc> listaCaja = service.listarCajUnica(4, p_ciacont, obj);
			List<lcobanc> listaBco = service.listarBcoUnica(4, p_ciacont, obj);
			
			//Verificamos si ya existe un registro
			if(listaBco.size()==1) {
				salida.put("mensaje", "El banco ya existe");
			}else {
				obj.setBl_feccrea(LocalDate.now());
				obj.setBl_hracrea(LocalTime.now());
//				obj.setBl_fecact(LocalDate.now());
//				obj.setBl_hraact(LocalTime.now());
				service.registrarBco(1, p_ciacont, obj);
				salida.put("mensaje", "Registrado correctamente");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			//salida.put("mensaje", "Error HUR1005 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	
	
	/*
	METODO POST PARA LISTAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA COMPAÑIA), COD_TABLA Y COD_CLAVE
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
		COD_TABLA, CODIGO DE TABLA A BUSCAR,
		COD_CLAVE, CODIGO CLAVE A BUSCAR(OPCIONAL)
	*/
	//Registra Caja
	@PostMapping("/registraCaja/{p_ciacont}")
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> registraCaja(@PathVariable("p_ciacont") String p_ciacont,
																  @RequestBody lcobanc obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			
			List<lcobanc> listaCaja = service.listarCajUnica(4, p_ciacont, obj);
			//List<lcobanc> listaBco = service.listarBcoUnica(4, p_ciacont, obj);
			
			//Verificamos si ya existe un registro
			if(listaCaja.size()==1){
				salida.put("mensaje", "La caja ya existe");
			}else {
				obj.setBl_feccrea(LocalDate.now());
				obj.setBl_hracrea(LocalTime.now());
				obj.setBl_fecact(LocalDate.of(0001, 01, 01));
				obj.setBl_hraact(LocalTime.of(10, 10));
				service.registrarBco(1, p_ciacont, obj);
				salida.put("mensaje", "Registrado correctamente");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			//salida.put("mensaje", "Error HUR1005 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	
	
	
	
	
	
	/*
	METODO POST PARA LISTAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA COMPAÑIA), COD_TABLA Y COD_CLAVE
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
		COD_TABLA, CODIGO DE TABLA A BUSCAR,
		COD_CLAVE, CODIGO CLAVE A BUSCAR(OPCIONAL)
	*/
	@PutMapping(value={"/actuTablaBco/{p_ciacont}", "/actuTablaCaj/{p_ciacont}"})
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> actualizaBanc(@PathVariable("p_ciacont") String p_ciacont,
																  @RequestBody lcobanc obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {		
			List<lcobanc> listaCaja = service.listarCajUnica(4, p_ciacont, obj);
			List<lcobanc> listaBco = service.listarBcoUnica(4, p_ciacont, obj);
			if(listaCaja.size()==1 || listaBco.size()==1) {
				obj.setBl_feccrea(LocalDate.now());
				obj.setBl_hracrea(LocalTime.now());
				obj.setBl_fecact(LocalDate.now());
				obj.setBl_hraact(LocalTime.now());
				service.actualizarBco(2, p_ciacont, obj);
				salida.put("mensaje", "Actualizado correctamente");
			}else {
				salida.put("mensaje", "No se encontro el registro");
			}
			
				
			
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1005 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	//Elimina banco
	@DeleteMapping(value="/elimTablaBco/{p_ciacont}/{bl_codbco}")
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> eliminaBanc(@PathVariable("p_ciacont") String p_ciacont,
															@PathVariable(value="bl_codbco") String bl_codbco){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		lcobancPk objetoPk = new lcobancPk(bl_codbco, "N");
		lcobanc objeto = new lcobanc();
		objeto.setPkID(objetoPk);
		objeto.setBl_feccrea(LocalDate.now());
		objeto.setBl_hracrea(LocalTime.now());
		objeto.setBl_fecact(LocalDate.now());
		objeto.setBl_hraact(LocalTime.now());
		try {		
			//List<lcobanc> listaCaja = service.listarCajUnica(4, p_ciacont, objeto);
			List<lcobanc> listaBco = service.listarBcoUnica(4, p_ciacont, objeto);
			if(listaBco.size()==1) {
				lcobancPk objPk = new lcobancPk(bl_codbco, "N");
				lcobanc obj = new lcobanc();
				obj.setPkID(objPk);
				obj.setBl_cuenta("");
				obj.setBl_desccta("");
				obj.setBl_entfina("");
				obj.setBl_estado("");
				obj.setBl_fche1("");
				obj.setBl_fche2("");
				obj.setBl_fche3("");
				obj.setBl_frche("");
				obj.setBl_tipmon("");
				obj.setBl_modesdcta("");
				obj.setBl_tipocta("");
				obj.setBl_feccrea(LocalDate.now());
				obj.setBl_hracrea(LocalTime.now());
				obj.setBl_fecact(LocalDate.now());
				obj.setBl_hraact(LocalTime.now());
				service.eliminarBco(3, p_ciacont, obj);
				salida.put("mensaje", "Eliminado correctamente");
			}else {
				salida.put("mensaje", "No se encontro el registro");

			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1005 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	//Elimina caja
	@DeleteMapping(value="/elimTablaCaj/{p_ciacont}/{bl_codbco}")
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> eliminaCaj(@PathVariable("p_ciacont") String p_ciacont,
															@PathVariable(value="bl_codbco", required = false) String bl_codbco){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		lcobancPk objetoPk = new lcobancPk(bl_codbco, "S");
		lcobanc objeto = new lcobanc();
		objeto.setPkID(objetoPk);
		objeto.setBl_feccrea(LocalDate.now());
		objeto.setBl_hracrea(LocalTime.now());
		objeto.setBl_fecact(LocalDate.now());
		objeto.setBl_hraact(LocalTime.now());
		try {		
			List<lcobanc> listaCaja = service.listarCajUnica(4, p_ciacont, objeto);
			//List<lcobanc> listaBco = service.listarBcoUnica(4, p_ciacont, objeto);
			if(listaCaja.size()==1) {
				lcobancPk objPk = new lcobancPk(bl_codbco, "S");
				lcobanc obj = new lcobanc();
				obj.setPkID(objPk);
				obj.setBl_cuenta("");
				obj.setBl_desccta("");
				obj.setBl_entfina("");
				obj.setBl_estado("");
				obj.setBl_fche1("");
				obj.setBl_fche2("");
				obj.setBl_fche3("");
				obj.setBl_frche("");
				obj.setBl_tipmon("");
				obj.setBl_modesdcta("");
				obj.setBl_tipocta("");
				obj.setBl_feccrea(LocalDate.now());
				obj.setBl_hracrea(LocalTime.now());
				obj.setBl_fecact(LocalDate.now());
				obj.setBl_hraact(LocalTime.now());
				service.eliminarBco(3, p_ciacont, obj);
				salida.put("mensaje", "Eliminado correctamente");
			}else {
				salida.put("mensaje", "No se encontro el registro");

			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1005 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	// 	Modificar chequera

	@PutMapping(value={"/modifiChe/{cia}/{codigo}/{nro_chequera}/{cheque}"})
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> modificarChequera(@PathVariable("cia") String cia,
																  @PathVariable("codigo") String codigo,
																  @PathVariable("nro_chequera") String nro_chequera,
																  @PathVariable("cheque") String cheque){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {		
			service.modificarChequera(0, cia, codigo, nro_chequera, cheque);
	
				salida.put("mensaje", "La chequera ah cambiado de registro a " + cheque);
			
			
				
			
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1005 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	
}
