package com.empresa.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.detraccion;
import com.empresa.entity.detraccionPK;
import com.empresa.service.detraccionService;


@RestController
@RequestMapping("rest/detraccion")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })

public class detraccionController {
    
    @Autowired
    private detraccionService detraccionService;

    @GetMapping(value = {"/listarTASD/{cia}", "/listarTASD/{cia}/{td_tipope}/{td_codbser}"})
    @ResponseBody
    public ResponseEntity<List<detraccion>> listarTASD(
        @PathVariable(value = "cia") String cia,
        @PathVariable(value = "td_tipope", required = false) String td_tipope,
        @PathVariable(value = "td_codbser", required = false) String td_codbser) throws Exception {
            
            if(td_tipope == null) td_tipope = "";
            if(td_codbser == null) td_codbser = "";
            
            detraccion objSalida = new detraccion();
            detraccionPK pk = new detraccionPK();
            List<detraccion> lista;

            try{
                pk.setTd_codbser(td_codbser);
                pk.setTd_tipope(td_tipope);
                objSalida.setTd_tasa(0.0);
                objSalida.setTd_valref1(0.0);
                objSalida.setTd_valref2(0.0);
                objSalida.setTd_feccrea(LocalDate.now());
                objSalida.setTd_hracrea(LocalTime.now());
                objSalida.setTd_fecact(LocalDate.now());
                objSalida.setTd_hraact(LocalTime.now());
                objSalida.setPk(pk);

                lista = detraccionService.listarTASD(0, cia, objSalida);
            } catch(Exception e) {
                throw new Exception("Error HUR1014 + " + e.getMessage());
            }
            return ResponseEntity.ok(lista);
        }

    @PostMapping("/creaTASD/{cia}")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> creaTASD(
        @PathVariable(value = "cia") String cia,
        @RequestBody detraccion obj) {
        Map<String, Object> salida = new HashMap<>();        
        try {
            List<detraccion> lista = detraccionService.listarTASD(0, cia, obj);
            if(lista.size() >= 1) {
                salida.put("mensaje", "Ya existe registro");
            } else {
                obj.setTd_feccrea(LocalDate.now());
                obj.setTd_hracrea(LocalTime.now());
                obj.setTd_fecact(LocalDate.now());
                obj.setTd_hraact(LocalTime.now());
                detraccionService.creaTASD(1, cia, obj);
                salida.put("mensaje", "Registrado correctamente");
            }
        } catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "No se pudo registrar");
		}
        return ResponseEntity.ok(salida);
    }

    
    @PutMapping("/actuTASD/{cia}")
    public ResponseEntity<Map<String, Object>> actuTASD(
        @PathVariable(value = "cia") String cia,
        @RequestBody detraccion obj) {
        Map<String, Object> salida = new HashMap<>();
        try {
            obj.setTd_fecact(LocalDate.now());
            obj.setTd_hraact(LocalTime.now());
            detraccionService.actuTASD(2, cia, obj);
            salida.put("mensaje", "Actualizado correctamente");
        } catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1014 " + e.getMessage());
		}
        return ResponseEntity.ok(salida);
    }

    @DeleteMapping("eliminaTASD/{cia}/{td_tipope}/{td_codbser}")
    public ResponseEntity<Map<String, Object>> eliminaTASD(
        @PathVariable(value = "cia") String cia,
        @PathVariable String td_tipope,
        @PathVariable("td_codbser") String td_codbser) throws Exception {
        
        Map<String, Object> response = new HashMap<>();
        detraccion objSalida = new detraccion();
        detraccionPK pk = new detraccionPK();
        try{
            pk.setTd_codbser(td_codbser);
            pk.setTd_tipope(td_tipope);
            objSalida.setPk(pk);
            List<detraccion> lista = detraccionService.listarTASD(0, cia, objSalida);

            if(lista.size() == 0) {
                response.put("mensaje", "No se encontro los datos con el id ".concat(td_codbser));
            } else {
                detraccionService.eliminaTASD(3, cia, objSalida);
                response.put("mensaje", "Eliminado correctamente");
            }
        } catch(Exception e) {
            throw new Exception("Error HUR1014 + " + e.getMessage());
        }
        return ResponseEntity.ok(response);
    }
}
