package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface libroDiarioService {
    List<Map<String, Object>> swLibDiario(int opcion, String p_ciacont, String ejercicio, String periodo, String subdia);

    List<Map<String, Object>> swLibDiarioPLE (int opcion, String p_ciacont, String ejercicio, String periodo, String subdia);

    List<Map<String, Object>> swPlanCtaPLE (int opcion, String p_ciacont, String ejercicio, String periodo, String subdia);

    List<Map<String, Object>> swLibDiarioSubdiario (int opcion, String p_ciacont, String ejercicio, String periodo, String subdia);

    List<Map<String, Object>> swLibDiarioPLESubdiario (int opcion, String p_ciacont, String ejercicio, String periodo, String subdia);
    
}
