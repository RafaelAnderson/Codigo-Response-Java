package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface rptBalanceSaldoService {
    List <Map<String,Object[]>> swBalSaldo(String Cia ,String ejercicio,String PER,String N );
}
