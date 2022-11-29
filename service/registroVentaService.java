package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoVent21;

public interface registroVentaService {
    List<Map<String, Object>> swValRegVnt(int opcion, String p_ciacont, String ejercicio, String per, String par);
    
    List<Map<String, Object>> swRegVntTbl(int opcion, String p_ciacont, String ejercicio, String per, String par);

    List<Map<String, Object>> swRegVntPLE(int opcion, String p_ciacont, String ejercicio, String per, String par);

    List<Map<String, Object>> Listar_p(int opcion, String p_ciacont, String ejercicio, String per, String par);

    List<Map<String, Object>> swLstRecVnt(int opcion, String p_ciacont, String ejercicio, String per, String par);

    void swGrabarVentas(int opcion, String p_ciacont, String per, lcoVent21 obj);





}
