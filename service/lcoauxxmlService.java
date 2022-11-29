package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoauxxml;
import com.empresa.entity.lcotmpcv;
import com.empresa.entity.lcotmpdv;

public interface lcoauxxmlService {

    public List<lcoauxxml> sw_ListarDocXML(String cia, String ejer);
    void sw_CvtDocXML(String cia, String ejer);
    List<Map<String, Object[]>> sw_InsertTableDocXML(String cia, String ejer, lcoauxxml obj);
    public List<lcoauxxml> sw_ListarTblXml(String cia, String ejer);
    public List<Map<String, Object[]>> sw_GetCabecerasByCompro(String cia,String ejer,String compro);
    public List<Map<String, Object[]>> sw_BscParVtaXml(String cia, String tdoc, String sdoc);
    public List<Map<String, Object[]>> sw_BscCtaGraXml(String cia);
    public List<Map<String, Object[]>> sw_BscCtaNGraXml (String cia);
    public List<Map<String, Object[]>> sw_BscCtaExoXml(String cia);
    void sw_CreaDetaAstTmpXml(String cia, String ejer, lcotmpdv obj);
    void sw_CreaCabeAstTmpXml(String cia, String ejer, lcotmpcv obj);
    void sw_ActCabeAsientoTmpXml(String cia, String ejer, lcotmpcv obj);
    void sw_ActDocXML(String cia, String ejer, lcoauxxml obj);
    public List<lcoauxxml> sw_ListarAnexNuevoXml(String cia, String ejer);
    void sw_InsertatAnexNuevoXml( String cia, String ejer);
    public List<Map<String, Object[]>> sw_ListarDetaVtaXml(String cia,String ejer,String vsd, String idcmp);
    public List<Map<String, Object[]>> sw_ListarAsientoTmpXml(String cia, String ejer);
    void sw_EliDetAsiTmpXml(String cia,String ejer,String sd,String id);
    void sw_AdicionaCmpXml(String cia,String ejer,String nrocmp,String usr,String sd, String id);
    List<Map<String, Object[]>> sw_ValidaSiDocEstaRegXml(String cia,String ejer,String tdc, String sdc,String ndc, String tide,String nide);
}
