package com.empresa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="lcomenu")
public class lcomenu {

    @Id
    private String mu_id;

    private String mu_nivel;
    private String mu_nombre;
    private String mu_tipo;
    private String mu_cod;
    private String mu_icon;
    private String mu_ruta;
    private String mu_nvar;

    public lcomenu() {
        super();
    }

    public lcomenu(String mu_id,String mu_nivel, String mu_nombre, String mu_tipo, String mu_cod, String mu_icon, String mu_ruta, String mu_nvar) {
        this.mu_id = mu_id;
        this.mu_nivel = mu_nivel;
        this.mu_nombre = mu_nombre;
        this.mu_tipo = mu_tipo;
        this.mu_cod = mu_cod;
        this.mu_icon = mu_icon;
        this.mu_ruta = mu_ruta;
        this.mu_nvar = mu_nvar;
    }


    public String getMu_id() {
        return this.mu_id;
    }

    public void setMu_id(String mu_id) {
        this.mu_id = mu_id;
    }

    public String getMu_nivel() {
        return this.mu_nivel;
    }

    public void setMu_nivel(String mu_nivel) {
        this.mu_nivel = mu_nivel;
    }

    public String getMu_nombre() {
        return this.mu_nombre;
    }

    public void setMu_nombre(String mu_nombre) {
        this.mu_nombre = mu_nombre;
    }

    public String getMu_tipo() {
        return this.mu_tipo;
    }

    public void setMu_tipo(String mu_tipo) {
        this.mu_tipo = mu_tipo;
    }

    public String getMu_cod() {
        return this.mu_cod;
    }

    public void setMu_cod(String mu_cod) {
        this.mu_cod = mu_cod;
    }

    public String getMu_icon() {
        return this.mu_icon;
    }

    public void setMu_icon(String mu_icon) {
        this.mu_icon = mu_icon;
    }

    public String getMu_ruta() {
        return this.mu_ruta;
    }

    public void setMu_ruta(String mu_ruta) {
        this.mu_ruta = mu_ruta;
    }

    public String getMu_nvar() {
        return this.mu_nvar;
    }

    public void setMu_nvar(String mu_nvar) {
        this.mu_nvar = mu_nvar;
    }
}