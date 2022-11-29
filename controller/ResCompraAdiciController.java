package com.empresa.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.empresa.entity.lcocmpa;
import com.empresa.entity.lcocmpaPk;
import com.empresa.service.ResCompraAdiciService;

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

@RestController
@RequestMapping("/rest/listarlcocmpa")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class ResCompraAdiciController {
    @Autowired
    private ResCompraAdiciService service;

    @GetMapping(value = "/swListarRecCmp/{cia}/{ejercicio}/{PER}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swListarRecCmp(@PathVariable("cia") String cia,
            @PathVariable("ejercicio") String ejercicio,
            @PathVariable("PER") String PER)

            throws Exception {
        lcocmpaPk pk = new lcocmpaPk();

        List<Map<String, Object[]>> lista;
        try {
            pk.setAc_codper(PER);
            pk.setAc_subdia("");
            pk.setAc_compro("");
            lcocmpa objE = new lcocmpa(pk, LocalDate.now(), LocalDate.now(), LocalDate.now(), "", "", "", "", "", "",
                    "", "", "", "", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, "",
                    LocalDate.now(), 0.0, LocalDate.now(), "", "", "",
                    LocalDate.now(), LocalTime.now(), "", LocalDate.now(), LocalTime.now(), "", 0.0, 0.0, "", "", "",
                    "", "", "", "", "", 0.0, 0.0, 0.0, 0.0);

            lista = service.swListarRecCmp(0, cia, ejercicio, PER, "", "", objE);
            return ResponseEntity.ok().body(lista);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("mensaje" + " HUR1052" + e.getMessage());

        }
    }

    @GetMapping(value = "/swBscRecCmp/{cia}/{ejercicio}/{PER}/{SD}/{ASIENTO}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swBscRecCmp(@PathVariable("cia") String cia,
            @PathVariable("ejercicio") String ejercicio,
            @PathVariable("PER") String PER,
            @PathVariable("SD") String SD,
            @PathVariable("ASIENTO") String ASIENTO)
            throws Exception {
        lcocmpaPk pk = new lcocmpaPk();

        List<Map<String, Object[]>> lista;
        try {
            pk.setAc_codper(PER);
            pk.setAc_subdia("");
            pk.setAc_compro("");
            lcocmpa objE = new lcocmpa(pk, LocalDate.now(), LocalDate.now(), LocalDate.now(), "", "", "", "", "", "",
                    "", "", "", "", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, "",
                    LocalDate.now(), 0.0, LocalDate.now(), "", "", "",
                    LocalDate.now(), LocalTime.now(), "", LocalDate.now(), LocalTime.now(), "", 0.0, 0.0, "", "", "",
                    "", "", "", "", "", 0.0, 0.0, 0.0, 0.0);

            lista = service.swBscRecCmp(1, cia, ejercicio, PER, SD, ASIENTO, objE);
            return ResponseEntity.ok().body(lista);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("mensaje" + " HUR1052" + e.getMessage());

        }
    }

    @GetMapping(value = "/swConRecCmp/{cia}/{PER}/{SD}/{ASIENTO}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object[]>>> swConRecCmp(@PathVariable("cia") String cia,
            @PathVariable("PER") String PER,
            @PathVariable("SD") String SD,
            @PathVariable("ASIENTO") String ASIENTO)
            throws Exception {
        lcocmpaPk pk = new lcocmpaPk();

        List<Map<String, Object[]>> lista;
        try {
            pk.setAc_codper(PER);
            pk.setAc_subdia("");
            pk.setAc_compro("");
            lcocmpa objE = new lcocmpa(pk, LocalDate.now(), LocalDate.now(), LocalDate.now(), "", "", "", "", "", "",
                    "", "", "", "", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, "",
                    LocalDate.now(), 0.0, LocalDate.now(), "", "", "",
                    LocalDate.now(), LocalTime.now(), "", LocalDate.now(), LocalTime.now(), "", 0.0, 0.0, "", "", "",
                    "", "", "", "", "", 0.0, 0.0, 0.0, 0.0);

            lista = service.swConRecCmp(2, cia, "", PER, SD, ASIENTO, objE);
            return ResponseEntity.ok().body(lista);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("mensaje" + " HUR1052" + e.getMessage());

        }
    }

    @DeleteMapping(value = "/swEliRecCmp/{cia}/{SD}/{ASIENTO}")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> swEliRecCmp(@PathVariable("cia") String cia,
            @PathVariable("SD") String SD,
            @PathVariable("ASIENTO") String ASIENTO) {

        Map<String, Object> response = new HashMap<>();
        // entity
        lcocmpaPk pk = new lcocmpaPk();
        // primary key entity
        lcocmpa objE = new lcocmpa(pk, LocalDate.now(), LocalDate.now(), LocalDate.now(), "", "", "", "", "", "",
                "", "", "", "", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, "",
                LocalDate.now(), 0.0, LocalDate.now(), "", "", "",
                LocalDate.now(), LocalTime.now(), "", LocalDate.now(), LocalTime.now(), "", 0.0, 0.0, "", "", "",
                "", "", "", "", "", 0.0, 0.0, 0.0, 0.0);
        // SETEAMOS LOS VALORES DE LOS CAMPOS DE LA LLAVE PRIMARIA,
        // PARA SABER QUE REGISTRO SE VA A ELIMINAR
        pk.setAc_codper("");
        pk.setAc_subdia(SD);
        pk.setAc_compro(ASIENTO);
        try {
            service.swEliRecCmp(3, cia, "", "", SD, ASIENTO, objE);
            response.put("mensaje", "Eliminado correctamente");
        } catch (Exception e) {
            response.put("Mensaje", "Ocurrio un error al eliminar con id ");
            response.put("mensaje", "Error HUR1052_B " + e.getMessage());
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping(value={"/swCrearRecCmp/{cia}"})
    @ResponseBody
    public ResponseEntity<Map<String, Object>> swCrearRecCmp(@PathVariable("cia") String cia,
            @RequestBody lcocmpa objE) {
        Map<String, Object> salida = new HashMap<>();
        LocalDate date = LocalDate.of(1111,11,11);
        if(objE.getAc_tipdocref().equals("")){
            objE.setAc_fecdocref(date);
        }
        // ac_fecdocref
        try {
            System.out.println(objE.toString());
            // objE.setAc_feccom(LocalDate.now());
            // objE.setAc_fecdoc(LocalDate.now());
            // objE.setAc_fecven(LocalDate.now());
            // objE.setAc_fecdocref(LocalDate.now());
            // objE.setAc_fecdet(LocalDate.now());
            objE.setAc_feccrea(LocalDate.now());
            objE.setAc_hracrea(LocalTime.now());
            objE.setAc_fecact(LocalDate.now());
            objE.setAc_hraact(LocalTime.now());

            service.swCrearRecCmp(4, cia, "", "", "", "", objE);
            salida.put("mensaje", "Registrado correctamente");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
            String[] parts = e.getMessage().split(";");
            if (parts.length > 2) {
                salida.put("error", parts[2]);
            }
            salida.put("mensaje", "Error HUR1052_B " + e.getMessage());
        }

        return ResponseEntity.ok(salida);
    }

    @PutMapping("/swActRecCmp/{cia}")
    public ResponseEntity<Map<String, Object>> swActRecCmp(@PathVariable("cia") String cia,
            @RequestBody lcocmpa objE) {
        Map<String, Object> salida = new HashMap<>();
        try {
         /*    objE.setAc_feccom(LocalDate.now());
            objE.setAc_fecdoc(LocalDate.now());
            objE.setAc_fecven(LocalDate.now());
            objE.setAc_fecdocref(LocalDate.now());
            objE.setAc_fecdet(LocalDate.now()); */
            objE.setAc_feccrea(LocalDate.now());
            objE.setAc_hracrea(LocalTime.now());
            objE.setAc_fecact(LocalDate.now());
            objE.setAc_hraact(LocalTime.now());
            service.swActRecCmp(5, cia, "", "", "", "", objE);
            salida.put("mensaje", "Actualizado  correctamente");

        } catch (Exception e) {
            e.printStackTrace();
            salida.put("mensaje", "Error HUR1052_B " + e.getMessage());
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
        lcocmpaPk pk = new lcocmpaPk();
        List<Map<String, Object[]>> lista;
        try {
            pk.setAc_codper(PER);
            pk.setAc_subdia("");
            pk.setAc_compro("");
            lcocmpa objE = new lcocmpa(pk, LocalDate.now(), LocalDate.now(), LocalDate.now(), "", "", "", "", "", "",
                    "", "", "", "", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, "",
                    LocalDate.now(), 0.0, LocalDate.now(), "", "", "",
                    LocalDate.now(), LocalTime.now(), "", LocalDate.now(), LocalTime.now(), "", 0.0, 0.0, "", "", "",
                    "", "", "", "", "", 0.0, 0.0, 0.0, 0.0);

            lista = service.swListarAyuOmi(6, cia, ejercicio, PER, SD, "", objE);
            return ResponseEntity.ok().body(lista);

        } catch (Exception e) {
            e.printStackTrace();
			throw new Exception("mensaje" + "Error HUR1052_B " + e.getMessage());        }
    }


 /*    @PostMapping(value={"/crearCmpa/{cia}"})
    @ResponseBody
    public ResponseEntity<Map<String, Object>> crearCmpa(@PathVariable("cia") String cia,
            @RequestBody lcocmpa objE) {
        Map<String, Object> salida = new HashMap<>();
        // ac_fecdocref
            System.out.println(objE.toString());
            // objE.setAc_feccom(LocalDate.now());
            // objE.setAc_fecdoc(LocalDate.now());
            // objE.setAc_fecven(LocalDate.now());
            // objE.setAc_fecdocref(LocalDate.now());
            // objE.setAc_fecdet(LocalDate.now());
            objE.setAc_feccrea(LocalDate.now());
            objE.setAc_hracrea(LocalTime.now());
            objE.setAc_fecact(LocalDate.now());
            objE.setAc_hraact(LocalTime.now());

            service.crearCmpa( cia, objE);
            salida.put("mensaje", "Registrado correctamente");
        

        return ResponseEntity.ok(salida);
    } */

}
