package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface reporteAEstadoFinancieroService {
	List<Map<String, Object>> swAnaliEstFina(String p_ciacont, String ejercicio, String modForm, String periodo,
			String nSalAnt, String nSalAct, String nDebe, String nHaber);

	List<Map<String, Object>> swBalGene(String p_ciacont, String ejercicio, String periodo, String formato,
			String apertura, String rubro, String cuentas, String opcion, String resultados, String saldMn, String saldMe);

	List<Map<String, Object>> swBalGeneG1(String p_ciacont, String ejercicio, String periodo, String formato,
			String apertura, String rubro, String cuentas, String opcion, String resultados, String saldMn, String saldMe);

	List<Map<String, Object>> swBalGeneG2(String p_ciacont, String ejercicio, String periodo, String formato,
			String apertura, String rubro, String cuentas, String opcion, String resultados, String saldMn, String saldMe);

	List<Map<String, Object>> swValFrmBal(String p_ciacont, String ejercicio, String periodo, String formato,
			String apertura, String rubro, String cuentas, String opcion, String resultados, String saldMn, String saldMe);
}
