package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lcohdoc")
public class lcohdoc {
    @Id
    @EmbeddedId
    private lcohdocPk pkId;
    @Column
    private String hd_tipreg;
    @Column
    private Double hd_import;
    @Column
    private Double hd_imp4ta;
    @Column
    private Double hd_impapo;
    @Column
    private Double hd_imptot;
    @Column
    private Double hd_tipcam;
    @Column
    private String hd_fla4ta;
    @Column
    private LocalDate hd_fecemi;
    @Column
    private LocalDate hd_fecpag;
    @Column
    private String hd_glosa;
    @Column
    private String hd_subdia;
    @Column
    private String hd_compro;
    @Column
    private LocalDate hd_feccom;
    @Column
    private String hd_usucre;
    @Column
    private LocalDate hd_feccre;
    @Column
    private LocalTime hd_hracre;
    @Column
    private String hd_usumod;
    @Column
    private LocalDate hd_fecmod;
    @Column
    private LocalTime hd_hramod;

    public lcohdoc() {
    }

    public lcohdoc(lcohdocPk pkId, String hd_tipreg, Double hd_import, Double hd_imp4ta, Double hd_impapo,
            Double hd_imptot, Double hd_tipcam, String hd_fla4ta, LocalDate hd_fecemi, LocalDate hd_fecpag,
            String hd_glosa, String hd_subdia, String hd_compro, LocalDate hd_feccom, String hd_usucre,
            LocalDate hd_feccre, LocalTime hd_hracre, String hd_usumod, LocalDate hd_fecmod, LocalTime hd_hramod) {
        this.pkId = pkId;
        this.hd_tipreg = hd_tipreg;
        this.hd_import = hd_import;
        this.hd_imp4ta = hd_imp4ta;
        this.hd_impapo = hd_impapo;
        this.hd_imptot = hd_imptot;
        this.hd_tipcam = hd_tipcam;
        this.hd_fla4ta = hd_fla4ta;
        this.hd_fecemi = hd_fecemi;
        this.hd_fecpag = hd_fecpag;
        this.hd_glosa = hd_glosa;
        this.hd_subdia = hd_subdia;
        this.hd_compro = hd_compro;
        this.hd_feccom = hd_feccom;
        this.hd_usucre = hd_usucre;
        this.hd_feccre = hd_feccre;
        this.hd_hracre = hd_hracre;
        this.hd_usumod = hd_usumod;
        this.hd_fecmod = hd_fecmod;
        this.hd_hramod = hd_hramod;
    }

    public lcohdocPk getPkId() {
        return pkId;
    }

    public void setPkId(lcohdocPk pkId) {
        this.pkId = pkId;
    }

    public String getHd_tipreg() {
        return hd_tipreg;
    }

    public void setHd_tipreg(String hd_tipreg) {
        this.hd_tipreg = hd_tipreg;
    }

    public Double getHd_import() {
        return hd_import;
    }

    public void setHd_import(Double hd_import) {
        this.hd_import = hd_import;
    }

    public Double getHd_imp4ta() {
        return hd_imp4ta;
    }

    public void setHd_imp4ta(Double hd_imp4ta) {
        this.hd_imp4ta = hd_imp4ta;
    }

    public Double getHd_impapo() {
        return hd_impapo;
    }

    public void setHd_impapo(Double hd_impapo) {
        this.hd_impapo = hd_impapo;
    }

    public Double getHd_imptot() {
        return hd_imptot;
    }

    public void setHd_imptot(Double hd_imptot) {
        this.hd_imptot = hd_imptot;
    }

    public Double getHd_tipcam() {
        return hd_tipcam;
    }

    public void setHd_tipcam(Double hd_tipcam) {
        this.hd_tipcam = hd_tipcam;
    }

    public String getHd_fla4ta() {
        return hd_fla4ta;
    }

    public void setHd_fla4ta(String hd_fla4ta) {
        this.hd_fla4ta = hd_fla4ta;
    }

    public LocalDate getHd_fecemi() {
        return hd_fecemi;
    }

    public void setHd_fecemi(LocalDate hd_fecemi) {
        this.hd_fecemi = hd_fecemi;
    }

    public LocalDate getHd_fecpag() {
        return hd_fecpag;
    }

    public void setHd_fecpag(LocalDate hd_fecpag) {
        this.hd_fecpag = hd_fecpag;
    }

    public String getHd_glosa() {
        return hd_glosa;
    }

    public void setHd_glosa(String hd_glosa) {
        this.hd_glosa = hd_glosa;
    }

    public String getHd_subdia() {
        return hd_subdia;
    }

    public void setHd_subdia(String hd_subdia) {
        this.hd_subdia = hd_subdia;
    }

    public String getHd_compro() {
        return hd_compro;
    }

    public void setHd_compro(String hd_compro) {
        this.hd_compro = hd_compro;
    }

    public LocalDate getHd_feccom() {
        return hd_feccom;
    }

    public void setHd_feccom(LocalDate hd_feccom) {
        this.hd_feccom = hd_feccom;
    }

    public String getHd_usucre() {
        return hd_usucre;
    }

    public void setHd_usucre(String hd_usucre) {
        this.hd_usucre = hd_usucre;
    }

    public LocalDate getHd_feccre() {
        return hd_feccre;
    }

    public void setHd_feccre(LocalDate hd_feccre) {
        this.hd_feccre = hd_feccre;
    }

    public LocalTime getHd_hracre() {
        return hd_hracre;
    }

    public void setHd_hracre(LocalTime hd_hracre) {
        this.hd_hracre = hd_hracre;
    }

    public String getHd_usumod() {
        return hd_usumod;
    }

    public void setHd_usumod(String hd_usumod) {
        this.hd_usumod = hd_usumod;
    }

    public LocalDate getHd_fecmod() {
        return hd_fecmod;
    }

    public void setHd_fecmod(LocalDate hd_fecmod) {
        this.hd_fecmod = hd_fecmod;
    }

    public LocalTime getHd_hramod() {
        return hd_hramod;
    }

    public void setHd_hramod(LocalTime hd_hramod) {
        this.hd_hramod = hd_hramod;
    }

}