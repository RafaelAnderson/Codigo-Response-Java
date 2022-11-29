/*package com.empresa.controller;

import java.util.List;

import com.empresa.service.ReporteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/lcoReporte")
@CrossOrigin(origins = {"http://192.168.0.46","http://localhost:4200","http://192.168.1.209"})
public class ReporteController {

	@Autowired
	private ReporteService service;

	
	@GetMapping(value={"/swBalSaldo/{cia}/{anio}/{per_rep}/{mos_bal}"})
	@ResponseBody
	public ResponseEntity<List<Object>> swBalSaldo(
			@PathVariable("cia") String cia,
			@PathVariable(value="anio") String anio,
			@PathVariable(value="per_rep") String per_rep,
			@PathVariable(value="mos_bal") String mos_bal
			) throws Exception{
	
		try {
			
		
			List<Object> lista = service.balanceSaldo(cia,anio,per_rep,mos_bal);
			return ResponseEntity.ok(lista);
		}catch(Exception e) {
			throw new Exception("Error HUR1040_B[22] + " + e.getMessage());
		}
	}
	
	
}*/
