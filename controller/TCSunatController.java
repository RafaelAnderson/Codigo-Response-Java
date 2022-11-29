package com.empresa.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("rest/tcSunat")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class TCSunatController {

    @GetMapping(value = { "/moneda/{anio}/{mes}" })
    @ResponseBody
    public List<Object> swCrearTcb(
            @PathVariable("mes") String mes,
            @PathVariable("anio") String anio) throws Exception {

        String url = "https://api.apis.net.pe/v1/tipo-cambio-sunat?month=" + mes + "&year=" + anio;

        RestTemplate restTemplate = new RestTemplate();

        Object[] monedas = restTemplate.getForObject(url, Object[].class);

        return Arrays.asList(monedas);
    }
}
