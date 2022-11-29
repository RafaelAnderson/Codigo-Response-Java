package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.empresa.service.CentroCostoDetalladoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/rptCentroCostoDetallado")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class CentroCostoDetalladoController {

    @Autowired
    private CentroCostoDetalladoService centroCostoDetalladoService;

    @GetMapping(value = {
            "/swRepCst/{_ejer}/{_cia}/{periodo_ini}/{periodo_fin}/{_mnd}/{codCstIni}/{codCstFin}/{tpAnx}/{cdAnx}/{_quie1}/{_quie2}/{_quie3}",
    })
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swRepCst(

            @PathVariable("_ejer") String _ejer,
            @PathVariable("_cia") String _cia,
            @PathVariable("periodo_ini") String periodo_ini,
            @PathVariable("periodo_fin") String periodo_fin,
            @PathVariable("_mnd") String _mnd,
            @PathVariable("_quie1") String _quie1,
            @PathVariable("_quie2") String _quie2,
            @PathVariable("_quie3") String _quie3,
            @PathVariable(value = "codCstIni", required = false) String codCstIni,
            @PathVariable(value = "codCstFin", required = false) String codCstFin,
            @PathVariable(value = "tpAnx", required = false) String tpAnx,
            @PathVariable(value = "cdAnx", required = false) String cdAnx) throws Exception {
        if (codCstIni == null) {
            codCstIni = "";
        }
        if (codCstFin == null) {
            codCstFin = "";
        }
        if (tpAnx == null) {
            tpAnx = "";
        }
        if (cdAnx == null) {
            cdAnx = "";
        }
        List<Map<String, Object[]>> lista = new ArrayList<>();
        try {
            System.out.println(lista);
            lista = centroCostoDetalladoService.swRepCst(_ejer, _cia, periodo_ini, periodo_fin, _mnd, codCstIni, codCstFin, tpAnx, cdAnx, _quie1, _quie2, _quie3);
            return ResponseEntity.ok(lista);
        } catch (Exception e) {

            throw new Exception("Error HU1059_B + " + e.getMessage());
        }
    }
}
