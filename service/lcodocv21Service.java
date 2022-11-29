package com.empresa.service;

import java.util.List;

import com.empresa.entity.lcodocv21;

public interface lcodocv21Service {

	List<lcodocv21> swListaCabAsiento(int opcion, String p_ciacont, String ejercicio, lcodocv21 obj);

	List<Object[]> swObtUltSecDocV(int opcion, String p_ciacont, String ejercicio, lcodocv21 obj);

	// DEFINIMOS EL METODO PARA CREAR REGISTROS
	void swCreaDocAsiento(int opcion, String p_ciacont, String ejercicio, lcodocv21 obj);

	// DEFINIMOS EL METODO PARA EDITAR REGISTROS
	void swActuaDocAsie(int opcion, String p_ciacont, String ejercicio, lcodocv21 obj);

	// DEFINIMOS EL METODO PARA ELIMINAR REGISTRO
	void swEliminarDocAsie(int opcion, String p_ciacont, String ejercicio, lcodocv21 obj);

	// DEFINIMOS EL METODO PARA ELIMINAR REGISTRO
	void modificarAsientos(String p_ciacont, String ejercicio, lcodocv21 obj);

}
