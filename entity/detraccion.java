package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "lco0001tasd")
public class detraccion {
    @EmbeddedId
    detraccionPK pk;

    @Column(length = 100 )
    String td_dsctasa;

    @Column
    Double td_tasa;

    @Column
    Double td_valref1;
    
    @Column
    Double td_valref2;

    @Column(length = 1)
    String td_flabas;

    @Column(length = 10)
    String td_usrcrea;

    LocalDate td_feccrea;
    LocalTime td_hracrea;

    @Column(length = 10)
    String td_usract;

    LocalDate td_fecact;
    LocalTime td_hraact;

    public detraccion() {
        super();
    }

    public detraccion(detraccionPK pk, String td_dsctasa, Double td_tasa, Double td_valref1, Double td_valref2, String td_flabas, String td_usrcrea, LocalDate td_feccrea, LocalTime td_hracrea, String td_usract, LocalDate td_fecact, LocalTime td_hraact) {
        super();
        this.pk = pk;
        this.td_dsctasa = td_dsctasa;
        this.td_tasa = td_tasa;
        this.td_valref1 = td_valref1;
        this.td_valref2 = td_valref2;
        this.td_flabas = td_flabas;
        this.td_usrcrea = td_usrcrea;
        this.td_feccrea = td_feccrea;
        this.td_hracrea = td_hracrea;
        this.td_usract = td_usract;
        this.td_fecact = td_fecact;
        this.td_hraact = td_hraact;
    }


    public detraccionPK getPk() {
        return this.pk;
    }

    public void setPk(detraccionPK pk) {
        this.pk = pk;
    }

    public String getTd_dsctasa() {
        return this.td_dsctasa;
    }

    public void setTd_dsctasa(String td_dsctasa) {
        this.td_dsctasa = td_dsctasa;
    }

    public Double getTd_tasa() {
        return this.td_tasa;
    }

    public void setTd_tasa(Double td_tasa) {
        this.td_tasa = td_tasa;
    }

    public Double getTd_valref1() {
        return this.td_valref1;
    }

    public void setTd_valref1(Double td_valref1) {
        this.td_valref1 = td_valref1;
    }

    public Double getTd_valref2() {
        return this.td_valref2;
    }

    public void setTd_valref2(Double td_valref2) {
        this.td_valref2 = td_valref2;
    }

    public String getTd_flabas() {
        return this.td_flabas;
    }

    public void setTd_flabas(String td_flabas) {
        this.td_flabas = td_flabas;
    }

    public String getTd_usrcrea() {
        return this.td_usrcrea;
    }

    public void setTd_usrcrea(String td_usrcrea) {
        this.td_usrcrea = td_usrcrea;
    }

    public LocalDate getTd_feccrea() {
        return this.td_feccrea;
    }

    public void setTd_feccrea(LocalDate td_feccrea) {
        this.td_feccrea = td_feccrea;
    }

    public LocalTime getTd_hracrea() {
        return this.td_hracrea;
    }

    public void setTd_hracrea(LocalTime td_hracrea) {
        this.td_hracrea = td_hracrea;
    }

    public String getTd_usract() {
        return this.td_usract;
    }

    public void setTd_usract(String td_usract) {
        this.td_usract = td_usract;
    }

    public LocalDate getTd_fecact() {
        return this.td_fecact;
    }

    public void setTd_fecact(LocalDate td_fecact) {
        this.td_fecact = td_fecact;
    }

    public LocalTime getTd_hraact() {
        return this.td_hraact;
    }

    public void setTd_hraact(LocalTime td_hraact) {
        this.td_hraact = td_hraact;
    }

}
