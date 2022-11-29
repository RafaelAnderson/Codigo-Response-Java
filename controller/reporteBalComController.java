package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.empresa.service.reporteBalComService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/lcoreportbal")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
        "http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
        "http://192.168.1.213" })
public class reporteBalComController {
    @Autowired
    private reporteBalComService service;

    @GetMapping("/listarBalanceCompro/{Cia}/{ejercicio}/{PER}/{Nd}/{pCta}/{tipRep}")
    @ResponseBody
    public ResponseEntity<List<Object[]>> swBalComp(@PathVariable("Cia") String Cia,
			@PathVariable("ejercicio") String ejercicio, @PathVariable("PER") String PER,
			@PathVariable("Nd") String Nd, @PathVariable("pCta") String pCta, @PathVariable("tipRep") String tipRep) throws Exception {

// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
//Map<String, Object> response = new HashMap<>();
		// lcodocv21 objSalida = new lcodocv21();
		// lcodocv21Pk pk = new lcodocv21Pk();
		List<Object[]> lista = new ArrayList<>();

		try {

			

			lista = service.swBalComp(0, Cia, ejercicio, PER, Nd, pCta, tipRep);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}

	@GetMapping("/listarBalanceComproApertura/{Cia}/{ejercicio}/{PER}/{Nd}/{pCta}/{tipRep}")
    @ResponseBody
    public ResponseEntity<List<Object[]>> swBalCompAper (@PathVariable("Cia") String Cia, @PathVariable("ejercicio") String ejercicio, @PathVariable("PER") String PER,
	@PathVariable("Nd") String Nd, @PathVariable("pCta") String pCta, @PathVariable("tipRep") String tipRep) throws Exception {

// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
//Map<String, Object> response = new HashMap<>();
		// lcodocv21 objSalida = new lcodocv21();
		// lcodocv21Pk pk = new lcodocv21Pk();
		List<Object[]> lista = new ArrayList<>();

		try {

			

			lista = service.swBalCompAper(1, Cia, ejercicio, PER, Nd, pCta, tipRep);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}

	@GetMapping("/listarBalanceComproNO/{Cia}/{ejercicio}/{PER}/{Nd}/{pCta}/{tipRep}")
    @ResponseBody
    public ResponseEntity<List<Object[]>> swBalCompNOrd (@PathVariable("Cia") String Cia, @PathVariable("ejercicio") String ejercicio, @PathVariable("PER") String PER,
	@PathVariable("Nd") String Nd, @PathVariable("pCta") String pCta, @PathVariable("tipRep") String tipRep) throws Exception {

// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
//Map<String, Object> response = new HashMap<>();
		// lcodocv21 objSalida = new lcodocv21();
		// lcodocv21Pk pk = new lcodocv21Pk();
		List<Object[]> lista = new ArrayList<>();

		try {

			

			lista = service.swBalCompNOrd(2, Cia, ejercicio, PER, Nd, pCta, tipRep);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}

	@GetMapping("/listarBalanceComprotipo2/{Cia}/{ejercicio}/{PER}/{Nd}/{pCta}/{tipRep}")
    @ResponseBody
    public ResponseEntity<List<Map<String,Object[]>>> swBalComptipo2(@PathVariable("Cia") String Cia,
			@PathVariable("ejercicio") String ejercicio, @PathVariable("PER") String PER,
			@PathVariable("Nd") String Nd, @PathVariable("pCta") String pCta, @PathVariable("tipRep") String tipRep) throws Exception {

// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
//Map<String, Object> response = new HashMap<>();
		// lcodocv21 objSalida = new lcodocv21();
		// lcodocv21Pk pk = new lcodocv21Pk();
		List<Map<String,Object[]>> lista = new ArrayList<>();

		try {

			

			lista = service.swBalComptipo2(0, Cia, ejercicio, PER, Nd, pCta, tipRep);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}

	@GetMapping("/listarBalanceComproAperturatipo2/{Cia}/{ejercicio}/{PER}/{Nd}/{pCta}/{tipRep}")
    @ResponseBody
    public ResponseEntity<List<Map<String,Object[]>>> swBalCompApertipo2 (@PathVariable("Cia") String Cia, @PathVariable("ejercicio") String ejercicio, @PathVariable("PER") String PER,
	@PathVariable("Nd") String Nd, @PathVariable("pCta") String pCta, @PathVariable("tipRep") String tipRep) throws Exception {

// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
//Map<String, Object> response = new HashMap<>();
		// lcodocv21 objSalida = new lcodocv21();
		// lcodocv21Pk pk = new lcodocv21Pk();
		List<Map<String,Object[]>> lista = new ArrayList<>();

		try {

			

			lista = service.swBalCompApertipo2(1, Cia, ejercicio, PER, Nd, pCta, tipRep);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}

	@GetMapping("/listarBalanceComproNOtipo2/{Cia}/{ejercicio}/{PER}/{Nd}/{pCta}/{tipRep}")
    @ResponseBody
    public ResponseEntity<List<Map<String,Object[]>>> swBalCompNOrdtipo2 (@PathVariable("Cia") String Cia, @PathVariable("ejercicio") String ejercicio, @PathVariable("PER") String PER,
	@PathVariable("Nd") String Nd, @PathVariable("pCta") String pCta, @PathVariable("tipRep") String tipRep) throws Exception {

// CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
//Map<String, Object> response = new HashMap<>();
		// lcodocv21 objSalida = new lcodocv21();
		// lcodocv21Pk pk = new lcodocv21Pk();
		List<Map<String,Object[]>> lista = new ArrayList<>();

		try {

			

			lista = service.swBalCompNOrdtipo2(2, Cia, ejercicio, PER, Nd, pCta, tipRep);

			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);
		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error HUR1021_F  + " + e.getMessage());
		}

	}
}   
