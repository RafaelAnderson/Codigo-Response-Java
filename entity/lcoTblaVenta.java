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
@Table(name = "lco0001vnta")
public class lcoTblaVenta {
    @EmbeddedId
    private lcoTblaVentaPk pkID;

    @Column
    private LocalDate av_feccom;
    @Column
    private LocalDate av_fecdoc;
    @Column
    private LocalDate av_fecven;
    @Column
    private String av_tipdoc;
    @Column
    private String av_docser;
    @Column
    private String av_docnum;
    @Column
    private String av_numdoc;
    @Column
    private String av_tipane;
    @Column
    private String av_codane;
    @Column
    private String av_tipide;
    @Column
    private String av_numide;
    @Column
    private String av_nomane;
    @Column
    private String av_codmon;
    @Column
    private Double av_afemn;
    @Column
    private Double av_inamn;
    @Column
    private Double av_iscmn;
    @Column
    private Double av_exomn;
    @Column
    private Double av_igvmn;
    @Column
    private Double av_ivamn;
    @Column
    private Double av_otrmn;
    @Column
    private Double av_desmn;
    @Column
    private Double av_idemn;
    @Column
    private Double av_expmn;
    @Column
    private Double av_icbpmn;
    @Column
    private Double av_importmn;
    @Column
    private Double av_afeme;
    @Column
    private Double av_iname;
    @Column
    private Double av_iscme;
    @Column
    private Double av_exome;
    @Column
    private Double av_igvme;
    @Column
    private Double av_ivame;
    @Column
    private Double av_otrme;
    @Column
    private Double av_desme;
    @Column
    private Double av_ideme;
    @Column
    private Double av_expme;
    @Column
    private Double av_icbpme;
    @Column
    private Double av_importme;
    @Column 
    private String av_tctipo;
    @Column
    private Double av_tipcamb;
    @Column
    private Double av_porcigv;
    @Column
    private LocalDate av_fecdocref;
    @Column
    private String av_tipdocref;
    @Column
    private String av_docserref;
    @Column
    private String av_docnumref;
    @Column
    private String av_usrcrea;
    @Column
    private LocalDate av_feccrea;
    @Column
    private LocalTime av_hracrea;
    @Column
    private String av_usract;
    @Column
    private LocalDate av_fecact;
    @Column
    private LocalTime av_hraact;
    @Column
    private String av_secuen;
    @Column
    private String av_cuenta;
    @Column
    private String av_perrec;
    @Column
    private String av_medpag;
    @Column
    private String av_estado;
    @Column
    private String av_cencos;
    @Column
    private String av_proy;
    public lcoTblaVenta(lcoTblaVentaPk pkID, LocalDate av_feccom, LocalDate av_fecdoc, LocalDate av_fecven,
            String av_tipdoc, String av_docser, String av_docnum, String av_numdoc, String av_tipane, String av_codane,
            String av_tipide, String av_numide, String av_nomane, String av_codmon, Double av_afemn, Double av_inamn,
            Double av_iscmn, Double av_exomn, Double av_igvmn, Double av_ivamn, Double av_otrmn, Double av_desmn,
            Double av_idemn, Double av_expmn, Double av_icbpmn, Double av_importmn, Double av_afeme, Double av_iname,
            Double av_iscme, Double av_exome, Double av_igvme, Double av_ivame, Double av_otrme, Double av_desme,
            Double av_ideme, Double av_expme, Double av_icbpme, Double av_importme, String av_tctipo, Double av_tipcamb,
            Double av_porcigv, LocalDate av_fecdocref, String av_tipdocref, String av_docserref, String av_docnumref,
            String av_usrcrea, LocalDate av_feccrea, LocalTime av_hracrea, String av_usract, LocalDate av_fecact,
            LocalTime av_hraact, String av_secuen, String av_cuenta, String av_perrec, String av_medpag,
            String av_estado, String av_cencos, String av_proy) {
        this.pkID = pkID;
        this.av_feccom = av_feccom;
        this.av_fecdoc = av_fecdoc;
        this.av_fecven = av_fecven;
        this.av_tipdoc = av_tipdoc;
        this.av_docser = av_docser;
        this.av_docnum = av_docnum;
        this.av_numdoc = av_numdoc;
        this.av_tipane = av_tipane;
        this.av_codane = av_codane;
        this.av_tipide = av_tipide;
        this.av_numide = av_numide;
        this.av_nomane = av_nomane;
        this.av_codmon = av_codmon;
        this.av_afemn = av_afemn;
        this.av_inamn = av_inamn;
        this.av_iscmn = av_iscmn;
        this.av_exomn = av_exomn;
        this.av_igvmn = av_igvmn;
        this.av_ivamn = av_ivamn;
        this.av_otrmn = av_otrmn;
        this.av_desmn = av_desmn;
        this.av_idemn = av_idemn;
        this.av_expmn = av_expmn;
        this.av_icbpmn = av_icbpmn;
        this.av_importmn = av_importmn;
        this.av_afeme = av_afeme;
        this.av_iname = av_iname;
        this.av_iscme = av_iscme;
        this.av_exome = av_exome;
        this.av_igvme = av_igvme;
        this.av_ivame = av_ivame;
        this.av_otrme = av_otrme;
        this.av_desme = av_desme;
        this.av_ideme = av_ideme;
        this.av_expme = av_expme;
        this.av_icbpme = av_icbpme;
        this.av_importme = av_importme;
        this.av_tctipo = av_tctipo;
        this.av_tipcamb = av_tipcamb;
        this.av_porcigv = av_porcigv;
        this.av_fecdocref = av_fecdocref;
        this.av_tipdocref = av_tipdocref;
        this.av_docserref = av_docserref;
        this.av_docnumref = av_docnumref;
        this.av_usrcrea = av_usrcrea;
        this.av_feccrea = av_feccrea;
        this.av_hracrea = av_hracrea;
        this.av_usract = av_usract;
        this.av_fecact = av_fecact;
        this.av_hraact = av_hraact;
        this.av_secuen = av_secuen;
        this.av_cuenta = av_cuenta;
        this.av_perrec = av_perrec;
        this.av_medpag = av_medpag;
        this.av_estado = av_estado;
        this.av_cencos = av_cencos;
        this.av_proy = av_proy;
    }
    public lcoTblaVenta() {
    }
    public lcoTblaVentaPk getPkID() {
        return pkID;
    }
    public void setPkID(lcoTblaVentaPk pkID) {
        this.pkID = pkID;
    }
    public LocalDate getAv_feccom() {
        return av_feccom;
    }
    public void setAv_feccom(LocalDate av_feccom) {
        this.av_feccom = av_feccom;
    }
    public LocalDate getAv_fecdoc() {
        return av_fecdoc;
    }
    public void setAv_fecdoc(LocalDate av_fecdoc) {
        this.av_fecdoc = av_fecdoc;
    }
    public LocalDate getAv_fecven() {
        return av_fecven;
    }
    public void setAv_fecven(LocalDate av_fecven) {
        this.av_fecven = av_fecven;
    }
    public String getAv_tipdoc() {
        return av_tipdoc;
    }
    public void setAv_tipdoc(String av_tipdoc) {
        this.av_tipdoc = av_tipdoc;
    }
    public String getAv_docser() {
        return av_docser;
    }
    public void setAv_docser(String av_docser) {
        this.av_docser = av_docser;
    }
    public String getAv_docnum() {
        return av_docnum;
    }
    public void setAv_docnum(String av_docnum) {
        this.av_docnum = av_docnum;
    }
    public String getAv_numdoc() {
        return av_numdoc;
    }
    public void setAv_numdoc(String av_numdoc) {
        this.av_numdoc = av_numdoc;
    }
    public String getAv_tipane() {
        return av_tipane;
    }
    public void setAv_tipane(String av_tipane) {
        this.av_tipane = av_tipane;
    }
    public String getAv_codane() {
        return av_codane;
    }
    public void setAv_codane(String av_codane) {
        this.av_codane = av_codane;
    }
    public String getAv_tipide() {
        return av_tipide;
    }
    public void setAv_tipide(String av_tipide) {
        this.av_tipide = av_tipide;
    }
    public String getAv_numide() {
        return av_numide;
    }
    public void setAv_numide(String av_numide) {
        this.av_numide = av_numide;
    }
    public String getAv_nomane() {
        return av_nomane;
    }
    public void setAv_nomane(String av_nomane) {
        this.av_nomane = av_nomane;
    }
    public String getAv_codmon() {
        return av_codmon;
    }
    public void setAv_codmon(String av_codmon) {
        this.av_codmon = av_codmon;
    }
    public Double getAv_afemn() {
        return av_afemn;
    }
    public void setAv_afemn(Double av_afemn) {
        this.av_afemn = av_afemn;
    }
    public Double getAv_inamn() {
        return av_inamn;
    }
    public void setAv_inamn(Double av_inamn) {
        this.av_inamn = av_inamn;
    }
    public Double getAv_iscmn() {
        return av_iscmn;
    }
    public void setAv_iscmn(Double av_iscmn) {
        this.av_iscmn = av_iscmn;
    }
    public Double getAv_exomn() {
        return av_exomn;
    }
    public void setAv_exomn(Double av_exomn) {
        this.av_exomn = av_exomn;
    }
    public Double getAv_igvmn() {
        return av_igvmn;
    }
    public void setAv_igvmn(Double av_igvmn) {
        this.av_igvmn = av_igvmn;
    }
    public Double getAv_ivamn() {
        return av_ivamn;
    }
    public void setAv_ivamn(Double av_ivamn) {
        this.av_ivamn = av_ivamn;
    }
    public Double getAv_otrmn() {
        return av_otrmn;
    }
    public void setAv_otrmn(Double av_otrmn) {
        this.av_otrmn = av_otrmn;
    }
    public Double getAv_desmn() {
        return av_desmn;
    }
    public void setAv_desmn(Double av_desmn) {
        this.av_desmn = av_desmn;
    }
    public Double getAv_idemn() {
        return av_idemn;
    }
    public void setAv_idemn(Double av_idemn) {
        this.av_idemn = av_idemn;
    }
    public Double getAv_expmn() {
        return av_expmn;
    }
    public void setAv_expmn(Double av_expmn) {
        this.av_expmn = av_expmn;
    }
    public Double getAv_icbpmn() {
        return av_icbpmn;
    }
    public void setAv_icbpmn(Double av_icbpmn) {
        this.av_icbpmn = av_icbpmn;
    }
    public Double getAv_importmn() {
        return av_importmn;
    }
    public void setAv_importmn(Double av_importmn) {
        this.av_importmn = av_importmn;
    }
    public Double getAv_afeme() {
        return av_afeme;
    }
    public void setAv_afeme(Double av_afeme) {
        this.av_afeme = av_afeme;
    }
    public Double getAv_iname() {
        return av_iname;
    }
    public void setAv_iname(Double av_iname) {
        this.av_iname = av_iname;
    }
    public Double getAv_iscme() {
        return av_iscme;
    }
    public void setAv_iscme(Double av_iscme) {
        this.av_iscme = av_iscme;
    }
    public Double getAv_exome() {
        return av_exome;
    }
    public void setAv_exome(Double av_exome) {
        this.av_exome = av_exome;
    }
    public Double getAv_igvme() {
        return av_igvme;
    }
    public void setAv_igvme(Double av_igvme) {
        this.av_igvme = av_igvme;
    }
    public Double getAv_ivame() {
        return av_ivame;
    }
    public void setAv_ivame(Double av_ivame) {
        this.av_ivame = av_ivame;
    }
    public Double getAv_otrme() {
        return av_otrme;
    }
    public void setAv_otrme(Double av_otrme) {
        this.av_otrme = av_otrme;
    }
    public Double getAv_desme() {
        return av_desme;
    }
    public void setAv_desme(Double av_desme) {
        this.av_desme = av_desme;
    }
    public Double getAv_ideme() {
        return av_ideme;
    }
    public void setAv_ideme(Double av_ideme) {
        this.av_ideme = av_ideme;
    }
    public Double getAv_expme() {
        return av_expme;
    }
    public void setAv_expme(Double av_expme) {
        this.av_expme = av_expme;
    }
    public Double getAv_icbpme() {
        return av_icbpme;
    }
    public void setAv_icbpme(Double av_icbpme) {
        this.av_icbpme = av_icbpme;
    }
    public Double getAv_importme() {
        return av_importme;
    }
    public void setAv_importme(Double av_importme) {
        this.av_importme = av_importme;
    }
    public String getAv_tctipo() {
        return av_tctipo;
    }
    public void setAv_tctipo(String av_tctipo) {
        this.av_tctipo = av_tctipo;
    }
    public Double getAv_tipcamb() {
        return av_tipcamb;
    }
    public void setAv_tipcamb(Double av_tipcamb) {
        this.av_tipcamb = av_tipcamb;
    }
    public Double getAv_porcigv() {
        return av_porcigv;
    }
    public void setAv_porcigv(Double av_porcigv) {
        this.av_porcigv = av_porcigv;
    }
    public LocalDate getAv_fecdocref() {
        return av_fecdocref;
    }
    public void setAv_fecdocref(LocalDate av_fecdocref) {
        this.av_fecdocref = av_fecdocref;
    }
    public String getAv_tipdocref() {
        return av_tipdocref;
    }
    public void setAv_tipdocref(String av_tipdocref) {
        this.av_tipdocref = av_tipdocref;
    }
    public String getAv_docserref() {
        return av_docserref;
    }
    public void setAv_docserref(String av_docserref) {
        this.av_docserref = av_docserref;
    }
    public String getAv_docnumref() {
        return av_docnumref;
    }
    public void setAv_docnumref(String av_docnumref) {
        this.av_docnumref = av_docnumref;
    }
    public String getAv_usrcrea() {
        return av_usrcrea;
    }
    public void setAv_usrcrea(String av_usrcrea) {
        this.av_usrcrea = av_usrcrea;
    }
    public LocalDate getAv_feccrea() {
        return av_feccrea;
    }
    public void setAv_feccrea(LocalDate av_feccrea) {
        this.av_feccrea = av_feccrea;
    }
    public LocalTime getAv_hracrea() {
        return av_hracrea;
    }
    public void setAv_hracrea(LocalTime av_hracrea) {
        this.av_hracrea = av_hracrea;
    }
    public String getAv_usract() {
        return av_usract;
    }
    public void setAv_usract(String av_usract) {
        this.av_usract = av_usract;
    }
    public LocalDate getAv_fecact() {
        return av_fecact;
    }
    public void setAv_fecact(LocalDate av_fecact) {
        this.av_fecact = av_fecact;
    }
    public LocalTime getAv_hraact() {
        return av_hraact;
    }
    public void setAv_hraact(LocalTime av_hraact) {
        this.av_hraact = av_hraact;
    }
    public String getAv_secuen() {
        return av_secuen;
    }
    public void setAv_secuen(String av_secuen) {
        this.av_secuen = av_secuen;
    }
    public String getAv_cuenta() {
        return av_cuenta;
    }
    public void setAv_cuenta(String av_cuenta) {
        this.av_cuenta = av_cuenta;
    }
    public String getAv_perrec() {
        return av_perrec;
    }
    public void setAv_perrec(String av_perrec) {
        this.av_perrec = av_perrec;
    }
    public String getAv_medpag() {
        return av_medpag;
    }
    public void setAv_medpag(String av_medpag) {
        this.av_medpag = av_medpag;
    }
    public String getAv_estado() {
        return av_estado;
    }
    public void setAv_estado(String av_estado) {
        this.av_estado = av_estado;
    }
    public String getAv_cencos() {
        return av_cencos;
    }
    public void setAv_cencos(String av_cencos) {
        this.av_cencos = av_cencos;
    }
    public String getAv_proy() {
        return av_proy;
    }
    public void setAv_proy(String av_proy) {
        this.av_proy = av_proy;
    }

   

}
