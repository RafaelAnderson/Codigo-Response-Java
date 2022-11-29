package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import lombok.Data;

@Data
@Entity
@Table(name = "lco0001cmpa")
public class lcocmpa {
    @EmbeddedId
    private lcocmpaPk pkID;
    @Column
    private LocalDate ac_feccom;
    @Column
    private LocalDate ac_fecdoc;
    @Column
    private LocalDate ac_fecven;
    @Column
    private String ac_tipdoc;
    @Column
    private String ac_docser;
    @Column
    private String ac_docnum;
    @Column
    private String ac_numdoc;
    @Column
    private String ac_tipane;
    @Column
    private String ac_codane;
    @Column
    private String ac_tipide;
    @Column
    private String ac_numide;
    @Column
    private String ac_nomane;
    @Column
    private String ac_codmon;
    @Column
    private Double ac_afemn;
    @Column
    private Double ac_inamn;
    @Column
    private Double ac_igvmn;
    @Column
    private Double ac_importmn;
    @Column
    private Double ac_iscmn;
    @Column
    private Double ac_otrmn;
    @Column
    private Double ac_idemn;
    @Column
    private Double ac_afeme;
    @Column
    private Double ac_iname;
    @Column
    private Double ac_igvme;
    @Column
    private Double ac_importme;
    @Column
    private Double ac_iscme;
    @Column
    private Double ac_otrme;
    @Column
    private Double ac_ideme;
    @Column
    private String ac_numdet;
    @Column
    private LocalDate ac_fecdet;
    @Column
    private Double ac_tipcamb;
    @Column
    private LocalDate ac_fecdocref;
    @Column
    private String ac_tipdocref;
    @Column
    private String ac_docserref;
    @Column
    private String ac_docnumref;
    @Column
    private LocalDate ac_feccrea;
    @Column
    private LocalTime ac_hracrea;
    @Column
    private String ac_usrcrea;
    @Column
    private LocalDate ac_fecact;
    @Column
    private LocalTime ac_hraact;
    @Column
    private String ac_usract;
    @Column
    private Double ac_recmn;
    @Column
    private Double ac_recme;
    @Column
    private String ac_codcla;
    @Column
    private String ac_secuen;
    @Column
    private String ac_cuenta;
    @Column
    private String ac_perrec;
    @Column
    private String ac_medpag;
    @Column
    private String ac_estado;
    @Column
    private String ac_datadi;
    @Column
    private String ac_coddet;
    @Column
    private Double ac_icbpmn;
    @Column
    private Double ac_icbpme;
    @Column
    private Double ac_irlqmn;
    @Column
    private Double ac_irlqme;

    public lcocmpa(lcocmpaPk pkID, LocalDate ac_feccom, LocalDate ac_fecdoc, LocalDate ac_fecven, String ac_tipdoc,
            String ac_docser, String ac_docnum, String ac_numdoc, String ac_tipane, String ac_codane, String ac_tipide,
            String ac_numide, String ac_nomane, String ac_codmon, Double ac_afemn, Double ac_inamn, Double ac_igvmn,
            Double ac_importmn, Double ac_iscmn, Double ac_otrmn, Double ac_idemn, Double ac_afeme, Double ac_iname,
            Double ac_igvme, Double ac_importme, Double ac_iscme, Double ac_otrme, Double ac_ideme, String ac_numdet,
            LocalDate ac_fecdet, Double ac_tipcamb, LocalDate ac_fecdocref, String ac_tipdocref, String ac_docserref,
            String ac_docnumref, LocalDate ac_feccrea, LocalTime ac_hracrea, String ac_usrcrea, LocalDate ac_fecact,
            LocalTime ac_hraact, String ac_usract, Double ac_recmn, Double ac_recme, String ac_codcla, String ac_secuen,
            String ac_cuenta, String ac_perrec, String ac_medpag, String ac_estado, String ac_datadi, String ac_coddet,
            Double ac_icbpmn, Double ac_icbpme, Double ac_irlqmn, Double ac_irlqme) {
        this.pkID = pkID;
        this.ac_feccom = ac_feccom;
        this.ac_fecdoc = ac_fecdoc;
        this.ac_fecven = ac_fecven;
        this.ac_tipdoc = ac_tipdoc;
        this.ac_docser = ac_docser;
        this.ac_docnum = ac_docnum;
        this.ac_numdoc = ac_numdoc;
        this.ac_tipane = ac_tipane;
        this.ac_codane = ac_codane;
        this.ac_tipide = ac_tipide;
        this.ac_numide = ac_numide;
        this.ac_nomane = ac_nomane;
        this.ac_codmon = ac_codmon;
        this.ac_afemn = ac_afemn;
        this.ac_inamn = ac_inamn;
        this.ac_igvmn = ac_igvmn;
        this.ac_importmn = ac_importmn;
        this.ac_iscmn = ac_iscmn;
        this.ac_otrmn = ac_otrmn;
        this.ac_idemn = ac_idemn;
        this.ac_afeme = ac_afeme;
        this.ac_iname = ac_iname;
        this.ac_igvme = ac_igvme;
        this.ac_importme = ac_importme;
        this.ac_iscme = ac_iscme;
        this.ac_otrme = ac_otrme;
        this.ac_ideme = ac_ideme;
        this.ac_numdet = ac_numdet;
        this.ac_fecdet = ac_fecdet;
        this.ac_tipcamb = ac_tipcamb;
        this.ac_fecdocref = ac_fecdocref;
        this.ac_tipdocref = ac_tipdocref;
        this.ac_docserref = ac_docserref;
        this.ac_docnumref = ac_docnumref;
        this.ac_feccrea = ac_feccrea;
        this.ac_hracrea = ac_hracrea;
        this.ac_usrcrea = ac_usrcrea;
        this.ac_fecact = ac_fecact;
        this.ac_hraact = ac_hraact;
        this.ac_usract = ac_usract;
        this.ac_recmn = ac_recmn;
        this.ac_recme = ac_recme;
        this.ac_codcla = ac_codcla;
        this.ac_secuen = ac_secuen;
        this.ac_cuenta = ac_cuenta;
        this.ac_perrec = ac_perrec;
        this.ac_medpag = ac_medpag;
        this.ac_estado = ac_estado;
        this.ac_datadi = ac_datadi;
        this.ac_coddet = ac_coddet;
        this.ac_icbpmn = ac_icbpmn;
        this.ac_icbpme = ac_icbpme;
        this.ac_irlqmn = ac_irlqmn;
        this.ac_irlqme = ac_irlqme;
    }

