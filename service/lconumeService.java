package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lconume;

public interface lconumeService {
	
	//LISTAR REGISTRO DE NUMERACION
	public abstract List<Map<String, Object>> listaNume(int opcion, String p_ciacont, String ejer, lconume obj);
	
	public abstract List<lconume> listaUnNume(int opcion, String p_ciacont, String ejer, lconume obj);
	
	void registrarNume(int opcion, String p_ciacont, String ejer,lconume obj);
	
	void editarNume(int opcion, String p_ciacont, String ejer, lconume obj);

	void eliminarNume(int opcion, String p_ciacont, String ejer, lconume obj);


}
