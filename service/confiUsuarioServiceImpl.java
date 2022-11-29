package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.empresa.entity.lcoUcia;
import com.empresa.repository.confiUsuarioRepositorio;
import com.empresa.repository.confiUsuarioRepositorio1;
@Service
public class confiUsuarioServiceImpl implements confiUsuarioService{

	@Autowired
    private confiUsuarioRepositorio repository;

	@Autowired
    private confiUsuarioRepositorio1 repository1;
	
	@Override
	public List<Map<String, Object[]>> swListarUsr(int opcion) {
		return repository1.swListarUsr(opcion);
	}

	@Override
	public List<Map<String, Object[]>> swListUsrCia(int opcion, lcoUcia obj) {
		return repository.swListUsrCia(opcion, obj.getPk().getUl_codusr(),obj.getPk().getUl_codcia(),
				obj.getUl_usrcrea(),obj.getUl_feccrea(),obj.getUl_hracrea(),obj.getUl_usract(),
				obj.getUl_fecact(),obj.getUl_hraact());
	}

	@Override
	public void swLimpiarUsrCia(int opcion, lcoUcia obj) {
		repository.swLimpiarUsrCia(opcion, obj.getPk().getUl_codusr(),obj.getPk().getUl_codcia(),
				obj.getUl_usrcrea(),obj.getUl_feccrea(),obj.getUl_hracrea(),obj.getUl_usract(),
				obj.getUl_fecact(),obj.getUl_hraact());
		
	}

	@Override
	public void swGrabarUsrCia(int opcion, lcoUcia obj) {
		repository.swGrabarUsrCia(opcion, obj.getPk().getUl_codusr(),obj.getPk().getUl_codcia(),
				obj.getUl_usrcrea(),obj.getUl_feccrea(),obj.getUl_hracrea(),obj.getUl_usract(),
				obj.getUl_fecact(),obj.getUl_hraact());
	}
}
