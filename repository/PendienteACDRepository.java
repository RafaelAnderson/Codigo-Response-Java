package com.empresa.repository;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoDetV;
import com.empresa.entity.lcoDetVPk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PendienteACDRepository extends JpaRepository<lcoDetV, lcoDetVPk> {
    @Query(value = "{call SP_ListarPendACD(:opcion, :cia, :ejercicio, :periodo, :info, :anex, :codanexini, :codanexfin, :ctaini, :ctafin, :orden)}", nativeQuery = true)
    List<Map<String, Object>> swListarPendACD(
        @Param("opcion") int opcion,
        @Param("cia") String cia,
        @Param("ejercicio") String ejercicio,
        @Param("periodo") String periodo,
        @Param("info") String info,
        @Param("anex") String anex,
        @Param("codanexini") String codanexini,
        @Param("codanexfin") String codanexfin,
        @Param("ctaini") String ctaini,
        @Param("ctafin") String ctafin,
        @Param("orden") String orden
    );
    
    // @Query(value = "{call SP_ListarResuPACD(:opcion, :cia, :ejercicio, :periodo, :info, :anex, :codanexini, :codanexfin, :ctaini, :ctafin, :orden)}", nativeQuery = true)
    // List<Map<String, Object>> swListarResuPACD(
    //     @Param("opcion") int opcion,
    //     @Param("cia") String cia,
    //     @Param("ejercicio") String ejercicio,
    //     @Param("periodo") String periodo,
    //     @Param("info") String info,
    //     @Param("anex") String anex,
    //     @Param("codanexini") String codanexini,
    //     @Param("codanexfin") String codanexfin,
    //     @Param("ctaini") String ctaini,
    //     @Param("ctafin") String ctafin,
    //     @Param("orden") String orden
    // );

        
    // @Query(value = "{call SP_ListarPlanoPACD(:opcion, :cia, :ejercicio, :periodo, :info, :anex, :codanexini, :codanexfin, :ctaini, :ctafin, :orden)}", nativeQuery = true)
    // List<Map<String, Object>> swListarPlanoPACD(
    //     @Param("opcion") int opcion,
    //     @Param("cia") String cia,
    //     @Param("ejercicio") String ejercicio,
    //     @Param("periodo") String periodo,
    //     @Param("info") String info,
    //     @Param("anex") String anex,
    //     @Param("codanexini") String codanexini,
    //     @Param("codanexfin") String codanexfin,
    //     @Param("ctaini") String ctaini,
    //     @Param("ctafin") String ctafin,
    //     @Param("orden") String orden
    // );
}
