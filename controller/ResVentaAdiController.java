package com.empresa.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.lcoTblaVenta;
import com.empresa.entity.lcoTblaVentaPk;
import com.empresa.service.ResVentaAdiService;

@RestController
@RequestMapping("/rest/listlcovent")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class ResVentaAdiController {
    @Autowired
    private ResVentaAdiService service;

    @GetMapping(value = "/swListarRecVnt/{cia}/{ejercicio}/{PER}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swListarRecVnt(@PathVariable("cia") String cia,
            @PathVariable("ejercicio") String ejercicio,
            @PathVariable("PER") String PER)

            throws Exception {
        lcoTblaVentaPk pk = new lcoTblaVentaPk();
        List<Map<String, Object[]>> lista;

        try {
            pk.setAv_codper(PER);
            pk.setAv_subdia("");
            pk.setAv_compro("");
            lcoTblaVenta objE = new lcoTblaVenta(pk, LocalDate.now(), LocalDate.now(), LocalDate.now(), "", "", "", "",
                    "", "", "", "", "", "",
                    0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                    0.0, 0.0, 0.0, 0.0, "", 0.0, 0.0,
                    LocalDate.now(), "", "", "", "", LocalDate.now(), LocalTime.now(), "", LocalDate.now(),
                    LocalTime.now(),
                    "", "", "", "", "", "", "");

            lista = service.swListarRecVnt(0, cia, ejercicio, PER, "", "", objE);
            return ResponseEntity.ok().body(lista);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("mensaje" + " HUR1057" + e.getMessage());
        }
    }

    @GetMapping(value = "/swBscRecVnt/{cia}/{ejercicio}/{PER}/{SD}/{asiento}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swBscRecVnt(@PathVariable("cia") String cia,
            @PathVariable("ejercicio") String ejercicio,
            @PathVariable("PER") String PER,
            @PathVariable("SD") String SD,
            @PathVariable("asiento") String asiento)
            throws Exception {
        lcoTblaVentaPk pk = new lcoTblaVentaPk();
      
        List<Map<String, Object[]>> lista;
        try {
            pk.setAv_codper(PER);
            pk.setAv_subdia("");
            pk.setAv_compro("");
            lcoTblaVenta objE = new lcoTblaVenta(pk, LocalDate.now(), LocalDate.now(), LocalDate.now(), "", "", "", "",
                    "", "", "", "", "", "",
                    0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                    0.0, 0.0, 0.0, 0.0, "", 0.0, 0.0,
                    LocalDate.now(), "", "", "", "", LocalDate.now(), LocalTime.now(), "", LocalDate.now(),
                    LocalTime.now(),
                    "", "", "", "", "", "", "");
            lista = service.swBscRecVnt(1, cia, ejercicio, PER, SD, asiento, objE);
            return ResponseEntity.ok().body(lista);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("mensaje" + " HUR1057" + e.getMessage());
        }
    }

    @GetMapping(value = "/swConRecVnt/{cia}/{PER}/{SD}/{asiento}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swConRecVnt(@PathVariable("cia") String cia,
            @PathVariable("PER") String PER,
            @PathVariable("SD") String SD,
            @PathVariable("asiento") String asiento)
            throws Exception {
        lcoTblaVentaPk pk = new lcoTblaVentaPk();
        List<Map<String, Object[]>> lista;

        try {
            pk.setAv_codper(PER);
            pk.setAv_subdia("");
            pk.setAv_compro("");
            lcoTblaVenta objE = new lcoTblaVenta(pk, LocalDate.now(), LocalDate.now(), LocalDate.now(), "", "", "", "",
                    "", "", "", "", "", "",
                    0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                    0.0, 0.0, 0.0, 0.0, "", 0.0, 0.0,
                    LocalDate.now(), "", "", "", "", LocalDate.now(), LocalTime.now(), "", LocalDate.now(),
                    LocalTime.now(),
                    "", "", "", "", "", "", "");
            lista = service.swConRecVnt(2, cia, "", PER, SD, asiento, objE);
            return ResponseEntity.ok().body(lista);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("mensaje" + " HUR1057" + e.getMessage());
        }
    }

    @DeleteMapping(value = "/swEliRecVnt/{cia}/{SD}/{asiento}")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> swEliRecVnt(@PathVariable("cia") String cia,
            @PathVariable("SD") String SD,
            @PathVariable("asiento") String asiento) {
        Map<String, Object> response = new HashMap<>();
        lcoTblaVentaPk pk = new lcoTblaVentaPk();

        lcoTblaVenta objE = new lcoTblaVenta(pk, LocalDate.now(), LocalDate.now(), LocalDate.now(), "", "", "", "",
                "", "", "", "", "", "",
                0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 0.0, 0.0, "", 0.0, 0.0,
                LocalDate.now(), "", "", "", "", LocalDate.now(), LocalTime.now(), "", LocalDate.now(), LocalTime.now(),
                "", "", "", "", "", "", "");

        pk.setAv_codper("");
        pk.setAv_subdia(SD);
        pk.setAv_compro(asiento);
        try {
            service.swEliRecVnt(3, cia, "", "", SD, asiento, objE);
            response.put("mensaje", "Eliminado correctamente");
        } catch (Exception e) {
            response.put("Mensaje", "Ocurrio un error al eliminar con id ");
            response.put("mensaje", "Error HUR1057_B " + e.getMessage());
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping(value = { "/swCrearRecVnt/{cia}" })
    @ResponseBody
    public ResponseEntity<Map<String, Object>> swCrearRecVnt(@PathVariable("cia") String cia,
            @RequestBody lcoTblaVenta objE) {
        Map<String, Object> salida = new HashMap<>();
        LocalDate date = LocalDate.of(1111,11,11);
        if(objE.getAv_tipdocref().equals("")){
            objE.setAv_fecdocref(date);
        }
        // ac_fecdocref
        try {
            System.out.println(objE.toString());
            objE.setAv_feccrea(LocalDate.now());
            objE.setAv_hracrea(LocalTime.now());
            objE.setAv_fecact(LocalDate.now());
            objE.setAv_hraact(LocalTime.now());

            service.swCrearRecVnt(4, cia, "", "", "", "", objE);
            salida.put("mensaje", "Registrado correctamente");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
            String[] parts = e.getMessage().split(";");
            if (parts.length > 2) {
                salida.put("error", parts[2]);
            }
            salida.put("mensaje", "Error HUR1057_B " + e.getMessage());
        }

        return ResponseEntity.ok(salida);
    }

    @PutMapping("/swActRecVnt/{cia}")
    public ResponseEntity<Map<String, Object>> swActRecVnt(@PathVariable("cia") String cia,
            @RequestBody lcoTblaVenta objE) {
        Map<String, Object> salida = new HashMap<>();
        try {

            System.out.println(objE.toString());
            objE.setAv_feccrea(LocalDate.now());
            objE.setAv_hracrea(LocalTime.now());
            objE.setAv_fecact(LocalDate.now());
            objE.setAv_hraact(LocalTime.now());
            service.swActRecVnt(5, cia, "", "", "", "", objE);
            salida.put("mensaje", "Actualizado  correctamente");
        } catch (Exception e) {
            e.printStackTrace();
            salida.put("mensaje", "Error HUR1057_B " + e.getMessage());
        }
        return ResponseEntity.ok(salida);
    }

    @GetMapping(value = "/swListarAyuOmi/{cia}/{ejercicio}/{PER}/{SD}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swListarAyuOmi(
            @PathVariable("cia") String cia,
            @PathVariable("ejercicio") String ejercicio,
            @PathVariable("PER") String PER,
            @PathVariable("SD") String SD)
            throws Exception {
        lcoTblaVentaPk pk = new lcoTblaVentaPk();
        List<Map<String, Object[]>> lista;
        try {
            pk.setAv_codper(PER);
            pk.setAv_subdia("");
            pk.setAv_compro("");
            lcoTblaVenta objE = new lcoTblaVenta(pk, LocalDate.now(), LocalDate.now(), LocalDate.now(), "", "", "", "",
                    "", "", "", "", "", "",
                    0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                    0.0, 0.0, 0.0, 0.0, "", 0.0, 0.0,
                    LocalDate.now(), "", "", "", "", LocalDate.now(), LocalTime.now(), "", LocalDate.now(),
                    LocalTime.now(),
                    "", "", "", "", "", "", "");
            lista = service.swListarAyuOmi(6, cia, ejercicio, PER, SD, "", objE);
            return ResponseEntity.ok().body(lista);

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("mensaje" + "Error HUR1052_B " + e.getMessage());
        }
    }

}
