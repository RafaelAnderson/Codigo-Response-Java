package com.empresa.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.empresa.service.rptMovimientoAnexoCuentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.format.annotation.DateTimeFormat;

@RestController
@RequestMapping("/rest/MovimientoAnexoCuenta")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class rptMovimientoAnexoCuentaController {
    @Autowired
    private rptMovimientoAnexoCuentaService service;

    @GetMapping(value = {
            "/swListarDetAnexCta/{cia}/{ejercicio}/{FecInicial}/{FecFinal}/{CtaInicial}/{CtaFinal}/{TipoAnexo}/{CodAnexoInicial}/{CodAnexoFinal}/{Orden}",
            "/swListarDetAnexCta/{cia}/{ejercicio}/{FecInicial}/{FecFinal}/{CtaInicial}/{CtaFinal}/{CodAnexoInicial}/{CodAnexoFinal}/{Orden}"
    })
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swListarDetAnexCta(
            @PathVariable("cia") String cia,
            @PathVariable("ejercicio") String ejercicio,
            @PathVariable("FecInicial") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate FecInicial,
            @PathVariable("FecFinal") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate FecFinal,
            @PathVariable("CtaInicial") String CtaInicial,
            @PathVariable("CtaFinal") String CtaFinal,
            @PathVariable(value = "TipoAnexo", required = false) String TipoAnexo,
            @PathVariable("CodAnexoInicial") String CodAnexoInicial,
            @PathVariable("CodAnexoFinal") String CodAnexoFinal,
            @PathVariable("Orden") String Orden) throws Exception {

        List<Map<String, Object[]>> lista = new ArrayList<>();
        try {
            if (TipoAnexo == null) {
                TipoAnexo = "";
            }
            lista = service.swListarDetAnexCta(0, cia, ejercicio, FecInicial, FecFinal, CtaInicial, CtaFinal,
                    TipoAnexo, CodAnexoInicial, CodAnexoFinal, Orden);
            System.out.println(lista.toString());

            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            throw new Exception("Error HUR1070_B  + " + e.getMessage());
        }

    }

    @GetMapping(value = {
            "/swListarDetAnex/{cia}/{ejercicio}/{FecInicial}/{FecFinal}/{CtaInicial}/{CtaFinal}/{TipoAnexo}/{CodAnexoInicial}/{CodAnexoFinal}/{Orden}",
            "/swListarDetAnex/{cia}/{ejercicio}/{FecInicial}/{FecFinal}/{CtaInicial}/{CtaFinal}/{CodAnexoInicial}/{CodAnexoFinal}/{Orden}" })
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swListarDetAnex(
            @PathVariable("cia") String cia,
            @PathVariable("ejercicio") String ejercicio,
            @PathVariable("FecInicial") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate FecInicial,
            @PathVariable("FecFinal") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate FecFinal,
            @PathVariable("CtaInicial") String CtaInicial,
            @PathVariable("CtaFinal") String CtaFinal,
            @PathVariable(value = "TipoAnexo", required = false) String TipoAnexo,
            @PathVariable("CodAnexoInicial") String CodAnexoInicial,
            @PathVariable("CodAnexoFinal") String CodAnexoFinal,
            @PathVariable("Orden") String Orden) throws Exception {

        List<Map<String, Object[]>> lista = new ArrayList<>();
        try {
            if (TipoAnexo == null) {
                TipoAnexo = "";
            }
            lista = service.swListarDetAnex(1, cia, ejercicio, FecInicial, FecFinal, CtaInicial, CtaFinal,
                    TipoAnexo, CodAnexoInicial, CodAnexoFinal, Orden);
            System.out.println(lista.toString());

            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            throw new Exception("Error HUR1070_B  + " + e.getMessage());
        }

    }
}