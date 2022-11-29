package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcociec;
import com.empresa.repository.lcociecRepository;


@Service
public class lcociecServiceImpl implements lcociecService {

	@Autowired
	private lcociecRepository lcociecRepo;
	
	@Override
	public List<lcociec> listaAllCabecera(int opcion, String p_ciacon, lcociec obj) {
		
		// TODO Auto-generated method stub
		return lcociecRepo.listAll(opcion, p_ciacon, obj.getCl_asien() , obj.getCl_descr(),obj.getCl_cmpr(), obj.getCl_usrcrea(), obj.getCl_feccrea(),
				obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public void agregarRegistro(int opcion, String p_ciacon, lcociec obj) {
		
		lcociecRepo.nuevoRegistro(opcion, p_ciacon, obj.getCl_asien() , obj.getCl_descr(),obj.getCl_cmpr(), obj.getCl_usrcrea(), obj.getCl_feccrea(),
				obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public void editarRegistro(int opcion, String p_ciacon, lcociec obj) {
		lcociecRepo.actualizaRegistro(opcion, p_ciacon, obj.getCl_asien() , obj.getCl_descr(),obj.getCl_cmpr(), obj.getCl_usrcrea(), obj.getCl_feccrea(),
				obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
		
	}

	@Override
	public void eliminarRegistro(int opcion, String p_ciacon, lcociec obj) {
		lcociecRepo.eliminarRegistro(opcion, p_ciacon, obj.getCl_asien() , obj.getCl_descr(),obj.getCl_cmpr(), obj.getCl_usrcrea(), obj.getCl_feccrea(),
				obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
		
	}

	@Override
	public void eliminarCabeDeta(int opcion, String p_ciacon, lcociec obj) {
		lcociecRepo.EliminarCabeDeta(opcion, p_ciacon, obj.getCl_asien() , obj.getCl_descr(),obj.getCl_cmpr(), obj.getCl_usrcrea(), obj.getCl_feccrea(),
				obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
		
	}

}
