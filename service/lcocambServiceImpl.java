package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcocamb;
import com.empresa.repository.lcocambRepository;

@Service
public class lcocambServiceImpl implements lcocambService{
	@Autowired
	private lcocambRepository lcocambRepo;

	@Override
	public List<lcocamb> listaRegistros(int opcion, lcocamb obj) {
		// TODO Auto-generated method stub
		return lcocambRepo.listAll(opcion, obj.getPk_ID().getCl_tipmon(), obj.getPk_ID().getCl_fectcamb(),obj.getCl_tipcmpx(),
				obj.getCl_tipcmpn(),obj.getCl_tipvtax(), obj.getCl_tipvtan(), obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(),
				obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public void NuevoRegistro(int opcion, lcocamb obj) {
		lcocambRepo.nuevoRegistro(opcion, obj.getPk_ID().getCl_tipmon(), obj.getPk_ID().getCl_fectcamb(),obj.getCl_tipcmpx(),
				obj.getCl_tipcmpn(),obj.getCl_tipvtax(), obj.getCl_tipvtan(), obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(),
				obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}
		
	

	@Override
	public void editarRegistro(int opcion, lcocamb obj) {
		lcocambRepo.actualizaRegistro(opcion, obj.getPk_ID().getCl_tipmon(), obj.getPk_ID().getCl_fectcamb(),obj.getCl_tipcmpx(),
				obj.getCl_tipcmpn(),obj.getCl_tipvtax(), obj.getCl_tipvtan(), obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(),
				obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public void eliminarRegistro(int opcion, lcocamb obj) {
		lcocambRepo.eliminaRegistro(opcion, obj.getPk_ID().getCl_tipmon(), obj.getPk_ID().getCl_fectcamb(),obj.getCl_tipcmpx(),
				obj.getCl_tipcmpn(),obj.getCl_tipvtax(), obj.getCl_tipvtan(), obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(),
				obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public List<lcocamb> listaUnRegistro(int opcion, lcocamb obj) {
		// TODO Auto-generated method stub
		return lcocambRepo.listaUno(opcion, obj.getPk_ID().getCl_tipmon(), obj.getPk_ID().getCl_fectcamb(),obj.getCl_tipcmpx(),
				obj.getCl_tipcmpn(),obj.getCl_tipvtax(), obj.getCl_tipvtan(), obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(),
				obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public List<lcocamb> getByYearMonth(int year, int month, String money) {
		// TODO Auto-generated method stub
		return lcocambRepo.getByYearMonth(year, month, money);
	}


	//==================================================================================================================================================

	@Override
	public List<lcocamb> swListarTcb(int opcion, lcocamb obj) {
		// TODO Auto-generated method stub
		return lcocambRepo.swListarTcb(opcion, obj.getPk_ID().getCl_tipmon(), obj.getPk_ID().getCl_fectcamb(),obj.getCl_tipcmpx(),
				obj.getCl_tipcmpn(),obj.getCl_tipvtax(), obj.getCl_tipvtan(), obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(),
				obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact(), obj.getCl_tipcn21(), obj.getCl_tipvn21());
	}

	@Override
	public void registrarTcb(int opcion, lcocamb obj) {
		lcocambRepo.registrarTcb(opcion, obj.getPk_ID().getCl_tipmon(), obj.getPk_ID().getCl_fectcamb(),obj.getCl_tipcmpx(),
				obj.getCl_tipcmpn(),obj.getCl_tipvtax(), obj.getCl_tipvtan(), obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(),
				obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact(), obj.getCl_tipcn21(),obj.getCl_tipvn21());
	}
		
	

	@Override
	public void actualizarTcb(int opcion, lcocamb obj) {
		lcocambRepo.actualizarTcb(opcion, obj.getPk_ID().getCl_tipmon(), obj.getPk_ID().getCl_fectcamb(),obj.getCl_tipcmpx(),
				obj.getCl_tipcmpn(),obj.getCl_tipvtax(), obj.getCl_tipvtan(), obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(),
				obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact(), obj.getCl_tipcn21(),obj.getCl_tipvn21());
	}

	@Override
	public void eliminarTcb(int opcion, lcocamb obj) {
		lcocambRepo.eliminarTcb(opcion, obj.getPk_ID().getCl_tipmon(), obj.getPk_ID().getCl_fectcamb(),obj.getCl_tipcmpx(),
				obj.getCl_tipcmpn(),obj.getCl_tipvtax(), obj.getCl_tipvtan(), obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(),
				obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact(), obj.getCl_tipcn21(), obj.getCl_tipvn21());
	}

	@Override
	public void actualizarTcbNic(int opcion, lcocamb obj){
		lcocambRepo.actualizarTcbNic(opcion,obj.getPk_ID().getCl_tipmon(),obj.getPk_ID().getCl_fectcamb(),obj.getCl_tipcn21(),obj.getCl_tipvn21());
	}
}
