package com.empresa.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.lcoauxxml;

@Repository
public interface lcoauxxmlRepository extends JpaRepository<lcoauxxml, Integer> {
    
    
    @Query(value = "{call SP_GetCabeceraByCompro(:cia, :ejer, :compro)}", nativeQuery = true)
    List<Map<String, Object[]>> sw_GetCabecerasByCompro(
        @Param("cia") String cia,
        @Param("ejer") String ejer,
        @Param("compro") String tmpd_compro);

    @Query(value = "{call SP_ListarDocXML(:cia, :ejer)}", nativeQuery = true)
    List<lcoauxxml> sw_ListarDocXML(
        @Param("cia") String cia,
        @Param("ejer") String ejer 
    );

    @Query(value = "{call SP_CvtDocXML(:cia, :ejer)}", nativeQuery = true)
    @Modifying
    @Transactional
    void sw_CvtDocXML(
        @Param("cia") String cia,
        @Param("ejer") String ejer 
    );

    @Query(value = "{call SP_InsertTableDocXML(:cia, :ejer,:auxFecDoc  ,:auxFecVen  ,:auxTdoc  ,:auxSdoc  ,:auxNdoc,:auxTiden  ,:auxNiden  ,:auxRazSoc  ,:auxMnd  ,:auxOpeGrav,"
        + ":auxOpeExp  ,:auxOpeIna  ,:auxOpeExo  ,:auxIpercep  ,:auxDpercep  ,:auxIgv  ,:auxIvap  ,:auxIcbp  ,:auxIsc  ,:auxIrenta,"
        + ":auxOtros  ,:auxTdsct  ,:auxTotal  ,:auxTipDet  ,:auxNroDet  ,:auxFecDet  ,:auxTasDet  ,:auxImpDet  ,:auxBasDet  ,:auxTdocrf,"
        + ":auxSdocrf  ,:auxNdocrf  ,:auxFdocrf  ,:auxDirecc  ,:auxDdistr  ,:auxDprov  ,:auxDdepr  ,:auxUbigeo,:auxSD ,:auxCtaPag ,:auxCtaCmp ,:auxCcst ,:auxAnxPrin ,:auxAnxAux ,:auxNomXML)}", nativeQuery = true)
    @Modifying
    @Transactional
    List<Map<String, Object[]>> sw_InsertTableDocXML(
        @Param("cia") String cia,
        @Param("ejer") String ejer,
        @Param("auxFecDoc") LocalDate auxFecDoc, 
        @Param("auxFecVen") LocalDate auxFecVen, 
        @Param("auxTdoc") String auxTdoc,
        @Param("auxSdoc") String auxSdoc,
        @Param("auxNdoc") String auxNdoc,
        @Param("auxTiden") String auxTiden,
        @Param("auxNiden") String auxNiden,
        @Param("auxRazSoc") String auxRazSoc,
        @Param("auxMnd") String auxMnd,
        @Param("auxOpeGrav") Double auxOpeGrav,
        @Param("auxOpeExp") Double auxOpeExp,
        @Param("auxOpeIna") Double auxOpeIna,
        @Param("auxOpeExo") Double auxOpeExo,
        @Param("auxIpercep") Double auxIpercep,
        @Param("auxDpercep") String auxDpercep,
        @Param("auxIgv") Double auxIgv,
        @Param("auxIvap") Double auxIvap,
        @Param("auxIcbp") Double auxIcbp,
        @Param("auxIsc") Double auxIsc,
        @Param("auxIrenta") Double auxIrenta,
        @Param("auxOtros") Double auxOtros,
        @Param("auxTdsct") Double auxTdsct,
        @Param("auxTotal") Double auxTotal,
        @Param("auxTipDet") String auxTipDet,
        @Param("auxNroDet") String auxNroDet,
        @Param("auxFecDet") LocalDate auxFecDet,
        @Param("auxTasDet") Double auxTasDet,
        @Param("auxImpDet") Double auxImpDet,
        @Param("auxBasDet") Double auxBasDet,
        @Param("auxTdocrf") String auxTdocrf,
        @Param("auxSdocrf") String auxSdocrf,
        @Param("auxNdocrf") String auxNdocrf,
        @Param("auxFdocrf") LocalDate auxFdocrf,
        @Param("auxDirecc") String auxDirecc,
        @Param("auxDdistr") String auxDdistr,
        @Param("auxDprov") String auxDprov,
        @Param("auxDdepr") String auxDdepr,
        @Param("auxUbigeo") String auxUbigeo,
        @Param("auxSD") String auxSD,
        @Param("auxCtaPag") String auxCtaPag,
        @Param("auxCtaCmp") String auxCtaCmp,
        @Param("auxCcst") String auxCcst,
        @Param("auxAnxPrin") String auxAnxPrin,
        @Param("auxAnxAux") String auxAnxAux,
        @Param("auxNomXML") String auxNomXML
    );

