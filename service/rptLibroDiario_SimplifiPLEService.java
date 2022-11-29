package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface rptLibroDiario_SimplifiPLEService {
    List<Map<String, Object[]>> LibroDiario_SimplifiPLE(String basedatos, Integer opcion, String cia, String ejercicio,
            String PER);

}