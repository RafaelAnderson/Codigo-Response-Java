package com.empresa.service;

import java.util.List;
import java.util.Map;


import com.empresa.repository.lcoPendienteACDRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class lcoPendienteACDServiceImpl implements lcoPendienteACDService{
    @Autowired
    private lcoPendienteACDRepository repository;
    @Override
    public List<Map<String, Object>> swListarPendACD(int opcion, String cia, String ejer, String periodo, String info,
            String tipoAnexo, String codAnexoInicial, String codAnexoFinal, String ctaInicial, String ctaFinal, String fecIni, String fecVen,
            String orden) {
        // TODO Auto-generated method stub
        return repository.swListarPendACD(opcion, cia, ejer, periodo, info, tipoAnexo, codAnexoInicial, codAnexoFinal, ctaInicial, ctaFinal, fecIni, fecVen, orden);
    }

    @Override
    public List<Map<String, Object>> swListarResuPACD(int opcion, String cia, String ejer, String periodo, String info,
            String tipoAnexo, String codAnexoInicial, String codAnexoFinal, String ctaInicial, String ctaFinal, String fecIni, String fecVen,
            String orden) {
        // TODO Auto-generated method stub
        return repository.swListarResuPACD(opcion, cia, ejer, periodo, info, tipoAnexo, codAnexoInicial, codAnexoFinal, ctaInicial, ctaFinal, fecIni, fecVen, orden);
    }

    @Override
    public List<Map<String, Object>> swListarPlanoPACD(int opcion, String cia, String ejer, String periodo, String info,
            String tipoAnexo, String codAnexoInicial, String codAnexoFinal, String ctaInicial, String ctaFinal, String fecIni, String fecVen,
            String orden) {
        // TODO Auto-generated method stub
        return repository.swListarPlanoPACD(opcion, cia, ejer, periodo, info, tipoAnexo, codAnexoInicial, codAnexoFinal, ctaInicial, ctaFinal, fecIni, fecVen, orden);
    }
    
}
