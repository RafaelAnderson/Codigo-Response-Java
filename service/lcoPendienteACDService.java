package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface lcoPendienteACDService {

    List<Map<String, Object>> swListarPendACD(int opcion, String cia, String ejer, String periodo, String info, String tipoAnexo, String codAnexoInicial, String codAnexoFinal, String ctaInicial, String ctaFinal, String fecIni, String fecVen, String orden);
    
    List<Map<String, Object>> swListarResuPACD(int opcion, String cia, String ejer, String periodo, String info, String tipoAnexo, String codAnexoInicial, String codAnexoFinal, String ctaInicial, String ctaFinal, String fecIni, String fecVen, String orden);
    
    List<Map<String, Object>> swListarPlanoPACD(int opcion, String cia, String ejer, String periodo, String info, String tipoAnexo, String codAnexoInicial, String codAnexoFinal, String ctaInicial, String ctaFinal, String fecIni, String fecVen, String orden);
    
}
