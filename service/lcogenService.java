package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcotgen;

public interface lcogenService {

	//DEFINIMOS EL METODO PARA LISTAR REGISTROS
	/*public abstract List<lcotgen> listaRegistros(int opcion, String p_ciacont, lcotgen obj);*/
	
	//DEFINIMOS EL METODO PARA CREAR REGISTROS
	void registrarNuevoRegistro(int opcion, String p_ciacont, String p_ejer, lcotgen obj);
	
	//DEFINIMOS EL METODO PARA EDITAR REGISTROS
	void editarRegistro(int opcion, String p_ciacont, String p_ejer, lcotgen obj);
	
	//DEFINIMOS EL METODO PARA ELIMINAR REGISTRO
	void eliminarRegistro(int opcion, String p_ciacont, String p_ejer, lcotgen obj);
	
	//DEFINIMOS EL METODO PARA LISTAR REGISTROS ESPECIFICOS
	public abstract List<lcotgen> listaUnRegistro(int opcion, String p_ciacont, String p_ejer, lcotgen obj);

	public List<Map<String, Object>> swListarAnexos3(int opcion, String p_ciacont, String p_ejer);	

}
