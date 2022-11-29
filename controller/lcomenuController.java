package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.lcomenu;
import com.empresa.service.lcomenuService;

@RestController
@RequestMapping("/rest/lcomenu")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcomenuController {
    @Autowired
    private lcomenuService service;

    @GetMapping("/listarMenu/{pUser}")
    @ResponseBody
    public ResponseEntity<List<lcomenu>> listarMenu(@PathVariable String pUser) throws Exception {
        try {
            List<lcomenu> lista = service.swListarMenu(pUser);
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            throw new Exception("Error HUR1096 " + e.getMessage());
        }
    }

}
