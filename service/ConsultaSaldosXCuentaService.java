package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface ConsultaSaldosXCuentaService {
    List<Map<String, Object[]>> swListarSaldoCtaDet(int opcion, String cia, String ejer, String periodo, String cta,
            String codane, String tpanex, String tpdoc, String nmdoc);

    List<Map<String, Object[]>> swListarDetaSaldCta(int opcion, String cia, String ejer, String periodo, String cta,
            String codane, String tpanex, String tpdoc, String nmdoc);
}