package com.empresa.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class lcoauxxml {

    @Id
    Integer auxID;
    String auxTipo;
    LocalDate auxFecDoc; 
    LocalDate auxFecVen; 
    String auxTdoc; 
    String auxSdoc; 
    String auxNdoc; 
    String auxTiden; 
    String auxNiden; 
    String auxRazSoc; 
    String auxMnd; 
    Double auxOpeGrav;
    Double auxOpeExp; 
    Double auxOpeIna; 
    Double auxOpeExo; 
    Double auxIpercep;
    String auxDpercep; 
    Double auxIgv; 
    Double auxIvap; 
    Double auxIcbp; 
    Double auxIsc; 
    Double auxIrenta; 
    Double auxOtros; 
    Double auxTdsct; 
    Double auxTotal; 
    String auxTipDet;
    String auxNroDet; 
    LocalDate auxFecDet; 
    Double auxTasDet; 
    Double auxImpDet; 
    Double auxBasDet; 
    String auxTdocrf; 
    String auxSdocrf; 
    String auxNdocrf; 
    LocalDate auxFdocrf; 
    String auxDirecc;
    String auxDdistr;
    String auxDprov;
    String auxDdepr;
    String auxUbigeo;
    String auxSD ;
    String auxCtaPag ;
    String auxCtaCmp;
    String auxCcst ;
    String auxAnxPrin ;
    String auxAnxAux ;
    String auxNomXML;

    public lcoauxxml() {
        super();
    }


    public lcoauxxml(Integer auxID, String auxTipo, LocalDate auxFecDoc, LocalDate auxFecVen, String auxTdoc, String auxSdoc, String auxNdoc, String auxTiden, String auxNiden, String auxRazSoc, String auxMnd, Double auxOpeGrav, Double auxOpeExp, Double auxOpeIna, Double auxOpeExo, Double auxIpercep, String auxDpercep, Double auxIgv, Double auxIvap, Double auxIcbp, Double auxIsc, Double auxIrenta, Double auxOtros, Double auxTdsct, Double auxTotal, String auxTipDet, String auxNroDet, LocalDate auxFecDet, Double auxTasDet, Double auxImpDet, Double auxBasDet, String auxTdocrf, String auxSdocrf, String auxNdocrf, LocalDate auxFdocrf, String auxDirecc, String auxDdistr, String auxDprov, String auxDdepr, String auxUbigeo, String auxSD, String auxCtaPag, String auxCtaCmp, String auxCcst, String auxAnxPrin, String auxAnxAux, String auxNomXML) {
        this.auxID = auxID;
        this.auxTipo = auxTipo;
        this.auxFecDoc = auxFecDoc;
        this.auxFecVen = auxFecVen;
        this.auxTdoc = auxTdoc;
        this.auxSdoc = auxSdoc;
        this.auxNdoc = auxNdoc;
        this.auxTiden = auxTiden;
        this.auxNiden = auxNiden;
        this.auxRazSoc = auxRazSoc;
        this.auxMnd = auxMnd;
        this.auxOpeGrav = auxOpeGrav;
        this.auxOpeExp = auxOpeExp;
        this.auxOpeIna = auxOpeIna;
        this.auxOpeExo = auxOpeExo;
        this.auxIpercep = auxIpercep;
        this.auxDpercep = auxDpercep;
        this.auxIgv = auxIgv;
        this.auxIvap = auxIvap;
        this.auxIcbp = auxIcbp;
        this.auxIsc = auxIsc;
        this.auxIrenta = auxIrenta;
        this.auxOtros = auxOtros;
        this.auxTdsct = auxTdsct;
        this.auxTotal = auxTotal;
        this.auxTipDet = auxTipDet;
        this.auxNroDet = auxNroDet;
        this.auxFecDet = auxFecDet;
        this.auxTasDet = auxTasDet;
        this.auxImpDet = auxImpDet;
        this.auxBasDet = auxBasDet;
        this.auxTdocrf = auxTdocrf;
        this.auxSdocrf = auxSdocrf;
        this.auxNdocrf = auxNdocrf;
        this.auxFdocrf = auxFdocrf;
        this.auxDirecc = auxDirecc;
        this.auxDdistr = auxDdistr;
        this.auxDprov = auxDprov;
        this.auxDdepr = auxDdepr;
        this.auxUbigeo = auxUbigeo;
        this.auxSD = auxSD;
        this.auxCtaPag = auxCtaPag;
        this.auxCtaCmp = auxCtaCmp;
        this.auxCcst = auxCcst;
        this.auxAnxPrin = auxAnxPrin;
        this.auxAnxAux = auxAnxAux;
        this.auxNomXML = auxNomXML;
    }


    public Integer getAuxID() {
        return this.auxID;
    }

    public void setAuxID(Integer auxID) {
        this.auxID = auxID;
    }

    public String getAuxTipo() {
        return this.auxTipo;
    }

    public void setAuxTipo(String auxTipo) {
        this.auxTipo = auxTipo;
    }

    public LocalDate getAuxFecDoc() {
        return this.auxFecDoc;
    }

    public void setAuxFecDoc(LocalDate auxFecDoc) {
        this.auxFecDoc = auxFecDoc;
    }

    public LocalDate getAuxFecVen() {
        return this.auxFecVen;
    }

    public void setAuxFecVen(LocalDate auxFecVen) {
        this.auxFecVen = auxFecVen;
    }

    public String getAuxTdoc() {
        return this.auxTdoc;
    }

    public void setAuxTdoc(String auxTdoc) {
        this.auxTdoc = auxTdoc;
    }

    public String getAuxSdoc() {
        return this.auxSdoc;
    }

    public void setAuxSdoc(String auxSdoc) {
        this.auxSdoc = auxSdoc;
    }

    public String getAuxNdoc() {
        return this.auxNdoc;
    }

    public void setAuxNdoc(String auxNdoc) {
        this.auxNdoc = auxNdoc;
    }

    public String getAuxTiden() {
        return this.auxTiden;
    }

    public void setAuxTiden(String auxTiden) {
        this.auxTiden = auxTiden;
    }

    public String getAuxNiden() {
        return this.auxNiden;
    }

    public void setAuxNiden(String auxNiden) {
        this.auxNiden = auxNiden;
    }

    public String getAuxRazSoc() {
        return this.auxRazSoc;
    }

    public void setAuxRazSoc(String auxRazSoc) {
        this.auxRazSoc = auxRazSoc;
    }

    public String getAuxMnd() {
        return this.auxMnd;
    }

    public void setAuxMnd(String auxMnd) {
        this.auxMnd = auxMnd;
    }

    public Double getAuxOpeGrav() {
        return this.auxOpeGrav;
    }

    public void setAuxOpeGrav(Double auxOpeGrav) {
        this.auxOpeGrav = auxOpeGrav;
    }

    public Double getAuxOpeExp() {
        return this.auxOpeExp;
    }

    public void setAuxOpeExp(Double auxOpeExp) {
        this.auxOpeExp = auxOpeExp;
    }

    public Double getAuxOpeIna() {
        return this.auxOpeIna;
    }

    public void setAuxOpeIna(Double auxOpeIna) {
        this.auxOpeIna = auxOpeIna;
    }

    public Double getAuxOpeExo() {
        return this.auxOpeExo;
    }

    public void setAuxOpeExo(Double auxOpeExo) {
        this.auxOpeExo = auxOpeExo;
    }

    public Double getAuxIpercep() {
        return this.auxIpercep;
    }

    public void setAuxIpercep(Double auxIpercep) {
        this.auxIpercep = auxIpercep;
    }

    public String getAuxDpercep() {
        return this.auxDpercep;
    }

    public void setAuxDpercep(String auxDpercep) {
        this.auxDpercep = auxDpercep;
    }

    public Double getAuxIgv() {
        return this.auxIgv;
    }

    public void setAuxIgv(Double auxIgv) {
        this.auxIgv = auxIgv;
    }

    public Double getAuxIvap() {
        return this.auxIvap;
    }

    public void setAuxIvap(Double auxIvap) {
        this.auxIvap = auxIvap;
    }

    public Double getAuxIcbp() {
        return this.auxIcbp;
    }

    public void setAuxIcbp(Double auxIcbp) {
        this.auxIcbp = auxIcbp;
    }

    public Double getAuxIsc() {
        return this.auxIsc;
    }

    public void setAuxIsc(Double auxIsc) {
        this.auxIsc = auxIsc;
    }

    public Double getAuxIrenta() {
        return this.auxIrenta;
    }

    public void setAuxIrenta(Double auxIrenta) {
        this.auxIrenta = auxIrenta;
    }

    public Double getAuxOtros() {
        return this.auxOtros;
    }

    public void setAuxOtros(Double auxOtros) {
        this.auxOtros = auxOtros;
    }

    public Double getAuxTdsct() {
        return this.auxTdsct;
    }

    public void setAuxTdsct(Double auxTdsct) {
        this.auxTdsct = auxTdsct;
    }

    public Double getAuxTotal() {
        return this.auxTotal;
    }

    public void setAuxTotal(Double auxTotal) {
        this.auxTotal = auxTotal;
    }

    public String getAuxTipDet() {
        return this.auxTipDet;
    }

    public void setAuxTipDet(String auxTipDet) {
        this.auxTipDet = auxTipDet;
    }

    public String getAuxNroDet() {
        return this.auxNroDet;
    }

    public void setAuxNroDet(String auxNroDet) {
        this.auxNroDet = auxNroDet;
    }

    public LocalDate getAuxFecDet() {
        return this.auxFecDet;
    }

    public void setAuxFecDet(LocalDate auxFecDet) {
        this.auxFecDet = auxFecDet;
    }

    public Double getAuxTasDet() {
        return this.auxTasDet;
    }

    public void setAuxTasDet(Double auxTasDet) {
        this.auxTasDet = auxTasDet;
    }

    public Double getAuxImpDet() {
        return this.auxImpDet;
    }

    public void setAuxImpDet(Double auxImpDet) {
        this.auxImpDet = auxImpDet;
    }

    public Double getAuxBasDet() {
        return this.auxBasDet;
    }

    public void setAuxBasDet(Double auxBasDet) {
        this.auxBasDet = auxBasDet;
    }

    public String getAuxTdocrf() {
        return this.auxTdocrf;
    }

    public void setAuxTdocrf(String auxTdocrf) {
        this.auxTdocrf = auxTdocrf;
    }

    public String getAuxSdocrf() {
        return this.auxSdocrf;
    }

    public void setAuxSdocrf(String auxSdocrf) {
        this.auxSdocrf = auxSdocrf;
    }

    public String getAuxNdocrf() {
        return this.auxNdocrf;
    }

    public void setAuxNdocrf(String auxNdocrf) {
        this.auxNdocrf = auxNdocrf;
    }

    public LocalDate getAuxFdocrf() {
        return this.auxFdocrf;
    }

    public void setAuxFdocrf(LocalDate auxFdocrf) {
        this.auxFdocrf = auxFdocrf;
    }

    public String getAuxDirecc() {
        return this.auxDirecc;
    }

    public void setAuxDirecc(String auxDirecc) {
        this.auxDirecc = auxDirecc;
    }

    public String getAuxDdistr() {
        return this.auxDdistr;
    }

    public void setAuxDdistr(String auxDdistr) {
        this.auxDdistr = auxDdistr;
    }

    public String getAuxDprov() {
        return this.auxDprov;
    }

    public void setAuxDprov(String auxDprov) {
        this.auxDprov = auxDprov;
    }

    public String getAuxDdepr() {
        return this.auxDdepr;
    }

    public void setAuxDdepr(String auxDdepr) {
        this.auxDdepr = auxDdepr;
    }

    public String getAuxUbigeo() {
        return this.auxUbigeo;
    }

    public void setAuxUbigeo(String auxUbigeo) {
        this.auxUbigeo = auxUbigeo;
    }

    public String getAuxSD() {
        return this.auxSD;
    }

    public void setAuxSD(String auxSD) {
        this.auxSD = auxSD;
    }

    public String getAuxCtaPag() {
        return this.auxCtaPag;
    }

    public void setAuxCtaPag(String auxCtaPag) {
        this.auxCtaPag = auxCtaPag;
    }

    public String getAuxCtaCmp() {
        return this.auxCtaCmp;
    }

    public void setAuxCtaCmp(String auxCtaCmp) {
        this.auxCtaCmp = auxCtaCmp;
    }

    public String getAuxCcst() {
        return this.auxCcst;
    }

    public void setAuxCcst(String auxCcst) {
        this.auxCcst = auxCcst;
    }

    public String getAuxAnxPrin() {
        return this.auxAnxPrin;
    }

    public void setAuxAnxPrin(String auxAnxPrin) {
        this.auxAnxPrin = auxAnxPrin;
    }

    public String getAuxAnxAux() {
        return this.auxAnxAux;
    }

    public void setAuxAnxAux(String auxAnxAux) {
        this.auxAnxAux = auxAnxAux;
    }

    public String getAuxNomXML() {
        return this.auxNomXML;
    }

    public void setAuxNomXML(String auxNomXML) {
        this.auxNomXML = auxNomXML;
    }

}
