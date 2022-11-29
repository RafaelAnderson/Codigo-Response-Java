package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoCabV;
import com.empresa.entity.lcoDetV;

public interface lcoCabVService {
	
	void transaccional(int opcion,String cia, String año,lcoCabV obj);
	
	List<lcoCabV> listar(int opcion,String cia, String año,lcoCabV obj);
	
	List<Object[]> listar2(int opcion,String cia, String año,lcoCabV obj, lcoDetV obj2);
	List<Object[]> listar3(int opcion,String cia, String año,String cl_subdia, String cl_compro);
	

	List<lcoCabV> EntreAsientos(int opcion,String cia, String año,String cl_subdia, String cl_compro, String cl_compro2, String estado);


	List<Object[]> TotalImporte(String cia, String año, String dl_subdia, String dl_compro);


	List<Object[]> listUltimoNumReaV2(int opcion, String p_ciacont,String Año, String Mes,String ejercicio,lcoCabV obj);

	List<Map<String, Object>> ListarLibroMayor(String cia, String ejer, String per, String CTAINI, String CTAFIN, String option);

	List<Map<String, Object>> generarAsiento(String cia, String ejer, String pSD, String pMes, String pAnio);

	void actualizarBalance(String mes, String cia, String periodo, String ejercicio);

}
