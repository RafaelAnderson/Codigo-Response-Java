package com.empresa.controller;

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

import com.empresa.entity.lcoauxxml;
import com.empresa.entity.lcotmpcv;
import com.empresa.entity.lcotmpdv;
import com.empresa.service.lcoauxxmlService;


@RestController
@RequestMapping("rest/lcoauxxml")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcoauxxmlController {
    @Autowired
    private lcoauxxmlService service;

    @GetMapping(value = {"/listarDocXml/{cia}/{ejer}"})
    @ResponseBody
    public ResponseEntity<List<lcoauxxml>> ListarDocXML(
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer) throws Exception {
            
            List<lcoauxxml> lista;
            try {
                lista = service.sw_ListarDocXML(cia, ejer);
            }
            catch(Exception e) {
                throw new Exception("Error HUR1091 + " + e.getMessage());
            }
            return ResponseEntity.ok(lista);
    }


    // Tengo que hacer que el SP retorne un mensaje

    @GetMapping(value = {"/cvtDocXml/{cia}/{ejer}"})
    public ResponseEntity<Map<String, Object>> CvtDocXML(
        @PathVariable(value="cia") String cia,
        @PathVariable(value="ejer") String ejer) throws Exception {
            Map<String, Object> salida = new HashMap<>();
            try {
                service.sw_CvtDocXML(cia, ejer);
                salida.put("mensaje", "Proceso Ejecutado Correctamente");
            } catch(Exception e) {
                throw new Exception("Error HUR1091 + " + e.getMessage());
            }
            return ResponseEntity.ok(salida);
    }

    @PostMapping("/insertTableDocXml/{cia}/{ejer}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> InsertTableDocXML(
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer, 
        @RequestBody lcoauxxml obj) throws Exception{
            List<Map<String, Object[]>> lista;
            try{
                // SP para validar si existe un obj con el mismo PK
                // If lista >= 1 no crea, retorna mensaje existente
                // else
                
                lista = service.sw_InsertTableDocXML(cia, ejer, obj);
            }catch(Exception e) {
                throw new Exception("Error HUR1091 + " + e.getMessage());
            }
            System.out.println("Objeto que crea3" + obj.getAuxFdocrf());
            return ResponseEntity.ok(lista);
    }

    @GetMapping(value = {"/listarTblXml/{cia}/{ejer}"})
    public ResponseEntity<List<lcoauxxml>> ListarTblXml(
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer) throws Exception {
            List<lcoauxxml> lista;
            try {
                 lista = service.sw_ListarTblXml(cia, ejer);
            } catch(Exception e) {
                throw new Exception("Error HUR1091 + " + e.getMessage());
            }
            return ResponseEntity.ok(lista);
    }

    @GetMapping(value = {"/bscParVtaXml/{cia}/{tdoc}/{sdoc}"})
    public ResponseEntity<List<Map<String, Object[]>>> BscParVtaXml(
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="tdoc") String tdoc, 
        @PathVariable(value="sdoc") String sdoc) throws Exception {
            List<Map<String, Object[]>> lista;

            try {
                lista = service.sw_BscParVtaXml(cia, tdoc, sdoc);
            } catch(Exception e) {
                throw new Exception("Error HUR1091 + " + e.getMessage());
            }
            return ResponseEntity.ok(lista);
    }

    @GetMapping(value = {"/bscCtaGraXml/{cia}"})
    public ResponseEntity<List<Map<String, Object[]>>> BscCtaGraXml(
        @PathVariable(value="cia") String cia) throws Exception{

            List<Map<String, Object[]>> objSalida;

            try {
                objSalida = service.sw_BscCtaGraXml(cia);
            } catch(Exception e) {
                throw new Exception("Error HUR1091 + " + e.getMessage());
            }
            return ResponseEntity.ok(objSalida);
    }

    @GetMapping(value = {"/bscCtaNGraXml/{cia}"})
    public ResponseEntity<List<Map<String, Object[]>>> BscCtaNGraXml(
        @PathVariable(value="cia") String cia) throws Exception {
            List<Map<String, Object[]>> objSalida;

            try {
                objSalida = service.sw_BscCtaNGraXml(cia);
            } catch(Exception e) {
                throw new Exception("Error HUR1091 + " + e.getMessage());
            }
            return ResponseEntity.ok(objSalida);
    }

    @GetMapping(value = {"/bscCtaExoXml/{cia}"})
    public ResponseEntity<List<Map<String, Object[]>>> BscCtaExoXml(
        @PathVariable(value="cia") String cia) throws Exception {
            List<Map<String, Object[]>> objSalida;

            try {
                objSalida = service.sw_BscCtaExoXml(cia);
            } catch(Exception e) {
                throw new Exception("Error HUR1091 + " + e.getMessage());
            }
            return ResponseEntity.ok(objSalida);
    }


    @PostMapping("/creaDetaAstTmpXml/{cia}/{ejer}")
    public ResponseEntity<Map<String, Object>> CreaDetaAstTmpXml(
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer, 
        @RequestBody lcotmpdv obj) throws Exception {
            Map<String, Object> salida = new HashMap<>();
            try{
                // SP para validar si existe un obj con el mismo PK
                // If lista >= 1 no crea, retorna mensaje existente
                // else
                service.sw_CreaDetaAstTmpXml(cia, ejer, obj);
                salida.put("mensaje", "Proceso Ejecutado Correctamente");
            }catch(Exception e) {
                throw new Exception("Error HUR1091 + " + e.getMessage());
            }
            return ResponseEntity.ok(salida);
    }

    @PostMapping("/creaCabeAstTmpXml/{cia}/{ejer}")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> CreaCabeAstTmpXml(
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer, 
        @RequestBody lcotmpcv obj) throws Exception {
            Map<String, Object> salida = new HashMap<>();
            try{
                // SP para validar si existe un obj con el mismo PK
                // If lista >= 1 no crea, retorna mensaje existente
                // else
                service.sw_CreaCabeAstTmpXml(cia, ejer, obj);
                salida.put("mensaje", "Proceso Ejecutado Correctamente");
            }catch(Exception e) {
                throw new Exception("Error HUR1091 + " + e.getMessage());
            }
            return ResponseEntity.ok(salida);
    }

    @PutMapping("/actCabeAsientoTmpXml/{cia}/{ejer}")
    public ResponseEntity<Map<String, Object>> ActCabeAsientoTmpXml(
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer, 
        @RequestBody lcotmpcv obj) throws Exception {
            Map<String, Object> salida = new HashMap<>();
            try{
                // SP para validar si existe un obj con el mismo PK
                // If lista >= 1 no crea, retorna mensaje existente
                // else
                service.sw_ActCabeAsientoTmpXml(cia, ejer, obj);
                salida.put("mensaje", "Proceso Ejecutado Correctamente");
            }catch(Exception e) {
                throw new Exception("Error HUR1091 + " + e.getMessage());
            }
            return ResponseEntity.ok(salida);
    }

    @PutMapping("/actDocXML/{cia}/{ejer}")
    public ResponseEntity<Map<String, Object>> ActDocXML(
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer, 
        @RequestBody lcoauxxml obj) throws Exception{
            Map<String, Object> salida = new HashMap<>();
            try{
                // SP para validar si existe un obj con el mismo PK
                // If lista >= 1 no crea, retorna mensaje existente
                // else
                service.sw_ActDocXML(cia, ejer, obj);
                salida.put("mensaje", "Proceso Ejecutado Correctamente");
            }catch(Exception e) {
                throw new Exception("Error HUR1091 + " + e.getMessage());
            }
            return ResponseEntity.ok(salida);
    }

    @GetMapping("/listarAnexNuevoXml/{cia}/{ejer}")
    public ResponseEntity<List<lcoauxxml>> ListarAnexNuevoXml(
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer) throws Exception{ 
            List<lcoauxxml> lista;
            try {
                 lista = service.sw_ListarAnexNuevoXml(cia, ejer);
            } catch(Exception e) {
                throw new Exception("Error HUR1091 + " + e.getMessage());
            }
            return ResponseEntity.ok(lista);
    }

    @PostMapping("/insertatAnexNuevoXml/{cia}/{ejer}")
    public ResponseEntity<Map<String, Object>> InsertatAnexNuevoXml( 
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer) throws Exception
    {     
        Map<String, Object> salida = new HashMap<>();
        try{
            service.sw_InsertatAnexNuevoXml(cia, ejer);
            salida.put("mensaje", "Proceso Ejecutado Correctamente");
        }catch(Exception e) {
            throw new Exception("Error HUR1091 + " + e.getMessage());
        }
        return ResponseEntity.ok(salida);
    }

    @GetMapping("/listarDetaVtaXml/{cia}/{ejer}/{vsd}/{idcmp}")
    public ResponseEntity<List<Map<String, Object[]>>> ListarDetaVtaXml(
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer,
        @PathVariable(value="vsd") String vsd,
        @PathVariable(value="idcmp") String idcmp) throws Exception
    { 
        List<Map<String, Object[]>> lista;
        try {
             lista = service.sw_ListarDetaVtaXml(cia, ejer, vsd, idcmp);
        } catch(Exception e) {
            throw new Exception("Error HUR1091 + " + e.getMessage());
        }
        return ResponseEntity.ok(lista);
    }
    
    @GetMapping("/listarAsientoTmpXml/{cia}/{ejer}")
    public ResponseEntity<List<Map<String, Object[]>>> ListarAsientoTmpXml(
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer) throws Exception
    { 
        List<Map<String, Object[]>> lista;
        try {
             lista = service.sw_ListarAsientoTmpXml(cia, ejer);
        } catch(Exception e) {
            throw new Exception("Error HUR1091 + " + e.getMessage());
        }
        return ResponseEntity.ok(lista);
    }

    @DeleteMapping("/eliDetAsiTmpXml/{cia}/{ejer}/{sd}/{id}")
    public ResponseEntity<Map<String, Object>> EliDetAsiTmpXml( 
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer,
        @PathVariable(value="sd") String sd,
        @PathVariable(value="id") String id) throws Exception
    {  
        Map<String, Object> salida = new HashMap<>();
        try{
            //  Comprobar si existe y luego eliminar
            service.sw_EliDetAsiTmpXml(cia, ejer,sd,id);
            salida.put("mensaje", "Proceso Ejecutado Correctamente");
        }catch(Exception e) {
            throw new Exception("Error HUR1091 + " + e.getMessage());
        }
        return ResponseEntity.ok(salida);
    }

    @PostMapping("/adicionaCmpXml/{cia}/{ejer}/{nrocmp}/{usr}/{sd}/{id}")
    public ResponseEntity<Map<String, Object>> AdicionaCmpXml( 
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer,
        @PathVariable(value="nrocmp") String nrocmp, 
        @PathVariable(value="usr") String usr,
        @PathVariable(value="sd") String sd,
        @PathVariable(value="id") String id) throws Exception
    {  
        Map<String, Object> salida = new HashMap<>();
        try{
            // Validar si los id son validos
            service.sw_AdicionaCmpXml(cia, ejer, nrocmp, usr, sd, id);
            salida.put("mensaje", "Proceso Ejecutado Correctamente");
        }catch(Exception e) {
            throw new Exception("Error HUR1091 + " + e.getMessage());
        }
        return ResponseEntity.ok(salida);
    }

    // Lista detalle si el documento de venta está registrado
    @GetMapping("/validaSiDocEstaRegXml/{cia}/{ejer}/{tdc}/{sdc}/{ndc}/{tide}/{nide}")
    public ResponseEntity<List<Map<String, Object[]>>> ValidaSiDocEstaRegXml( 
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer,
        @PathVariable(value="tdc") String tdc, 
        @PathVariable(value="sdc") String sdc,
        @PathVariable(value="ndc") String ndc,
        @PathVariable(value="tide") String tide,
        @PathVariable(value="nide") String nide) throws Exception
    {  
        List<Map<String, Object[]>> lista;
        try{
            // Validar si los id son validos
            lista = service.sw_ValidaSiDocEstaRegXml(cia, ejer, tdc, sdc, ndc, tide, nide);
        }catch(Exception e) {
            throw new Exception("Error HUR1091 + " + e.getMessage());
        }
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/getCabeceraByCompro/{cia}/{ejer}/{compro}")
    public ResponseEntity<List<Map<String, Object[]>>> getCabeceraByCompro(
        @PathVariable(value="cia") String cia, 
        @PathVariable(value="ejer") String ejer,
        @PathVariable(value = "compro") String compro) throws Exception{ 
            List<Map<String, Object[]>> lista;
            try {
                 lista = service.sw_GetCabecerasByCompro(cia, ejer,compro);
            } catch(Exception e) {
                throw new Exception("Error HUR1091 + " + e.getMessage());
            }
            return ResponseEntity.ok(lista);
    }

}
