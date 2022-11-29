package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.empresa.service.rptBalanceSaldoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/rtpBalanceSaldo")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class rptBalanceSaldoController {
    @Autowired
    private rptBalanceSaldoService rptBalanceService;

    @GetMapping(value = {"/swBalSaldo/{Cia}/{ejercicio}/{PER}/{N}"})
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swBalSaldo(
                                                                @PathVariable("Cia")String Cia,
                                                                @PathVariable("ejercicio")String ejercicio,
                                                                @PathVariable("PER")String PER,
                                                                @PathVariable("N")String N)throws Exception{
            List<Map<String,Object[]>>lista=new ArrayList<>();
            try {
                lista = rptBalanceService.swBalSaldo(Cia, ejercicio, PER, N);
                return ResponseEntity.ok(lista);
            } catch (Exception e) {
                throw new Exception("Error HUR1021_F  + " + e.getMessage());
            }

            
       
        }
    }