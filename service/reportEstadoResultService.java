package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface reportEstadoResultService {
    List<Map<String, Object>> swExisFormato(int opcion, String p_ciacont, String ejercicio, String periodo, String tipo, String n, String ltm, String formula, String cero);
    
    List<Map<String, Object>> swRepFrmResuGyP(int opcion, String p_ciacont, String ejercicio, String periodo, String tipo, String n, String ltm, String formula, String cero);

    List<Map<String, Object>> swRepFrmResuTot(int opcion, String p_ciacont, String ejercicio, String periodo, String tipo, String n, String ltm, String formula, String cero);

    List<Map<String, Object>> swEstadoResul1(String Tcia, String Tperiodo, String TForm, String TModel);

    void swEstadoResul2(String Tcia, String TForm, String TModel);
}
