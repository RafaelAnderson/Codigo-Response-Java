package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.lcoCabV;
import com.empresa.entity.lcoCabVPk;

@Repository
public interface lcoCabVRepository extends JpaRepository<lcoCabV, lcoCabVPk> {
        @Query(value = "{call SP_Num_Real_V2(:opcion, :p_codcia,:anio,:mes,:ejercicio,:cl_subdia,:cl_compro,:cl_tipo,:cl_feccom,:cl_moneda,:cl_tctipo,"
                        + ":cl_tcimporte,:cl_tcfecha,:cl_glosa,:cl_estado,:cl_totvouc,"
                        + ":cl_origen,:cl_flagconv,:cl_form,:cl_extor,:cl_usrcrea,:cl_fecCrea,:cl_hracrea,:cl_usract,:cl_fecact,:cl_hraact )}", nativeQuery = true)

        List<Object[]> listUltimoNumReaV2(
                        @Param("opcion") int opcion,
                        @Param("p_codcia") String p_codcia,
                        @Param("anio") String anio,
                        @Param("mes") String mes,
                        @Param("ejercicio") String ejercicio,

                        @Param("cl_subdia") String cl_subdia,
                        @Param("cl_compro") String cl_compro,
                        @Param("cl_tipo") String cl_tipo,
                        @Param("cl_feccom") LocalDate cl_feccom,
                        @Param("cl_moneda") String cl_moneda,
                        @Param("cl_tctipo") String cl_tctipo,
                        @Param("cl_tcimporte") Double cl_tcimporte,
                        @Param("cl_tcfecha") LocalDate cl_tcfecha,
                        @Param("cl_glosa") String cl_glosa,
                        @Param("cl_estado") String cl_estado,
                        @Param("cl_totvouc") Double cl_totvouc,
                        @Param("cl_origen") String cl_origen,
                        @Param("cl_flagconv") String cl_flagconv,
                        @Param("cl_form") String cl_form,
                        @Param("cl_extor") String cl_extor,
                        @Param("cl_usrcrea") String cl_usrcrea,
                        @Param("cl_fecCrea") LocalDate cl_fecCrea,
                        @Param("cl_hracrea") LocalTime cl_hracrea,
                        @Param("cl_usract") String cl_usract,
                        @Param("cl_fecact") LocalDate cl_fecact,
                        @Param("cl_hraact") LocalTime cl_hraact

        );

        @Query(value = "{call SP_CrudLcoCabV(:opcion, :p_codcia,:anio ,:cl_subdia, :cl_compro," +
                        " :cl_tipo, :cl_feccom, :cl_moneda, :cl_tctipo, :cl_tcimporte, :cl_tcfecha," +
                        " :cl_glosa, :cl_estado, :cl_totvouc, :cl_origen, :cl_flagconv, :cl_form, :cl_extor," +
                        " :cl_usrcrea, :cl_fecCrea, :cl_hracrea, :cl_usract, :cl_fecact, :cl_hraact)}", nativeQuery = true)
        List<lcoCabV> lista(@Param("opcion") int opcion,
                        @Param("p_codcia") String p_codcia,
                        @Param("anio") String anio,
                        @Param("cl_subdia") String cl_subdia,
                        @Param("cl_compro") String cl_compro,
                        @Param("cl_tipo") String cl_tipo,
                        @Param("cl_feccom") LocalDate cl_feccom,
                        @Param("cl_moneda") String cl_moneda,
                        @Param("cl_tctipo") String cl_tctipo,
                        @Param("cl_tcimporte") Double cl_tcimporte,
                        @Param("cl_tcfecha") LocalDate cl_tcfecha,
                        @Param("cl_glosa") String cl_glosa,
                        @Param("cl_estado") String cl_estado,
                        @Param("cl_totvouc") Double cl_totvouc,
                        @Param("cl_origen") String cl_origen,
                        @Param("cl_flagconv") String cl_flagconv,
                        @Param("cl_form") String cl_form,
                        @Param("cl_extor") String cl_extor,
                        @Param("cl_usrcrea") String cl_usrcrea,
                        @Param("cl_fecCrea") LocalDate cl_fecCrea,
                        @Param("cl_hracrea") LocalTime cl_hracrea,
                        @Param("cl_usract") String cl_usract,
                        @Param("cl_fecact") LocalDate cl_fecact,
                        @Param("cl_hraact") LocalTime cl_hraact);

