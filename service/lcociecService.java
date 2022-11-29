package com.empresa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.empresa.entity.lcociec;

@Service
public interface lcociecService {

	List<lcociec> listaAllCabecera(int opcion, String p_ciacon, lcociec obj);
	void agregarRegistro(int opcion, String p_ciacon, lcociec obj);
	void editarRegistro(int opcion, String p_ciacon, lcociec obj);
	void eliminarRegistro(int opcion, String p_ciacon, lcociec obj);
	void eliminarCabeDeta(int opcion, String p_ciacon, lcociec obj);
}
