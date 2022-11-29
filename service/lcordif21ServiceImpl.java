package com.empresa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.empresa.repository.lcordif21Repository;

@Service
public class lcordif21ServiceImpl implements lcordif21Service{

	@Autowired
	private lcordif21Repository repo;
	@Override
	public void asieReguDifeCamb(String cia, String ejer, String periodo, String usu) {
		repo.asieReguDifeCamb(cia, ejer, periodo, usu);
		
	}

	@Override
	public List<Map<String,Object>> listarlcordif21(int opcion, String cia, String ejercicio, String periodo, String clave,String codane, String tipdoc, String numdoc) {
		return repo.listarlcordif21(opcion, cia, ejercicio, periodo, clave,codane,tipdoc,numdoc);
		
	}

	@Override
	public void eliminarlcordif21(int opcion, String cia, String ejercicio, String periodo, String clave,String codane, String tipdoc, String numdoc) {
		 repo.eliminarlcordif21(opcion, cia, ejercicio, periodo, clave,codane,tipdoc,numdoc);
		
	}

	
	@Override
	public List<Map<String,Object>> listarDetallelcordif21( String cia, String ejercicio, String periodo, String cuenta, String cdanex,String tpanex,String numdoc ) {
		return repo.listarDetallelcordif21(cia, ejercicio, periodo, cuenta, tpanex, cdanex,numdoc);
		
	}

}
