package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoauxxml;
import com.empresa.entity.lcotmpcv;
import com.empresa.entity.lcotmpdv;
import com.empresa.repository.lcoauxxmlRepository;

@Service
public class lcoauxxmlServiceImpl implements lcoauxxmlService {
    
    @Autowired lcoauxxmlRepository repository;

    @Override
    public List<lcoauxxml> sw_ListarDocXML(String cia, String ejer){
        return repository.sw_ListarDocXML(cia, ejer);
    }

    @Override
    public void sw_CvtDocXML(String cia, String ejer){
        repository.sw_CvtDocXML(cia, ejer);
    }

    @Override
    public List<Map<String, Object[]>>  sw_InsertTableDocXML(String cia, String ejer, lcoauxxml obj){
        return repository.sw_InsertTableDocXML(cia, ejer, obj.getAuxFecDoc(), obj.getAuxFecVen(), obj.getAuxTdoc(), 
        obj.getAuxSdoc(), obj.getAuxNdoc(), obj.getAuxTiden(), obj.getAuxNiden(), obj.getAuxRazSoc(), obj.getAuxMnd(),
        obj.getAuxOpeGrav(), obj.getAuxOpeExp(), obj.getAuxOpeIna(), obj.getAuxOpeExo(), obj.getAuxIpercep(), obj.getAuxDpercep(), obj.getAuxIgv(),
        obj.getAuxIvap(), obj.getAuxIcbp(), obj.getAuxIsc(), obj.getAuxIrenta(), obj.getAuxOtros(), obj.getAuxTdsct(), obj.getAuxTotal(),
        obj.getAuxTipDet(), obj.getAuxNroDet(), obj.getAuxFecDet(), obj.getAuxTasDet(), obj.getAuxImpDet(), obj.getAuxBasDet(), obj.getAuxTdocrf(),
        obj.getAuxSdocrf(), obj.getAuxNdocrf(), obj.getAuxFdocrf(), obj.getAuxDirecc(), obj.getAuxDdistr(), obj.getAuxDprov(), obj.getAuxDdepr(),
        obj.getAuxUbigeo(), obj.getAuxSD(), obj.getAuxCtaPag(), obj.getAuxCtaCmp(), obj.getAuxCcst(), obj.getAuxAnxPrin(), obj.getAuxAnxAux(), obj.getAuxNomXML());
    }

    @Override
    public List<lcoauxxml> sw_ListarTblXml(String cia, String ejer){
        return repository.sw_ListarTblXml(cia, ejer);
    }

    @Override
    public List<Map<String, Object[]>> sw_BscParVtaXml(String cia, String tdoc, String sdoc){
        return repository.sw_BscParVtaXml(cia, tdoc, sdoc);
    }

    @Override
    public List<Map<String, Object[]>> sw_BscCtaGraXml(String cia){
        return repository.sw_BscCtaGraXml(cia);
    }

    @Override
    public List<Map<String, Object[]>> sw_BscCtaNGraXml (String cia){
        return repository.sw_BscCtaNGraXml(cia);
    }

    @Override
    public List<Map<String, Object[]>> sw_BscCtaExoXml(String cia){
        return repository.sw_BscCtaExoXml(cia);
    }

    @Override
    public void sw_CreaDetaAstTmpXml(String cia, String ejer, lcotmpdv obj){
        repository.sw_CreaDetaAstTmpXml(cia, ejer, obj.getPk().getTmpd_subdia(), obj.getPk().getTmpd_compro(), obj.getPk().getTmpd_secue(), obj.getTmpd_feccom(),
        obj.getTmpd_cuenta(), obj.getTmpd_tpanex(), obj.getTmpd_cdanex(), obj.getTmpd_cencst(), obj.getTmpd_dh(),
        obj.getTmpd_tpdoc(), obj.getTmpd_sedoc(), obj.getTmpd_nmdoc(), obj.getTmpd_fecdoc(), obj.getTmpd_fecven(),
        obj.getTmpd_tipcam(), obj.getTmpd_glosa(), obj.getTmpd_codmnd(), obj.getTmpd_importe(), obj.getTmpd_impmn(),
        obj.getTmpd_impme(), obj.getTmpd_tpanex2(), obj.getTmpd_cdanex2(), obj.getTmpd_medpag(), obj.getTmpd_tpdocrf(),
        obj.getTmpd_nmdocrf(), obj.getTmpd_fecdocrf(), obj.getTmpd_tptasa(), obj.getTmpd_imptas(), obj.getTmpd_impbmn(),
        obj.getTmpd_impbme(), obj.getTmpd_area(), obj.getTmpd_tipcmp(), obj.getTmpd_flag(), obj.getTmpd_datref(), obj.getTmpd_fluefec(),
        obj.getTmpd_fecdet(), obj.getTmpd_nrodet(), obj.getTmpd_secorig(), obj.getTmpd_inafcc(), obj.getTmpd_estdc());
    }

