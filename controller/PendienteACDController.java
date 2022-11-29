/* 
package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.aspectj.apache.bcel.classfile.Module.Require;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.service.PendienteACDService;

@RestController
@RequestMapping("/rest/pendienteACD")
@CrossOrigin(origins = {"http://192.168.0.46","http://localhost:4200","http://174.138.178.198", "https://app.liderasoftware.pe"})
public class PendienteACDController {
    @Autowired
    private PendienteACDService service;


    @GetMapping( value = {"/swListarPendACD/{opcion}/{p_ciacont}/{ejercicio}/{periodo}/{info}/{anex}/{codanexini}/{codanexfin}/{ctaini}/{ctafin}/{orden}",
    "/swListarPendACD/{opcion}/{p_ciacont}/{ejercicio}/{periodo}",
    "/swListarPendACD/{opcion}/{p_ciacont}/{ejercicio}/{periodo}/{info}",
    "/swListarPendACD/{opcion}/{p_ciacont}/{ejercicio}/{periodo}/{info}/{anex}",
    "/swListarPendACD/{opcion}/{p_ciacont}/{ejercicio}/{periodo}/{info}/{anex}/{codanexini}/{codanexfin}",
    "/swListarPendACD/{opcion}/{p_ciacont}/{ejercicio}/{periodo}/{info}/{anex}/{ctaini}/{ctafin}/{orden}"
    })
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swListarPendACD(
        @PathVariable("opcion") int opcion,
        @PathVariable("p_ciacont") String p_ciacont,
        @PathVariable(value ="ejercicio") String ejercicio,
        @PathVariable(value = "periodo") String periodo,
        @PathVariable(value ="info", required = false) String info,
        @PathVariable(value = "anex", required = false) String anex,
        @PathVariable(value ="codanexini", required = false) String codanexini,
        @PathVariable(value ="codanexfin", required = false) String codanexfin,
        @PathVariable(value = "ctaini", required = false) String ctaini,
        @PathVariable(value = "ctafin", required = false) String ctafin,
        @PathVariable(value = "orden", required = false) String orden
    ) throws Exception{
        List<Map<String, Object>> lista = new ArrayList<>();
        try
        {
            lista = service.swListarPendACD(opcion, p_ciacont, ejercicio, periodo, info, anex, codanexini, codanexfin, ctaini, ctafin, orden);
            return ResponseEntity.ok(lista);
        }
        catch(Exception e){
            throw new Exception("Error HUR1072_B  + " + e.getMessage());
        }
    }
    
    // @GetMapping("/swListarResuPACD/{p_ciacont}/{ejercicio}/{periodo}/{info}/{anex}/{codanexini}/{codanexfin}/{ctaini}/{ctafin}/{orden}")
    // @ResponseBody
    // public ResponseEntity<List<Map<String, Object>>> swListarResuPACD(
    //     @PathVariable("p_ciacont") String p_ciacont,
    //     @PathVariable("ejercicio") String ejercicio,
    //     @PathVariable("periodo") String periodo,
    //     @PathVariable("info") String info,
    //     @PathVariable("anex") String anex,
    //     @PathVariable("codanexini") String codanexini,
    //     @PathVariable("codanexfin") String codanexfin,
    //     @PathVariable("ctaini") String ctaini,
    //     @PathVariable("ctafin") String ctafin,
    //     @PathVariable("orden") String orden
    // ) throws Exception{
    //     List<Map<String, Object>> lista = new ArrayList<>();
    //     try
    //     {
    //         lista = service.swListarResuPACD(p_ciacont, ejercicio, periodo, info, anex, codanexini, codanexfin, ctaini, ctafin, orden);
    //         return ResponseEntity.ok(lista);
    //     }
    //     catch(Exception e){
    //         throw new Exception("Error HUR1071_F  + " + e.getMessage());
    //     }
    // }
    
    // @GetMapping("/swListarPlanoPACD/{p_ciacont}/{ejercicio}/{periodo}/{info}/{anex}/{codanexini}/{codanexfin}/{ctaini}/{ctafin}/{orden}")
    // @ResponseBody
    // public ResponseEntity<List<Map<String, Object>>> swListarPlanoPACD(
    //     @PathVariable("p_ciacont") String p_ciacont,
    //     @PathVariable("ejercicio") String ejercicio,
    //     @PathVariable("periodo") String periodo,
    //     @PathVariable("info") String info,
    //     @PathVariable("anex") String anex,
    //     @PathVariable("codanexini") String codanexini,
    //     @PathVariable("codanexfin") String codanexfin,
    //     @PathVariable("ctaini") String ctaini,
    //     @PathVariable("ctafin") String ctafin,
    //     @PathVariable("orden") String orden
    // ) throws Exception{
    //     List<Map<String, Object>> lista = new ArrayList<>();
    //     try
    //     {
    //         lista = service.swListarPlanoPACD(p_ciacont, ejercicio, periodo, info, anex, codanexini, codanexfin, ctaini, ctafin, orden);
    //         return ResponseEntity.ok(lista);
    //     }
    //     catch(Exception e){
    //         throw new Exception("Error HUR1071_F  + " + e.getMessage());
    //     }
    // }
}
*/