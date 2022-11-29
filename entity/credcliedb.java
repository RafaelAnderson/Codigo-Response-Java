package com.empresa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class credcliedb {
    @Id
    private String cu_001;
    
	private String ul_coduser;
	private String ul_ctipusu; 
	private String cu_002;
	private String cu_003;
	private String cu_004;
	private String cu_005;
	private String cu_006;
	
    public credcliedb(String cu_001, String ul_coduser, String ul_ctipusu, String cu_002, String cu_003, String cu_004, String cu_005, String cu_006) {
        this.cu_001 = cu_001;
        this.ul_coduser = ul_coduser;
        this.ul_ctipusu = ul_ctipusu;
        this.cu_002 = cu_002;
        this.cu_003 = cu_003;
        this.cu_004 = cu_004;
        this.cu_005 = cu_005;
        this.cu_006 = cu_006;
    }

    
	public String getCu_001() {
		return cu_001;
	}
	public void setCu_001(String cu_001) {
		this.cu_001 = cu_001;
	}
	public String getUl_coduser() {
		return ul_coduser;
	}
	public void setUl_coduser(String ul_coduser) {
		this.ul_coduser = ul_coduser;
	}
	public String getUl_ctipusu() {
		return ul_ctipusu;
	}
	public void setUl_ctipusu(String ul_ctipusu) {
		this.ul_ctipusu = ul_ctipusu;
	}
	public String getCu_002() {
		return cu_002;
	}
	public void setCu_002(String cu_002) {
		this.cu_002 = cu_002;
	}
	public String getCu_003() {
		return cu_003;
	}
	public void setCu_003(String cu_003) {
		this.cu_003 = cu_003;
	}
	public String getCu_004() {
		return cu_004;
	}
	public void setCu_004(String cu_004) {
		this.cu_004 = cu_004;
	}
	public String getCu_005() {
		return cu_005;
	}
	public void setCu_005(String cu_005) {
		this.cu_005 = cu_005;
	}
	public String getCu_006() {
		return cu_006;
	}
	public void setCu_006(String cu_006) {
		this.cu_006 = cu_006;
	}
}
