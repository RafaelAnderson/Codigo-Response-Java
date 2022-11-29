package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.repository.libroDiarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class libroDiarioServiceImp implements libroDiarioService{
    @Autowired
    private libroDiarioRepository repository;
    @Override
    public List<Map<String, Object>> swLibDiario(int opcion, String p_ciacont, String ejercicio, String periodo, String subdia) {
        // TODO Auto-generated method stub
        return repository.swLibDiario(opcion, p_ciacont, ejercicio, periodo, subdia);
    }
    @Override
    public List<Map<String, Object>> swLibDiarioPLE(int opcion, String p_ciacont, String ejercicio, String periodo, String subdia) {
        // TODO Auto-generated method stub
        return repository.swLibDiarioPLE(opcion, p_ciacont, ejercicio, periodo, subdia);
    }
    @Override
    public List<Map<String, Object>> swPlanCtaPLE(int opcion, String p_ciacont, String ejercicio, String periodo, String subdia) {
        // TODO Auto-generated method stub
        return repository.swPlanCtaPLE(opcion, p_ciacont, ejercicio, periodo, subdia);
    }
    @Override
    public List<Map<String, Object>> swLibDiarioSubdiario(int opcion, String p_ciacont, String ejercicio, String periodo, String subdia) {
        // TODO Auto-generated method stub
        return repository.swLibDiarioSubdiario(opcion, p_ciacont, ejercicio, periodo, subdia);
    }
    @Override
    public List<Map<String, Object>> swLibDiarioPLESubdiario(int opcion, String p_ciacont, String ejercicio,
            String periodo, String subdia) {
        // TODO Auto-generated method stub
        return repository.swLibDiarioPLESubdiario(opcion, p_ciacont, ejercicio, periodo, subdia);
    }
    
}
