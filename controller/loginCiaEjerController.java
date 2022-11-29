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

import com.empresa.service.loginCiaEjerService;

@RestController
@RequestMapping("rest/loginCiaEjer")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class loginCiaEjerController {

    @Autowired
    private loginCiaEjerService service;

    @GetMapping(value = { "/swListarEjerDoc/{_codcia}/{_nrodoc}" })
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swListarEjerDoc(
            @PathVariable(value = "_codcia") String _codcia,
            @PathVariable(value = "_nrodoc") String _nrodoc) throws Exception {

        List<Map<String, Object[]>> lista = new ArrayList<>();

        try {
            lista = service.ListarEjer(0, _codcia, _nrodoc);
            return ResponseEntity.ok(lista);

        } catch (Exception e) {
            throw new Exception("Error 1095 1° " + e.getMessage());
        }
    }

    @GetMapping(value = { "/swListarCiasLDxUser/{_coduser}/{_idbd}" })
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swListarCiasLDxUser(
            @PathVariable(value = "_coduser") String _coduser,
            @PathVariable(value = "_idbd") String _idbd) throws Exception {

        List<Map<String, Object[]>> lista1 = new ArrayList<>();
        List<Map<String, Object[]>> lista2 = new ArrayList<>();

        try {
            lista1 = service.ListarCias(0, _coduser, _idbd);
            lista2 = service.ListarCias(1, _coduser, _idbd);

            System.out.println(lista1.size());
            
            if (lista1.size() == 0) {
                System.out.println(lista2.size());
                return ResponseEntity.ok(lista2);
            } else {
                return ResponseEntity.ok(lista1);
            }
        } catch (Exception e) {
            throw new Exception("Error 1095 2° " + e.getMessage());
        }
    }
}