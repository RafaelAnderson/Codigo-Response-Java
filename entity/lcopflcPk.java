package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class lcopflcPk implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "fl_tipfrmt")
	private String fl_tipfrmt;
	
	@Column(name="fl_modelfrmt")
	private String fl_modelfrmt;
	
	@Column(name="fl_codfrmt")
	private String fl_codfrmt;

	public String getFl_tipFrmt() {
		return fl_tipfrmt;
	}

	public void setFl_tipFrmt(String fl_tipFrmt) {
		this.fl_tipfrmt = fl_tipFrmt;
	}

	public String getFl_modelfrmt() {
		return fl_modelfrmt;
	}

	public void setFl_modelfrmt(String fl_modelfrmt) {
		this.fl_modelfrmt = fl_modelfrmt;
	}

	public String getFl_codfrmt() {
		return fl_codfrmt;
	}

	public void setFl_codfrmt(String fl_codfrmt) {
		this.fl_codfrmt = fl_codfrmt;
	}

	public lcopflcPk(String fl_tipFrmt, String fl_modelfrmt, String fl_codfrmt) {
		super();
		this.fl_tipfrmt = fl_tipFrmt;
		this.fl_modelfrmt = fl_modelfrmt;
		this.fl_codfrmt = fl_codfrmt;
	}

	public lcopflcPk() {
		super();
	}
	
	

}
