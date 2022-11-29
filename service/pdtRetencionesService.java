package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface pdtRetencionesService {
    List<Map<String, Object[]>> swCargaRetenciones(String base, int opcion, String cia, String ejer, String periodo);
}