        @Query(value = "{call SP_CrudLcoCabV(:opcion, :p_codcia,:anio ,:cl_subdia, :cl_compro," +
                        " :cl_tipo, :cl_feccom, :cl_moneda, :cl_tctipo, :cl_tcimporte, :cl_tcfecha," +
                        " :cl_glosa, :cl_estado, :cl_totvouc, :cl_origen, :cl_flagconv, :cl_form, :cl_extor," +
                        " :cl_usrcrea, :cl_fecCrea, :cl_hracrea, :cl_usract, :cl_fecact, :cl_hraact)}", nativeQuery = true)
        @Modifying
        @Transactional
        void transaccional(@Param("opcion") int opcion, @Param("p_codcia") String p_codcia, @Param("anio") String anio,
                        @Param("cl_subdia") String cl_subdia,
                        @Param("cl_compro") String cl_compro,
                        @Param("cl_tipo") String cl_tipo,
                        @Param("cl_feccom") LocalDate cl_feccom,
                        @Param("cl_moneda") String cl_moneda,
                        @Param("cl_tctipo") String cl_tctipo,
                        @Param("cl_tcimporte") Double cl_tcimporte,
                        @Param("cl_tcfecha") LocalDate cl_tcfecha,
                        @Param("cl_glosa") String cl_glosa,
                        @Param("cl_estado") String cl_estado,
                        @Param("cl_totvouc") Double cl_totvouc,
                        @Param("cl_origen") String cl_origen,
                        @Param("cl_flagconv") String cl_flagconv,
                        @Param("cl_form") String cl_form,
                        @Param("cl_extor") String cl_extor,
                        @Param("cl_usrcrea") String cl_usrcrea,
                        @Param("cl_fecCrea") LocalDate cl_fecCrea,
                        @Param("cl_hracrea") LocalTime cl_hracrea,
                        @Param("cl_usract") String cl_usract,
                        @Param("cl_fecact") LocalDate cl_fecact,
                        @Param("cl_hraact") LocalTime cl_hraact);

