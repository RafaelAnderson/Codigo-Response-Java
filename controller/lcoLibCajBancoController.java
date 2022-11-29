package com.empresa.controller;

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

import com.empresa.service.lcoLibCajBancoService;

@RestController
@RequestMapping("/rest/lcoLibCajBanco")
@CrossOrigin(origins = {"http://192.168.0.46","http://localhost:4200","http://174.138.178.198","https://app.liderasoftware.pe"})

public class lcoLibCajBancoController {

    @Autowired
    private lcoLibCajBancoService service;

    @GetMapping(value={"/swLibCajBanco/{cia}/{ejer}/{periodo}"})

    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swLibCajBanco(
            @PathVariable(value = "cia") String cia,
            @PathVariable(value = "ejer") String ejer,
            @PathVariable(value = "periodo") String periodo) throws Exception {

            List<Map<String, Object[]>> lista;

            try {
                lista = service.swLibCajBanco(1, cia, ejer, periodo);
            } catch (Exception e) {
                throw new Exception("Error HUR2006_B 1° + " + e.getMessage());
            }
        return ResponseEntity.ok(lista);
    }

    @GetMapping(value={"/swLibCajBancoFrmCab/{cia}/{ejer}/{periodo}/{ctaInicial}/{ctaFinal}/{tipoAnexo}/{codAnexo}/{flagAstCie}"})

    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swLibCajBancoFrmCab(
            @PathVariable(value = "cia") String cia,
            @PathVariable(value = "ejer") String ejer,
            @PathVariable(value = "periodo") String periodo,
            @PathVariable(value = "ctaInicial") String ctaInicial,
            @PathVariable(value = "ctaFinal") String ctaFinal,
            @PathVariable(value = "tipoAnexo") String tipoAnexo,
            @PathVariable(value = "codAnexo") String codAnexo,
            @PathVariable(value = "flagAstCie") String flagAstCie) throws Exception {
                
            List<Map<String, Object[]>> lista;

            try {
                lista = service.swLibCajBancoFrmCab(1, cia, ejer, periodo, ctaInicial, ctaFinal, tipoAnexo, codAnexo, flagAstCie);
            } catch (Exception e) {
                throw new Exception("Error HUR2006_B 1° + " + e.getMessage());
            }
        return ResponseEntity.ok(lista);
    }

    @GetMapping(value={"/swLibCajBancoFrmDet/{cia}/{ejer}/{periodo}/{cta}/{codAnexo}/{flagAstCie}/{flagAstAjs}"})

    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swLibCajBancoFrmDet(
            @PathVariable(value = "cia") String cia,
            @PathVariable(value = "ejer") String ejer,
            @PathVariable(value = "periodo") String periodo,
            @PathVariable(value = "cta") String cta,
            @PathVariable(value = "codAnexo") String codAnexo,
            @PathVariable(value = "flagAstCie") String flagAstCie,
            @PathVariable(value = "flagAstAjs") String flagAstAjs) throws Exception {

            List<Map<String, Object[]>> lista;

            try {
                lista = service.swLibCajBancoFrmDet(1, cia, ejer, periodo, cta, codAnexo, flagAstCie, flagAstAjs);
            } catch (Exception e) {
                throw new Exception("Error HUR2006_B 1° + " + e.getMessage());
            }
        return ResponseEntity.ok(lista);
    }
}
