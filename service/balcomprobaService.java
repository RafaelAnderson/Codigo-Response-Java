package com.empresa.service;

import java.util.List;
import java.util.Map;



public interface balcomprobaService {
    
    List<Map<String,Object[]>> swBalComp (int opcion,String Cia,String ejercicio,String PER,String Nd,String pCta,String tipRep);
   
    
}
