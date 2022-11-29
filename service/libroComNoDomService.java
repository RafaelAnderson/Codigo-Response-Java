package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface libroComNoDomService {
    List<Map<String,Object[]>> swLiComNoDom(int opcion, String cia,String ejercicio,String per );
}
