package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface PendienteACDService {
    List<Map<String, Object>> swListarPendACD(int opcion, String cia, String ejercicio, String periodo, String info, String anex, String codanexini, String codanexfin, String ctaini, String ctafin, String orden);
    // List<Map<String, Object>> swListarResuPACD(int opcion, String cia, String ejercicio, String periodo, String info, String anex, String codanexini, String codanexfin, String ctaini, String ctafin, String orden);
    // List<Map<String, Object>> swListarPlanoPACD(int opcion, String cia, String ejercicio, String periodo, String info, String anex, String codanexini, String codanexfin, String ctaini, String ctafin, String orden);
}
