package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.repository.pdtPercepcionesRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class pdtPercepcionesServiceImpl implements pdtPercepcionesService {
	@Autowired
	pdtPercepcionesRepositorio repositorio;

	@Override
	public List<Map<String, Object[]>> swCargaPercepciones(String basedatos, Integer opcion, String cia,
			String ejercicio, String Periodo) {
		return repositorio.swCargaPercepciones(basedatos, opcion, cia, ejercicio, Periodo);
	}
}