    @Override
    public void sw_CreaCabeAstTmpXml(String cia, String ejer, lcotmpcv obj){
        repository.sw_CreaCabeAstTmpXml(cia, ejer, obj.getPk().getTmpc_subdia(), obj.getPk().getTmpc_compro(), obj.getTmpc_tipo(),
        obj.getTmpc_feccom(), obj.getTmpc_moneda(), obj.getTmpc_tctipo(), obj.getTmpc_tcimporte(), obj.getTmpc_tcfecha(),
        obj.getTmpc_glosa(), obj.getTmpc_origen(), obj.getTmpc_flagconv(), obj.getTmpc_form(), obj.getTmpc_extor(), 
        obj.getTmpc_ctaPag(), obj.getTmpc_ctaCmp());
    }

    @Override
    public void sw_ActCabeAsientoTmpXml(String cia, String ejer, lcotmpcv obj){
        repository.sw_ActCabeAsientoTmpXml(cia, ejer, obj.getPk().getTmpc_subdia(), obj.getPk().getTmpc_compro(), obj.getTmpc_tipo(),
        obj.getTmpc_feccom(), obj.getTmpc_moneda(), obj.getTmpc_tctipo(), obj.getTmpc_tcimporte(), obj.getTmpc_tcfecha(),
        obj.getTmpc_glosa(), obj.getTmpc_origen(), obj.getTmpc_flagconv(), obj.getTmpc_form(), obj.getTmpc_extor(), 
        obj.getTmpc_ctaPag(), obj.getTmpc_ctaCmp());
    }

    @Override
    public void sw_ActDocXML(String cia, String ejer, lcoauxxml obj){
        repository.sw_ActDocXML(cia, ejer, obj.getAuxID(), obj.getAuxFecDoc(), obj.getAuxFecVen(), obj.getAuxTdoc(), 
        obj.getAuxSdoc(), obj.getAuxNdoc(), obj.getAuxTiden(), obj.getAuxNiden(), obj.getAuxRazSoc(), obj.getAuxMnd(),
        obj.getAuxOpeGrav(), obj.getAuxOpeExp(), obj.getAuxOpeIna(), obj.getAuxOpeExo(), obj.getAuxIpercep(), obj.getAuxDpercep(), obj.getAuxIgv(),
        obj.getAuxIvap(), obj.getAuxIcbp(), obj.getAuxIsc(), obj.getAuxIrenta(), obj.getAuxOtros(), obj.getAuxTdsct(), obj.getAuxTotal(),
        obj.getAuxTipDet(), obj.getAuxNroDet(), obj.getAuxFecDet(), obj.getAuxTasDet(), obj.getAuxImpDet(), obj.getAuxBasDet(), obj.getAuxTdocrf(),
        obj.getAuxSdocrf(), obj.getAuxNdocrf(), obj.getAuxFdocrf(), obj.getAuxDirecc(), obj.getAuxDdistr(), obj.getAuxDprov(), obj.getAuxDdepr(),
        obj.getAuxUbigeo(), obj.getAuxSD(), obj.getAuxCtaPag(), obj.getAuxCtaCmp(), obj.getAuxCcst(), obj.getAuxAnxPrin(), obj.getAuxAnxAux(), obj.getAuxNomXML());
    }

    @Override
    public List<lcoauxxml> sw_ListarAnexNuevoXml(String cia, String ejer){
        return repository.sw_ListarAnexNuevoXml(cia, ejer);
    }

    @Override
    public void sw_InsertatAnexNuevoXml( String cia, String ejer){
        repository.sw_InsertatAnexNuevoXml(cia, ejer);
    }

    @Override
    public List<Map<String, Object[]>> sw_ListarDetaVtaXml(String cia,String ejer,String vsd, String idcmp){
        return repository.sw_ListarDetaVtaXml(cia, ejer, vsd, idcmp);
    }

    @Override
    public List<Map<String, Object[]>> sw_ListarAsientoTmpXml(String cia, String ejer){
        return repository.sw_ListarAsientoTmpXml(cia, ejer);
    }

    @Override
    public void sw_EliDetAsiTmpXml(String cia,String ejer,String sd,String id){
        repository.sw_EliDetAsiTmpXml(cia, ejer, sd, id);
    }

    @Override
    public void sw_AdicionaCmpXml(String cia,String ejer,String nrocmp,String usr,String sd, String id){
        repository.sw_AdicionaCmpXml(cia, ejer, nrocmp, usr, sd, id);
    }

    @Override
    public List<Map<String, Object[]>> sw_ValidaSiDocEstaRegXml(String cia,String ejer,String tdc, String sdc,String ndc, String tide,String nide){
        return repository.sw_ValidaSiDocEstaRegXml(cia, ejer, tdc, sdc, ndc, tide, nide);
    }

    @Override
    public List<Map<String, Object[]>> sw_GetCabecerasByCompro(String cia,String ejer,String compro) {
        return repository.sw_GetCabecerasByCompro(cia, ejer, compro);
    }
    
}
