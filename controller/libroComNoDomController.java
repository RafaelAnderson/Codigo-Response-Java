package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.empresa.service.libroComNoDomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/libroNoCompDom")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class libroComNoDomController {
    @Autowired
    private libroComNoDomService service;

    @GetMapping("/libroNoCompDom/{cia}/{ejercicio}/{per}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swLiComNoDom(
        @PathVariable("cia") String cia,
        @PathVariable("ejercicio") String ejercicio,
        @PathVariable("per") String per)
         throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object[]>> lista = new ArrayList<>();
        try {
            lista = service.swLiComNoDom(0, cia, ejercicio, per);
            System.out.println(lista);
            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1021_F  + " + e.getMessage());
        }
    }
}
