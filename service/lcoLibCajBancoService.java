package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface lcoLibCajBancoService {
    
    public List<Map<String, Object[]>> swLibCajBanco(
        int opcion,
        String cia,
        String ejer,
        String periodo
    );

    public List<Map<String, Object[]>> swLibCajBancoFrmCab(
        int opcion,
        String cia,
        String ejer,
        String periodo,
        String ctaInicial,
        String ctaFinal,
        String tipoAnexo,
        String codAnexo,
        String flagAstCie
    );

    public List<Map<String, Object[]>> swLibCajBancoFrmDet(
        int opcion,
        String cia,
        String ejer,
        String periodo,
        String cta,
        String codAnexo,
        String flagAstCie,
        String flagAstAjs
    );
}
