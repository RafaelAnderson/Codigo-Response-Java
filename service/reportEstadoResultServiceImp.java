package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.repository.reportEstadoResultRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class reportEstadoResultServiceImp implements reportEstadoResultService {

    @Autowired
    private reportEstadoResultRepository repository;
    
    @Override
    public List<Map<String, Object>> swExisFormato(int opcion, String p_ciacont, String ejercicio, String periodo,
         String tipo, String n, String ltm, String formula, String cero) {
        return repository.swExisFormato(opcion, p_ciacont, ejercicio, periodo, tipo, n, ltm, formula, cero);
    }

    @Override
    public List<Map<String, Object>> swRepFrmResuGyP(int opcion, String p_ciacont, String ejercicio, String periodo,
             String tipo, String n, String ltm, String formula, String cero) {
        return repository.swRepFrmResuGyP(opcion, p_ciacont, ejercicio, periodo, tipo, n, ltm, formula, cero);
    }

    @Override
    public List<Map<String, Object>> swRepFrmResuTot(int opcion, String p_ciacont, String ejercicio, String periodo,
            String tipo, String n, String ltm, String formula, String cero) {
        return repository.swRepFrmResuTot(opcion, p_ciacont, ejercicio, periodo, tipo, n, ltm, formula, cero);
    }

    @Override
    public List<Map<String, Object>> swEstadoResul1(String Tcia, String Tperiodo, String TForm, String TModel){
        return repository.swEstadoResul1(Tcia, Tperiodo, TForm, TModel);
    }

    @Override
    public void swEstadoResul2(String Tcia, String TForm, String TModel){
        repository.swEstadoResul2(Tcia, TForm, TModel);
    }
}