    public lcocmpa() {
    }

    public lcocmpaPk getPkID() {
        return pkID;
    }

    public void setPkID(lcocmpaPk pkID) {
        this.pkID = pkID;
    }

    public LocalDate getAc_feccom() {
        return ac_feccom;
    }

    public void setAc_feccom(LocalDate ac_feccom) {
        this.ac_feccom = ac_feccom;
    }

    public LocalDate getAc_fecdoc() {
        return ac_fecdoc;
    }

    public void setAc_fecdoc(LocalDate ac_fecdoc) {
        this.ac_fecdoc = ac_fecdoc;
    }

    public LocalDate getAc_fecven() {
        return ac_fecven;
    }

    public void setAc_fecven(LocalDate ac_fecven) {
        this.ac_fecven = ac_fecven;
    }

    public String getAc_tipdoc() {
        return ac_tipdoc;
    }

    public void setAc_tipdoc(String ac_tipdoc) {
        this.ac_tipdoc = ac_tipdoc;
    }

    public String getAc_docser() {
        return ac_docser;
    }

    public void setAc_docser(String ac_docser) {
        this.ac_docser = ac_docser;
    }

    public String getAc_docnum() {
        return ac_docnum;
    }

    public void setAc_docnum(String ac_docnum) {
        this.ac_docnum = ac_docnum;
    }

    public String getAc_numdoc() {
        return ac_numdoc;
    }

    public void setAc_numdoc(String ac_numdoc) {
        this.ac_numdoc = ac_numdoc;
    }

    public String getAc_tipane() {
        return ac_tipane;
    }

    public void setAc_tipane(String ac_tipane) {
        this.ac_tipane = ac_tipane;
    }

    public String getAc_codane() {
        return ac_codane;
    }

    public void setAc_codane(String ac_codane) {
        this.ac_codane = ac_codane;
    }

    public String getAc_tipide() {
        return ac_tipide;
    }

    public void setAc_tipide(String ac_tipide) {
        this.ac_tipide = ac_tipide;
    }

    public String getAc_numide() {
        return ac_numide;
    }

    public void setAc_numide(String ac_numide) {
        this.ac_numide = ac_numide;
    }

    public String getAc_nomane() {
        return ac_nomane;
    }

    public void setAc_nomane(String ac_nomane) {
        this.ac_nomane = ac_nomane;
    }

    public String getAc_codmon() {
        return ac_codmon;
    }

    public void setAc_codmon(String ac_codmon) {
        this.ac_codmon = ac_codmon;
    }

    public Double getAc_afemn() {
        return ac_afemn;
    }

    public void setAc_afemn(Double ac_afemn) {
        this.ac_afemn = ac_afemn;
    }

    public Double getAc_inamn() {
        return ac_inamn;
    }

    public void setAc_inamn(Double ac_inamn) {
        this.ac_inamn = ac_inamn;
    }

    public Double getAc_igvmn() {
        return ac_igvmn;
    }

    public void setAc_igvmn(Double ac_igvmn) {
        this.ac_igvmn = ac_igvmn;
    }

