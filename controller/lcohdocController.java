package com.empresa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.empresa.entity.lcohdoc;
import com.empresa.entity.lcohdocPk;
import com.empresa.service.lcohdocService;

@RestController
@RequestMapping("/rest/lcohdoc")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class lcohdocController {

    @Autowired
    private lcohdocService service;

    @GetMapping(value = { "/swCargaDocHon/{periodo}/{usu}/{cia}/{ejer}/{perSaldo}" })
    public ResponseEntity<?> swCargaDocHon(
            @PathVariable(value = "periodo") String periodo,
            @PathVariable(value = "usu") String usu,
            @PathVariable(value = "cia") String cia,
            @PathVariable(value = "ejer") String ejer,
            @PathVariable(value = "perSaldo") String perSaldo) throws Exception {

        Map<String, Object> salida = new HashMap<>();
        // lcohdoc objSalida = new lcohdoc();
        // lcohdocPk pk = new lcohdocPk();
        // objSalida.setPkId(pk);
        try {
            // pk.setHd_codper(periodo);
            // pk.setHd_cdanex("");
            // pk.setHd_tipdoc("");
            // pk.setHd_serdoc("");
            // pk.setHd_numdoc("");

            service.swCargaDocHon(0, periodo, usu, cia, ejer, "", "", "", "", "",
                    perSaldo);

            salida.put("mensaje", "Registrado correctamente");
            return ResponseEntity.ok(salida);
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception("Error HUR1033_F  + " + e.getMessage());
        }
        // return ResponseEntity.ok(salida);
    }

    @GetMapping(value = { "/swCargaProvHon/{periodo}/{usu}/{cia}/{ejer}" })
    public ResponseEntity<?> swCargaProvHon(
            @PathVariable(value = "periodo") String periodo,
            @PathVariable(value = "usu") String usu,
            @PathVariable(value = "cia") String cia,
            @PathVariable(value = "ejer") String ejer) throws Exception {

        Map<String, Object> salida = new HashMap<>();
        // lcohdoc objSalida = new lcohdoc();
        // lcohdocPk pk = new lcohdocPk();
        // objSalida.setPkId(pk);
        try {
            // pk.setHd_codper(periodo);
            // pk.setHd_cdanex("");
            // pk.setHd_tipdoc("");
            // pk.setHd_serdoc("");
            // pk.setHd_numdoc("");

            service.swCargaProvHon(1, periodo, usu, cia, ejer, "", "", "", "", "",
                    "");
            salida.put("mensaje", "Registrado correctamente");
            return ResponseEntity.ok(salida);
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception("Error HUR1033_F  + " + e.getMessage());
        }
        // return ResponseEntity.ok(salida);
    }

    @GetMapping(value = { "/swListarHonDoc/{periodo}/{cia}/{orden}" })
    public ResponseEntity<List<Map<String, Object[]>>> swListarHonDoc(
            @PathVariable(value = "periodo") String periodo,
            @PathVariable(value = "cia") String cia,
            @PathVariable(value = "orden") String orden) throws Exception {

        lcohdoc objSalida = new lcohdoc();
        lcohdocPk pk = new lcohdocPk();
        objSalida.setPkId(pk);
        try {
            pk.setHd_codper("");
            pk.setHd_cdanex("");
            pk.setHd_tipdoc("");
            pk.setHd_serdoc("");
            pk.setHd_numdoc("");

            List<Map<String, Object[]>> lista = service.swListarHonDoc(2, periodo, "", cia, "", orden, "", "", "", "",
                    "");
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception("Error HUR1033_F  + " + e.getMessage());
        }
    }

    @GetMapping(value = { "/swListarHonDeta/{cia}/{ejer}/{codAnexo}/{tipoDoc}/{serDoc}/{numDoc}/{perSaldo}" })
    public ResponseEntity<List<Map<String, Object[]>>> swListarHonDeta(
            @PathVariable(value = "cia") String cia,
            @PathVariable(value = "ejer") String ejer,
            @PathVariable(value = "codAnexo") String codAnexo,
            @PathVariable(value = "tipoDoc") String tipoDoc,
            @PathVariable(value = "serDoc") String serDoc,
            @PathVariable(value = "numDoc") String numDoc,
            @PathVariable(value = "perSaldo") String perSaldo) throws Exception {

        lcohdoc objSalida = new lcohdoc();
        lcohdocPk pk = new lcohdocPk();
        objSalida.setPkId(pk);
        try {
            pk.setHd_codper("");
            pk.setHd_cdanex("");
            pk.setHd_tipdoc("");
            pk.setHd_serdoc("");
            pk.setHd_numdoc("");

            List<Map<String, Object[]>> lista = service.swListarHonDeta(3, "", "", cia, ejer, "", codAnexo, tipoDoc,
                    serDoc, numDoc,
                    perSaldo);
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception("Error HUR1033_F  + " + e.getMessage());
        }
    }

    @GetMapping(value = { "/swListarHonDetaTotal/{cia}/{ejer}/{codAnexo}/{tipoDoc}/{serDoc}/{numDoc}/{perSaldo}" })
    public ResponseEntity<List<Map<String, Object[]>>> swListarHonDetaTotal(
            @PathVariable(value = "cia") String cia,
            @PathVariable(value = "ejer") String ejer,
            @PathVariable(value = "codAnexo") String codAnexo,
            @PathVariable(value = "tipoDoc") String tipoDoc,
            @PathVariable(value = "serDoc") String serDoc,
            @PathVariable(value = "numDoc") String numDoc,
            @PathVariable(value = "perSaldo") String perSaldo) throws Exception {

        lcohdoc objSalida = new lcohdoc();
        lcohdocPk pk = new lcohdocPk();
        objSalida.setPkId(pk);
        try {
            pk.setHd_codper("");
            pk.setHd_cdanex("");
            pk.setHd_tipdoc("");
            pk.setHd_serdoc("");
            pk.setHd_numdoc("");

            List<Map<String, Object[]>> lista = service.swListarHonDetaTotal(4, "", "", cia, ejer, "", codAnexo,
                    tipoDoc,
                    serDoc, numDoc, perSaldo);
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception("Error HUR1033_F  + " + e.getMessage());
        }
    }

    @GetMapping(value = { "/swListarFormato07/{cia}/{periodo}" })
    public ResponseEntity<List<Map<String, Object[]>>> swListarFormato07(
            @PathVariable(value = "cia") String cia,
            @PathVariable(value = "periodo") String periodo) throws Exception {

        lcohdoc objSalida = new lcohdoc();
        lcohdocPk pk = new lcohdocPk();
        objSalida.setPkId(pk);
        try {
            pk.setHd_codper("");
            pk.setHd_cdanex("");
            pk.setHd_tipdoc("");
            pk.setHd_serdoc("");
            pk.setHd_numdoc("");

            List<Map<String, Object[]>> lista = service.swListarFormato07(5, periodo, "", cia, "", "", "", "",
                    "", "", "");
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception("Error HUR1033_F  + " + e.getMessage());
        }
    }

    @GetMapping(value = { "/swListarFormato20/{cia}/{periodo}" })
    public ResponseEntity<List<Map<String, Object[]>>> swListarFormato20(
            @PathVariable(value = "cia") String cia,
            @PathVariable(value = "periodo") String periodo) throws Exception {

        lcohdoc objSalida = new lcohdoc();
        lcohdocPk pk = new lcohdocPk();
        objSalida.setPkId(pk);
        try {
            pk.setHd_codper("");
            pk.setHd_cdanex("");
            pk.setHd_tipdoc("");
            pk.setHd_serdoc("");
            pk.setHd_numdoc("");

            List<Map<String, Object[]>> lista = service.swListarFormato20(6, periodo, "", cia, "", "", "", "",
                    "", "", "");
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception("Error HUR1033_F  + " + e.getMessage());
        }
    }

    @GetMapping(value = { "/swReportEstFluEfec/{periodo}/{cia}/{ejer}/{FRM}" })
    public ResponseEntity<List<Map<String, Object[]>>> swReportEstFluEfec(
            @PathVariable(value = "periodo") String periodo,
            @PathVariable(value = "cia") String cia,
            @PathVariable(value = "ejer") String ejer,
            @PathVariable(value = "FRM") String FRM) throws Exception {
        try {
            List<Map<String, Object[]>> lista = service.swReportEstFluEfec(periodo, cia, ejer, FRM);

            return ResponseEntity.ok(lista);

        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception("Error HUR1033_F  + " + e.getMessage());
        }
    }
}