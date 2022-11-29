package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface AnalisiEstaResulService {

    List <Map<String,Object[]>> swExisFormato(int opcion, String cia,String EJER,String PER,String N,String tipo,String modelo);

    default List<Map<String, Object[]>> swRepFrmAnaResu(int opcion, String cia, String EJER, String PER, String N, String tipo, String modelo) {
        return null;
    }

}
