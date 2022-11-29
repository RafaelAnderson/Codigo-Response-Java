package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Ubigeo;
import com.empresa.repository.UbigeoRepository;

@Service
public class UbigeoServiceImpl implements UbigeoService {
	
	@Autowired
	UbigeoRepository repository;

	@Override
	public List<Ubigeo> listarDept() {
		// TODO Auto-generated method stub
		return repository.listar(0, "", "", "", "");
	}

	@Override
	public List<Ubigeo> listarProv(String Dep) {
		// TODO Auto-generated method stub
		return repository.listar(1, Dep, "", "", "");
	}

	@Override
	public List<Ubigeo> listarDist(String Dep, String Prov) {
		// TODO Auto-generated method stub
		return repository.listar(2, Dep, Prov, "", "");
	}

	@Override
	public List<Ubigeo> BuscarUbigeo(String Ubigeo) {
		// TODO Auto-generated method stub
		return repository.listar(3, "", "", "",Ubigeo);
	}

}
