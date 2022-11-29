package com.empresa.entity;

import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class lcotmpcv {

    @EmbeddedId
    lcotmpcvPK pk;

    String tmpc_tipo;
    LocalDate tmpc_feccom; 
    String tmpc_moneda;
    String tmpc_tctipo; 
    Double tmpc_tcimporte; 
    LocalDate tmpc_tcfecha;
    String tmpc_glosa;
    String tmpc_origen;
    String tmpc_flagconv;
    String tmpc_form;
    String tmpc_extor;
    String tmpc_ctaPag;
    String tmpc_ctaCmp;

    public lcotmpcv() {
        super();
    }


    public lcotmpcv(lcotmpcvPK pk, String tmpc_tipo, LocalDate tmpc_feccom, String tmpc_moneda, String tmpc_tctipo, Double tmpc_tcimporte, LocalDate tmpc_tcfecha, String tmpc_glosa, String tmpc_origen, String tmpc_flagconv, String tmpc_form, String tmpc_extor, String tmpc_ctaPag, String tmpc_ctaCmp) {
        this.pk = pk;
        this.tmpc_tipo = tmpc_tipo;
        this.tmpc_feccom = tmpc_feccom;
        this.tmpc_moneda = tmpc_moneda;
        this.tmpc_tctipo = tmpc_tctipo;
        this.tmpc_tcimporte = tmpc_tcimporte;
        this.tmpc_tcfecha = tmpc_tcfecha;
        this.tmpc_glosa = tmpc_glosa;
        this.tmpc_origen = tmpc_origen;
        this.tmpc_flagconv = tmpc_flagconv;
        this.tmpc_form = tmpc_form;
        this.tmpc_extor = tmpc_extor;
        this.tmpc_ctaPag = tmpc_ctaPag;
        this.tmpc_ctaCmp = tmpc_ctaCmp;
    }


    public lcotmpcvPK getPk() {
        return this.pk;
    }

    public void setPk(lcotmpcvPK pk) {
        this.pk = pk;
    }

    public String getTmpc_tipo() {
        return this.tmpc_tipo;
    }

    public void setTmpc_tipo(String tmpc_tipo) {
        this.tmpc_tipo = tmpc_tipo;
    }

    public LocalDate getTmpc_feccom() {
        return this.tmpc_feccom;
    }

    public void setTmpc_feccom(LocalDate tmpc_feccom) {
        this.tmpc_feccom = tmpc_feccom;
    }

    public String getTmpc_moneda() {
        return this.tmpc_moneda;
    }

    public void setTmpc_moneda(String tmpc_moneda) {
        this.tmpc_moneda = tmpc_moneda;
    }

    public String getTmpc_tctipo() {
        return this.tmpc_tctipo;
    }

    public void setTmpc_tctipo(String tmpc_tctipo) {
        this.tmpc_tctipo = tmpc_tctipo;
    }

    public Double getTmpc_tcimporte() {
        return this.tmpc_tcimporte;
    }

    public void setTmpc_tcimporte(Double tmpc_tcimporte) {
        this.tmpc_tcimporte = tmpc_tcimporte;
    }

    public LocalDate getTmpc_tcfecha() {
        return this.tmpc_tcfecha;
    }

    public void setTmpc_tcfecha(LocalDate tmpc_tcfecha) {
        this.tmpc_tcfecha = tmpc_tcfecha;
    }

    public String getTmpc_glosa() {
        return this.tmpc_glosa;
    }

    public void setTmpc_glosa(String tmpc_glosa) {
        this.tmpc_glosa = tmpc_glosa;
    }

    public String getTmpc_origen() {
        return this.tmpc_origen;
    }

    public void setTmpc_origen(String tmpc_origen) {
        this.tmpc_origen = tmpc_origen;
    }

    public String getTmpc_flagconv() {
        return this.tmpc_flagconv;
    }

    public void setTmpc_flagconv(String tmpc_flagconv) {
        this.tmpc_flagconv = tmpc_flagconv;
    }

    public String getTmpc_form() {
        return this.tmpc_form;
    }

    public void setTmpc_form(String tmpc_form) {
        this.tmpc_form = tmpc_form;
    }

    public String getTmpc_extor() {
        return this.tmpc_extor;
    }

    public void setTmpc_extor(String tmpc_extor) {
        this.tmpc_extor = tmpc_extor;
    }

    public String getTmpc_ctaPag() {
        return this.tmpc_ctaPag;
    }

    public void setTmpc_ctaPag(String tmpc_ctaPag) {
        this.tmpc_ctaPag = tmpc_ctaPag;
    }

    public String getTmpc_ctaCmp() {
        return this.tmpc_ctaCmp;
    }

    public void setTmpc_ctaCmp(String tmpc_ctaCmp) {
        this.tmpc_ctaCmp = tmpc_ctaCmp;
    }
    

}
