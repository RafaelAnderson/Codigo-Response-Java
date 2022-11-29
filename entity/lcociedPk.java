package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode
@Embeddable
public class lcociedPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String dl_asien;
	String dl_secue;
	
	
	public lcociedPk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public lcociedPk(String id1, String id2) {
	
	}
	public String getDl_asien() {
		return dl_asien;
	}
	public void setDl_asien(String dl_asien) {
		this.dl_asien = dl_asien;
	}
	public String getDl_secue() {
		return dl_secue;
	}
	public void setDl_secue(String dl_secue) {
		this.dl_secue = dl_secue;
	}
	
	
}
