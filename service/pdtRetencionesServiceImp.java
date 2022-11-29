package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.repository.pdtRetencioneRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class pdtRetencionesServiceImp implements pdtRetencionesService{
    @Autowired
    private pdtRetencioneRepository repositoryRetenciones;

	@Override
	public List<Map<String, Object[]>> swCargaRetenciones(String base, int opcion, String cia, String ejer,
			String periodo) {
	
		return repositoryRetenciones.swCargaRetenciones(base, opcion, cia, ejer, periodo);
	}

	
}