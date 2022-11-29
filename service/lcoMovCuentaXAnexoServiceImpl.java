package com.empresa.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.repository.lcoMovCuentaXAnexoRepository;

@Service
public class lcoMovCuentaXAnexoServiceImpl implements lcoMovCuentaXAnexoService {

    @Autowired
    lcoMovCuentaXAnexoRepository repository;

    @Override
    public List<Map<String, Object[]>> swListarDetCtaAnex(Integer opcion, String cia, String ejer, LocalDate fecInicial,
            LocalDate fecFinal, String ctaInicial, String ctaFinal, String tipoAnexo, String codAnexoInicial,
            String codAnexoFinal, String orden, String tipo) {
        return repository.swListarDetCtaAnex(opcion, cia, ejer, fecInicial, fecFinal, ctaInicial, ctaFinal, tipoAnexo,
                codAnexoInicial, codAnexoFinal, orden, tipo);
    }

    @Override
    public List<Map<String, Object[]>> swListarResuCtaAnex(Integer opcion, String cia, String ejer, LocalDate fecInicial,
            LocalDate fecFinal, String ctaInicial, String ctaFinal, String tipoAnexo, String codAnexoInicial,
            String codAnexoFinal, String orden, String tipo) {
        return repository.swListarResuCtaAnex(opcion, cia, ejer, fecInicial, fecFinal, ctaInicial, ctaFinal, tipoAnexo,
                codAnexoInicial, codAnexoFinal, orden, tipo);
    }

    @Override
    public List<Map<String, Object[]>> swListarDetCta(Integer opcion, String cia, String ejer, LocalDate fecInicial,
            LocalDate fecFinal, String ctaInicial, String ctaFinal, String tipoAnexo, String codAnexoInicial,
            String codAnexoFinal, String orden, String tipo) {
        return repository.swListarDetCta(opcion, cia, ejer, fecInicial, fecFinal, ctaInicial, ctaFinal, tipoAnexo,
                codAnexoInicial, codAnexoFinal, orden, tipo);
    }
}
