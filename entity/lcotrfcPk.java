package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode
@Embeddable
public class lcotrfcPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String tl_cntcst;
	String tl_ctacar;
	String tl_ctaabo;

	
	
	public lcotrfcPk() {
		 
	}
	
	public lcotrfcPk(String  id1, String id2, String id3) {
		
	}
	
	public String getTl_cntcst() {
		return tl_cntcst;
	}
	public void setTl_cntcst(String tl_cntcst) {
		this.tl_cntcst = tl_cntcst;
	}
	public String getTl_ctacar() {
		return tl_ctacar;
	}
	public void setTl_ctacar(String tl_ctacar) {
		this.tl_ctacar = tl_ctacar;
	}

	public String getTl_ctaabo() {
		return tl_ctaabo;
	}

	public void setTl_ctaabo(String tl_ctaabo) {
		this.tl_ctaabo = tl_ctaabo;
	}
	
	
	
}
