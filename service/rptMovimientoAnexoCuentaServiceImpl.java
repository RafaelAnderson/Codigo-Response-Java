package com.empresa.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import com.empresa.repository.rptMovimientoAnexoCuentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class rptMovimientoAnexoCuentaServiceImpl implements rptMovimientoAnexoCuentaService {
	@Autowired
	rptMovimientoAnexoCuentaRepository repository;

	@Override
	public List<Map<String, Object[]>> swListarDetAnexCta(Integer opcion, String cia, String ejercicio,
			LocalDate FecInicial, LocalDate FecFinal, String CtaInicial, String CtaFinal, String TipoAnexo,
			String CodAnexoInicial, String CodAnexoFinal, String Orden) {
		return repository.swListarDetAnexCta(opcion, cia, ejercicio, FecInicial, FecFinal, CtaInicial, CtaFinal,
				TipoAnexo, CodAnexoInicial, CodAnexoFinal, Orden);

	}

	@Override
	public List<Map<String, Object[]>> swListarDetAnex(Integer opcion, String cia, String ejercicio,
			LocalDate FecInicial, LocalDate FecFinal, String CtaInicial, String CtaFinal, String TipoAnexo,
			String CodAnexoInicial, String CodAnexoFinal, String Orden) {
		return repository.swListarDetAnex(opcion, cia, ejercicio, FecInicial, FecFinal, CtaInicial, CtaFinal,
				TipoAnexo, CodAnexoInicial, CodAnexoFinal, Orden);

	}
}