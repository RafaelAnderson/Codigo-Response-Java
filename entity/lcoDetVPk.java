package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class lcoDetVPk implements Serializable {

	private static final long serialVersionUID = 1L;
	
	String dl_subdia;
	String dl_compro;
	String dl_secue;
	public lcoDetVPk(String dl_subdia, String dl_compro, String dl_secue) {
		super();
		this.dl_subdia = dl_subdia;
		this.dl_compro = dl_compro;
		this.dl_secue = dl_secue;
	}
	public lcoDetVPk() {
		super();
	}
	public String getDl_subdia() {
		return dl_subdia;
	}
	public void setDl_subdia(String dl_subdia) {
		this.dl_subdia = dl_subdia;
	}
	public String getDl_compro() {
		return dl_compro;
	}
	public void setDl_compro(String dl_compro) {
		this.dl_compro = dl_compro;
	}
	public String getDl_secue() {
		return dl_secue;
	}
	public void setDl_secue(String dl_secue) {
		this.dl_secue = dl_secue;
	}
	
	
	
	
}




