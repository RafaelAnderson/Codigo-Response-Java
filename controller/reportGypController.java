package com.empresa.controller;

import java.util.ArrayList;
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

import com.empresa.service.reportGypService;

@RestController
@RequestMapping("rest/reportGyp")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class reportGypController {

    @Autowired
    private reportGypService service;

    @GetMapping(value = {"/listReportGYP/{xcia}/{xejer}/{xmodelo}/{xfecsaldo}/{xcodrbr}"})
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swReporte_GyP(
        @PathVariable("xcia") String xcia,
        @PathVariable("xejer") String xejer,
        @PathVariable("xmodelo") int xmodelo,
        @PathVariable("xfecsaldo") String xfecsaldo,
        @PathVariable("xcodrbr") String xcodrbr
    ) throws Exception{

        List<Map<String, Object>> lista = new ArrayList<>();

        try{
            lista = service.swReporte_GyP(xcia, xejer, xmodelo, xfecsaldo, xcodrbr);
            return ResponseEntity.ok(lista);
        } catch(Exception e){
            throw new Exception("Error ReportGYP " + e.getMessage());
        }
    }
}
