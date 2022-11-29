package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.empresa.service.libroDiarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/libroDiario")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class libroDiarioController {
    @Autowired
    private libroDiarioService service;

    @GetMapping("/librodiario1/{p_ciacont}/{ejercicio}/{periodo}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swLibDiario(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("periodo") String periodo) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swLibDiario(0, p_ciacont, ejercicio, periodo, "");

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1021_F  + " + e.getMessage());
        }

    }

    @GetMapping("/librodiario2/{p_ciacont}/{ejercicio}/{periodo}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swLibDiarioPLE(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("periodo") String periodo) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swLibDiario(1, p_ciacont, ejercicio, periodo, "");

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1021_F  + " + e.getMessage());
        }

    }

    @GetMapping("/librodiario3/{p_ciacont}/{ejercicio}/{periodo}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swPlanCtaPLE(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("periodo") String periodo) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swLibDiario(2, p_ciacont, ejercicio, periodo, "");

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1021_F  + " + e.getMessage());
        }

    }

    
    @GetMapping("/librodiario1Subdiario/{p_ciacont}/{ejercicio}/{periodo}/{subdia}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swLibDiarioSubdiario(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("periodo") String periodo, @PathVariable("subdia") String subdia) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swLibDiarioSubdiario(3, p_ciacont, ejercicio, periodo, subdia);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1021_F  + " + e.getMessage());
        }

    }

    
    @GetMapping("/librodiario2Subdiario/{p_ciacont}/{ejercicio}/{periodo}/{subdia}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swLibDiarioPLE(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("periodo") String periodo, @PathVariable("subdia") String subdia) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swLibDiarioPLESubdiario(4, p_ciacont, ejercicio, periodo, subdia);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1021_F  + " + e.getMessage());
        }

    }
}
