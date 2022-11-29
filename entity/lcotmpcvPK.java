package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class lcotmpcvPK implements Serializable{

    String tmpc_subdia;

    String tmpc_compro;

    lcotmpcvPK() {
        super();
    }


    public lcotmpcvPK(String tmpc_subdia, String tmpc_compro) {
        this.tmpc_subdia = tmpc_subdia;
        this.tmpc_compro = tmpc_compro;
    }



    public String getTmpc_subdia() {
        return this.tmpc_subdia;
    }

    public void setTmpc_subdia(String tmpc_subdia) {
        this.tmpc_subdia = tmpc_subdia;
    }

    public String getTmpc_compro() {
        return this.tmpc_compro;
    }

    public void setTmpc_compro(String tmpc_compro) {
        this.tmpc_compro = tmpc_compro;
    }

}