    @Query(value = "{call SP_ListarTblXML(:cia, :ejer)}", nativeQuery = true)
    List<lcoauxxml> sw_ListarTblXml(
        @Param("cia") String cia,
        @Param("ejer") String ejer 
    );


    // Retorno objeto con campos: SD, CTAMN, CTAME
    @Query(value = "{call SP_BscParVtaXml(:cia, :tdoc, :sdoc)}", nativeQuery = true)
    List<Map<String, Object[]>> sw_BscParVtaXml(
        @Param("cia") String cia,
        @Param("tdoc") String tdoc,
        @Param("sdoc") String sdoc
    );

    // Objeto con campos: cl_itmp1
    @Query(value = "{call SP_BscCtaGraXml(:cia)}", nativeQuery = true)
    List<Map<String, Object[]>> sw_BscCtaGraXml(
        @Param("cia") String cia
    );

    // Objeto con campos: cl_itmp1
    @Query(value = "{call SP_BscCtaNGraXml (:cia)}", nativeQuery = true)
    List<Map<String, Object[]>> sw_BscCtaNGraXml (
        @Param("cia") String cia
    );

    // Objeto con campos: cl_itmp1
    @Query(value = "{call SP_BscCtaExoXml (:cia)}", nativeQuery = true)
    List<Map<String, Object[]>> sw_BscCtaExoXml (
        @Param("cia") String cia
    );

