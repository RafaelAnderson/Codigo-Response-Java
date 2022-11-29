package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface AsientoAperturaService {
    List<Map<String, Object>> swListarTablaVarSD(int opcion, String cia, String ejercicio, String periodo, String parametro);

    List<Map<String, Object>> swListarSaldosCuenta(int opcion, String cia, String ejercicio, String periodo, String parametro);
}
