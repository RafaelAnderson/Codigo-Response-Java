package com.empresa.entity;

import java.io.Serializable;
import lombok.Data;

import javax.persistence.Embeddable;
@Data
@Embeddable
public class lcocmpaPk implements Serializable {
    private static final long serialVersionUID = 1L;
    private String ac_codper;
    private String ac_subdia;
    private String ac_compro;
    
    public lcocmpaPk(String ac_codper, String ac_subdia, String ac_compro) {
        this.ac_codper = ac_codper;
        this.ac_subdia = ac_subdia;
        this.ac_compro = ac_compro;
    }
    public lcocmpaPk(){
        super();
    }
    public String getAc_codper() {
        return ac_codper;
    }
    public void setAc_codper(String ac_codper) {
        this.ac_codper = ac_codper;
    }
    public String getAc_subdia() {
        return ac_subdia;
    }
    public void setAc_subdia(String ac_subdia) {
        this.ac_subdia = ac_subdia;
    }
    public String getAc_compro() {
        return ac_compro;
    }
    public void setAc_compro(String ac_compro) {
        this.ac_compro = ac_compro;
    }
  
}