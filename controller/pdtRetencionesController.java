package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.empresa.service.pdtRetencionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/pdtRetenciones")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class pdtRetencionesController {
    @Autowired
    private pdtRetencionesService service;

    @GetMapping(value = { "/Retenciones/{base}/{opcion}/{cia}/{ejer}/{periodo}" })
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swCargaRetenciones(
            @PathVariable("base") String base,
            @PathVariable("opcion") int opcion,
            @PathVariable("cia") String cia,
            @PathVariable("ejer") String ejer,
            @PathVariable("periodo") String periodo) throws Exception {

        List<Map<String, Object[]>> lista = new ArrayList<>();

        try {

            lista = service.swCargaRetenciones(base, opcion, cia, ejer, periodo);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1049_F  + " + e.getMessage());
        }

    }

}