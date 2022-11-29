package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.empresa.service.balcomprobaService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/rtpBalanceComprobacion")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class balcomprobaController {
    @Autowired
    private balcomprobaService balanceService;

    @GetMapping(value = {"/swBalComp/{opcion}/{Cia}/{ejercicio}/{PER}/{Nd}/{pCta}/{tipRep}"})
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swBal(
                                                                @PathVariable("opcion")int opcion,
                                                                @PathVariable("Cia")String Cia,
                                                                @PathVariable("ejercicio")String ejercicio,
                                                                @PathVariable("PER")String PER,
                                                                @PathVariable("Nd")String Nd,
                                                                @PathVariable("pCta")String pCta,
                                                                @PathVariable("tipRep")String tipRep)throws Exception{
            List<Map<String,Object[]>>lista=new ArrayList<>();
            try {
                lista = balanceService.swBalComp(opcion,Cia, ejercicio, PER, Nd,pCta,tipRep);
                return ResponseEntity.ok(lista);
            } catch (Exception e) {
                throw new Exception("Error HUR1021_F  + " + e.getMessage());
            }

        }
    }
