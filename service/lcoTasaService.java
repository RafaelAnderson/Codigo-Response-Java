package com.empresa.service;

import java.util.List;

import com.empresa.entity.lcoTasa;


public interface lcoTasaService {
	
	public abstract List<lcoTasa> listaTasa(int opcion, String p_ciacont, lcoTasa obj);
	
	void transaccion(int opcion, String p_ciacont, lcoTasa obj);

}
