package com.empresa.service;

import java.util.List;

import com.empresa.entity.lcopflc;

public interface lcopflcService {
	
	List<lcopflc> listar(int opcion, String p_ciacont, lcopflc obj);
	
	List<Object> listarBalance(int opcion, String p_ciacont,String año,String per,String N,String inc0,String no0,String aper);
	
	void registrar(int opcion, String p_ciacont, lcopflc obj);
	
	void editar(int opcion, String p_ciacont, lcopflc obj);
	
	void eliminar(int opcion, String p_ciacont, lcopflc obj);
	
	List<lcopflc> listarLcoPflc(int opcion, String p_ciacont, lcopflc obj);
}
