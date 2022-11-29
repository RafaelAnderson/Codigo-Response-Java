package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode
@Embeddable
public class lcoRefv21Pk  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String rf_subdia;
	String rf_compro;
	String rf_secue;
	
	public lcoRefv21Pk() {
		super();
	}
	
	public lcoRefv21Pk(String rf_subdia, String rf_compro, String rf_secue) {
		super();
		this.rf_subdia = rf_subdia;
		this.rf_compro = rf_compro;
		this.rf_secue = rf_secue;
	}

	public String getrf_subdia() {
		return rf_subdia;
	}
	public void setrf_subdia(String rf_subdia) {
		this.rf_subdia = rf_subdia;
	}
	public String getrf_compro() {
		return rf_compro;
	}
	public void setrf_compro(String rf_compro) {
		this.rf_compro = rf_compro;
	}
	public String getrf_secue() {
		return rf_secue;
	}
	public void setrf_secue(String rf_secue) {
		this.rf_secue = rf_secue;
	}
	
}
