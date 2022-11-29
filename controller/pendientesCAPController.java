package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.empresa.service.pendientesCAPService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/pendienteCAP")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class pendientesCAPController {
    @Autowired
    private pendientesCAPService service;

    @GetMapping("/swListarPendCAD/{p_ciacont}/{ejercicio}/{periodo}/{info}/{anex}/{CtaInicial}/{CtaFinal}/{AnexIni}/{AnexFin}/{CstIni}/{CstFin}/{fecIni}/{fecVen}/{orden}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swListarPendCAD(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("periodo") String periodo, @PathVariable("info") String info, @PathVariable("anex") String anex,
            @PathVariable("CtaInicial") String CtaInicial, @PathVariable("CtaFinal") String CtaFinal, @PathVariable("AnexIni") String AnexIni, @PathVariable("AnexFin") String AnexFin,
            @PathVariable("CstIni") String CstIni, @PathVariable("CstFin") String CstFin, @PathVariable("fecIni") String fecIni, @PathVariable("fecVen") String fecVen, @PathVariable("orden") String orden ) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swListarPendCAD(0, p_ciacont, ejercicio, periodo, info, anex, CtaInicial, CtaFinal, AnexIni, AnexFin, CstIni, CstFin, fecIni, fecVen, orden);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1071_F  + " + e.getMessage());
        }

    }

    @GetMapping("/swListarResuPCAD/{p_ciacont}/{ejercicio}/{periodo}/{info}/{anex}/{CtaInicial}/{CtaFinal}/{AnexIni}/{AnexFin}/{CstIni}/{CstFin}/{fecIni}/{fecVen}/{orden}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swListarResuPCAD(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("periodo") String periodo, @PathVariable("info") String info, @PathVariable("anex") String anex,
            @PathVariable("CtaInicial") String CtaInicial, @PathVariable("CtaFinal") String CtaFinal, @PathVariable("AnexIni") String AnexIni, @PathVariable("AnexFin") String AnexFin,
            @PathVariable("CstIni") String CstIni, @PathVariable("CstFin") String CstFin, @PathVariable("fecIni") String fecIni, @PathVariable("fecVen") String fecVen, @PathVariable("orden") String orden ) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swListarResuPCAD(1, p_ciacont, ejercicio, periodo, info, anex, CtaInicial, CtaFinal, AnexIni, AnexFin, CstIni, CstFin, fecIni, fecVen, orden);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1071_F  + " + e.getMessage());
        }

    }

    @GetMapping("/swListarPlanoPCAD/{p_ciacont}/{ejercicio}/{periodo}/{info}/{anex}/{CtaInicial}/{CtaFinal}/{AnexIni}/{AnexFin}/{CstIni}/{CstFin}/{fecIni}/{fecVen}/{orden}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swListarPlanoPCAD(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("periodo") String periodo, @PathVariable("info") String info, @PathVariable("anex") String anex,
            @PathVariable("CtaInicial") String CtaInicial, @PathVariable("CtaFinal") String CtaFinal, @PathVariable("AnexIni") String AnexIni, @PathVariable("AnexFin") String AnexFin,
            @PathVariable("CstIni") String CstIni, @PathVariable("CstFin") String CstFin, @PathVariable("fecIni") String fecIni, @PathVariable("fecVen") String fecVen, @PathVariable("orden") String orden ) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swListarPlanoPCAD(2, p_ciacont, ejercicio, periodo, info, anex, CtaInicial, CtaFinal, AnexIni, AnexFin, CstIni, CstFin, fecIni, fecVen, orden);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1071_F  + " + e.getMessage());
        }

    }

    @GetMapping("/anexo/{p_ciacont}/{ejercicio}/{periodo}/{info}/{anex}/{CtaInicial}/{CtaFinal}/{AnexIni}/{AnexFin}/{CstIni}/{CstFin}/{fecIni}/{fecVen}/{orden}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> ultAnexo(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("periodo") String periodo, @PathVariable("info") String info, @PathVariable("anex") String anex,
            @PathVariable("CtaInicial") String CtaInicial, @PathVariable("CtaFinal") String CtaFinal, @PathVariable("AnexIni") String AnexIni, @PathVariable("AnexFin") String AnexFin,
            @PathVariable("CstIni") String CstIni, @PathVariable("CstFin") String CstFin, @PathVariable("fecIni") String fecIni, @PathVariable("fecVen") String fecVen, @PathVariable("orden") String orden ) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swListarPlanoPCAD(3, p_ciacont, ejercicio, periodo, info, anex, CtaInicial, CtaFinal, AnexIni, AnexFin, CstIni, CstFin, fecIni, fecVen, orden);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1071_F  + " + e.getMessage());
        }

    }

    @GetMapping("/cuenta/{p_ciacont}/{ejercicio}/{periodo}/{info}/{anex}/{CtaInicial}/{CtaFinal}/{AnexIni}/{AnexFin}/{CstIni}/{CstFin}/{fecIni}/{fecVen}/{orden}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> ultCuenta(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("periodo") String periodo, @PathVariable("info") String info, @PathVariable("anex") String anex,
            @PathVariable("CtaInicial") String CtaInicial, @PathVariable("CtaFinal") String CtaFinal, @PathVariable("AnexIni") String AnexIni, @PathVariable("AnexFin") String AnexFin,
            @PathVariable("CstIni") String CstIni, @PathVariable("CstFin") String CstFin, @PathVariable("fecIni") String fecIni, @PathVariable("fecVen") String fecVen, @PathVariable("orden") String orden ) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swListarPlanoPCAD(4, p_ciacont, ejercicio, periodo, info, anex, CtaInicial, CtaFinal, AnexIni, AnexFin, CstIni, CstFin, fecIni, fecVen, orden);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1071_F  + " + e.getMessage());
        }

    }

    @GetMapping("/costo/{p_ciacont}/{ejercicio}/{periodo}/{info}/{anex}/{CtaInicial}/{CtaFinal}/{AnexIni}/{AnexFin}/{CstIni}/{CstFin}/{fecIni}/{fecVen}/{orden}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> ultCosto(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("periodo") String periodo, @PathVariable("info") String info, @PathVariable("anex") String anex,
            @PathVariable("CtaInicial") String CtaInicial, @PathVariable("CtaFinal") String CtaFinal, @PathVariable("AnexIni") String AnexIni, @PathVariable("AnexFin") String AnexFin,
            @PathVariable("CstIni") String CstIni, @PathVariable("CstFin") String CstFin, @PathVariable("fecIni") String fecIni, @PathVariable("fecVen") String fecVen, @PathVariable("orden") String orden ) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swListarPlanoPCAD(5, p_ciacont, ejercicio, periodo, info, anex, CtaInicial, CtaFinal, AnexIni, AnexFin, CstIni, CstFin, fecIni, fecVen, orden);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1071_F  + " + e.getMessage());
        }

    }
}
