package com.empresa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ubigeo")
public class Ubigeo {
	
	@Id
	private String id_ubigeo; 
	
	private String cod_dep;
	private String cod_prov; 
	private String cod_dist;
	private String des_dep;
	private String des_prov;
	private String des_dist;
	
	

	public Ubigeo(String id_ubigeo, String cod_dep, String cod_prov, String cod_dist, String des_dep, String des_prov,
			String des_dist) {
		super();
		this.id_ubigeo = id_ubigeo;
		this.cod_dep = cod_dep;
		this.cod_prov = cod_prov;
		this.cod_dist = cod_dist;
		this.des_dep = des_dep;
		this.des_prov = des_prov;
		this.des_dist = des_dist;
	}

	public Ubigeo() {
		super();
	}

	public String getId_ubigeo() {
		return id_ubigeo;
	}

	public void setId_ubigeo(String id_ubigeo) {
		this.id_ubigeo = id_ubigeo;
	}

	public String getCod_dep() {
		return cod_dep;
	}

	public void setCod_dep(String cod_dep) {
		this.cod_dep = cod_dep;
	}

	public String getCod_prov() {
		return cod_prov;
	}

	public void setCod_prov(String cod_prov) {
		this.cod_prov = cod_prov;
	}

	public String getCod_dist() {
		return cod_dist;
	}

	public void setCod_dist(String cod_dist) {
		this.cod_dist = cod_dist;
	}

	public String getDes_dep() {
		return des_dep;
	}

	public void setDes_dep(String des_dep) {
		this.des_dep = des_dep;
	}

	public String getDes_prov() {
		return des_prov;
	}

	public void setDes_prov(String des_prov) {
		this.des_prov = des_prov;
	}

	public String getDes_dist() {
		return des_dist;
	}

	public void setDes_dist(String des_dist) {
		this.des_dist = des_dist;
	}
	
	

}
