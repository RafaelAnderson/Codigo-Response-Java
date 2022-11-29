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

import com.empresa.service.AsientoAperturaService;

@RestController
@RequestMapping("/rest/AsientoApertura")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class AsientoAperturaController {
    @Autowired
    private AsientoAperturaService service;

    @GetMapping("/listarTabla/{cia}/{parametro}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swListarTablaVarSD(@PathVariable("cia") String cia, @PathVariable("parametro") String parametro) throws Exception {
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swListarTablaVarSD(0, cia, "", "", parametro);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1021_F  + " + e.getMessage());
        }

    }

    @GetMapping("/saldoCuenta/{cia}/{ejercicio}/{periodo}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swListarSaldosCuenta(@PathVariable("cia") String cia, @PathVariable("ejercicio") String ejercicio,
                                                                        @PathVariable("periodo") String periodo) throws Exception {
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swListarSaldosCuenta(1, cia, ejercicio, periodo, "");

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1021_F  + " + e.getMessage());
        }

    }
}
