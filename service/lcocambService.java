package com.empresa.service;

import java.util.List;

import com.empresa.entity.lcocamb;

public interface lcocambService {

	//DEFINIMOS EL METODO PARA LISTAR REGISTROS
	public  List<lcocamb> listaRegistros(int opcion,  lcocamb obj);

	//DEFINIMOS EL METODO PARA CREAR REGISTROS
	void NuevoRegistro(int opcion,  lcocamb obj);
	
	//DEFINIMOS EL METODO PARA EDITAR REGISTROS
	void editarRegistro(int opcion, lcocamb obj);
	
	//DEFINIMOS EL METODO PARA ELIMINAR REGISTRO
	void eliminarRegistro(int opcion,  lcocamb obj);
	
	//DEFINIMOS EL METODO PARA LISTAR REGISTROS ESPECIFICOS
	public List<lcocamb> listaUnRegistro(int opcion,  lcocamb obj);
	
	// Lista por año, mes y tipo de moneda
	public List<lcocamb> getByYearMonth(int year, int month, String money);

	//======================================================================

	public  List<lcocamb> swListarTcb(int opcion,  lcocamb obj);

		//DEFINIMOS EL METODO PARA CREAR REGISTROS
		void registrarTcb(int opcion,  lcocamb obj);
		
		//DEFINIMOS EL METODO PARA EDITAR REGISTROS
		void actualizarTcb(int opcion, lcocamb obj);
		
		//DEFINIMOS EL METODO PARA ELIMINAR REGISTRO
		void eliminarTcb(int opcion,  lcocamb obj);

		// ACTUALIZAR TIPO CAMBIO NIC
		void actualizarTcbNic(int opcion,lcocamb obj);

	}
