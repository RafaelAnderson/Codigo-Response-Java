package com.empresa.entity;
import java.io.Serializable;
import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class lcoTblaVentaPk implements Serializable {
    private static final long serialVersionUID = 1L;

    private String av_codper;
    private String av_subdia;
    private String av_compro;

    public lcoTblaVentaPk(String av_codper, String av_subdia, String av_compro) {
        this.av_codper = av_codper;
        this.av_subdia = av_subdia;
        this.av_compro = av_compro;
    }

    public lcoTblaVentaPk() {
        super();
    }

    public String getAv_codper() {
        return av_codper;
    }

    public void setAv_codper(String av_codper) {
        this.av_codper = av_codper;
    }

    public String getAv_subdia() {
        return av_subdia;
    }

    public void setAv_subdia(String av_subdia) {
        this.av_subdia = av_subdia;
    }

    public String getAv_compro() {
        return av_compro;
    }

    public void setAv_compro(String av_compro) {
        this.av_compro = av_compro;
    }
}
