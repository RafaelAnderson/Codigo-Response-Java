package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoCiem;
import com.empresa.repository.lcoCiemRepository;

@Service
public class lcoCiemServiceImpl implements lcoCiemService {
	
	@Autowired
	lcoCiemRepository repository;

	

	@Override
	public List<lcoCiem> listar(int opcion, String cia, String ejer, lcoCiem obj) {
		// TODO Auto-generated method stub
		return repository.listar(opcion, cia, ejer, obj.getPk().getCm_periodo(), obj.getPk().getCm_subdia(), obj.getCm_fcierre(), 
				obj.getCm_usrcrea(), obj.getCm_feccrea(), obj.getCm_hracrea(), obj.getCm_usract(),obj.getCm_fecact(),obj.getCm_hraact());
	}

	@Override
	public List<Object> listarGrilla(int opcion, String cia, String ejer, lcoCiem obj) {
		// TODO Auto-generated method stub
		return repository.listarGrilla(opcion, cia, ejer, obj.getPk().getCm_periodo(), obj.getPk().getCm_subdia(), obj.getCm_fcierre(), 
				obj.getCm_usrcrea(), obj.getCm_feccrea(), obj.getCm_hracrea(), obj.getCm_usract(),obj.getCm_fecact(),obj.getCm_hraact());
	}

	@Override
	public void transaccion(int opcion, String cia, String ejer, lcoCiem obj) {
		repository.transaccion(opcion, cia, ejer, obj.getPk().getCm_periodo(), obj.getPk().getCm_subdia(), obj.getCm_fcierre(), 
				obj.getCm_usrcrea(), obj.getCm_feccrea(), obj.getCm_hracrea(), obj.getCm_usract(),obj.getCm_fecact(),obj.getCm_hraact());
		
	}

}
