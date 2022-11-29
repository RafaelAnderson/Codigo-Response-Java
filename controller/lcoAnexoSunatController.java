package com.empresa.controller;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.models.Response;

@RestController
@RequestMapping("rest/DatosSunat")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcoAnexoSunatController {

    @GetMapping(value = { "/DNISunat/{dni}" })
    @ResponseBody
    public String swDNISunat(
            @PathVariable("dni") String dni) throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.apis.net.pe/v1/dni?numero=" + dni))
                .build();

        HttpResponse<String> response = null;

        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String responseString = response.body();
        System.out.println(responseString);

        Response romaniaData = null;

        try {
            romaniaData = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                    .readValue(responseString, Response.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return responseString;
    }

    @GetMapping(value = { "/RUCSunat/{ruc}" })
    @ResponseBody
    public String swRUCSunat(
            @PathVariable("ruc") String ruc) throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.apis.net.pe/v1/ruc?numero=" + ruc))
                .build();

        HttpResponse<String> response = null;

        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String responseString = response.body();
        System.out.println(responseString);

        Response romaniaData = null;

        try {
            romaniaData = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                    .readValue(responseString, Response.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return responseString;
    }

}
