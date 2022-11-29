package com.empresa.entity;
import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class lcoumnuPk implements Serializable{
    private static final long serialVersionUID = 1L;

    private String um_codusr;
    private String um_id;

    public lcoumnuPk(){
        super();
    }

    public lcoumnuPk(String um_codusr, String um_id){
        super();
        this.um_codusr = um_codusr;
        this.um_id = um_id;
    }


    public String getUm_codusr() {
        return this.um_codusr;
    }

    public void setUm_codusr(String um_codusr) {
        this.um_codusr = um_codusr;
    }

    public String getUm_id() {
        return this.um_id;
    }

    public void setUm_id(String um_id) {
        this.um_id = um_id;
    }

}