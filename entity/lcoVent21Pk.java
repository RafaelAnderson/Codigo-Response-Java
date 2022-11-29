package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class lcoVent21Pk implements Serializable {
    private static final long serialVersionUID = 1L;
    private String rv_subdia;
    private String rv_compro;
    private String rv_secuen;
   
    public String getRv_subdia() {
        return rv_subdia;
    }
    public void setRv_subdia(String rv_subdia) {
        this.rv_subdia = rv_subdia;
    }
    public String getRv_compro() {
        return rv_compro;
    }
    public void setRv_compro(String rv_compro) {
        this.rv_compro = rv_compro;
    }
    public String getRv_secuen() {
        return rv_secuen;
    }
    public void setRv_secuen(String rv_secuen) {
        this.rv_secuen = rv_secuen;
    }
    
    
}
