package com.empresa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Ubigeo;
import com.empresa.service.UbigeoServiceImpl;

@RestController
@RequestMapping("/rest/Ubigeo")
@CrossOrigin(origins = { "http://192.168.0.46", "http://localhost:4200", "http://174.138.178.198",
		"http://170.0.235.54", "https://app.liderasoftware.pe", "http://192.168.1.214", "http://192.168.1.212",
		"http://192.168.1.213" })
public class UbigeoController {

	@Autowired
	private UbigeoServiceImpl service;

	@GetMapping("/ListarDept")
	@ResponseBody
	public ResponseEntity<List<Ubigeo>> listaDept() throws Exception {

		Map<String, Object> salida = new HashMap<>();
		try {

			List<Ubigeo> lista = service.listarDept();
			if (lista.size() == 0) {
				salida.put("mensaje", "No se encontro Departamento");
				System.out.println("No hay consulta");
			} else
				salida.put("mensaje", "Consulta exitosa");
			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);

		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error Ubigeo + " + e.getMessage());
		}

	}

	@GetMapping(value = { "/ListarProv/{Dept}" })
	@ResponseBody
	public ResponseEntity<List<Ubigeo>> listaProv(@PathVariable(value = "Dept") String Dept) throws Exception {

		Map<String, Object> salida = new HashMap<>();
		try {
			// CREAMOS UNA LISTA Y LA LLENAMOS CON LA DATA QUE NOS LLEGA DE LA BASE DE DATOS
			// TAMBIEN LLAMAMOS AL OBJETO SERVICE E INVOCAMOS A SU METODO LISTA REGISTROS
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 0, QUE REALIZARA EL METODO GET
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			// COMO TERCER PARAMETRO LE PASAMOS pl_cuenta en caso se requiera un plan de
			// cuenta en especifico que ira dentro de objsalida
			List<Ubigeo> lista = service.listarProv(Dept);
			if (lista.size() == 0) {
				salida.put("mensaje", "No se encontro Departamento");
				System.out.println("No hay consulta");
			} else
				salida.put("mensaje", "Consulta exitosa");
			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);

		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error Ubigeo + " + e.getMessage());
		}

	}

	@GetMapping(value = { "/ListarDist/{Dept}/{Prov}" })
	@ResponseBody
	public ResponseEntity<List<Ubigeo>> listaDist(@PathVariable(value = "Dept") String Dept,
			@PathVariable(value = "Prov") String Prov) throws Exception {

		Map<String, Object> salida = new HashMap<>();
		try {
			// CREAMOS UNA LISTA Y LA LLENAMOS CON LA DATA QUE NOS LLEGA DE LA BASE DE DATOS
			// TAMBIEN LLAMAMOS AL OBJETO SERVICE E INVOCAMOS A SU METODO LISTA REGISTROS
			// COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 0, QUE REALIZARA EL METODO GET
			// COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			// COMO TERCER PARAMETRO LE PASAMOS pl_cuenta en caso se requiera un plan de
			// cuenta en especifico que ira dentro de objsalida
			List<Ubigeo> lista = service.listarDist(Dept, Prov);
			if (lista.size() == 0) {
				salida.put("mensaje", "No se encontro Departamento");
				System.out.println("No hay consulta");
			} else
				salida.put("mensaje", "Consulta exitosa");
			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);

		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error Ubigeo + " + e.getMessage());
		}

	}

	@GetMapping(value = { "/ListarUbig/{Ubigeo}" })
	@ResponseBody
	public ResponseEntity<List<Ubigeo>> listaUbigeo(@PathVariable(value = "Ubigeo") String Ubigeo) throws Exception {

		Map<String, Object> salida = new HashMap<>();
		try {

			List<Ubigeo> lista = service.BuscarUbigeo(Ubigeo);
			if (lista.size() == 0) {
				salida.put("mensaje", "No se encontro Ubigeo");
				System.out.println("No hay consulta");
			} else
				salida.put("mensaje", "Consulta exitosa");
			// DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
			return ResponseEntity.ok(lista);

		} catch (Exception e) {
			// DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
			throw new Exception("Error Ubigeo + " + e.getMessage());
		}

	}

}