        @Query(value = "{call SP_CrudLcoCabV(:opcion, :p_codcia,:anio ,:cl_subdia, :cl_compro," +
                        " :cl_tipo, :cl_feccom, :cl_moneda, :cl_tctipo, :cl_tcimporte, :cl_tcfecha," +
                        " :cl_glosa, :cl_estado, :cl_totvouc, :cl_origen, :cl_flagconv, :cl_form, :cl_extor," +
                        " :cl_usrcrea, :cl_fecCrea, :cl_hracrea, :cl_usract, :cl_fecact, :cl_hraact, :dl_subdia,:dl_compro, :dl_secue, :dl_feccom, :dl_cuenta, :dl_tpanex,:dl_cdanex, :dl_cencst, :dl_dh, :dl_tpdoc, :dl_nmdoc,:dl_fecdoc, :dl_fecven, :dl_tipcam, :dl_glosa,:dl_codmnd, :dl_importe, :dl_impmn, :dl_impme, :dl_tpanex2,:dl_cdanex2, :dl_medpag, :dl_tpdocrf, :dl_nmdocrf, :dl_fecdocrf,:dl_tptasa, :dl_imptas, :dl_impbmn, :dl_impbme, :dl_area,:dl_ctaorig, :dl_tipcmp, :dl_flag, :dl_mndcc, :dl_colcc,:dl_impbicc, :dl_inafcc, :dl_igvcc, :dl_tpcnvcc, :dl_flagcc,:dl_cdanexcc, :dl_tpanexcc, :dl_numdocc, :dl_estdc, :dl_cantc,:dl_cdmonc, :dl_impc, :dl_fecconc, :dl_nroconc, :dl_proconc,:dl_nunest, :dl_itemc, :dl_imptbc, :dl_anioc, :dl_usrcrea,:dl_fecCrea, :dl_hracrea, :dl_usract, :dl_fecact, :dl_hraact,:dl_datref,:dl_docser,:dl_docnum,:dl_docserf,:dl_docnumf)}", nativeQuery = true)
        List<Object[]> listar2(@Param("opcion") int opcion,
                        @Param("p_codcia") String p_codcia,
                        @Param("anio") String anio,
                        @Param("cl_subdia") String cl_subdia,
                        @Param("cl_compro") String cl_compro,
                        @Param("cl_tipo") String cl_tipo,
                        @Param("cl_feccom") LocalDate cl_feccom,
                        @Param("cl_moneda") String cl_moneda,
                        @Param("cl_tctipo") String cl_tctipo,
                        @Param("cl_tcimporte") Double cl_tcimporte,
                        @Param("cl_tcfecha") LocalDate cl_tcfecha,
                        @Param("cl_glosa") String cl_glosa,
                        @Param("cl_estado") String cl_estado,
                        @Param("cl_totvouc") Double cl_totvouc,
                        @Param("cl_origen") String cl_origen,
                        @Param("cl_flagconv") String cl_flagconv,
                        @Param("cl_form") String cl_form,
                        @Param("cl_extor") String cl_extor,
                        @Param("cl_usrcrea") String cl_usrcrea,
                        @Param("cl_fecCrea") LocalDate cl_fecCrea,
                        @Param("cl_hracrea") LocalTime cl_hracrea,
                        @Param("cl_usract") String cl_usract,
                        @Param("cl_fecact") LocalDate cl_fecact,
                        @Param("cl_hraact") LocalTime cl_hraact,

                        @Param("dl_subdia") String dl_subdia,
                        @Param("dl_compro") String dl_compro, @Param("dl_secue") String dl_secue,
                        @Param("dl_feccom") LocalDate dl_feccom,
                        @Param("dl_cuenta") String dl_cuenta, @Param("dl_tpanex") String dl_tpanex,
                        @Param("dl_cdanex") String dl_cdanex, @Param("dl_cencst") String dl_cencst,
                        @Param("dl_dh") String dl_dh, @Param("dl_tpdoc") String dl_tpdoc,
                        @Param("dl_nmdoc") String dl_nmdoc, @Param("dl_fecdoc") LocalDate dl_fecdoc,
                        @Param("dl_fecven") LocalDate dl_fecven, @Param("dl_tipcam") Double dl_tipcam,
                        @Param("dl_glosa") String dl_glosa, @Param("dl_codmnd") String dl_codmnd,
                        @Param("dl_importe") Double dl_importe, @Param("dl_impmn") Double dl_impmn,
                        @Param("dl_impme") Double dl_impme,
                        @Param("dl_tpanex2") String dl_tpanex2,
                        @Param("dl_cdanex2") String dl_cdanex2,
                        @Param("dl_medpag") String dl_medpag,
                        @Param("dl_tpdocrf") String dl_tpdocrf,
                        @Param("dl_nmdocrf") String dl_nmdocrf,
                        @Param("dl_fecdocrf") LocalDate dl_fecdocrf,
                        @Param("dl_tptasa") String cl_itmp1,
                        @Param("dl_imptas") Double dl_imptas,
                        @Param("dl_impbmn") Double dl_impbmn,
                        @Param("dl_impbme") Double dl_impbme,
                        @Param("dl_area") String dl_area,
                        @Param("dl_ctaorig") String dl_ctaorig,
                        @Param("dl_tipcmp") String dl_tipcmp,
                        @Param("dl_flag") String dl_flag,
                        @Param("dl_mndcc") String dl_mndcc,
                        @Param("dl_colcc") String dl_colcc,
                        @Param("dl_impbicc") Double cl_tipcmp,
                        @Param("dl_inafcc") Double dl_inafcc,
                        @Param("dl_igvcc") Double dl_igvcc,
                        @Param("dl_tpcnvcc") String dl_tpcnvcc,
                        @Param("dl_flagcc") String dl_flagcc,
                        @Param("dl_cdanexcc") String dl_cdanexcc,
                        @Param("dl_tpanexcc") String dl_tpanexcc,
                        @Param("dl_numdocc") String dl_numdocc,
                        @Param("dl_estdc") String dl_estdc,
                        @Param("dl_cantc") Double dl_cantc,
                        @Param("dl_cdmonc") String dl_cdmonc,
                        @Param("dl_impc") Double dl_impc,
                        @Param("dl_fecconc") LocalDate dl_fecconc,
                        @Param("dl_nroconc") String dl_nroconc,
                        @Param("dl_proconc") LocalDate dl_proconc,
                        @Param("dl_nunest") String dl_nunest,
                        @Param("dl_itemc") String dl_itemc,
                        @Param("dl_imptbc") Double dl_imptbc,
                        @Param("dl_anioc") String dl_anioc,
                        @Param("dl_usrcrea") String dl_usrcrea,
                        @Param("dl_fecCrea") LocalDate dl_fecCrea,
                        @Param("dl_hracrea") LocalTime dl_hracrea,
                        @Param("dl_usract") String dl_usract,
                        @Param("dl_fecact") LocalDate dl_fecact,
                        @Param("dl_hraact") LocalTime dl_hraact,
                        @Param("dl_datref") String dl_datref,
                        @Param("dl_docser") String dl_docser,
                        @Param("dl_docnum") String dl_docnum,
                        @Param("dl_docserf") String dl_docserf,
                        @Param("dl_docnumf") String dl_docnumf);

