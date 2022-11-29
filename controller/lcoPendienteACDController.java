package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.service.lcoPendienteACDService;

@RestController
@RequestMapping("/rest/lcoPendienteACD")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcoPendienteACDController {
    @Autowired
    private lcoPendienteACDService service;

    @GetMapping("/swListarPendACD/{cia}/{ejer}/{periodo}/{info}/{tipoAnexo}/{codAnexoInicial}/{codAnexoFinal}/{ctaInicial}/{ctaFinal}/{fecIni}/{fecVen}/{orden}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swListarPendACD(
            @PathVariable("cia") String cia,
            @PathVariable("ejer") String ejer,
            @PathVariable("periodo") String periodo,
            @PathVariable("info") String info,
            @PathVariable("tipoAnexo") String tipoAnexo,
            @PathVariable("codAnexoInicial") String codAnexoInicial,
            @PathVariable("codAnexoFinal") String codAnexoFinal,
            @PathVariable("ctaInicial") String ctaInicial,
            @PathVariable("ctaFinal") String ctaFinal,
            @PathVariable("fecIni") String fecIni,
            @PathVariable("fecVen") String fecVen,
            @PathVariable("orden") String orden) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {
            lista = service.swListarPendACD(1, cia, ejer, periodo, info, tipoAnexo, codAnexoInicial, codAnexoFinal,
                    ctaInicial, ctaFinal, fecIni, fecVen, orden);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1072_F + " + e.getMessage());
        }
    }

    @GetMapping("/swListarResuPACD/{cia}/{ejer}/{periodo}/{info}/{tipoAnexo}/{codAnexoInicial}/{codAnexoFinal}/{ctaInicial}/{ctaFinal}/{fecIni}/{fecVen}/{orden}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swListarResuPACD(
            @PathVariable("cia") String cia,
            @PathVariable("ejer") String ejer,
            @PathVariable("periodo") String periodo,
            @PathVariable("info") String info,
            @PathVariable("tipoAnexo") String tipoAnexo,
            @PathVariable("codAnexoInicial") String codAnexoInicial,
            @PathVariable("codAnexoFinal") String codAnexoFinal,
            @PathVariable("ctaInicial") String ctaInicial,
            @PathVariable("ctaFinal") String ctaFinal,
            @PathVariable("fecIni") String fecIni,
            @PathVariable("fecVen") String fecVen,
            @PathVariable("orden") String orden) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {
            lista = service.swListarResuPACD(2, cia, ejer, periodo, info, tipoAnexo, codAnexoInicial, codAnexoFinal,
                    ctaInicial, ctaFinal, fecIni, fecVen, orden);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1072_F + " + e.getMessage());
        }
    }

    @GetMapping("/swListarPlanoPACD/{cia}/{ejer}/{periodo}/{info}/{tipoAnexo}/{codAnexoInicial}/{codAnexoFinal}/{ctaInicial}/{ctaFinal}/{fecIni}/{fecVen}/{orden}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swListarPlanoPACD(
            @PathVariable("cia") String cia,
            @PathVariable("ejer") String ejer,
            @PathVariable("periodo") String periodo,
            @PathVariable("info") String info,
            @PathVariable("tipoAnexo") String tipoAnexo,
            @PathVariable("codAnexoInicial") String codAnexoInicial,
            @PathVariable("codAnexoFinal") String codAnexoFinal,
            @PathVariable("ctaInicial") String ctaInicial,
            @PathVariable("ctaFinal") String ctaFinal,
            @PathVariable("fecIni") String fecIni,
            @PathVariable("fecVen") String fecVen,
            @PathVariable("orden") String orden) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {
            lista = service.swListarPlanoPACD(3, cia, ejer, periodo, info, tipoAnexo, codAnexoInicial, codAnexoFinal,
                    ctaInicial, ctaFinal, fecIni, fecVen, orden);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1072_F + " + e.getMessage());
        }
    }

}
