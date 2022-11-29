package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoRefv21;

public interface lcoRefv21Service {
	List<Map<String, Object>> listDetaDocRef(String cia, String anio, lcoRefv21 lcorefv21);
	void registrarDetaRef(String cia, String anio, lcoRefv21 lcorefv21);
	void eliminarDetaRef(String cia, String anio, lcoRefv21 lcoRefv21);
	void limpiarDetaRef(String cia, String anio, lcoRefv21 lcoRefv21);
	void eliminarRefByDetalle(String cia, String anio, lcoRefv21 lcorefv21);
}
