package com.empresa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.empresa.repository.lconic21Repository;

@Service
public class lconic21ServiceImpl implements lconic21Service{
	
	@Autowired
	private lconic21Repository repo;

	@Override
	public void asientoRegularizacion(String cia, String ejercicio, String periodo, double tpventa, double tpcompra, String usu) {
		repo.asientoRegularizacion(cia, ejercicio, periodo, tpventa, tpcompra, usu);
		
	}
	
	@Override
	public List<Map<String,Object[]>> listarlcoNic21(int opcion, String cia, String ejercicio,String ni_codper,String ni_cuenta,String ni_tipane,String ni_codane,String ni_tipdoc,String ni_numdoc){
		return repo.listarlcoNic21(opcion, cia, ejercicio, ni_codper, ni_cuenta, ni_tipane, ni_codane, ni_tipdoc, ni_numdoc);
	}
	@Override
	public void eliminarlcoNic(int opcion, String cia, String ejercicio,String ni_codper,String ni_cuenta,String ni_tipane,String ni_codane,String ni_tipdoc,String ni_numdoc){
		repo.eliminarlcoNic21(opcion, cia, ejercicio, ni_codper,ni_cuenta,ni_tipane,ni_codane,ni_tipdoc,ni_numdoc);
	}


}
