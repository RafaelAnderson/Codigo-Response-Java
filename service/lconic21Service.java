package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface lconic21Service {

	void asientoRegularizacion(String cia, String ejercicio, String periodo, double tpventa, double tpcompra,String usu);
	public List<Map<String,Object[]>> listarlcoNic21(int opcion, String cia, String ejercicio, String ni_codper, String ni_cuenta, String ni_tipane, String ni_codane, String ni_tipdoc, String ni_numdoc );
	void eliminarlcoNic(int opcion, String cia, String ejercicio, String ni_codper, String ni_cuenta, String ni_tipane, String ni_codane, String ni_tipdoc, String ni_numdoc);
}
