package com.empresa.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoVent21;
import com.empresa.service.registroVentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/registroVenta")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class registroVentaController {
    @Autowired
    private registroVentaService service;

    @GetMapping("/asientosNF/{p_ciacont}/{ejercicio}/{per}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swValRegVnt(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("per") String per) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swValRegVnt(0, p_ciacont, ejercicio, per, "");

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1049_F  + " + e.getMessage());
        }

    }

    @GetMapping("/detalleRV/{p_ciacont}/{ejercicio}/{per}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swRegVntTbl(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("per") String per) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swRegVntTbl(1, p_ciacont, ejercicio, per, "");

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1049_F  + " + e.getMessage());
        }

    }

    @GetMapping("/listaRV/{p_ciacont}/{ejercicio}/{per}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swRegVntPLE(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("per") String per) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swRegVntPLE(2, p_ciacont, ejercicio, per, "");

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1049_F  + " + e.getMessage());
        }

    }

    @GetMapping("/detallePV/{p_ciacont}/{ejercicio}/{par}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> Listar_p(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("ejercicio") String ejercicio, @PathVariable("par") String par) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.Listar_p(3, p_ciacont, ejercicio, "", par);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1049_F  + " + e.getMessage());
        }

    }

    @GetMapping("/listarComRV/{p_ciacont}/{per}")
    @ResponseBody
    public ResponseEntity<List<Map<String, Object>>> swLstRecVnt(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("per") String per) throws Exception {

        // CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
        // Map<String, Object> response = new HashMap<>();
        // lcodocv21 objSalida = new lcodocv21();
        // lcodocv21Pk pk = new lcodocv21Pk();
        List<Map<String, Object>> lista = new ArrayList<>();

        try {

            lista = service.swLstRecVnt(4, p_ciacont, "", per, "");

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            // DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
            throw new Exception("Error HUR1049_F  + " + e.getMessage());
        }

    }

    @PostMapping("/crearVTA/{p_ciacont}/{per}")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> swGrabarVentas(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("per") String per, @RequestBody lcoVent21 obj) throws Exception {

        Map<String, Object> salida = new HashMap<>();
        // List<Map<String, Object>> lista = new ArrayList<>();

        try {

            service.swGrabarVentas(1, p_ciacont, per, obj);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            salida.put("mensaje", "registro/s agregado correctamente!!!");
        } catch (Exception e) {
            e.printStackTrace();
			salida.put("mensaje", "Error HUR1049_F " + e.getMessage());
        }
        return ResponseEntity.ok(salida);
    }

    @PostMapping("/verificar/{p_ciacont}/{per}")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> verificarTabla(@PathVariable("p_ciacont") String p_ciacont,
            @PathVariable("per") String per, @RequestBody lcoVent21 obj) throws Exception {

        Map<String, Object> salida = new HashMap<>();
        // List<Map<String, Object>> lista = new ArrayList<>();

        try {

            service.swGrabarVentas(0, p_ciacont, per, obj);

            // DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
            salida.put("mensaje", "tabla verificada");
        } catch (Exception e) {
            e.printStackTrace();
			salida.put("mensaje", "Error HUR1049_F " + e.getMessage());
        }
        return ResponseEntity.ok(salida);
    }
}
