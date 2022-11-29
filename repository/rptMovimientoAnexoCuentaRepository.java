package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.Modifying;

import com.empresa.entity.lcoCabV;
import com.empresa.entity.lcoCabVPk;
import javax.transaction.Transactional;

public interface rptMovimientoAnexoCuentaRepository extends JpaRepository<lcoCabV, lcoCabVPk> {
        @Query(value = "{call SP_Movimiento_AnexoCuenta(:opcion,:cia,:ejercicio,:FecInicial,:FecFinal,:CtaInicial,:CtaFinal,:TipoAnexo,:CodAnexoInicial,:CodAnexoFinal,:Orden)}", nativeQuery = true)
        @Modifying
        @Transactional
        List<Map<String, Object[]>> swListarDetAnexCta(
                        @Param("opcion") Integer opcion,
                        @Param("cia") String cia,
                        @Param("ejercicio") String ejercicio,
                        @Param("FecInicial") LocalDate FecInicial,
                        @Param("FecFinal") LocalDate FecFinal,
                        @Param("CtaInicial") String CtaInicial,
                        @Param("CtaFinal") String CtaFinal,
                        @Param("TipoAnexo") String TipoAnexo,
                        @Param("CodAnexoInicial") String CodAnexoInicial,
                        @Param("CodAnexoFinal") String CodAnexoFinal,
                        @Param("Orden") String Orden);

        @Query(value = "{call SP_Movimiento_AnexoCuenta(:opcion,:cia,:ejercicio,:FecInicial,:FecFinal,:CtaInicial,:CtaFinal,:TipoAnexo,:CodAnexoInicial,:CodAnexoFinal,:Orden)}", nativeQuery = true)
        @Modifying
        @Transactional
        List<Map<String, Object[]>> swListarDetAnex(
                        @Param("opcion") Integer opcion,
                        @Param("cia") String cia,
                        @Param("ejercicio") String ejercicio,
                        @Param("FecInicial") LocalDate FecInicial,
                        @Param("FecFinal") LocalDate FecFinal,
                        @Param("CtaInicial") String CtaInicial,
                        @Param("CtaFinal") String CtaFinal,
                        @Param("TipoAnexo") String TipoAnexo,
                        @Param("CodAnexoInicial") String CodAnexoInicial,
                        @Param("CodAnexoFinal") String CodAnexoFinal,
                        @Param("Orden") String Orden);

}