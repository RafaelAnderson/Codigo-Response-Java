package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class lcotmpdvPK implements Serializable{
    String tmpd_subdia;
    Integer tmpd_compro; 
    String tmpd_secue;

    lcotmpdvPK() {
        super();
    }


    public lcotmpdvPK(String tmpd_subdia, Integer tmpd_compro, String tmpd_secue) {
        this.tmpd_subdia = tmpd_subdia;
        this.tmpd_compro = tmpd_compro;
        this.tmpd_secue = tmpd_secue;
    }


    public String getTmpd_subdia() {
        return this.tmpd_subdia;
    }

    public void setTmpd_subdia(String tmpd_subdia) {
        this.tmpd_subdia = tmpd_subdia;
    }

    public Integer getTmpd_compro() {
        return this.tmpd_compro;
    }

    public void setTmpd_compro(Integer tmpd_compro) {
        this.tmpd_compro = tmpd_compro;
    }

    public String getTmpd_secue() {
        return this.tmpd_secue;
    }

    public void setTmpd_secue(String tmpd_secue) {
        this.tmpd_secue = tmpd_secue;
    }

}