    @Query(value = "{call SP_CreaDetaAstTmpXml (:cia,:ejer ,:tmpd_subdia ,:tmpd_compro ,:tmpd_secue ,:tmpd_feccom ,:tmpd_cuenta ,:tmpd_tpanex ,"
        + ":tmpd_cdanex ,:tmpd_cencst ,:tmpd_dh ,:tmpd_tpdoc ,:tmpd_sedoc ,:tmpd_nmdoc ,:tmpd_fecdoc ,:tmpd_fecven ,:tmpd_tipcam ,:tmpd_glosa ,"
        + ":tmpd_codmnd ,:tmpd_importe ,:tmpd_impmn ,:tmpd_impme ,:tmpd_tpanex2 ,:tmpd_cdanex2 ,:tmpd_medpag ,:tmpd_tpdocrf ,:tmpd_nmdocrf ,"
        + ":tmpd_fecdocrf ,:tmpd_tptasa ,:tmpd_imptas ,:tmpd_impbmn ,:tmpd_impbme ,:tmpd_area ,:tmpd_tipcmp ,:tmpd_flag ,:tmpd_datref ,:tmpd_fluefec ,"
        + ":tmpd_fecdet ,:tmpd_nrodet ,:tmpd_secorig ,:tmpd_inafcc ,:tmpd_estdc )}", nativeQuery = true)
    @Modifying
    @Transactional
        void sw_CreaDetaAstTmpXml (
        @Param("cia") String cia,
        @Param("ejer") String ejer,
        @Param("tmpd_subdia") String tmpd_subdia,
        @Param("tmpd_compro") Integer tmpd_compro,
        @Param("tmpd_secue") String tmpd_secue,
        @Param("tmpd_feccom") LocalDate tmpd_feccom,
        @Param("tmpd_cuenta") String tmpd_cuenta, 
        @Param("tmpd_tpanex") String tmpd_tpanex,
        @Param("tmpd_cdanex") String tmpd_cdanex,
        @Param("tmpd_cencst") String tmpd_cencst,
        @Param("tmpd_dh") String tmpd_dh,
        @Param("tmpd_tpdoc") String tmpd_tpdoc,
        @Param("tmpd_sedoc") String tmpd_sedoc,
        @Param("tmpd_nmdoc") String tmpd_nmdoc,
        @Param("tmpd_fecdoc") LocalDate tmpd_fecdoc,
        @Param("tmpd_fecven") LocalDate tmpd_fecven,
        @Param("tmpd_tipcam") Double tmpd_tipcam,
        @Param("tmpd_glosa") String tmpd_glosa,
        @Param("tmpd_codmnd") String tmpd_codmnd,
        @Param("tmpd_importe") Double tmpd_importe,
        @Param("tmpd_impmn") Double tmpd_impmn,
        @Param("tmpd_impme") Double tmpd_impme,
        @Param("tmpd_tpanex2") String tmpd_tpanex2,
        @Param("tmpd_cdanex2") String tmpd_cdanex2,
        @Param("tmpd_medpag") String tmpd_medpag,
        @Param("tmpd_tpdocrf") String tmpd_tpdocrf,
        @Param("tmpd_nmdocrf") String tmpd_nmdocrf,
        @Param("tmpd_fecdocrf") LocalDate tmpd_fecdocrf,
        @Param("tmpd_tptasa") String tmpd_tptasa,
        @Param("tmpd_imptas") Double tmpd_imptas,
        @Param("tmpd_impbmn") Double tmpd_impbmn,
        @Param("tmpd_impbme") Double tmpd_impbme,
        @Param("tmpd_area") String tmpd_area,
        @Param("tmpd_tipcmp") String tmpd_tipcmp,
        @Param("tmpd_flag") String tmpd_flag,
        @Param("tmpd_datref") String tmpd_datref,
        @Param("tmpd_fluefec") String tmpd_fluefec,
        @Param("tmpd_fecdet") LocalDate tmpd_fecdet,
        @Param("tmpd_nrodet") String tmpd_nrodet,
        @Param("tmpd_secorig") String tmpd_secorig,
        @Param("tmpd_inafcc") Double tmpd_inafcc,
        @Param("tmpd_estdc") String tmpd_estdc
    );    

    @Query(value = "{call SP_CreaCabeAstTmpXml (:cia,:ejer ,:tmpc_subdia ,:tmpc_compro ,:tmpc_tipo ,:tmpc_feccom ,:tmpc_moneda ,:tmpc_tctipo , "
        + ":tmpc_tcimporte ,:tmpc_tcfecha ,:tmpc_glosa ,:tmpc_origen ,:tmpc_flagconv ,:tmpc_form ,:tmpc_extor ,:tmpc_ctaPag ,:tmpc_ctaCmp)}", nativeQuery = true)
    @Modifying
    @Transactional
        void sw_CreaCabeAstTmpXml (
        @Param("cia") String cia,
        @Param("ejer") String ejer,
        @Param("tmpc_subdia") String tmpc_subdia,
        @Param("tmpc_compro") String tmpc_compro,
        @Param("tmpc_tipo") String tmpc_tipo,
        @Param("tmpc_feccom") LocalDate tmpc_feccom,
        @Param("tmpc_moneda") String tmpc_moneda,
        @Param("tmpc_tctipo") String tmpc_tctipo,
        @Param("tmpc_tcimporte") Double tmpc_tcimporte,
        @Param("tmpc_tcfecha") LocalDate tmpc_tcfecha,
        @Param("tmpc_glosa") String tmpc_glosa,
        @Param("tmpc_origen") String tmpc_origen,
        @Param("tmpc_flagconv") String tmpc_flagconv,
        @Param("tmpc_form") String tmpc_form,
        @Param("tmpc_extor") String tmpc_extor,
        @Param("tmpc_ctaPag") String tmpc_ctaPag,
        @Param("tmpc_ctaCmp") String tmpc_ctaCmp
    );

    
    @Query(value = "{call SP_ActCabeAsientoTmpXml (:cia,:ejer ,:tmpc_subdia ,:tmpc_compro ,:tmpc_tipo ,:tmpc_feccom ,:tmpc_moneda ,:tmpc_tctipo , "
        + ":tmpc_tcimporte ,:tmpc_tcfecha ,:tmpc_glosa ,:tmpc_origen ,:tmpc_flagconv ,:tmpc_form ,:tmpc_extor ,:tmpc_ctaPag ,:tmpc_ctaCmp)}", nativeQuery = true)
    @Modifying
    @Transactional
    void sw_ActCabeAsientoTmpXml (
        @Param("cia") String cia,
        @Param("ejer") String ejer,
        @Param("tmpc_subdia") String tmpc_subdia,
        @Param("tmpc_compro") String tmpc_compro,
        @Param("tmpc_tipo") String tmpc_tipo,
        @Param("tmpc_feccom") LocalDate tmpc_feccom,
        @Param("tmpc_moneda") String tmpc_moneda,
        @Param("tmpc_tctipo") String tmpc_tctipo,
        @Param("tmpc_tcimporte") Double tmpc_tcimporte,
        @Param("tmpc_tcfecha") LocalDate tmpc_tcfecha,
        @Param("tmpc_glosa") String tmpc_glosa,
        @Param("tmpc_origen") String tmpc_origen,
        @Param("tmpc_flagconv") String tmpc_flagconv,
        @Param("tmpc_form") String tmpc_form,
        @Param("tmpc_extor") String tmpc_extor,
        @Param("tmpc_ctaPag") String tmpc_ctaPag,
        @Param("tmpc_ctaCmp") String tmpc_ctaCmp
    );

