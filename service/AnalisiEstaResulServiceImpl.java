package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.repository.AnalisiEstaResulRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnalisiEstaResulServiceImpl implements AnalisiEstaResulService{

    @Autowired
    AnalisiEstaResulRepository repositoryAnalisisEstadoResultados;

    @Override
    public List<Map<String, Object[]>> swExisFormato(int opcion, String cia, String EJER, String PER, String N,
            String tipo, String modelo) {
        // TODO Auto-generated method stub
        return repositoryAnalisisEstadoResultados.swExisFormato(opcion, cia, EJER, PER, N, tipo, modelo);
    }

    @Override
    public List<Map<String, Object[]>> swRepFrmAnaResu(int opcion, String cia, String EJER, String PER, String N,
            String tipo, String modelo) {
        // TODO Auto-generated method stub
        return repositoryAnalisisEstadoResultados.swRepFrmAnaResu(opcion, cia, EJER, PER, N, tipo, modelo);
    }

    
    
    
}
