package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class lcoCompPk implements Serializable{
    private static final long serialVersionUID = 1L;
    
    String rc_subdia;
    String rc_compro;
    String rc_secuen;
    
	public lcoCompPk(String rc_subdia, String rc_compro, String rc_secuen) {
		super();
		this.rc_subdia = rc_subdia;
		this.rc_compro = rc_compro;
		this.rc_secuen = rc_secuen;
	}
	public lcoCompPk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRc_subdia() {
		return rc_subdia;
	}
	public void setRc_subdia(String rc_subdia) {
		this.rc_subdia = rc_subdia;
	}
	public String getRc_compro() {
		return rc_compro;
	}
	public void setRc_compro(String rc_compro) {
		this.rc_compro = rc_compro;
	}
	public String getRc_secuen() {
		return rc_secuen;
	}
	public void setRc_secuen(String rc_secuen) {
		this.rc_secuen = rc_secuen;
	}

}
