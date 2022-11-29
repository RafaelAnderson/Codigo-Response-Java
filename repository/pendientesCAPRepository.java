package com.empresa.repository;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoDetV;
import com.empresa.entity.lcoDetVPk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface pendientesCAPRepository extends JpaRepository<lcoDetV, lcoDetVPk>{ 
    @Query(value = "{call SP_PendientesCAP(:opcion, :p_ciacont, :ejercicio, :periodo, :info, :anex, :CtaInicial, :CtaFinal, :AnexIni, :AnexFin, :CstIni, :CstFin, :fecIni, :fecVen, :orden)}", nativeQuery = true)
    List<Map<String, Object>> swListarPendCAD(@Param("opcion") int opcion,
                                @Param("p_ciacont") String p_ciacont,
                                @Param("ejercicio") String ejercicio,
                                @Param("periodo") String periodo,
                                @Param("info") String info,
                                @Param("anex") String anex,
                                @Param("CtaInicial") String CtaInicial,
                                @Param("CtaFinal") String CtaFinal,
                                @Param("AnexIni") String AnexIni,
                                @Param("AnexFin") String AnexFin,
                                @Param("CstIni") String CstIni,
                                @Param("CstFin") String CstFin,
                                @Param("fecIni") String fecIni,
                                @Param("fecVen") String fecVen,
                                @Param("orden") String orden
    ); 

    @Query(value = "{call SP_PendientesCAP(:opcion, :p_ciacont, :ejercicio, :periodo, :info, :anex, :CtaInicial, :CtaFinal, :AnexIni, :AnexFin, :CstIni, :CstFin, :fecIni, :fecVen, :orden)}", nativeQuery = true)
    List<Map<String, Object>> swListarResuPCAD(@Param("opcion") int opcion,
                                @Param("p_ciacont") String p_ciacont,
                                @Param("ejercicio") String ejercicio,
                                @Param("periodo") String periodo,
                                @Param("info") String info,
                                @Param("anex") String anex,
                                @Param("CtaInicial") String CtaInicial,
                                @Param("CtaFinal") String CtaFinal,
                                @Param("AnexIni") String AnexIni,
                                @Param("AnexFin") String AnexFin,
                                @Param("CstIni") String CstIni,
                                @Param("CstFin") String CstFin,
                                @Param("fecIni") String fecIni,
                                @Param("fecVen") String fecVen,
                                @Param("orden") String orden
    ); 

    @Query(value = "{call SP_PendientesCAP(:opcion, :p_ciacont, :ejercicio, :periodo, :info, :anex, :CtaInicial, :CtaFinal, :AnexIni, :AnexFin, :CstIni, :CstFin, :fecIni, :fecVen, :orden)}", nativeQuery = true)
    List<Map<String, Object>> swListarPlanoPCAD(@Param("opcion") int opcion,
                                @Param("p_ciacont") String p_ciacont,
                                @Param("ejercicio") String ejercicio,
                                @Param("periodo") String periodo,
                                @Param("info") String info,
                                @Param("anex") String anex,
                                @Param("CtaInicial") String CtaInicial,
                                @Param("CtaFinal") String CtaFinal,
                                @Param("AnexIni") String AnexIni,
                                @Param("AnexFin") String AnexFin,
                                @Param("CstIni") String CstIni,
                                @Param("CstFin") String CstFin,
                                @Param("fecIni") String fecIni,
                                @Param("fecVen") String fecVen,
                                @Param("orden") String orden
    ); 

    @Query(value = "{call SP_PendientesCAP(:opcion, :p_ciacont, :ejercicio, :periodo, :info, :anex, :CtaInicial, :CtaFinal, :AnexIni, :AnexFin, :CstIni, :CstFin, :fecIni, :fecVen, :orden)}", nativeQuery = true)
    List<Map<String, Object>> ultAnexo(@Param("opcion") int opcion,
                                @Param("p_ciacont") String p_ciacont,
                                @Param("ejercicio") String ejercicio,
                                @Param("periodo") String periodo,
                                @Param("info") String info,
                                @Param("anex") String anex,
                                @Param("CtaInicial") String CtaInicial,
                                @Param("CtaFinal") String CtaFinal,
                                @Param("AnexIni") String AnexIni,
                                @Param("AnexFin") String AnexFin,
                                @Param("CstIni") String CstIni,
                                @Param("CstFin") String CstFin,
                                @Param("fecIni") String fecIni,
                                @Param("fecVen") String fecVen,
                                @Param("orden") String orden
    ); 

    @Query(value = "{call SP_PendientesCAP(:opcion, :p_ciacont, :ejercicio, :periodo, :info, :anex, :CtaInicial, :CtaFinal, :AnexIni, :AnexFin, :CstIni, :CstFin, :fecIni, :fecVen, :orden)}", nativeQuery = true)
    List<Map<String, Object>> ultCuenta(@Param("opcion") int opcion,
                                @Param("p_ciacont") String p_ciacont,
                                @Param("ejercicio") String ejercicio,
                                @Param("periodo") String periodo,
                                @Param("info") String info,
                                @Param("anex") String anex,
                                @Param("CtaInicial") String CtaInicial,
                                @Param("CtaFinal") String CtaFinal,
                                @Param("AnexIni") String AnexIni,
                                @Param("AnexFin") String AnexFin,
                                @Param("CstIni") String CstIni,
                                @Param("CstFin") String CstFin,
                                @Param("fecIni") String fecIni,
                                @Param("fecVen") String fecVen,
                                @Param("orden") String orden
    ); 

    @Query(value = "{call SP_PendientesCAP(:opcion, :p_ciacont, :ejercicio, :periodo, :info, :anex, :CtaInicial, :CtaFinal, :AnexIni, :AnexFin, :CstIni, :CstFin, :fecIni, :fecVen, :orden)}", nativeQuery = true)
    List<Map<String, Object>> ultCosto(@Param("opcion") int opcion,
                                @Param("p_ciacont") String p_ciacont,
                                @Param("ejercicio") String ejercicio,
                                @Param("periodo") String periodo,
                                @Param("info") String info,
                                @Param("anex") String anex,
                                @Param("CtaInicial") String CtaInicial,
                                @Param("CtaFinal") String CtaFinal,
                                @Param("AnexIni") String AnexIni,
                                @Param("AnexFin") String AnexFin,
                                @Param("CstIni") String CstIni,
                                @Param("CstFin") String CstFin,
                                @Param("fecIni") String fecIni,
                                @Param("fecVen") String fecVen,
                                @Param("orden") String orden
    ); 
}
