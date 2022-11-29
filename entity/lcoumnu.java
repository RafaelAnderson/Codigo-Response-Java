package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="lcoumnu")
public class lcoumnu {
    
    @EmbeddedId
    private lcoumnuPk pk;

    private int um_id0;
    private int um_id1;
    private int um_id2;

    private String um_usrcrea;
    private LocalDate um_feccrea;
    private LocalTime um_hracrea;

    private String um_usract;
    private LocalDate um_fecact;
    private LocalTime um_hraact;

    public lcoumnu(){
        super();
    }


    public lcoumnu(lcoumnuPk pk, int um_id0, int um_id1, int um_id2, String um_usrcrea, LocalDate um_feccrea, LocalTime um_hracrea, String um_usract, LocalDate um_fecact, LocalTime um_hraact) {
        this.pk = pk;
        this.um_id0 = um_id0;
        this.um_id1 = um_id1;
        this.um_id2 = um_id2;
        this.um_usrcrea = um_usrcrea;
        this.um_feccrea = um_feccrea;
        this.um_hracrea = um_hracrea;
        this.um_usract = um_usract;
        this.um_fecact = um_fecact;
        this.um_hraact = um_hraact;
    }
    

    public lcoumnuPk getPk() {
        return this.pk;
    }

    public void setPk(lcoumnuPk pk) {
        this.pk = pk;
    }

    public int getUm_id0() {
        return this.um_id0;
    }

    public void setUm_id0(int um_id0) {
        this.um_id0 = um_id0;
    }

    public int getUm_id1() {
        return this.um_id1;
    }

    public void setUm_id1(int um_id1) {
        this.um_id1 = um_id1;
    }

    public int getUm_id2() {
        return this.um_id2;
    }

    public void setUm_id2(int um_id2) {
        this.um_id2 = um_id2;
    }

    public String getUm_usrcrea() {
        return this.um_usrcrea;
    }

    public void setUm_usrcrea(String um_usrcrea) {
        this.um_usrcrea = um_usrcrea;
    }

    public LocalDate getUm_feccrea() {
        return this.um_feccrea;
    }

    public void setUm_feccrea(LocalDate um_feccrea) {
        this.um_feccrea = um_feccrea;
    }

    public LocalTime getUm_hracrea() {
        return this.um_hracrea;
    }

    public void setUm_hracrea(LocalTime um_hracrea) {
        this.um_hracrea = um_hracrea;
    }

    public String getUm_usract() {
        return this.um_usract;
    }

    public void setUm_usract(String um_usract) {
        this.um_usract = um_usract;
    }

    public LocalDate getUm_fecact() {
        return this.um_fecact;
    }

    public void setUm_fecact(LocalDate um_fecact) {
        this.um_fecact = um_fecact;
    }

    public LocalTime getUm_hraact() {
        return this.um_hraact;
    }

    public void setUm_hraact(LocalTime um_hraact) {
        this.um_hraact = um_hraact;
    }
    
}