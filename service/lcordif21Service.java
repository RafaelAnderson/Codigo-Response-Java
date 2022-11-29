package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface lcordif21Service {

	void asieReguDifeCamb(String cia, String ejer, String periodo, String usu);
	public List<Map<String,Object>> listarlcordif21(int opcion, String cia, String ejercicio, String periodo, String clave, String codane, String tipdoc, String numdoc);
	void eliminarlcordif21(int opcion, String cia, String ejercicio, String periodo, String clave, String codane, String tipdoc, String numdoc);
	public List<Map<String,Object>> listarDetallelcordif21( String cia, String ejercicio, String periodo, String cuenta,String cdanex, String tpanex,String numdoc );
}
