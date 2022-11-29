package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class lcodocv21Pk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String il_subdia ;
	 private String  il_compro ;
	  private String il_secue ;
	public String getIl_subdia() {
		return il_subdia;
	}
	public void setIl_subdia(String il_subdia) {
		this.il_subdia = il_subdia;
	}
	public String getIl_compro() {
		return il_compro;
	}
	public void setIl_compro(String il_compro) {
		this.il_compro = il_compro;
	}
	public String getIl_secue() {
		return il_secue;
	}
	public void setIl_secue(String il_secue) {
		this.il_secue = il_secue;
	}
	  
	  
}
