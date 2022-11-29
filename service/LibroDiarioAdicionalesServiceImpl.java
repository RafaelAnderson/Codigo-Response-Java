package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoCabV;
import com.empresa.repository.LibroDiarioAdicionalesRepository;
import java.time.LocalDate;

@Service
public class LibroDiarioAdicionalesServiceImpl implements LibroDiarioAdicionalesService {

	@Autowired
	private LibroDiarioAdicionalesRepository repository;

	@Override
	public List<Map<String, Object[]>> swListarOmi(String base, int opcion, String cia, String ejercicio,
			String Periodo, String SD,
			String Asiento, lcoCabV obj) {
		return repository.swListarOmi(base, opcion, cia, ejercicio, Periodo, SD, Asiento,
				obj.getCl_fecret(), obj.getCl_tipret(), obj.getCl_perrea(), obj.getCl_perpre());
	}

	@Override
	public void swEliOmi(String base, int opcion, String cia, String ejercicio,
			String Periodo, String SD,
			String Asiento, lcoCabV obj) {

		repository.swEliOmi(base, opcion, cia, ejercicio, Periodo, SD, Asiento,
				obj.getCl_fecret(), obj.getCl_tipret(), obj.getCl_perrea(), obj.getCl_perpre());
	}

	@Override
	public void swCrearOmi(String base, int opcion, String cia, String ejercicio,
			String Periodo, String SD,
			String Asiento, LocalDate cl_fecret, String cl_tipret, String cl_perrea,
			String cl_perpre) {

		repository.swCrearOmi(base, opcion, cia, ejercicio, Periodo, SD, Asiento,
				cl_fecret, cl_tipret, cl_perrea,
				cl_perpre);
	}

	/************************************************************************************* */
	@Override
	public List<Map<String, Object[]>> swListarAyuOmi(String base, int opcion, String cia, String ejercicio,
			String Periodo, String SD, String Asiento, lcoCabV obj) {

		return repository.swListarAyuOmi(base, opcion, cia, ejercicio, Periodo, SD, Asiento,
				obj.getCl_fecret(), obj.getCl_tipret(), obj.getCl_perrea(), obj.getCl_perpre());
	}

}
