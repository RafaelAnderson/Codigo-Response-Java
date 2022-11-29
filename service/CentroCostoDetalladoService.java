package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface CentroCostoDetalladoService {

    List<Map<String,Object[]>> swRepCst(String _ejer, String _cia,  String periodo_ini, String periodo_fin, String _mnd, String codCstIni, String codCstFin, String tpAnx, String cdAnx, String _quie1, String _quie2, String _quie3);
    
}
