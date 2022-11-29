package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.empresa.service.ConsultasCuentasOrigenDestinoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/consultaCtasOrigDest")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class ConsultasCuentasOrigenDestinoController {
    @Autowired
    private ConsultasCuentasOrigenDestinoService consultasCuentasOrigenDestinoService;

    @GetMapping(value = { "/swConsCtaDstOrig/{cia}/{ejercicio}/{periodo}/{pcta}",
            "/swConsCtaDstOrig/{cia}/{ejercicio}/{periodo}" })
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swExisFormato(
            @PathVariable("cia") String cia,
            @PathVariable("ejercicio") String ejercicio,
            @PathVariable("periodo") String periodo,
            @PathVariable(value = "pcta", required = false) String pcta) throws Exception {
        List<Map<String, Object[]>> lista = new ArrayList<>();
        if (pcta == null) {
            pcta = "";
        }
        try {
            lista = consultasCuentasOrigenDestinoService.swConsCtaDstOrig(
                    0,
                    cia,
                    ejercicio,
                    periodo,
                    pcta);
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception("Error HU1043_B + " + e.getMessage());
        }

    }

    @GetMapping(value = { "/swResuCtaDstOrig/{cia}/{ejercicio}/{periodo}/{pcta}"})
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swResuCtaDstOrig(
            @PathVariable("cia") String cia,
            @PathVariable("ejercicio") String ejercicio,
            @PathVariable("periodo") String periodo,
            @PathVariable(value = "pcta", required = false) String pcta) throws Exception {
        List<Map<String, Object[]>> lista = new ArrayList<>();
        if (pcta == null) {
            pcta = "";
        }
        try {
            lista = consultasCuentasOrigenDestinoService.swConsCtaDstOrig(
                    1,
                    cia,
                    ejercicio,
                    periodo,
                    pcta);
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception("Error HU1043_B + " + e.getMessage());
        }

    }

    @GetMapping(value = { "/swDetaCtaDstOrig/{cia}/{ejercicio}/{periodo}/{pcta}"})
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swDetaCtaDstOrig(
            @PathVariable("cia") String cia,
            @PathVariable("ejercicio") String ejercicio,
            @PathVariable("periodo") String periodo,
            @PathVariable(value = "pcta", required = false) String pcta) throws Exception {
        List<Map<String, Object[]>> lista = new ArrayList<>();
        if (pcta == null) {
            pcta = "";
        }
        try {
            lista = consultasCuentasOrigenDestinoService.swConsCtaDstOrig(
                    2,
                    cia,
                    ejercicio,
                    periodo,
                    pcta);
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception("Error HU1043_B + " + e.getMessage());
        }

    }
}
