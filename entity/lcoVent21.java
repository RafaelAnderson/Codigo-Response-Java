package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lcoVent2101")
public class lcoVent21 {
    @EmbeddedId
        private lcoVent21Pk pk;
    @Column 
        private LocalDate rv_feccom;
    @Column 
        private LocalDate rv_fecdoc;
    @Column
        private LocalDate rv_fecven;    
    @Column
        private String rv_tipdoc;    
    @Column
        private String rv_serdoc;    
    @Column
        private String rv_nrodoc;
        
    @Column
        private String rv_nrodini;

    @Column
        private String rv_nrodfin;

    @Column 
        private String rv_numdoc;
    @Column
        private String rv_tipane;
    @Column
        private String rv_codane;
    @Column
        private String rv_tpdocide;
    @Column
        private String rv_rucane;
    @Column
        private String rv_nomane;
    @Column
        private String rv_codmon;
    @Column
        private Double rv_afemn;
    @Column
        private Double rv_inamn;
    @Column 
        private Double rv_iscmn; 
    @Column
        private Double rv_exomn;
    @Column
        private Double rv_igvmn;
    @Column
        private Double rv_impomn;
    @Column
        private Double rv_otrmn;
    @Column
        private Double rv_detmn;
    @Column
        private Double rv_expmn;
    @Column
        private Double rv_afeme;
    @Column
        private Double rv_iname;
    @Column
        private Double rv_iscme;
    @Column
        private Double rv_exome;
    @Column
        private Double rv_igvme;
    @Column
        private Double rv_impome;
    @Column
        private Double rv_otrme;
    @Column
        private Double rv_detme;
    @Column
        private Double rv_expme;
    @Column
        private Double rv_tipcam;
    @Column
        private Double rv_porigv;
    @Column
        private Double rv_bivapmn;
    @Column
        private Double rv_bivapme;
    @Column
        private LocalDate rv_fedore;
    @Column
        private String rv_tidore;
    @Column
        private String rv_sedore;
    @Column
        private String rv_nudere;
    @Column
        private LocalDate rv_feccre;
    @Column
        private LocalTime rv_horcre;
    @Column
        private String rv_usucre;
    @Column
        private LocalDate rv_fecmod;
    @Column
        private LocalTime rv_hormod;
    @Column
        private String rv_usumod;
    @Column
        private String rv_cencos;
    @Column
        private Double rv_bolmn;
    @Column
        private Double rv_bolme;
    @Column
        private Double rv_ivapmn;
    @Column
        private Double rv_ivapme;
    @Column
        private String rv_medpag;
    @Column
        private String rv_estado;
    @Column
        private Double rv_descto;
    @Column
        private Double rv_impdsct;
    public lcoVent21() {
    }
    public lcoVent21(lcoVent21Pk pk, LocalDate rv_feccom, LocalDate rv_fecdoc, LocalDate rv_fecven, String rv_tipdoc,
            String rv_serdoc, String rv_nrodoc, String rv_nrodini, String rv_nrodfin, String rv_numdoc, String rv_tipane, String rv_codane,
            String rv_tpdocide, String rv_rucane, String rv_nomane, String rv_codmon, Double rv_afemn, Double rv_inamn,
            Double rv_iscmn, Double rv_exomn, Double rv_igvmn, Double rv_impomn, Double rv_otrmn, Double rv_detmn,
            Double rv_expmn, Double rv_afeme, Double rv_iname, Double rv_iscme, Double rv_exome, Double rv_igvme,
            Double rv_impome, Double rv_otrme, Double rv_detme, Double rv_expme, Double rv_tipcam, Double rv_porigv, Double rv_bivapmn, Double rv_bivapme,
            LocalDate rv_fedore, String rv_tidore, String rv_sedore, String rv_nudere, LocalDate rv_feccre,
            LocalTime rv_horcre, String rv_usucre, LocalDate rv_fecmod, LocalTime rv_hormod, String rv_usumod,
            String rv_cencos, Double rv_bolmn, Double rv_bolme, Double rv_ivapmn, Double rv_ivapme, String rv_medpag,
            String rv_estado, Double rv_descto, Double rv_impdsct) {
        this.pk = pk;
        this.rv_feccom = rv_feccom;
        this.rv_fecdoc = rv_fecdoc;
        this.rv_fecven = rv_fecven;
        this.rv_tipdoc = rv_tipdoc;
        this.rv_serdoc = rv_serdoc;
        this.rv_nrodoc = rv_nrodoc;
        this.rv_nrodini = rv_nrodini;
        this.rv_nrodfin = rv_nrodfin;
        this.rv_numdoc = rv_numdoc;
        this.rv_tipane = rv_tipane;
        this.rv_codane = rv_codane;
        this.rv_tpdocide = rv_tpdocide;
        this.rv_rucane = rv_rucane;
        this.rv_nomane = rv_nomane;
        this.rv_codmon = rv_codmon;
        this.rv_afemn = rv_afemn;
        this.rv_inamn = rv_inamn;
        this.rv_iscmn = rv_iscmn;
        this.rv_exomn = rv_exomn;
        this.rv_igvmn = rv_igvmn;
        this.rv_impomn = rv_impomn;
        this.rv_otrmn = rv_otrmn;
        this.rv_detmn = rv_detmn;
        this.rv_expmn = rv_expmn;
        this.rv_afeme = rv_afeme;
        this.rv_iname = rv_iname;
        this.rv_iscme = rv_iscme;
        this.rv_exome = rv_exome;
        this.rv_igvme = rv_igvme;
        this.rv_impome = rv_impome;
        this.rv_otrme = rv_otrme;
        this.rv_detme = rv_detme;
        this.rv_expme = rv_expme;
        this.rv_tipcam = rv_tipcam;
        this.rv_porigv = rv_porigv;
        this.rv_bivapmn = rv_bivapmn;
        this.rv_bivapme = rv_bivapme;
        this.rv_fedore = rv_fedore;
        this.rv_tidore = rv_tidore;
        this.rv_sedore = rv_sedore;
        this.rv_nudere = rv_nudere;
        this.rv_feccre = rv_feccre;
        this.rv_horcre = rv_horcre;
        this.rv_usucre = rv_usucre;
        this.rv_fecmod = rv_fecmod;
        this.rv_hormod = rv_hormod;
        this.rv_usumod = rv_usumod;
        this.rv_cencos = rv_cencos;
        this.rv_bolmn = rv_bolmn;
        this.rv_bolme = rv_bolme;
        this.rv_ivapmn = rv_ivapmn;
        this.rv_ivapme = rv_ivapme;
        this.rv_medpag = rv_medpag;
        this.rv_estado = rv_estado;
        this.rv_descto = rv_descto;
        this.rv_impdsct = rv_impdsct;
    }
    public lcoVent21Pk getPk() {
        return pk;
    }
    public void setPk(lcoVent21Pk pk) {
        this.pk = pk;
    }
    public LocalDate getRv_feccom() {
        return rv_feccom;
    }
    public void setRv_feccom(LocalDate rv_feccom) {
        this.rv_feccom = rv_feccom;
    }
    public LocalDate getRv_fecdoc() {
        return rv_fecdoc;
    }