    public Double getAc_importmn() {
        return ac_importmn;
    }

    public void setAc_importmn(Double ac_importmn) {
        this.ac_importmn = ac_importmn;
    }

    public Double getAc_iscmn() {
        return ac_iscmn;
    }

    public void setAc_iscmn(Double ac_iscmn) {
        this.ac_iscmn = ac_iscmn;
    }

    public Double getAc_otrmn() {
        return ac_otrmn;
    }

    public void setAc_otrmn(Double ac_otrmn) {
        this.ac_otrmn = ac_otrmn;
    }

    public Double getAc_idemn() {
        return ac_idemn;
    }

    public void setAc_idemn(Double ac_idemn) {
        this.ac_idemn = ac_idemn;
    }

    public Double getAc_afeme() {
        return ac_afeme;
    }

    public void setAc_afeme(Double ac_afeme) {
        this.ac_afeme = ac_afeme;
    }

    public Double getAc_iname() {
        return ac_iname;
    }

    public void setAc_iname(Double ac_iname) {
        this.ac_iname = ac_iname;
    }

    public Double getAc_igvme() {
        return ac_igvme;
    }

    public void setAc_igvme(Double ac_igvme) {
        this.ac_igvme = ac_igvme;
    }

    public Double getAc_importme() {
        return ac_importme;
    }

    public void setAc_importme(Double ac_importme) {
        this.ac_importme = ac_importme;
    }

    public Double getAc_iscme() {
        return ac_iscme;
    }

    public void setAc_iscme(Double ac_iscme) {
        this.ac_iscme = ac_iscme;
    }

    public Double getAc_otrme() {
        return ac_otrme;
    }

    public void setAc_otrme(Double ac_otrme) {
        this.ac_otrme = ac_otrme;
    }

    public Double getAc_ideme() {
        return ac_ideme;
    }

    public void setAc_ideme(Double ac_ideme) {
        this.ac_ideme = ac_ideme;
    }

    public String getAc_numdet() {
        return ac_numdet;
    }

    public void setAc_numdet(String ac_numdet) {
        this.ac_numdet = ac_numdet;
    }

    public LocalDate getAc_fecdet() {
        return ac_fecdet;
    }

    public void setAc_fecdet(LocalDate ac_fecdet) {
        this.ac_fecdet = ac_fecdet;
    }

    public Double getAc_tipcamb() {
        return ac_tipcamb;
    }

    public void setAc_tipcamb(Double ac_tipcamb) {
        this.ac_tipcamb = ac_tipcamb;
    }

    public LocalDate getAc_fecdocref() {
        return ac_fecdocref;
    }

    public void setAc_fecdocref(LocalDate ac_fecdocref) {
        this.ac_fecdocref = ac_fecdocref;
    }

    public String getAc_tipdocref() {
        return ac_tipdocref;
    }

    public void setAc_tipdocref(String ac_tipdocref) {
        this.ac_tipdocref = ac_tipdocref;
    }

    public String getAc_docserref() {
        return ac_docserref;
    }

    public void setAc_docserref(String ac_docserref) {
        this.ac_docserref = ac_docserref;
    }

    public String getAc_docnumref() {
        return ac_docnumref;
    }

    public void setAc_docnumref(String ac_docnumref) {
        this.ac_docnumref = ac_docnumref;
    }

    public LocalDate getAc_feccrea() {
        return ac_feccrea;
    }

    public void setAc_feccrea(LocalDate ac_feccrea) {
        this.ac_feccrea = ac_feccrea;
    }

    public LocalTime getAc_hracrea() {
        return ac_hracrea;
    }

    public void setAc_hracrea(LocalTime ac_hracrea) {
        this.ac_hracrea = ac_hracrea;
    }

    public String getAc_usrcrea() {
        return ac_usrcrea;
    }

    public void setAc_usrcrea(String ac_usrcrea) {
        this.ac_usrcrea = ac_usrcrea;
    }

    public LocalDate getAc_fecact() {
        return ac_fecact;
    }

    public void setAc_fecact(LocalDate ac_fecact) {
        this.ac_fecact = ac_fecact;
    }

    public LocalTime getAc_hraact() {
        return ac_hraact;
    }

    public void setAc_hraact(LocalTime ac_hraact) {
        this.ac_hraact = ac_hraact;
    }

    public String getAc_usract() {
        return ac_usract;
    }

    public void setAc_usract(String ac_usract) {
        this.ac_usract = ac_usract;
    }

    public Double getAc_recmn() {
        return ac_recmn;
    }

    public void setAc_recmn(Double ac_recmn) {
        this.ac_recmn = ac_recmn;
    }

    public Double getAc_recme() {
        return ac_recme;
    }

    public void setAc_recme(Double ac_recme) {
        this.ac_recme = ac_recme;
    }

    public String getAc_codcla() {
        return ac_codcla;
    }

