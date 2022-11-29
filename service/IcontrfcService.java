package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcotrfc;



public interface IcontrfcService {

	
	public  List<Map<String, Object>> listaRegistros(int opcion, String p_ciacont, lcotrfc obj);

	//DEFINIMOS EL METODO PARA CREAR REGISTROS
		void NuevoRegistro(int opcion, String p_ciacont, lcotrfc obj);
		
		//DEFINIMOS EL METODO PARA EDITAR REGISTROS
		void editarRegistro(int opcion, String p_ciacont, lcotrfc obj);
		
		//DEFINIMOS EL METODO PARA ELIMINAR REGISTRO
		void eliminarRegistro(int opcion, String p_ciacont, lcotrfc obj);
		
		//DEFINIMOS EL METODO PARA LISTAR REGISTROS ESPECIFICOS
		public abstract List<Object[]> listaUnRegistro(int opcion, String p_ciacont, lcotrfc obj);
}
