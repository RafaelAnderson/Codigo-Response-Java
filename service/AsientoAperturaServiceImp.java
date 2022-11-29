package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.repository.AsientoAperturaRepository;

@Service
public class AsientoAperturaServiceImp implements AsientoAperturaService{
    @Autowired
    private AsientoAperturaRepository repository;
    @Override
    public List<Map<String, Object>> swListarTablaVarSD(int opcion, String cia, String ejercicio, String periodo,
            String parametro) {
        return repository.swListarTablaVarSD(opcion, cia, ejercicio, periodo, parametro);
    }

    @Override
    public List<Map<String, Object>> swListarSaldosCuenta(int opcion, String cia, String ejercicio, String periodo,
            String parametro) {
        return repository.swListarSaldosCuenta(opcion, cia, ejercicio, periodo, parametro);
    }
    
}
