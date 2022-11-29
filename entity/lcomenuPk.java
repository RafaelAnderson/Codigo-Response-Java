package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class lcomenuPk implements Serializable{
    private static final long serialVersionUID = 1L;

    private int mu_id0;
    private int mu_id1;
    private int mu_id2;

    public lcomenuPk(){
        super();
    }

    public lcomenuPk(int mu_id0, int mu_id1, int mu_id2){
        super();
        this.mu_id0 = mu_id0;
        this.mu_id1 = mu_id1;
        this.mu_id2 = mu_id2;
    }

    public int getmu_id0(){
        return mu_id0;
    }

    public void setmu_id0(int mu_id0){
        this.mu_id0 = mu_id0;
    }

    public int getmu_id1(){
        return mu_id1;
    }

    public void setmu_id1(int mu_id1){
        this.mu_id1 = mu_id1;
    }

    public int getmu_id2(){
        return mu_id2;
    }

    public void setmu_id2(int mu_id2){
        this.mu_id2 = mu_id2;
    }
}