        @Query(value = "{call SP_CrudLcoCabV(:opcion, :cia, :anio ,:cl_subdia, :cl_compro)}", nativeQuery = true)
        List<Object[]> listar3(@Param("opcion") int opcion,
                        @Param("cia") String p_codcia,
                        @Param("anio") String anio,
                        @Param("cl_subdia") String cl_subdia,
                        @Param("cl_compro") String cl_compro

        );

        @Query(value = "{call SP_EntreAsiento(:opcion, :p_codcia,:anio ,:cl_subdia, :cl_compro, :cl_compro2, :cl_estado)}", nativeQuery = true)
        @Modifying
        @Transactional
        List<lcoCabV> EntreAsientos(@Param("opcion") int opcion,
                        @Param("p_codcia") String p_codcia,
                        @Param("anio") String anio,
                        @Param("cl_subdia") String cl_subdia,
                        @Param("cl_compro") String cl_compro,
                        @Param("cl_compro2") String cl_compro2,
                        @Param("cl_estado") String cl_estado);

        /* Cambio de nombre al Procedimiento */
        @Query(value = "{call TotalImporte_SP(:p_codcia,:anio , :dl_subdia, :dl_compro)}", nativeQuery = true)
        @Modifying
        @Transactional
        List<Object[]> TotalImporte(
                        @Param("p_codcia") String p_codcia,
                        @Param("anio") String anio,
                        @Param("dl_subdia") String dl_subdia,
                        @Param("dl_compro") String dl_compro);

        @Query(value = "{call SP_Libro_Mayor(:cia,:ejer,:per,:CTAINI,:CTAFIN,:option)}", nativeQuery = true)
        List<Map<String, Object>> ListarLibroMayor(
                        @Param("cia") String cia,
                        @Param("ejer") String ejer,
                        @Param("per") String per,
                        @Param("CTAINI") String CTAINI,
                        @Param("CTAFIN") String CTAFIN,
                        @Param("option") String option);

        @Query(value = "{call sp_sgteSecAsi(:cia, :ejer, :pSD, :pMes, :pAnio)}", nativeQuery = true)
        List<Map<String, Object>> generarAsiento(
                @Param("cia") String cia,
                @Param("ejer") String ejer,
                @Param("pSD") String pSD,
                @Param("pMes") String pMes,
                @Param("pAnio") String pAnio
        );

        @Query(value = "{call sp_RepCst(:_ejer, :_cia,  :periodo_ini, :periodo_fin, :_mnd, :codCstIni, :codCstFin, :tpAnx, :cdAnx, :_quie1, :_quie2, :_quie3)}", nativeQuery = true)
        List<Map<String, Object[]>> swRepCst(@Param("_ejer") String _ejer,
                                            @Param("_cia") String _cia, 
                                            @Param("periodo_ini") String periodo_ini ,
                                            @Param("periodo_fin") String periodo_fin,
                                            @Param("_mnd") String _mnd,
                                            @Param("codCstIni") String codCstIni,
                                            @Param("codCstFin") String codCstFin,
                                            @Param("tpAnx") String tpAnx,
                                            @Param("cdAnx") String cdAnx,
                                            @Param("_quie1") String _quie1,
                                            @Param("_quie2") String _quie2,
                                            @Param("_quie3") String _quie3);

        @Query(value = "{call Actualiza_SBAL(:mes, :cia, :periodo, :ejercicio)}", nativeQuery = true)
        @Modifying
        @Transactional
        void actualizarBalance(
                @Param("mes") String mes,
                @Param("cia") String cia,
                @Param("periodo") String periodo,
                @Param("ejercicio") String ejercicio
        );

}
