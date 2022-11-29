package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class detraccionPK  implements Serializable{
    private static final long serialVersionUID = 1L;

    @Column(length = 10)
    String td_tipope ;

    @Column(length = 10)
    String td_codbser;

    public detraccionPK() {
        super();
    }

    public detraccionPK(String td_tipope, String td_codbser) {
        super();
        this.td_tipope = td_tipope;
        this.td_codbser = td_codbser;
    }


    public String getTd_tipope() {
        return this.td_tipope;
    }

    public void setTd_tipope(String td_tipope) {
        this.td_tipope = td_tipope;
    }

    public String getTd_codbser() {
        return this.td_codbser;
    }

    public void setTd_codbser(String td_codbser) {
        this.td_codbser = td_codbser;
    }

}
