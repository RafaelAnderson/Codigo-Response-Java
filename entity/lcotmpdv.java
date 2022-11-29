package com.empresa.entity;

import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class lcotmpdv {
    @EmbeddedId
    lcotmpdvPK pk;

    LocalDate tmpd_feccom;
    String tmpd_cuenta; 
    String tmpd_tpanex;
    String tmpd_cdanex; 
    String tmpd_cencst; 
    String tmpd_dh; 
    String tmpd_tpdoc; 
    String tmpd_sedoc; 
    String tmpd_nmdoc; 
    LocalDate tmpd_fecdoc; 
    LocalDate tmpd_fecven; 
    Double tmpd_tipcam; 
    String tmpd_glosa;
    String tmpd_codmnd; 
    Double tmpd_importe; 
    Double tmpd_impmn; 
    Double tmpd_impme; 
    String tmpd_tpanex2; 
    String tmpd_cdanex2; 
    String tmpd_medpag; 
    String tmpd_tpdocrf; 
    String tmpd_nmdocrf; 
    LocalDate tmpd_fecdocrf; 
    String tmpd_tptasa; 
    Double tmpd_imptas; 
    Double tmpd_impbmn; 
    Double tmpd_impbme; 
    String tmpd_area; 
    String tmpd_tipcmp; 
    String tmpd_flag; 
    String tmpd_datref; 
    String tmpd_fluefec; 
    LocalDate tmpd_fecdet;
    String tmpd_nrodet; 
    String tmpd_secorig; 
    Double tmpd_inafcc; 
    String tmpd_estdc;

    lcotmpdv() {
        super();
    }


    public lcotmpdv(lcotmpdvPK pk, LocalDate tmpd_feccom, String tmpd_cuenta, String tmpd_tpanex, String tmpd_cdanex, String tmpd_cencst, String tmpd_dh, String tmpd_tpdoc, String tmpd_sedoc, String tmpd_nmdoc, LocalDate tmpd_fecdoc, LocalDate tmpd_fecven, Double tmpd_tipcam, String tmpd_glosa, String tmpd_codmnd, Double tmpd_importe, Double tmpd_impmn, Double tmpd_impme, String tmpd_tpanex2, String tmpd_cdanex2, String tmpd_medpag, String tmpd_tpdocrf, String tmpd_nmdocrf, LocalDate tmpd_fecdocrf, String tmpd_tptasa, Double tmpd_imptas, Double tmpd_impbmn, Double tmpd_impbme, String tmpd_area, String tmpd_tipcmp, String tmpd_flag, String tmpd_datref, String tmpd_fluefec, LocalDate tmpd_fecdet, String tmpd_nrodet, String tmpd_secorig, Double tmpd_inafcc, String tmpd_estdc) {
        this.pk = pk;
        this.tmpd_feccom = tmpd_feccom;
        this.tmpd_cuenta = tmpd_cuenta;
        this.tmpd_tpanex = tmpd_tpanex;
        this.tmpd_cdanex = tmpd_cdanex;
        this.tmpd_cencst = tmpd_cencst;
        this.tmpd_dh = tmpd_dh;
        this.tmpd_tpdoc = tmpd_tpdoc;
        this.tmpd_sedoc = tmpd_sedoc;
        this.tmpd_nmdoc = tmpd_nmdoc;
        this.tmpd_fecdoc = tmpd_fecdoc;
        this.tmpd_fecven = tmpd_fecven;
        this.tmpd_tipcam = tmpd_tipcam;
        this.tmpd_glosa = tmpd_glosa;
        this.tmpd_codmnd = tmpd_codmnd;
        this.tmpd_importe = tmpd_importe;
        this.tmpd_impmn = tmpd_impmn;
        this.tmpd_impme = tmpd_impme;
        this.tmpd_tpanex2 = tmpd_tpanex2;
        this.tmpd_cdanex2 = tmpd_cdanex2;
        this.tmpd_medpag = tmpd_medpag;
        this.tmpd_tpdocrf = tmpd_tpdocrf;
        this.tmpd_nmdocrf = tmpd_nmdocrf;
        this.tmpd_fecdocrf = tmpd_fecdocrf;
        this.tmpd_tptasa = tmpd_tptasa;
        this.tmpd_imptas = tmpd_imptas;
        this.tmpd_impbmn = tmpd_impbmn;
        this.tmpd_impbme = tmpd_impbme;
        this.tmpd_area = tmpd_area;
        this.tmpd_tipcmp = tmpd_tipcmp;
        this.tmpd_flag = tmpd_flag;
        this.tmpd_datref = tmpd_datref;
        this.tmpd_fluefec = tmpd_fluefec;
        this.tmpd_fecdet = tmpd_fecdet;
        this.tmpd_nrodet = tmpd_nrodet;
        this.tmpd_secorig = tmpd_secorig;
        this.tmpd_inafcc = tmpd_inafcc;
        this.tmpd_estdc = tmpd_estdc;
    }


    public lcotmpdvPK getPk() {
        return this.pk;
    }

    public void setPk(lcotmpdvPK pk) {
        this.pk = pk;
    }

    public LocalDate getTmpd_feccom() {
        return this.tmpd_feccom;
    }

    public void setTmpd_feccom(LocalDate tmpd_feccom) {
        this.tmpd_feccom = tmpd_feccom;
    }

    public String getTmpd_cuenta() {
        return this.tmpd_cuenta;
    }

    public void setTmpd_cuenta(String tmpd_cuenta) {
        this.tmpd_cuenta = tmpd_cuenta;
    }

    public String getTmpd_tpanex() {
        return this.tmpd_tpanex;
    }

    public void setTmpd_tpanex(String tmpd_tpanex) {
        this.tmpd_tpanex = tmpd_tpanex;
    }

    public String getTmpd_cdanex() {
        return this.tmpd_cdanex;
    }

    public void setTmpd_cdanex(String tmpd_cdanex) {
        this.tmpd_cdanex = tmpd_cdanex;
    }

    public String getTmpd_cencst() {
        return this.tmpd_cencst;
    }

    public void setTmpd_cencst(String tmpd_cencst) {
        this.tmpd_cencst = tmpd_cencst;
    }

    public String getTmpd_dh() {
        return this.tmpd_dh;
    }

    public void setTmpd_dh(String tmpd_dh) {
        this.tmpd_dh = tmpd_dh;
    }

    public String getTmpd_tpdoc() {
        return this.tmpd_tpdoc;
    }

    public void setTmpd_tpdoc(String tmpd_tpdoc) {
        this.tmpd_tpdoc = tmpd_tpdoc;
    }

    public String getTmpd_sedoc() {
        return this.tmpd_sedoc;
    }

    public void setTmpd_sedoc(String tmpd_sedoc) {
        this.tmpd_sedoc = tmpd_sedoc;
    }

    public String getTmpd_nmdoc() {
        return this.tmpd_nmdoc;
    }

    public void setTmpd_nmdoc(String tmpd_nmdoc) {
        this.tmpd_nmdoc = tmpd_nmdoc;
    }

    public LocalDate getTmpd_fecdoc() {
        return this.tmpd_fecdoc;
    }

    public void setTmpd_fecdoc(LocalDate tmpd_fecdoc) {
        this.tmpd_fecdoc = tmpd_fecdoc;
    }

    public LocalDate getTmpd_fecven() {
        return this.tmpd_fecven;
    }

    public void setTmpd_fecven(LocalDate tmpd_fecven) {
        this.tmpd_fecven = tmpd_fecven;
    }

    public Double getTmpd_tipcam() {
        return this.tmpd_tipcam;
    }

    public void setTmpd_tipcam(Double tmpd_tipcam) {
        this.tmpd_tipcam = tmpd_tipcam;
    }

    public String getTmpd_glosa() {
        return this.tmpd_glosa;
    }

    public void setTmpd_glosa(String tmpd_glosa) {
        this.tmpd_glosa = tmpd_glosa;
    }

    public String getTmpd_codmnd() {
        return this.tmpd_codmnd;
    }

    public void setTmpd_codmnd(String tmpd_codmnd) {
        this.tmpd_codmnd = tmpd_codmnd;
    }

    public Double getTmpd_importe() {
        return this.tmpd_importe;
    }

    public void setTmpd_importe(Double tmpd_importe) {
        this.tmpd_importe = tmpd_importe;
    }

    public Double getTmpd_impmn() {
        return this.tmpd_impmn;
    }

    public void setTmpd_impmn(Double tmpd_impmn) {
        this.tmpd_impmn = tmpd_impmn;
    }

    public Double getTmpd_impme() {
        return this.tmpd_impme;
    }

    public void setTmpd_impme(Double tmpd_impme) {
        this.tmpd_impme = tmpd_impme;
    }

    public String getTmpd_tpanex2() {
        return this.tmpd_tpanex2;
    }

    public void setTmpd_tpanex2(String tmpd_tpanex2) {
        this.tmpd_tpanex2 = tmpd_tpanex2;
    }

    public String getTmpd_cdanex2() {
        return this.tmpd_cdanex2;
    }

    public void setTmpd_cdanex2(String tmpd_cdanex2) {
        this.tmpd_cdanex2 = tmpd_cdanex2;
    }

    public String getTmpd_medpag() {
        return this.tmpd_medpag;
    }

    public void setTmpd_medpag(String tmpd_medpag) {
        this.tmpd_medpag = tmpd_medpag;
    }

    public String getTmpd_tpdocrf() {
        return this.tmpd_tpdocrf;
    }

    public void setTmpd_tpdocrf(String tmpd_tpdocrf) {
        this.tmpd_tpdocrf = tmpd_tpdocrf;
    }

    public String getTmpd_nmdocrf() {
        return this.tmpd_nmdocrf;
    }

    public void setTmpd_nmdocrf(String tmpd_nmdocrf) {
        this.tmpd_nmdocrf = tmpd_nmdocrf;
    }

    public LocalDate getTmpd_fecdocrf() {
        return this.tmpd_fecdocrf;
    }

    public void setTmpd_fecdocrf(LocalDate tmpd_fecdocrf) {
        this.tmpd_fecdocrf = tmpd_fecdocrf;
    }

    public String getTmpd_tptasa() {
        return this.tmpd_tptasa;
    }

    public void setTmpd_tptasa(String tmpd_tptasa) {
        this.tmpd_tptasa = tmpd_tptasa;
    }

    public Double getTmpd_imptas() {
        return this.tmpd_imptas;
    }

    public void setTmpd_imptas(Double tmpd_imptas) {
        this.tmpd_imptas = tmpd_imptas;
    }

    public Double getTmpd_impbmn() {
        return this.tmpd_impbmn;
    }

    public void setTmpd_impbmn(Double tmpd_impbmn) {
        this.tmpd_impbmn = tmpd_impbmn;
    }

    public Double getTmpd_impbme() {
        return this.tmpd_impbme;
    }

    public void setTmpd_impbme(Double tmpd_impbme) {
        this.tmpd_impbme = tmpd_impbme;
    }

    public String getTmpd_area() {
        return this.tmpd_area;
    }

    public void setTmpd_area(String tmpd_area) {
        this.tmpd_area = tmpd_area;
    }

    public String getTmpd_tipcmp() {
        return this.tmpd_tipcmp;
    }

    public void setTmpd_tipcmp(String tmpd_tipcmp) {
        this.tmpd_tipcmp = tmpd_tipcmp;
    }

    public String getTmpd_flag() {
        return this.tmpd_flag;
    }

    public void setTmpd_flag(String tmpd_flag) {
        this.tmpd_flag = tmpd_flag;
    }

    public String getTmpd_datref() {
        return this.tmpd_datref;
    }

    public void setTmpd_datref(String tmpd_datref) {
        this.tmpd_datref = tmpd_datref;
    }

    public String getTmpd_fluefec() {
        return this.tmpd_fluefec;
    }

    public void setTmpd_fluefec(String tmpd_fluefec) {
        this.tmpd_fluefec = tmpd_fluefec;
    }

    public LocalDate getTmpd_fecdet() {
        return this.tmpd_fecdet;
    }

    public void setTmpd_fecdet(LocalDate tmpd_fecdet) {
        this.tmpd_fecdet = tmpd_fecdet;
    }

    public String getTmpd_nrodet() {
        return this.tmpd_nrodet;
    }

    public void setTmpd_nrodet(String tmpd_nrodet) {
        this.tmpd_nrodet = tmpd_nrodet;
    }

    public String getTmpd_secorig() {
        return this.tmpd_secorig;
    }

    public void setTmpd_secorig(String tmpd_secorig) {
        this.tmpd_secorig = tmpd_secorig;
    }

    public Double getTmpd_inafcc() {
        return this.tmpd_inafcc;
    }

    public void setTmpd_inafcc(Double tmpd_inafcc) {
        this.tmpd_inafcc = tmpd_inafcc;
    }

    public String getTmpd_estdc() {
        return this.tmpd_estdc;
    }

    public void setTmpd_estdc(String tmpd_estdc) {
        this.tmpd_estdc = tmpd_estdc;
    }

}
