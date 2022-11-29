package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcopcmp;

public interface lcopcmpService {

	List<lcopcmp> lista(int opcion, String p_ciacon, lcopcmp obj);
	List<lcopcmp> listaCom(int opcion, String p_ciacon, lcopcmp obj);

	
	void agregarRegistro(int opcion, String p_ciacon, lcopcmp obj);
	void editarRegistro(int opcion, String p_ciacon, lcopcmp obj);
	void eliminarRegistro(int opcion, String p_ciacon, lcopcmp obj);
	
	//nick
	List<Map<String, Object>> listarLote(String opcion, String p_ciacon, String año);
	void agregarLote(String opcion, String p_ciacon, String año);
	void actualizarLote(String opcion, String p_ciacon, String año, String lote );

	List<Map<String, Object>> listarCuentaTipoOperacion(int opcion, String p_ciacon, lcopcmp obj);

	List<lcopcmp> swListarPrmCmpXml(int opcion, String cia, String cl_tipo, String cl_tipcmp, String cl_parcmp, String cl_itmp1, String cl_itmp2, String cl_itmp3, String cl_itmp4, String mnd);

	List<Map<String, Object>> swListarPrmCmpCtaMnd(int opcion, String cia, String cl_tipo, String cl_tipcmp, String cl_parcmp, String cl_itmp1, String cl_itmp2, String cl_itmp3, String cl_itmp4, String mnd);

	List<Map<String, Object>> swURegPrmCmpXML(int opcion, String cia, String cl_tipo, String cl_tipcmp, String cl_parcmp, String cl_itmp1, String cl_itmp2, String cl_itmp3, String cl_itmp4, String mnd);

	List<Map<String, Object>> swPrmCmpVarXml(int opcion, String cia, String cl_tipo, String cl_tipcmp, String cl_parcmp, String cl_itmp1, String cl_itmp2, String cl_itmp3, String cl_itmp4, String mnd);
}
