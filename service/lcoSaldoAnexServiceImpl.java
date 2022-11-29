package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.repository.lcoSaldoAnexRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class lcoSaldoAnexServiceImpl implements lcoSaldoAnexService {

    @Autowired
    lcoSaldoAnexRepository repository;

    @Override
    public List<Map<String, Object[]>> swListarSaldoAnex(int opcion, String cia, String ejer, String dl_cuenta, String dl_tpanex, String dl_cdanex, String periodo, String opciones, String dl_tpdoc, String dl_nmdoc){
        return repository.swListarSaldoAnex(opcion, cia, ejer, dl_cuenta, dl_tpanex, dl_cdanex, periodo, opciones, dl_tpdoc, dl_nmdoc);
    }

    @Override
    public List<Map<String, Object[]>> swListaSalDoc(int opcion, String cia, String ejer, String dl_cuenta, String dl_tpanex, String dl_cdanex, String periodo, String opciones, String dl_tpdoc, String dl_nmdoc){
        return repository.swListaSalDoc(opcion, cia, ejer, dl_cuenta, dl_tpanex, dl_cdanex, periodo, opciones, dl_tpdoc, dl_nmdoc);
    }

    @Override
    public List<Map<String, Object[]>> swListaDetSal(int opcion, String cia, String ejer, String dl_cuenta, String dl_tpanex, String dl_cdanex, String periodo, String opciones, String dl_tpdoc, String dl_nmdoc){
        return repository.swListaDetSal(opcion, cia, ejer, dl_cuenta, dl_tpanex, dl_cdanex, periodo, opciones, dl_tpdoc, dl_nmdoc);
    }
}
