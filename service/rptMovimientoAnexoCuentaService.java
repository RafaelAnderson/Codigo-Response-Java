package com.empresa.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface rptMovimientoAnexoCuentaService {
        List<Map<String, Object[]>> swListarDetAnexCta(
                        Integer opcion, String cia, String ejercicio, LocalDate FecInicial, LocalDate FecFinal,
                        String CtaInicial,
                        String CtaFinal, String TipoAnexo, String CodAnexoInicial, String CodAnexoFinal, String Orden);

        List<Map<String, Object[]>> swListarDetAnex(
                        Integer opcion, String cia, String ejercicio, LocalDate FecInicial, LocalDate FecFinal,
                        String CtaInicial,
                        String CtaFinal, String TipoAnexo, String CodAnexoInicial, String CodAnexoFinal, String Orden);
}