package com.empresa.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;
import com.empresa.repository.ConsultaSaldosXCuentaRepository;

@Service
public class ConsultaSaldosXCuentaServiceImpl implements ConsultaSaldosXCuentaService {

    @Autowired
    private ConsultaSaldosXCuentaRepository repo;

    @Override
    public List<Map<String, Object[]>> swListarSaldoCtaDet(int opcion, String cia, String ejer, String periodo,
            String cta,
            String codane, String tpanex, String tpdoc, String nmdoc) {
        return repo.swListarSaldoCtaDet(opcion, cia, ejer, periodo, cta, codane, tpanex, tpdoc, nmdoc);
    }

    @Override
    public List<Map<String, Object[]>> swListarDetaSaldCta(int opcion, String cia, String ejer, String periodo,
            String cta,
            String codane, String tpanex, String tpdoc, String nmdoc) {
        return repo.swListarDetaSaldCta(opcion, cia, ejer, periodo, cta, codane, tpanex, tpdoc, nmdoc);
    }
}