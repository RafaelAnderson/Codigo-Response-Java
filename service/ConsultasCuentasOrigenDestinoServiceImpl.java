package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.repository.ConsultasCuentaOrigenDestinoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultasCuentasOrigenDestinoServiceImpl implements ConsultasCuentasOrigenDestinoService{

    @Autowired
    private ConsultasCuentaOrigenDestinoRepository consultasCuentaOrigenDestinoRepository;

    @Override
    public List<Map<String, Object[]>> swConsCtaDstOrig(
        int opcion,
        String cia,
        String ejercicio,
        String periodo,
        String pcta) {
        return consultasCuentaOrigenDestinoRepository.consultaCuentaOrigen(
            opcion,
            cia,
            ejercicio,
            periodo,
            pcta);
    }
    
}
