package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface loginCiaEjerService {

    List<Map<String, Object[]>> ListarEjer(int opcion, String _codcia, String _nrodoc);
    
    List<Map<String, Object[]>> ListarCias(int opcion, String _coduser, String _idbd);
}
