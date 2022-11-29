package com.empresa.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.MySql.MySqlConfig;

import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/rest/ConectarBD")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class ConeccionMySql {

    @PostMapping(value = "/credenciales/{servidor}")
    public ResponseEntity<Map<String, Object>> conectarBD(
            @PathVariable(value = "servidor", required = true) String servidor) {

        Map<String, Object> response = new HashMap<>();

        MySqlConfig config = new MySqlConfig();

        try {
            config.userDataSource(servidor);
            response.put("Mensaje", "Base creada");
        } catch (Exception e) {
            e.printStackTrace();
            response.put("Mensaje", "Error fatal");
        }

        return ResponseEntity.ok(response);
    }
}