    public void setAc_codcla(String ac_codcla) {
        this.ac_codcla = ac_codcla;
    }

    public String getAc_secuen() {
        return ac_secuen;
    }

    public void setAc_secuen(String ac_secuen) {
        this.ac_secuen = ac_secuen;
    }

    public String getAc_cuenta() {
        return ac_cuenta;
    }

    public void setAc_cuenta(String ac_cuenta) {
        this.ac_cuenta = ac_cuenta;
    }

    public String getAc_perrec() {
        return ac_perrec;
    }

    public void setAc_perrec(String ac_perrec) {
        this.ac_perrec = ac_perrec;
    }

    public String getAc_medpag() {
        return ac_medpag;
    }

    public void setAc_medpag(String ac_medpag) {
        this.ac_medpag = ac_medpag;
    }

    public String getAc_estado() {
        return ac_estado;
    }

    public void setAc_estado(String ac_estado) {
        this.ac_estado = ac_estado;
    }

    public String getAc_datadi() {
        return ac_datadi;
    }

    public void setAc_datadi(String ac_datadi) {
        this.ac_datadi = ac_datadi;
    }

    public String getAc_coddet() {
        return ac_coddet;
    }

    public void setAc_coddet(String ac_coddet) {
        this.ac_coddet = ac_coddet;
    }

    public Double getAc_icbpmn() {
        return ac_icbpmn;
    }

    public void setAc_icbpmn(Double ac_icbpmn) {
        this.ac_icbpmn = ac_icbpmn;
    }

    public Double getAc_icbpme() {
        return ac_icbpme;
    }

    public void setAc_icbpme(Double ac_icbpme) {
        this.ac_icbpme = ac_icbpme;
    }

    public Double getAc_irlqmn() {
        return ac_irlqmn;
    }

    public void setAc_irlqmn(Double ac_irlqmn) {
        this.ac_irlqmn = ac_irlqmn;
    }

    public Double getAc_irlqme() {
        return ac_irlqme;
    }

    public void setAc_irlqme(Double ac_irlqme) {
        this.ac_irlqme = ac_irlqme;
    }
    @Override
    public String toString() {
        return "lcocmpa [ac_afeme=" + ac_afeme + ", ac_afemn=" + ac_afemn + ", ac_codane=" + ac_codane + ", ac_codcla="
                + ac_codcla + ", ac_coddet=" + ac_coddet + ", ac_codmon=" + ac_codmon + ", ac_cuenta=" + ac_cuenta
                + ", ac_datadi=" + ac_datadi + ", ac_docnum=" + ac_docnum + ", ac_docnumref=" + ac_docnumref
                + ", ac_docser=" + ac_docser + ", ac_docserref=" + ac_docserref + ", ac_estado=" + ac_estado
                + ", ac_fecact=" + ac_fecact + ", ac_feccom=" + ac_feccom + ", ac_feccrea=" + ac_feccrea
                + ", ac_fecdet=" + ac_fecdet + ", ac_fecdoc=" + ac_fecdoc + ", ac_fecdocref=" + ac_fecdocref
                + ", ac_fecven=" + ac_fecven + ", ac_hraact=" + ac_hraact + ", ac_hracrea=" + ac_hracrea
                + ", ac_icbpme=" + ac_icbpme + ", ac_icbpmn=" + ac_icbpmn + ", ac_ideme=" + ac_ideme + ", ac_idemn="
                + ac_idemn + ", ac_igvme=" + ac_igvme + ", ac_igvmn=" + ac_igvmn + ", ac_importme=" + ac_importme
                + ", ac_importmn=" + ac_importmn + ", ac_iname=" + ac_iname + ", ac_inamn=" + ac_inamn + ", ac_irlqme="
                + ac_irlqme + ", ac_irlqmn=" + ac_irlqmn + ", ac_iscme=" + ac_iscme + ", ac_iscmn=" + ac_iscmn
                + ", ac_medpag=" + ac_medpag + ", ac_nomane=" + ac_nomane + ", ac_numdet=" + ac_numdet + ", ac_numdoc="
                + ac_numdoc + ", ac_numide=" + ac_numide + ", ac_otrme=" + ac_otrme + ", ac_otrmn=" + ac_otrmn
                + ", ac_perrec=" + ac_perrec + ", ac_recme=" + ac_recme + ", ac_recmn=" + ac_recmn + ", ac_secuen="
                + ac_secuen + ", ac_tipane=" + ac_tipane + ", ac_tipcamb=" + ac_tipcamb + ", ac_tipdoc=" + ac_tipdoc
                + ", ac_tipdocref=" + ac_tipdocref + ", ac_tipide=" + ac_tipide + ", ac_usract=" + ac_usract
                + ", ac_usrcrea=" + ac_usrcrea + ", pkID=" + pkID + "]";
    }
}