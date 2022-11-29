package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.repository.lcoLibCajBancoRepository;

@Service
public class lcoLibCajBancoServiceImp implements lcoLibCajBancoService {

    @Autowired
    lcoLibCajBancoRepository repository;

    @Override
    public List<Map<String, Object[]>> swLibCajBanco(int opcion, String cia, String ejer, String periodo) {
        return repository.swLibCajBanco(opcion, cia, ejer, periodo);
    }

    @Override
    public List<Map<String, Object[]>> swLibCajBancoFrmCab(int opcion, String cia, String ejer, String periodo,
            String ctaInicial, String ctaFinal, String tipoAnexo, String codAnexo, String flagAstCie) {
        return repository.swLibCajBancoFrmCab(opcion, cia, ejer, periodo, ctaInicial, ctaFinal, tipoAnexo, codAnexo, flagAstCie);
    }

    @Override
    public List<Map<String, Object[]>> swLibCajBancoFrmDet(int opcion, String cia, String ejer, String periodo,
            String cta, String codAnexo, String flagAstCie, String flagAstAjs) {
        return repository.swLibCajBancoFrmDet(opcion, cia, ejer, periodo, cta, codAnexo, flagAstCie, flagAstAjs);
    } 
}
