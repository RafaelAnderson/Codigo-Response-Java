package com.empresa.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.empresa.repository.PendienteACDRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PendienteACDServiceImp implements PendienteACDService{
    @Autowired
    private PendienteACDRepository repository;
    @Override
    public List<Map<String, Object>> swListarPendACD(int opcion,String cia, String ejercicio, String periodo, String info, String anex, String codanexini, String codanexfin, String ctaini, String ctafin, String orden){
        return repository.swListarPendACD(opcion, cia, ejercicio, periodo, info, anex, codanexini, codanexfin, ctaini, ctafin, orden);
    }
    
    // @Override
    // public List<Map<String, Object>> swListarResuPACD(int opcion,String cia, String ejercicio, String periodo, String info, String anex, String codanexini, String codanexfin, String ctaini, String ctafin, String orden){
    //     return repository.swListarResuPACD(opcion, cia, ejercicio, periodo, info, anex, codanexini, codanexfin, ctaini, ctafin, orden);
    // }
    
    // @Override
    // public List<Map<String, Object>> swListarPlanoPACD(int opcion, String cia, String ejercicio, String periodo, String info, String anex, String codanexini, String codanexfin, String ctaini, String ctafin, String orden){
    //     return repository.swListarPlanoPACD(opcion, cia, ejercicio, periodo, info, anex, codanexini, codanexfin, ctaini, ctafin, orden);
    // }

}