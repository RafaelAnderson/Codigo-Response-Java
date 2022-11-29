package com.empresa.service;

import java.util.List;

import com.empresa.entity.lcoCiem;

public interface lcoCiemService {
	
	public abstract List<lcoCiem> listar(int opcion,String cia,String ejer,lcoCiem obj);
	
	public abstract List<Object> listarGrilla(int opcion,String cia,String ejer,lcoCiem obj);
	
	void transaccion (int opcion,String cia,String ejer,lcoCiem obj);

}
