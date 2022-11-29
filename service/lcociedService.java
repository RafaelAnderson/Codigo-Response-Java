package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.empresa.entity.lcocied;

@Service
public interface lcociedService {

	List<Map<String,Object[]>> listByDetAndCab(int opcion, String p_ciacon, lcocied obj);
	
	
	List<lcocied> listaByDetalle(int opcion, String p_ciacon, lcocied obj);
	void agregarRegistro(int opcion, String p_ciacon, lcocied obj);
	void editarRegistro(int opcion, String p_ciacon, lcocied obj);
	void eliminarRegistro(int opcion, String p_ciacon, lcocied obj);
}
