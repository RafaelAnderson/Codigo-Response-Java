package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface pdtPercepcionesService {
    List<Map<String, Object[]>> swCargaPercepciones(
            String basedatos, Integer opcion, String cia, String ejercicio, String Periodo);

}