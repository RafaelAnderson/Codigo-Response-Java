package com.empresa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.empresa.service.lcoSaldoAnexService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/lcoSaldoAnex")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcoSaldoAnexController {

    @Autowired
    private lcoSaldoAnexService service;

    @GetMapping(value = { "/listarSaldoAnex/{cia}/{ejer}/{periodo}/{dl_tpanex}",
            "/listarSaldoAnex/{cia}/{ejer}/{periodo}/{dl_tpanex}/{dl_cuenta}/{dl_cdanex}",
            "/listarSaldoAnex/{cia}/{ejer}/{periodo}/{dl_tpanex}/{dl_cuenta}//",
            "/listarSaldoAnex/{cia}/{ejer}/{periodo}/{dl_tpanex}//{dl_cdanex}",
    })

    public ResponseEntity<?> swListarSaldoAnex(
            @PathVariable("cia") String cia,
            @PathVariable("ejer") String ejer,
            @PathVariable(value = "dl_cuenta", required = false) String dl_cuenta,
            @PathVariable("dl_tpanex") String dl_tpanex,
            @PathVariable(value = "dl_cdanex", required = false) String dl_cdanex,
            @PathVariable("periodo") String periodo) {

        if (dl_cuenta == null) {
            dl_cuenta = "";
        }

        if (dl_cdanex == null) {
            dl_cdanex = "";
        }

        Map<String, Object> salida = new HashMap<>();

        try {
            List<Map<String, Object[]>> lista = service.swListarSaldoAnex(1, cia, ejer, dl_cuenta, dl_tpanex, dl_cdanex,
                    periodo, "", "", "");

            if (lista.size() == 0) {
                salida.put("mensaje", "Lista de saldos por anexo correctamente.");
            } else {
                salida.put("mensaje", "Consulta exitosa");
            }
            return ResponseEntity.ok(lista);

        } catch (Exception e) {
            e.printStackTrace();
            salida.put("mensaje", "Error HUR1064 " + e.getMessage());
        }

        return ResponseEntity.ok(salida);
    }

    @GetMapping(value = { "/listarSaldoDoc/{cia}/{ejer}/{periodo}/{dl_cuenta}/{dl_tpanex}/{dl_cdanex}",
            "/listarSaldoDoc/{cia}/{ejer}/{periodo}/{dl_cuenta}/{dl_tpanex}/{dl_cdanex}/{opciones}" })

    public ResponseEntity<?> swListaSalDoc(
            @PathVariable("cia") String cia,
            @PathVariable("ejer") String ejer,
            @PathVariable("dl_cuenta") String dl_cuenta,
            @PathVariable("dl_tpanex") String dl_tpanex,
            @PathVariable("dl_cdanex") String dl_cdanex,
            @PathVariable("periodo") String periodo,
            @PathVariable(value = "opciones", required = false) String opciones) {

        if (opciones == null) {
            opciones = "";
        }

        Map<String, Object> salida = new HashMap<>();

        try {
            List<Map<String, Object[]>> lista = service.swListaSalDoc(2, cia, ejer, dl_cuenta, dl_tpanex, dl_cdanex,
                    periodo, opciones, "", "");

            if (lista.size() == 0) {
                salida.put("mensaje", "Lista de saldos por documento correctamente.");
            } else {
                salida.put("mensaje", "Consulta exitosa");
            }
            return ResponseEntity.ok(lista);

        } catch (Exception e) {
            e.printStackTrace();
            salida.put("mensaje", "Error HUR1064 " + e.getMessage());
        }

        return ResponseEntity.ok(salida);
    }

    @GetMapping(value = { "/listarDetalleSal/{cia}/{ejer}/{periodo}/{dl_cuenta}/{dl_tpanex}/{dl_cdanex}",
            "/listarDetalleSal/{cia}/{ejer}/{periodo}/{dl_cuenta}/{dl_tpanex}/{dl_cdanex}/{dl_tpdoc}/{dl_nmdoc}" })
    public ResponseEntity<?> swListaDetSal(
            @PathVariable("cia") String cia,
            @PathVariable("ejer") String ejer,
            @PathVariable("dl_cuenta") String dl_cuenta,
            @PathVariable("dl_tpanex") String dl_tpanex,
            @PathVariable("dl_cdanex") String dl_cdanex,
            @PathVariable("periodo") String periodo,
            @PathVariable(value = "dl_tpdoc", required = false) String dl_tpdoc,
            @PathVariable(value = "dl_nmdoc", required = false) String dl_nmdoc) {

        if (dl_tpdoc == null) {
            dl_tpdoc = "";
        }

        if (dl_nmdoc == null) {
            dl_nmdoc = "";
        }

        Map<String, Object> salida = new HashMap<>();

        try {
            List<Map<String, Object[]>> lista = service.swListaDetSal(3, cia, ejer, dl_cuenta, dl_tpanex, dl_cdanex,
                    periodo, "", dl_tpdoc, dl_nmdoc);

            if (lista.size() == 0) {
                salida.put("mensaje", "Lista de detalles por saldo correctamente.");
            } else {
                salida.put("mensaje", "Consulta exitosa");
            }
            return ResponseEntity.ok(lista);

        } catch (Exception e) {
            e.printStackTrace();
            salida.put("mensaje", "Error HUR1064 " + e.getMessage());
        }

        return ResponseEntity.ok(salida);
    }

}