package com.empresa.service;

import java.util.List;

import com.empresa.entity.Ubigeo;

public interface UbigeoService {
	
	public abstract List<Ubigeo> listarDept();
	
	public abstract List<Ubigeo> listarProv(String Dep);
	
	public abstract List<Ubigeo> listarDist(String Dep, String Dist);
	
	public abstract List<Ubigeo> BuscarUbigeo(String Ubigeo);


}
