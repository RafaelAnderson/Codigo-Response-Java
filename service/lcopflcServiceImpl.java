package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcopflc;
import com.empresa.repository.lcopflcRepository;


@Service
public class lcopflcServiceImpl implements lcopflcService{
	
	@Autowired
	private lcopflcRepository repository;

	@Override
	public List<lcopflc> listar(int opcion, String p_ciacont, lcopflc obj) {
		return repository.listar(opcion, p_ciacont, obj.getLcopflcPk().getFl_tipFrmt(),
				obj.getLcopflcPk().getFl_modelfrmt(), obj.getLcopflcPk().getFl_codfrmt(),
				obj.getFl_grpfrmt(), obj.getFl_descri1(), obj.getFl_descri2(), obj.getFl_descrgrp(), obj.getFl_rubrobal(),
				obj.getFl_rubrores(), obj.getFl_formula(), obj.getFl_tipDto(), obj.getFl_rubeeff(),
				obj.getFl_orden(), obj.getFl_usrcrea(), obj.getFl_feccrea(), obj.getFl_hracrea(), obj.getFl_usract(), obj.getFl_fecact(), obj.getFl_hraact());
	}

	@Override
	public void registrar(int opcion, String p_ciacont, lcopflc obj) {
		repository.registrar(opcion, p_ciacont, obj.getLcopflcPk().getFl_tipFrmt(),
				obj.getLcopflcPk().getFl_modelfrmt(), obj.getLcopflcPk().getFl_codfrmt(),
				obj.getFl_grpfrmt(), obj.getFl_descri1(), obj.getFl_descri2(), obj.getFl_descrgrp(), obj.getFl_rubrobal(),
				obj.getFl_rubrores(), obj.getFl_formula(), obj.getFl_tipDto(), obj.getFl_rubeeff(),
				obj.getFl_orden(), obj.getFl_usrcrea(), obj.getFl_feccrea(), obj.getFl_hracrea(), obj.getFl_usract(), obj.getFl_fecact(), obj.getFl_hraact());
		
	}

	@Override
	public void editar(int opcion, String p_ciacont, lcopflc obj) {
		repository.editar(opcion, p_ciacont, obj.getLcopflcPk().getFl_tipFrmt(),
				obj.getLcopflcPk().getFl_modelfrmt(), obj.getLcopflcPk().getFl_codfrmt(),
				obj.getFl_grpfrmt(), obj.getFl_descri1(), obj.getFl_descri2(), obj.getFl_descrgrp(), obj.getFl_rubrobal(),
				obj.getFl_rubrores(), obj.getFl_formula(), obj.getFl_tipDto(), obj.getFl_rubeeff(),
				obj.getFl_orden(), obj.getFl_usrcrea(), obj.getFl_feccrea(), obj.getFl_hracrea(), obj.getFl_usract(), obj.getFl_fecact(), obj.getFl_hraact());
		
	}

	@Override
	public void eliminar(int opcion, String p_ciacont, lcopflc obj) {
		repository.eliminar(opcion, p_ciacont, obj.getLcopflcPk().getFl_tipFrmt(),
				obj.getLcopflcPk().getFl_modelfrmt(), obj.getLcopflcPk().getFl_codfrmt(),
				obj.getFl_grpfrmt(), obj.getFl_descri1(), obj.getFl_descri2(), obj.getFl_descrgrp(), obj.getFl_rubrobal(),
				obj.getFl_rubrores(), obj.getFl_formula(), obj.getFl_tipDto(), obj.getFl_rubeeff(),
				obj.getFl_orden(), obj.getFl_usrcrea(), obj.getFl_feccrea(), obj.getFl_hracrea(), obj.getFl_usract(), obj.getFl_fecact(), obj.getFl_hraact());
		
	}

	@Override
	public List<Object> listarBalance(int opcion,String p_ciacont,String año , String per, String N, String inc0, String no0,
			String aper) {
		// TODO Auto-generated method stub
		return repository.listarBalance(opcion, p_ciacont,año ,per, N, inc0, no0, aper);
	}

	// Listar Todo
	@Override
	public List<lcopflc> listarLcoPflc(int opcion, String p_ciacont, lcopflc obj) {
		return repository.listarLcoPflc(opcion, p_ciacont, obj.getLcopflcPk().getFl_tipFrmt(),
				obj.getLcopflcPk().getFl_modelfrmt(), obj.getLcopflcPk().getFl_codfrmt(),
				obj.getFl_grpfrmt(), obj.getFl_descri1(), obj.getFl_descri2(), obj.getFl_descrgrp(), obj.getFl_rubrobal(),
				obj.getFl_rubrores(), obj.getFl_formula(), obj.getFl_tipDto(), obj.getFl_rubeeff(),
				obj.getFl_orden(), obj.getFl_usrcrea(), obj.getFl_feccrea(), obj.getFl_hracrea(), obj.getFl_usract(), obj.getFl_fecact(), obj.getFl_hraact());
	}

}
