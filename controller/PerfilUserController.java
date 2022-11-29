package com.empresa.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoumnu;
import com.empresa.entity.lcoumnuPk;
import com.empresa.service.perfilUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/lcoPerfil")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })

public class PerfilUserController {

    @Autowired
    private perfilUserService service;

    // 1. Lista los registros de la Tabla de Menú, para el proceso de selección o
    // activación
    @GetMapping(value = { "/swListarMnuSel/{CodUser}" })
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swListarMnuSel(
            @PathVariable("CodUser") String CodUser) throws Exception {

        lcoumnuPk pk = new lcoumnuPk();

        pk.setUm_codusr(CodUser);
        pk.setUm_id("");

        lcoumnu objSalida = new lcoumnu(pk, 0, 0, 0, "", LocalDate.now(), LocalTime.now(), "",
                LocalDate.now(), LocalTime.now());

        List<Map<String, Object>> lista = new ArrayList<>();

        try {
            lista = service.swListarMnuSel(0, objSalida);
        } catch (Exception e) {
            throw new Exception("Error HUR1065_B  + " + e.getMessage());
        }
        return ResponseEntity.ok(lista);
    }

    // 2. Proceso que lista las opciones del menú para el acceso a los procesos del
    // modulo
    @GetMapping(value = { "/swListarMnu/{CodUser}" })
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swListarMnu(
            @PathVariable("CodUser") String CodUser) throws Exception {

        lcoumnuPk pk = new lcoumnuPk();

        pk.setUm_codusr(CodUser);
        pk.setUm_id("");

        lcoumnu objSalida = new lcoumnu(pk, 0, 0, 0, "", LocalDate.now(), LocalTime.now(), "",
                LocalDate.now(), LocalTime.now());

        List<Map<String, Object>> lista = new ArrayList<>();
        lista = service.swListarMnu(1, objSalida);

        if (lista.size() != 1) {
            try {
                return ResponseEntity.ok(lista);
            } catch (Exception e) {
                throw new Exception("Error HUR1065_B  + " + e.getMessage());
            }
        }
        return ResponseEntity.ok(lista);
    }

    // 3. Proceso que actualiza un registro de la tabla perfiles de usuarios

    @PostMapping(value = { "/GrabarUsrMnu" })
    @ResponseBody
    public ResponseEntity<Map<String, Object>> swGrabarUsrMnu(@RequestBody lcoumnu object)
            throws Exception {

        Map<String, Object> salida = new HashMap<>();

        try {
            object.setUm_feccrea(LocalDate.now());
            object.setUm_hracrea(LocalTime.now());
            object.setUm_fecact(LocalDate.now());
            object.setUm_hraact(LocalTime.now());

            service.swGrabarUsrMnu(2, object);
            salida.put("mensaje", "HUR 1088 Actualizado");
        } catch (Exception e) {
            salida.put("mensaje: ", "Error HUR 1088 " + e.getMessage());
            return ResponseEntity.ok(salida);
        }
        return ResponseEntity.ok(salida);
    }

    // 4. Proceso que elimina un registro de la tabla perfiles de usuarios

    @DeleteMapping(value = { "/ElimMenu/{CodUser}" })
    @ResponseBody
    public ResponseEntity<Map<String, Object>> swLimpiarUsrMnu(@PathVariable("CodUser") String CodUser)
            throws Exception {

        Map<String, Object> salida = new HashMap<>();

        lcoumnuPk pk = new lcoumnuPk();
        pk.setUm_codusr(CodUser);
        pk.setUm_id("");
        lcoumnu objSalida = new lcoumnu(pk, 0, 0, 0, "", LocalDate.now(), LocalTime.now(), "0",
                LocalDate.now(), LocalTime.now());

        // Funcion corrobora que existan registros con el codigo de usuario

        try {
            service.swLimpiarUsrMnu(3, objSalida);
            salida.put("mensaje", "Registro(s) eliminado(s)");
            return ResponseEntity.ok(salida);
        } catch (Exception e) {
            throw new Exception("Error HUR 1088 " + e.getMessage());
        }

    }
}
