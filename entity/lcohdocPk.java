package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class lcohdocPk implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String hd_codper;
    private String hd_cdanex;
    private String hd_tipdoc;
    private String hd_serdoc;
    private String hd_numdoc;

    public lcohdocPk() {
    }

    public lcohdocPk(String hd_codper, String hd_cdanex, String hd_tipdoc, String hd_serdoc, String hd_numdoc) {
        this.hd_codper = hd_codper;
        this.hd_cdanex = hd_cdanex;
        this.hd_tipdoc = hd_tipdoc;
        this.hd_serdoc = hd_serdoc;
        this.hd_numdoc = hd_numdoc;
    }

    public String getHd_codper() {
        return hd_codper;
    }

    public void setHd_codper(String hd_codper) {
        this.hd_codper = hd_codper;
    }

    public String getHd_cdanex() {
        return hd_cdanex;
    }

    public void setHd_cdanex(String hd_cdanex) {
        this.hd_cdanex = hd_cdanex;
    }

    public String getHd_tipdoc() {
        return hd_tipdoc;
    }

    public void setHd_tipdoc(String hd_tipdoc) {
        this.hd_tipdoc = hd_tipdoc;
    }

    public String getHd_serdoc() {
        return hd_serdoc;
    }

    public void setHd_serdoc(String hd_serdoc) {
        this.hd_serdoc = hd_serdoc;
    }

    public String getHd_numdoc() {
        return hd_numdoc;
    }

    public void setHd_numdoc(String hd_numdoc) {
        this.hd_numdoc = hd_numdoc;
    }

}