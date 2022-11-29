package com.empresa.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.lcoDetV;
import com.empresa.entity.lcoDetVPk;

@Repository
public interface lcoPendienteACDRepository extends JpaRepository<lcoDetV, lcoDetVPk>{
    @Query(value = "{call SP_PendienteACD(:opcion, :cia, :ejer, :periodo, :info, :tipoAnexo, :codAnexoInicial, :codAnexoFinal, :ctaInicial, :ctaFinal, :fecIni, :fecVen, :orden)}", nativeQuery = true)
    List<Map<String, Object>> swListarPendACD(@Param("opcion") int opcion,
                                 @Param("cia") String cia,
                                 @Param("ejer") String ejer,
                                 @Param("periodo") String periodo,
                                 @Param("info") String info,
                                 @Param("tipoAnexo") String tipoAnexo,
                                 @Param("codAnexoInicial") String codAnexoInicial,
                                 @Param("codAnexoFinal") String codAnexoFinal,
                                 @Param("ctaInicial") String ctaInicial,
                                 @Param("ctaFinal") String ctaFinal,
                                 @Param("fecIni") String fecIni,
                                 @Param("fecVen") String fecVen,
                                 @Param("orden") String orden
    );

    @Query(value = "{call SP_PendienteACD(:opcion, :cia, :ejer, :periodo, :info, :tipoAnexo, :codAnexoInicial, :codAnexoFinal, :ctaInicial, :ctaFinal, :fecIni, :fecVen, :orden)}", nativeQuery = true)
    List<Map<String, Object>> swListarResuPACD(@Param("opcion") int opcion,
                                 @Param("cia") String cia,
                                 @Param("ejer") String ejer,
                                 @Param("periodo") String periodo,
                                 @Param("info") String info,
                                 @Param("tipoAnexo") String tipoAnexo,
                                 @Param("codAnexoInicial") String codAnexoInicial,
                                 @Param("codAnexoFinal") String codAnexoFinal,
                                 @Param("ctaInicial") String ctaInicial,
                                 @Param("ctaFinal") String ctaFinal,
                                 @Param("fecIni") String fecIni,
                                 @Param("fecVen") String fecVen,
                                 @Param("orden") String orden
    );

    @Query(value = "{call SP_PendienteACD(:opcion, :cia, :ejer, :periodo, :info, :tipoAnexo, :codAnexoInicial, :codAnexoFinal, :ctaInicial, :ctaFinal, :fecIni, :fecVen, :orden)}", nativeQuery = true)
    List<Map<String, Object>> swListarPlanoPACD(@Param("opcion") int opcion,
                                 @Param("cia") String cia,
                                 @Param("ejer") String ejer,
                                 @Param("periodo") String periodo,
                                 @Param("info") String info,
                                 @Param("tipoAnexo") String tipoAnexo,
                                 @Param("codAnexoInicial") String codAnexoInicial,
                                 @Param("codAnexoFinal") String codAnexoFinal,
                                 @Param("ctaInicial") String ctaInicial,
                                 @Param("ctaFinal") String ctaFinal,
                                 @Param("fecIni") String fecIni,
                                 @Param("fecVen") String fecVen,
                                 @Param("orden") String orden
    );
}
