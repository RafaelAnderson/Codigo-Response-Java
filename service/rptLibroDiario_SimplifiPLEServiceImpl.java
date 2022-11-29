package com.empresa.service;

import java.util.List;
import java.util.Map;
import com.empresa.repository.rptLibroDiario_SimplifiPLERepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class rptLibroDiario_SimplifiPLEServiceImpl implements rptLibroDiario_SimplifiPLEService {
    @Autowired
    rptLibroDiario_SimplifiPLERepository repository;

    @Override
    public List<Map<String, Object[]>> LibroDiario_SimplifiPLE(String basedatos, Integer opcion, String cia,
            String ejercicio,
            String PER) {
        // TODO Auto-generated method stub
        return repository.LibroDiario_SimplifiPLE(basedatos, opcion, cia, ejercicio, PER);

    }
}