    @Query(value = "{call SP_ActDocXML(:cia, :ejer,:auxID ,:auxFecDoc  ,:auxFecVen  ,:auxTdoc  ,:auxSdoc  ,:auxNdoc,:auxTiden  ,:auxNiden  ,:auxRazSoc  ,:auxMnd  ,:auxOpeGrv,"
    + ":auxOpeExp  ,:auxOpeIna  ,:auxOpeExo  ,:auxIpercep  ,:auxDpercep  ,:auxIgv  ,:auxIvap  ,:auxIcbp  ,:auxIsc  ,:auxIrenta,"
    + ":auxOtros  ,:auxTdsct  ,:auxTotal  ,:auxTipDet  ,:auxNroDet  ,:auxFecDet  ,:auxTasDet  ,:auxImpDet  ,:auxBasDet  ,:auxTdocrf,"
    + ":auxSdocrf  ,:auxNdocrf  ,:auxFdocrf  ,:auxDirecc  ,:auxDdistr  ,:auxDprov  ,:auxDdepr  ,:auxUbigeo,:auxSD, :auxCtaPag ,:auxCtaCmp ,:auxCcst ,:auxAnxPrin ,:auxAnxAux ,:auxNomXML)}", nativeQuery = true)
    @Modifying
    @Transactional
    void sw_ActDocXML(
        @Param("cia") String cia,
        @Param("ejer") String ejer,
        @Param("auxID") Integer auxID,
        @Param("auxFecDoc") LocalDate auxFecDoc, 
        @Param("auxFecVen") LocalDate auxFecVen, 
        @Param("auxTdoc") String auxTdoc,
        @Param("auxSdoc") String auxSdoc,
        @Param("auxNdoc") String auxNdoc,
        @Param("auxTiden") String auxTiden,
        @Param("auxNiden") String auxNiden,
        @Param("auxRazSoc") String auxRazSoc,
        @Param("auxMnd") String auxMnd,
        @Param("auxOpeGrv") Double auxOpeGrv,
        @Param("auxOpeExp") Double auxOpeExp,
        @Param("auxOpeIna") Double auxOpeIna,
        @Param("auxOpeExo") Double auxOpeExo,
        @Param("auxIpercep") Double auxIpercep,
        @Param("auxDpercep") String auxDpercep,
        @Param("auxIgv") Double auxIgv,
        @Param("auxIvap") Double auxIvap,
        @Param("auxIcbp") Double auxIcbp,
        @Param("auxIsc") Double auxIsc,
        @Param("auxIrenta") Double auxIrenta,
        @Param("auxOtros") Double auxOtros,
        @Param("auxTdsct") Double auxTdsct,
        @Param("auxTotal") Double auxTotal,
        @Param("auxTipDet") String auxTipDet,
        @Param("auxNroDet") String auxNroDet,
        @Param("auxFecDet") LocalDate auxFecDet,
        @Param("auxTasDet") Double auxTasDet,
        @Param("auxImpDet") Double auxImpDet,
        @Param("auxBasDet") Double auxBasDet,
        @Param("auxTdocrf") String auxTdocrf,
        @Param("auxSdocrf") String auxSdocrf,
        @Param("auxNdocrf") String auxNdocrf,
        @Param("auxFdocrf") LocalDate auxFdocrf,
        @Param("auxDirecc") String auxDirecc,
        @Param("auxDdistr") String auxDdistr,
        @Param("auxDprov") String auxDprov,
        @Param("auxDdepr") String auxDdepr,
        @Param("auxUbigeo") String auxUbigeo,
        @Param("auxSD") String auxSD,
        @Param("auxCtaPag") String auxCtaPag,
        @Param("auxCtaCmp") String auxCtaCmp,
        @Param("auxCcst") String auxCcst,
        @Param("auxAnxPrin") String auxAnxPrin,
        @Param("auxAnxAux") String auxAnxAux,
        @Param("auxNomXML") String auxNomXML
    );

    
    @Query(value = "{call SP_ListarAnexNuevoXml(:cia, :ejer)}", nativeQuery = true)
    List<lcoauxxml> sw_ListarAnexNuevoXml(
        @Param("cia") String cia,
        @Param("ejer") String ejer 
    );

