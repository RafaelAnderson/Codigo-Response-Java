package com.empresa.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface lcoMovCuentaXAnexoService {

    public abstract List<Map<String, Object[]>> swListarDetCtaAnex(
            Integer opcion,
            String cia,
            String ejer,
            LocalDate fecInicial,
            LocalDate fecFinal,
            String ctaInicial,
            String ctaFinal,
            String tipoAnexo,
            String codAnexoInicial,
            String codAnexoFinal,
            String orden,
            String tipo);

    public abstract List<Map<String, Object[]>> swListarResuCtaAnex(
            Integer opcion,
            String cia,
            String ejer,
            LocalDate fecInicial,
            LocalDate fecFinal,
            String ctaInicial,
            String ctaFinal,
            String tipoAnexo,
            String codAnexoInicial,
            String codAnexoFinal,
            String orden,
            String tipo);

    public abstract List<Map<String, Object[]>> swListarDetCta(
            Integer opcion,
            String cia,
            String ejer,
            LocalDate fecInicial,
            LocalDate fecFinal,
            String ctaInicial,
            String ctaFinal,
            String tipoAnexo,
            String codAnexoInicial,
            String codAnexoFinal,
            String orden,
            String tipo);
}
