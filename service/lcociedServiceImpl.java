package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcocied;
import com.empresa.repository.lcociedRepository;

@Service
public class lcociedServiceImpl implements lcociedService{

	@Autowired
	private lcociedRepository lcociedRepo;
	@Override
	public List<lcocied> listaByDetalle(int opcion, String p_ciacon, lcocied obj) {
		// TODO Auto-generated method stub
		return lcociedRepo.listByDetalle(opcion, p_ciacon, obj.getPk().getDl_asien(), obj.getPk().getDl_secue(), obj.getDl_tipope(), obj.getDl_ctasal(), obj.getDl_ctatra(),
				obj.getDl_usrcrea(), obj.getDl_feccrea(), obj.getDl_hracrea(), obj.getDl_usract(), obj.getDl_fecact(), obj.getDl_hraact());
	}

	@Override
	public void agregarRegistro(int opcion, String p_ciacon, lcocied obj) {
		lcociedRepo.nuevoRegistro(opcion, p_ciacon, obj.getPk().getDl_asien(), obj.getPk().getDl_secue(), obj.getDl_tipope(), obj.getDl_ctasal(), obj.getDl_ctatra(),
				obj.getDl_usrcrea(), obj.getDl_feccrea(), obj.getDl_hracrea(), obj.getDl_usract(), obj.getDl_fecact(), obj.getDl_hraact());
		
	}

	@Override
	public void editarRegistro(int opcion, String p_ciacon, lcocied obj) {
		lcociedRepo.actualizaRegistro(opcion, p_ciacon, obj.getPk().getDl_asien(), obj.getPk().getDl_secue(), obj.getDl_tipope(), obj.getDl_ctasal(), obj.getDl_ctatra(),
				obj.getDl_usrcrea(), obj.getDl_feccrea(), obj.getDl_hracrea(), obj.getDl_usract(), obj.getDl_fecact(), obj.getDl_hraact());
		
	}

	@Override
	public void eliminarRegistro(int opcion, String p_ciacon, lcocied obj) {
		lcociedRepo.eliminarRegistro(opcion, p_ciacon, obj.getPk().getDl_asien(), obj.getPk().getDl_secue(), obj.getDl_tipope(), obj.getDl_ctasal(), obj.getDl_ctatra(),
				obj.getDl_usrcrea(), obj.getDl_feccrea(), obj.getDl_hracrea(), obj.getDl_usract(), obj.getDl_fecact(), obj.getDl_hraact());
		
	}

	@Override
	public List<Map<String,Object[]>> listByDetAndCab(int opcion, String p_ciacon, lcocied obj) {
		// TODO Auto-generated method stub
		return lcociedRepo.listByDetAndCab(opcion, p_ciacon, obj.getPk().getDl_asien(), obj.getPk().getDl_secue(), obj.getDl_tipope(), obj.getDl_ctasal(), obj.getDl_ctatra(),
				obj.getDl_usrcrea(), obj.getDl_feccrea(), obj.getDl_hracrea(), obj.getDl_usract(), obj.getDl_fecact(), obj.getDl_hraact());
		
	}

}
