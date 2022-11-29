package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.empresa.service.rptLibroDiario_SimplifiPLEService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/rptLibroDiarioSimpliPle")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class rptLibroDiario_SimplifiPLEController {
    @Autowired
    private rptLibroDiario_SimplifiPLEService service;

    @GetMapping(value = { "/LibroDiario_SimplifiPLE/{basedatos}/{opcion}/{cia}/{ejercicio}/{PER}" })
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> LibroDiario_SimplifiPLE(

            @PathVariable("basedatos") String basedatos,
            @PathVariable("opcion") Integer opcion,
            @PathVariable("cia") String cia,
            @PathVariable("ejercicio") String ejercicio,
            @PathVariable("PER") String PER) throws Exception {

        List<Map<String, Object[]>> lista = new ArrayList<>();
        try {
            lista = service.LibroDiario_SimplifiPLE(basedatos, opcion, cia, ejercicio, PER);
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            throw new Exception("Error HUR1077_B  + " + e.getMessage());
        }

    }
}