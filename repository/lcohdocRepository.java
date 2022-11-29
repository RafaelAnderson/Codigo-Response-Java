package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import java.util.List;
import java.util.Map;
import com.empresa.entity.lcohdoc;
import com.empresa.entity.lcohdocPk;

public interface lcohdocRepository extends JpaRepository<lcohdoc, lcohdocPk> {

        @Transactional
        @Modifying
        @Query(value = "{call SP_PDT_Honorarios(:opcion, :periodo,:usu, :cia, :ejer, :orden, :codAnexo, :tipoDoc, :serDoc, :numDoc, :perSaldo)}", nativeQuery = true)
        void swCargaDocHon(
                        @Param("opcion") int opcion,
                        @Param("periodo") String periodo,
                        @Param("usu") String usu,
                        @Param("cia") String cia,
                        @Param("ejer") String ejer,
                        @Param("orden") String orden,
                        @Param("codAnexo") String codAnexo,
                        @Param("tipoDoc") String tipoDoc,
                        @Param("serDoc") String serDoc,
                        @Param("numDoc") String numDoc,
                        @Param("perSaldo") String perSaldo);

        @Query(value = "{call SP_PDT_Honorarios(:opcion, :periodo,:usu, :cia, :ejer, :orden, :codAnexo, :tipoDoc, :serDoc, :numDoc, :perSaldo)}", nativeQuery = true)
        @Transactional
        @Modifying
        void swCargaProvHon(
                        @Param("opcion") int opcion,
                        @Param("periodo") String periodo,
                        @Param("usu") String usu,
                        @Param("cia") String cia,
                        @Param("ejer") String ejer,
                        @Param("orden") String orden,
                        @Param("codAnexo") String codAnexo,
                        @Param("tipoDoc") String tipoDoc,
                        @Param("serDoc") String serDoc,
                        @Param("numDoc") String numDoc,
                        @Param("perSaldo") String perSaldo);

        @Query(value = "{call SP_PDT_Honorarios(:opcion, :periodo,:usu, :cia, :ejer, :orden, :codAnexo, :tipoDoc, :serDoc, :numDoc, :perSaldo)}", nativeQuery = true)
        List<Map<String, Object[]>> swListarHonDoc(
                        @Param("opcion") int opcion,
                        @Param("periodo") String periodo,
                        @Param("usu") String usu,
                        @Param("cia") String cia,
                        @Param("ejer") String ejer,
                        @Param("orden") String orden,
                        @Param("codAnexo") String codAnexo,
                        @Param("tipoDoc") String tipoDoc,
                        @Param("serDoc") String serDoc,
                        @Param("numDoc") String numDoc,
                        @Param("perSaldo") String perSaldo);

        @Query(value = "{call SP_PDT_Honorarios(:opcion, :periodo,:usu, :cia, :ejer, :orden, :codAnexo, :tipoDoc, :serDoc, :numDoc, :perSaldo)}", nativeQuery = true)
        List<Map<String, Object[]>> swListarHonDeta(
                        @Param("opcion") int opcion,
                        @Param("periodo") String periodo,
                        @Param("usu") String usu,
                        @Param("cia") String cia,
                        @Param("ejer") String ejer,
                        @Param("orden") String orden,
                        @Param("codAnexo") String codAnexo,
                        @Param("tipoDoc") String tipoDoc,
                        @Param("serDoc") String serDoc,
                        @Param("numDoc") String numDoc,
                        @Param("perSaldo") String perSaldo);

        @Query(value = "{call SP_PDT_Honorarios(:opcion, :periodo,:usu, :cia, :ejer, :orden, :codAnexo, :tipoDoc, :serDoc, :numDoc, :perSaldo)}", nativeQuery = true)
        List<Map<String, Object[]>> swListarHonDetaTotal(
                        @Param("opcion") int opcion,
                        @Param("periodo") String periodo,
                        @Param("usu") String usu,
                        @Param("cia") String cia,
                        @Param("ejer") String ejer,
                        @Param("orden") String orden,
                        @Param("codAnexo") String codAnexo,
                        @Param("tipoDoc") String tipoDoc,
                        @Param("serDoc") String serDoc,
                        @Param("numDoc") String numDoc,
                        @Param("perSaldo") String perSaldo);

        @Query(value = "{call SP_PDT_Honorarios(:opcion, :periodo,:usu, :cia, :ejer, :orden, :codAnexo, :tipoDoc, :serDoc, :numDoc, :perSaldo)}", nativeQuery = true)
        List<Map<String, Object[]>> swListarFormato07(
                        @Param("opcion") int opcion,
                        @Param("periodo") String periodo,
                        @Param("usu") String usu,
                        @Param("cia") String cia,
                        @Param("ejer") String ejer,
                        @Param("orden") String orden,
                        @Param("codAnexo") String codAnexo,
                        @Param("tipoDoc") String tipoDoc,
                        @Param("serDoc") String serDoc,
                        @Param("numDoc") String numDoc,
                        @Param("perSaldo") String perSaldo);

        @Query(value = "{call SP_PDT_Honorarios(:opcion, :periodo,:usu, :cia, :ejer, :orden, :codAnexo, :tipoDoc, :serDoc, :numDoc, :perSaldo)}", nativeQuery = true)
        List<Map<String, Object[]>> swListarFormato20(
                        @Param("opcion") int opcion,
                        @Param("periodo") String periodo,
                        @Param("usu") String usu,
                        @Param("cia") String cia,
                        @Param("ejer") String ejer,
                        @Param("orden") String orden,
                        @Param("codAnexo") String codAnexo,
                        @Param("tipoDoc") String tipoDoc,
                        @Param("serDoc") String serDoc,
                        @Param("numDoc") String numDoc,
                        @Param("perSaldo") String perSaldo);

        @Query(value = "{call SP_EstadoFlujoEfectivo(:periodo, :cia,:ejer, :FRM)}", nativeQuery = true)
        List<Map<String, Object[]>> swReportEstFluEfec(
                        @Param("periodo") String periodo,
                        @Param("cia") String cia,
                        @Param("ejer") String ejer,
                        @Param("FRM") String FRM);

}