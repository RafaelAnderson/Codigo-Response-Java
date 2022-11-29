package com.empresa.service;
import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoTblaVenta;
/* import com.empresa.entity.lcoTblaVenta;
 */public interface ResVentaAdiService {
    List<Map<String, Object[]>> swListarRecVnt(int opcion, String cia, String ejercicio, String PER, String SD,
    String asiento, lcoTblaVenta obj);

    List<Map<String, Object[]>> swBscRecVnt(int opcion, String cia, String ejercicio, String PER, String SD,
    String asiento, lcoTblaVenta obj);

    List<Map<String, Object[]>> swConRecVnt(int opcion, String cia, String ejercicio, String PER, String SD,
    String asiento, lcoTblaVenta obj);

    void swEliRecVnt(int opcion, String cia, String ejercicio, String PER, String SD,
    String asiento, lcoTblaVenta obj);

    void swCrearRecVnt(int opcion, String cia, String ejercicio, String PER, String SD, String asiento, lcoTblaVenta obj);
    
    void swActRecVnt(int opcion, String cia, String ejercicio, String PER, String SD, String asiento, lcoTblaVenta obj);

    List<Map<String, Object[]>> swListarAyuOmi(int opcion, String cia, String ejercicio, String PER, String SD,
            String asiento, lcoTblaVenta obj);

}
