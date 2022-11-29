package com.empresa.service;

import java.util.List;

import com.empresa.entity.lcopcta;


public interface lcopctaService {
	
	public abstract List<lcopcta> listaPlanCtas(int opcion, String p_codcia, String p_ejer, lcopcta obj);
	
	void registrarNuevoRegistro(int opcion, String p_codcia, String p_ejer, lcopcta obj);

}
