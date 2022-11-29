package com.empresa.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoCabV;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface lcoMovCuentaXAnexoRepository extends JpaRepository<lcoCabV, String> {

        // Solo Orden
        @Query(value = "{call SP_MovCuentaXAnexo(:opcion, :cia, :ejer, :fecInicial, :fecFinal, :ctaInicial, :ctaFinal, :tipoAnexo, :codAnexoInicial, :codAnexoFinal, :orden, :tipo)}", nativeQuery = true)

        List<Map<String, Object[]>> swListarDetCtaAnex(
                        @Param("opcion") Integer opcion,
                        @Param("cia") String cia,
                        @Param("ejer") String ejer,
                        @Param("fecInicial") LocalDate fecInicial,
                        @Param("fecFinal") LocalDate fecFinal,
                        @Param("ctaInicial") String ctaInicial,
                        @Param("ctaFinal") String ctaFinal,
                        @Param("tipoAnexo") String tipoAnexo,
                        @Param("codAnexoInicial") String codAnexoInicial,
                        @Param("codAnexoFinal") String codAnexoFinal,
                        @Param("orden") String orden,
                        @Param("tipo") String tipo);

        // Solo tipo
        @Query(value = "{call SP_MovCuentaXAnexo(:opcion, :cia, :ejer, :fecInicial, :fecFinal, :ctaInicial, :ctaFinal, :tipoAnexo, :codAnexoInicial, :codAnexoFinal, :orden, :tipo)}", nativeQuery = true)
        List<Map<String, Object[]>> swListarResuCtaAnex(
                        @Param("opcion") Integer opcion,
                        @Param("cia") String cia,
                        @Param("ejer") String ejer,
                        @Param("fecInicial") LocalDate fecInicial,
                        @Param("fecFinal") LocalDate fecFinal,
                        @Param("ctaInicial") String ctaInicial,
                        @Param("ctaFinal") String ctaFinal,
                        @Param("tipoAnexo") String tipoAnexo,
                        @Param("codAnexoInicial") String codAnexoInicial,
                        @Param("codAnexoFinal") String codAnexoFinal,
                        @Param("orden") String orden,
                        @Param("tipo") String tipo);

        // Solo orden
        @Query(value = "{call SP_MovCuentaXAnexo(:opcion, :cia, :ejer, :fecInicial, :fecFinal, :ctaInicial, :ctaFinal, :tipoAnexo, :codAnexoInicial, :codAnexoFinal, :orden, :tipo)}", nativeQuery = true)
        List<Map<String, Object[]>> swListarDetCta(
                        @Param("opcion") Integer opcion,
                        @Param("cia") String cia,
                        @Param("ejer") String ejer,
                        @Param("fecInicial") LocalDate fecInicial,
                        @Param("fecFinal") LocalDate fecFinal,
                        @Param("ctaInicial") String ctaInicial,
                        @Param("ctaFinal") String ctaFinal,
                        @Param("tipoAnexo") String tipoAnexo,
                        @Param("codAnexoInicial") String codAnexoInicial,
                        @Param("codAnexoFinal") String codAnexoFinal,
                        @Param("orden") String orden,
                        @Param("tipo") String tipo);
}
