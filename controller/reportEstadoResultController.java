package com.empresa.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.empresa.service.reportEstadoResultService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/estadoResult")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class reportEstadoResultController {
    @Autowired
    private reportEstadoResultService service;

    @GetMapping("/existeFormula/{p_ciacont}/{n}/{tipo}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swExisFormato(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("n") String n, @PathVariable("tipo") String tipo) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swExisFormato(0, p_ciacont, "", "", tipo, n, "", "", "");

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1021_F  + " + e.getMessage());
        }

    }

    @GetMapping("/reporteEstado/{p_ciacont}/{ejercicio}/{periodo}/{n}/{tipo}/{cero}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swRepFrmResuGyP(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("periodo") String periodo,
            @PathVariable("n") String n, @PathVariable("tipo") String tipo, @PathVariable("cero") String cero)
            throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swRepFrmResuGyP(1, p_ciacont, ejercicio, periodo, tipo, n, "", "", cero);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1021_F  + " + e.getMessage());
        }

    }

    @GetMapping("/resultTotal/{p_ciacont}/{ejercicio}/{periodo}/{n}/{tipo}/{ltm}/{formula}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swRepFrmResuTot(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("periodo") String periodo,
            @PathVariable("n") String n, @PathVariable("tipo") String tipo, @PathVariable("ltm") String ltm,
            @PathVariable("formula") String formula) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swRepFrmResuTot(2, p_ciacont, ejercicio, periodo, tipo, n, ltm, formula, "");

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1021_F  + " + e.getMessage());
        }

    }

    // SP_ESTADORESULTADOS Version 2 HUR-1042

    @GetMapping("/swEstadoResul1/{Tcia}/{Tperiodo}/{TForm}/{TModel}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swEstadoResul1(
            @PathVariable("Tcia") String Tcia,
            @PathVariable("Tperiodo") String Tperiodo,
            @PathVariable("TForm") String TForm,
            @PathVariable("TModel") String TModel) throws Exception {

        List<Map<String, Object>> lista = new ArrayList<>();

        try {
            lista = service.swEstadoResul1(Tcia, Tperiodo, TForm, TModel);
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            throw new Exception("Error HUR1042 + " + e.getMessage());
        }
    }

    @PutMapping("/swEstadoResul2/{Tcia}/{TForm}/{TModel}")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> swEstadoResul2(
            @PathVariable("Tcia") String Tcia,
            @PathVariable("TForm") String TForm,
            @PathVariable("TModel") String TModel) throws Exception {

        Map<String, Object> salida = new HashMap<>();

        try {
            service.swEstadoResul2(Tcia, TForm, TModel);
            salida.put("mensaje", "Actualizado correctamente");
        } catch (Exception e) {
            e.printStackTrace();
            salida.put("mensaje", "Error HUR1042" + e.getMessage());
        }
        return ResponseEntity.ok(salida);
    }
}
