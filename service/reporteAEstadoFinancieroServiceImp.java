package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.repository.reporteAEstadoFinancieroRepository;

@Service
public class reporteAEstadoFinancieroServiceImp implements reporteAEstadoFinancieroService {
	@Autowired
	private reporteAEstadoFinancieroRepository repository;

	@Override
	public List<Map<String, Object>> swAnaliEstFina(String p_ciacont, String ejercicio, String modForm,
			String periodo, String nSaltAnt, String nSaltAct, String nDebe, String nHaber) {
		return repository.swAnaliEstFina(p_ciacont, ejercicio, modForm, periodo, nSaltAnt, nSaltAct, nDebe, nHaber);
	}

	@Override
	public List<Map<String, Object>> swBalGene(String p_ciacont, String ejercicio, String periodo, String formato,
			String apertura, String rubro, String cuentas, String opcion, String resultados, String saldMn, String saldMe) {
		return repository.swBalGene(p_ciacont, ejercicio, periodo, formato, apertura, rubro, cuentas, opcion,
				resultados, saldMn, saldMe);
	}

	@Override
	public List<Map<String, Object>> swBalGeneG1(String p_ciacont, String ejercicio, String periodo, String formato,
			String apertura, String rubro, String cuentas, String opcion, String resultados, String saldMn, String saldMe) {
		return repository.swBalGene(p_ciacont, ejercicio, periodo, formato, apertura, rubro, cuentas, opcion,
				resultados, saldMn, saldMe);
	}

	@Override
	public List<Map<String, Object>> swBalGeneG2(String p_ciacont, String ejercicio, String periodo, String formato,
			String apertura, String rubro, String cuentas, String opcion, String resultados, String saldMn, String saldMe) {
		return repository.swBalGene(p_ciacont, ejercicio, periodo, formato, apertura, rubro, cuentas, opcion,
				resultados, saldMn, saldMe);
	}

	@Override
	public List<Map<String, Object>> swValFrmBal(String p_ciacont, String ejercicio, String periodo, String formato,
			String apertura, String rubro, String cuentas, String opcion, String resultados, String saldMn, String saldMe) {
		return repository.swBalGene(p_ciacont, ejercicio, periodo, formato, apertura, rubro, cuentas, opcion,
				resultados, saldMn, saldMe);
	}

}
