package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface lcoSaldoAnexService {
    List<Map<String, Object[]>> swListarSaldoAnex(int opcion, String cia, String ejer, String dl_cuenta, String dl_tpanex, String dl_cdanex, String periodo, String opciones, String dl_tpdoc, String dl_nmdoc);

    List<Map<String, Object[]>> swListaSalDoc(int opcion, String cia, String ejer, String dl_cuenta, String dl_tpanex, String dl_cdanex, String periodo, String opciones, String dl_tpdoc, String dl_nmdoc);
    
    List<Map<String, Object[]>> swListaDetSal(int opcion, String cia, String ejer, String dl_cuenta, String dl_tpanex, String dl_cdanex, String periodo, String opciones, String dl_tpdoc, String dl_nmdoc);
}