package com.empresa.service;

import java.util.List;
import java.util.Map;
import java.time.LocalDate;

import com.empresa.entity.lcoCabV;

public interface LibroDiarioAdicionalesService {

	List<Map<String, Object[]>> swListarOmi(String base, int opcion, String cia, String ejercicio, String Periodo,
			String SD, String Asiento, lcoCabV obj);

	void swEliOmi(String base, int opcion, String cia, String ejercicio, String Periodo, String SD,
			String Asiento, lcoCabV obj);

	void swCrearOmi(String base, int opcion, String cia, String ejercicio, String Periodo, String SD,
			String Asiento, LocalDate cl_fecret, String cl_tipret, String cl_perrea,
			String cl_perpre);

	/********************************************************************************** */
	List<Map<String, Object[]>> swListarAyuOmi(String base, int opcion, String cia, String ejercicio, String Periodo,
			String SD,
			String Asiento, lcoCabV obj);

}