    @Query(value = "{call SP_InsertatAnexNuevoXml(:cia, :ejer)}", nativeQuery = true)
    void sw_InsertatAnexNuevoXml(
        @Param("cia") String cia,
        @Param("ejer") String ejer 
    );

    // Retorna lista de objetos con parametros: tmpd_secue, tmpd_cuenta, tmpd_cdanex, tmpd_tpdoc, tmpd_sedoc, 
    //                                          tmpd_nmdoc, tmpd_cencst, tmpd_glosa, tmpd_importe, tmpd_dh 
    @Query(value = "{call SP_ListarDetaVtaXml(:cia, :ejer, :vsd, :idcmp)}", nativeQuery = true)
    List<Map<String, Object[]>> sw_ListarDetaVtaXml(
        @Param("cia") String cia,
        @Param("ejer") String ejer,
        @Param("vsd") String vsd,
        @Param("idcmp") String idcmp
    );

    @Query(value = "{call SP_ListarAsientoTmpXml(:cia, :ejer)}", nativeQuery = true)
    List<Map<String, Object[]>> sw_ListarAsientoTmpXml(
        @Param("cia") String cia,
        @Param("ejer") String ejer
    );

    @Query(value = "{call SP_EliDetAsiTmpXml(:cia, :ejer, :sd, :id)}", nativeQuery = true)
    @Modifying
    @Transactional
    void sw_EliDetAsiTmpXml(
        @Param("cia") String cia,
        @Param("ejer") String ejer,
        @Param("sd") String sd,
        @Param("id") String id
    );

    @Query(value = "{call SP_AdicionaCmpXml(:cia, :ejer,:nrocmp, :usr, :sd, :id)}", nativeQuery = true)
    @Modifying
    @Transactional
    void sw_AdicionaCmpXml(
        @Param("cia") String cia,
        @Param("ejer") String ejer,
        @Param("nrocmp") String nrocmp,
        @Param("usr") String usr,
        @Param("sd") String sd,
        @Param("id") String id
    );

    @Query(value = "{call SP_ValidaSiDocEstaRegXml(:cia, :ejer,:tdc, :sdc, :ndc, :tide, :nide)}", nativeQuery = true)
    List<Map<String, Object[]>> sw_ValidaSiDocEstaRegXml(
        @Param("cia") String cia,
        @Param("ejer") String ejer,
        @Param("tdc") String tdc,
        @Param("sdc") String sdc,
        @Param("ndc") String ndc,
        @Param("tide") String tide,
        @Param("nide") String nide
    );
}
