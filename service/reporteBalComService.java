package com.empresa.service;
import java.util.Map;
import java.util.List;

public interface reporteBalComService {
    List<Object[]> swBalComp(int opcion, String Cia, String ejercicio,String PER,String Nd,String pCta,String tipRep);

    List<Object[]> swBalCompAper (int opcion, String Cia, String ejercicio,String PER,String Nd,String pCta,String tipRep);

    List<Object[]> swBalCompNOrd  (int opcion, String Cia, String ejercicio,String PER,String Nd,String pCta,String tipRep);

    List<Map<String,Object[]>> swBalComptipo2(int opcion, String Cia, String ejercicio,String PER,String Nd,String pCta,String tipRep);

    List<Map<String,Object[]>> swBalCompApertipo2 (int opcion, String Cia, String ejercicio,String PER,String Nd,String pCta,String tipRep);

    List<Map<String,Object[]>> swBalCompNOrdtipo2  (int opcion, String Cia, String ejercicio,String PER,String Nd,String pCta,String tipRep);
}
