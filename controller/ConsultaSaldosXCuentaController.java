package com.empresa.controller;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import com.empresa.service.ConsultaSaldosXCuentaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/ConsultaSaldosXCuenta")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class ConsultaSaldosXCuentaController {
    @Autowired
    private ConsultaSaldosXCuentaService service;

    @GetMapping(value = { "/swListarSaldoCtaDet/{cia}/{ejer}/{periodo}",
            "/swListarSaldoCtaDet/{cia}/{ejer}/{periodo}/{cta}",
            "/swListarSaldoCtaDet/{cia}/{ejer}/{periodo}/{cta}/{codane}",
            "/swListarSaldoCtaDet/{cia}/{ejer}/{periodo}/{codane}" })
    public ResponseEntity<List<Map<String, Object[]>>> swListarSaldoCtaDet(
            @PathVariable(value = "cia") String cia,
            @PathVariable(value = "ejer") String ejer,
            @PathVariable(value = "periodo") String periodo,
            @PathVariable(value = "cta", required = false) String cta,
            @PathVariable(value = "codane", required = false) String codane)
            throws Exception {
        if (cta == null) {
            cta = "";
        }
        if (codane == null) {
            codane = "";
        }
        try {
            List<Map<String, Object[]>> lista = service.swListarSaldoCtaDet(0, cia, ejer, periodo, cta, codane, "", "", "");

            return ResponseEntity.ok(lista);

        } catch (Exception e) {
            throw new Exception("Error HUR1033_F  + " + e.getMessage());
        }
    }

    @GetMapping(value = { "/swListarDetaSaldCta/{cia}/{ejer}/{periodo}/{cta}/{codane}/{tpanex}/{tpdoc}/{nmdoc}",
            "/swListarDetaSaldCta/{cia}/{ejer}/{periodo}/{cta}/{codane}/{tpanex}",
            "/swListarDetaSaldCta/{cia}/{ejer}/{periodo}/{cta}/{tpdoc}/{nmdoc}",
            "/swListarDetaSaldCta/{cia}/{ejer}/{periodo}/{cta}" })
    public ResponseEntity<List<Map<String, Object[]>>> swListarDetaSaldCta(
            @PathVariable(value = "cia") String cia,
            @PathVariable(value = "ejer") String ejer,
            @PathVariable(value = "periodo") String periodo,
            @PathVariable(value = "cta", required = false) String cta,
            @PathVariable(value = "codane", required = false) String codane,
            @PathVariable(value = "tpanex", required = false) String tpanex,
            @PathVariable(value = "tpdoc", required = false) String tpdoc,
            @PathVariable(value = "nmdoc", required = false) String nmdoc)
            throws Exception {
        if (codane == null && tpanex == null) {
            codane = "";
            tpanex = "";
        }
        if (tpdoc == null && nmdoc == null) {
            tpdoc = "";
            nmdoc = "";
        }
        if (cta == null) {
            cta = "";
        }
        try {
            List<Map<String, Object[]>> lista = service.swListarDetaSaldCta(1, cia, ejer, periodo, cta, codane, tpanex, tpdoc, nmdoc);

            return ResponseEntity.ok(lista);

        } catch (Exception e) {
            throw new Exception("Error HUR1033_F  + " + e.getMessage());
        }
    }
}