    //Nuevos campos para numero
    public void setRv_nrodini(String rv_nrodini) {
        this.rv_nrodini = rv_nrodini;
    }
    public String getRv_nrodini() {
        return rv_nrodini;
    }

    public void setRv_nrodfin(String rv_nrodfin) {
        this.rv_nrodfin = rv_nrodfin;
    }
    public String getRv_nrodfin() {
        return rv_nrodfin;
    }


    public void setRv_fecdoc(LocalDate rv_fecdoc) {
        this.rv_fecdoc = rv_fecdoc;
    }
    public LocalDate getRv_fecven() {
        return rv_fecven;
    }
    public void setRv_fecven(LocalDate rv_fecven) {
        this.rv_fecven = rv_fecven;
    }
    public String getRv_tipdoc() {
        return rv_tipdoc;
    }
    public void setRv_tipdoc(String rv_tipdoc) {
        this.rv_tipdoc = rv_tipdoc;
    }
    public String getRv_serdoc() {
        return rv_serdoc;
    }
    public void setRv_serdoc(String rv_serdoc) {
        this.rv_serdoc = rv_serdoc;
    }
    public String getRv_nrodoc() {
        return rv_nrodoc;
    }
    public void setRv_nrodoc(String rv_nrodoc) {
        this.rv_nrodoc = rv_nrodoc;
    }
    public String getRv_numdoc() {
        return rv_numdoc;
    }
    public void setRv_numdoc(String rv_numdoc) {
        this.rv_numdoc = rv_numdoc;
    }
    public String getRv_tipane() {
        return rv_tipane;
    }
    public void setRv_tipane(String rv_tipane) {
        this.rv_tipane = rv_tipane;
    }
    public String getRv_codane() {
        return rv_codane;
    }
    public void setRv_codane(String rv_codane) {
        this.rv_codane = rv_codane;
    }
    public String getRv_tpdocide() {
        return rv_tpdocide;
    }
    public void setRv_tpdocide(String rv_tpdocide) {
        this.rv_tpdocide = rv_tpdocide;
    }
    public String getRv_rucane() {
        return rv_rucane;
    }
    public void setRv_rucane(String rv_rucane) {
        this.rv_rucane = rv_rucane;
    }
    public String getRv_nomane() {
        return rv_nomane;
    }
    public void setRv_nomane(String rv_nomane) {
        this.rv_nomane = rv_nomane;
    }
    public String getRv_codmon() {
        return rv_codmon;
    }
    public void setRv_codmon(String rv_codmon) {
        this.rv_codmon = rv_codmon;
    }
    public Double getRv_afemn() {
        return rv_afemn;
    }
    public void setRv_afemn(Double rv_afemn) {
        this.rv_afemn = rv_afemn;
    }
    public Double getRv_inamn() {
        return rv_inamn;
    }
    public void setRv_inamn(Double rv_inamn) {
        this.rv_inamn = rv_inamn;
    }
    public Double getRv_iscmn() {
        return rv_iscmn;
    }
    public void setRv_iscmn(Double rv_iscmn) {
        this.rv_iscmn = rv_iscmn;
    }
    public Double getRv_exomn() {
        return rv_exomn;
    }
    public void setRv_exomn(Double rv_exomn) {
        this.rv_exomn = rv_exomn;
    }
    public Double getRv_igvmn() {
        return rv_igvmn;
    }
    public void setRv_igvmn(Double rv_igvmn) {
        this.rv_igvmn = rv_igvmn;
    }
    public Double getRv_impomn() {
        return rv_impomn;
    }
    public void setRv_impomn(Double rv_impomn) {
        this.rv_impomn = rv_impomn;
    }
    public Double getRv_otrmn() {
        return rv_otrmn;
    }
    public void setRv_otrmn(Double rv_otrmn) {
        this.rv_otrmn = rv_otrmn;
    }
    public Double getRv_detmn() {
        return rv_detmn;
    }
    public void setRv_detmn(Double rv_detmn) {
        this.rv_detmn = rv_detmn;
    }
    public Double getRv_expmn() {
        return rv_expmn;
    }
    public void setRv_expmn(Double rv_expmn) {
        this.rv_expmn = rv_expmn;
    }
    public Double getRv_afeme() {
        return rv_afeme;
    }
    public void setRv_afeme(Double rv_afeme) {
        this.rv_afeme = rv_afeme;
    }
    public Double getRv_iname() {
        return rv_iname;
    }
    public void setRv_iname(Double rv_iname) {
        this.rv_iname = rv_iname;
    }
    public Double getRv_iscme() {
        return rv_iscme;
    }
    public void setRv_iscme(Double rv_iscme) {
        this.rv_iscme = rv_iscme;
    }
    public Double getRv_exome() {
        return rv_exome;
    }
    public void setRv_exome(Double rv_exome) {
        this.rv_exome = rv_exome;
    }
    public Double getRv_igvme() {
        return rv_igvme;
    }
    public void setRv_igvme(Double rv_igvme) {
        this.rv_igvme = rv_igvme;
    }
    public Double getRv_impome() {
        return rv_impome;
    }
    public void setRv_impome(Double rv_impome) {
        this.rv_impome = rv_impome;
    }
    public Double getRv_otrme() {
        return rv_otrme;
    }
    public void setRv_otrme(Double rv_otrme) {
        this.rv_otrme = rv_otrme;
    }
    public Double getRv_detme() {
        return rv_detme;
    }
    public void setRv_detme(Double rv_detme) {
        this.rv_detme = rv_detme;
    }
    public Double getRv_expme() {
        return rv_expme;
    }
    public void setRv_expme(Double rv_expme) {
        this.rv_expme = rv_expme;
    }
    public Double getRv_tipcam() {
        return rv_tipcam;
    }
    public void setRv_tipcam(Double rv_tipcam) {
        this.rv_tipcam = rv_tipcam;
    }
    public Double getRv_porigv() {
        return rv_porigv;
    }
    public void setRv_porigv(Double rv_porigv) {
        this.rv_porigv = rv_porigv;
    }
    public Double getRv_bivapmn() {
        return rv_bivapmn;
    }
    public void setRv_bivapmn(Double rv_bivapmn) {
        this.rv_bivapmn = rv_bivapmn;
    }
    public Double getRv_bivapme() {
        return rv_bivapme;
    }
    public void setRv_bivapme(Double rv_bivapme) {
        this.rv_bivapme = rv_bivapme;
    }
    public LocalDate getRv_fedore() {
        return rv_fedore;
    }
    public void setRv_fedore(LocalDate rv_fedore) {
        this.rv_fedore = rv_fedore;
    }
    public String getRv_tidore() {
        return rv_tidore;
    }
    public void setRv_tidore(String rv_tidore) {
        this.rv_tidore = rv_tidore;
    }
    public String getRv_sedore() {
        return rv_sedore;
    }
    public void setRv_sedore(String rv_sedore) {
        this.rv_sedore = rv_sedore;
    }
    public String getRv_nudere() {
        return rv_nudere;
    }
    public void setRv_nudere(String rv_nudere) {
        this.rv_nudere = rv_nudere;
    }
    public LocalDate getRv_feccre() {
        return rv_feccre;
    }
    public void setRv_feccre(LocalDate rv_feccre) {
        this.rv_feccre = rv_feccre;
    }
    public LocalTime getRv_horcre() {
        return rv_horcre;
    }
    public void setRv_horcre(LocalTime rv_horcre) {
        this.rv_horcre = rv_horcre;
    }
    public String getRv_usucre() {
        return rv_usucre;
    }
    public void setRv_usucre(String rv_usucre) {
        this.rv_usucre = rv_usucre;
    }
    public LocalDate getRv_fecmod() {
        return rv_fecmod;
    }
    public void setRv_fecmod(LocalDate rv_fecmod) {
        this.rv_fecmod = rv_fecmod;
    }
    public LocalTime getRv_hormod() {
        return rv_hormod;
    }
    public void setRv_hormod(LocalTime rv_hormod) {
        this.rv_hormod = rv_hormod;
    }
    public String getRv_usumod() {
        return rv_usumod;
    }
    public void setRv_usumod(String rv_usumod) {
        this.rv_usumod = rv_usumod;
    }
    public String getRv_cencos() {
        return rv_cencos;
    }
    public void setRv_cencos(String rv_cencos) {
        this.rv_cencos = rv_cencos;
    }
    public Double getRv_bolmn() {
        return rv_bolmn;
    }
    public void setRv_bolmn(Double rv_bolmn) {
        this.rv_bolmn = rv_bolmn;
    }
    public Double getRv_bolme() {
        return rv_bolme;
    }
    public void setRv_bolme(Double rv_bolme) {
        this.rv_bolme = rv_bolme;
    }
    public Double getRv_ivapmn() {
        return rv_ivapmn;
    }
    public void setRv_ivapmn(Double rv_ivapmn) {
        this.rv_ivapmn = rv_ivapmn;
    }
    public Double getRv_ivapme() {
        return rv_ivapme;
    }
    public void setRv_ivapme(Double rv_ivapme) {
        this.rv_ivapme = rv_ivapme;
    }
    public String getRv_medpag() {
        return rv_medpag;
    }
    public void setRv_medpag(String rv_medpag) {
        this.rv_medpag = rv_medpag;
    }
    public String getRv_estado() {
        return rv_estado;
    }
    public void setRv_estado(String rv_estado) {
        this.rv_estado = rv_estado;
    }
    public Double getRv_descto() {
        return rv_descto;
    }
    public void setRv_descto(Double rv_descto) {
        this.rv_descto = rv_descto;
    }
    public Double getRv_impdsct() {
        return rv_impdsct;
    }
    public void setRv_impdsct(Double rv_impdsct) {
        this.rv_impdsct = rv_impdsct;
    }
        
    

    
}
