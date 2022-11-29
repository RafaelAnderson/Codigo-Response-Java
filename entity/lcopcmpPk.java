package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.EqualsAndHashCode;
@EqualsAndHashCode
@Embeddable
public class lcopcmpPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String  cl_tipcmp;
   private String cl_parcmp ;
   
   
public lcopcmpPk(String cl_tipcmp, String cl_parcmp) {
	
}
public lcopcmpPk() {
	super();
	// TODO Auto-generated constructor stub
}
public String getCl_tipcmp() {
	return cl_tipcmp;
}
public void setCl_tipcmp(String cl_tipcmp) {
	this.cl_tipcmp = cl_tipcmp;
}
public String getCl_parcmp() {
	return cl_parcmp;
}
public void setCl_parcmp(String cl_parcmp) {
	this.cl_parcmp = cl_parcmp;
}
   
   
}
