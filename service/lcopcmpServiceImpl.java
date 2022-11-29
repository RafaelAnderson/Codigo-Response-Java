package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcopcmp;
import com.empresa.repository.lcopcmpRepository;

@Service
public class lcopcmpServiceImpl  implements lcopcmpService{

	@Autowired
	private lcopcmpRepository lcopcmpRepo;

	@Override
	public List<lcopcmp> lista(int opcion, String p_ciacon, lcopcmp obj) {
		// TODO Auto-generated method stub
		return lcopcmpRepo.listAll(opcion,  p_ciacon,obj.getPk_ID().getCl_tipcmp(),obj.getPk_ID().getCl_parcmp(), obj.getCl_itmp1(), obj.getCl_itmp2(), obj.getCl_itmp3(),
				obj.getCl_itmp4(), obj.getCl_itmp5(), obj.getCl_itmp6(), obj.getCl_itmp7(), obj.getCl_usrcrea(), 
				obj.getCl_feccrea(), obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public void agregarRegistro(int opcion, String p_ciacon, lcopcmp obj) {
		lcopcmpRepo.nuevoRegistro(opcion, p_ciacon, obj.getPk_ID().getCl_tipcmp(),obj.getPk_ID().getCl_parcmp(), obj.getCl_itmp1(), obj.getCl_itmp2(), obj.getCl_itmp3(),
				obj.getCl_itmp4(), obj.getCl_itmp5(), obj.getCl_itmp6(), obj.getCl_itmp7(), obj.getCl_usrcrea(), 
				obj.getCl_feccrea(), obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
		
	}

	@Override
	public void editarRegistro(int opcion, String p_ciacon, lcopcmp obj) {
		lcopcmpRepo.actualizaRegistro(opcion, p_ciacon,obj.getPk_ID().getCl_tipcmp(), obj.getPk_ID().getCl_parcmp(), obj.getCl_itmp1(), obj.getCl_itmp2(), obj.getCl_itmp3(),
				obj.getCl_itmp4(), obj.getCl_itmp5(), obj.getCl_itmp6(), obj.getCl_itmp7(), obj.getCl_usrcrea(), 
				obj.getCl_feccrea(), obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
		
	}

	@Override
	public void eliminarRegistro(int opcion, String p_ciacon, lcopcmp obj) {
		lcopcmpRepo.eliminarRegistro(opcion, p_ciacon, obj.getPk_ID().getCl_tipcmp(),obj.getPk_ID().getCl_parcmp(), obj.getCl_itmp1(), obj.getCl_itmp2(), obj.getCl_itmp3(),
				obj.getCl_itmp4(), obj.getCl_itmp5(), obj.getCl_itmp6(), obj.getCl_itmp7(), obj.getCl_usrcrea(), 
				obj.getCl_feccrea(), obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
		
	}

	@Override
	public List<lcopcmp> listaCom(int opcion, String p_ciacon, lcopcmp obj) {
		// TODO Auto-generated method stub
		return lcopcmpRepo.listCom(opcion , p_ciacon,obj.getPk_ID().getCl_tipcmp(),obj.getPk_ID().getCl_parcmp(), obj.getCl_itmp1(), obj.getCl_itmp2(), obj.getCl_itmp3(),
				obj.getCl_itmp4(), obj.getCl_itmp5(), obj.getCl_itmp6(), obj.getCl_itmp7(), obj.getCl_usrcrea(), 
				obj.getCl_feccrea(), obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public List<Map<String, Object>> listarLote(String opcion, String p_ciacon, String año) {
		// TODO Auto-generated method stub
		return lcopcmpRepo.ListarLote(opcion, p_ciacon, año, "");
	}

	@Override
	public void agregarLote(String opcion, String p_ciacon, String año) {
		// TODO Auto-generated method stub
		lcopcmpRepo.agregarLote(opcion, p_ciacon, año, "");
	}

	@Override
	public void actualizarLote(String opcion, String p_ciacon, String año, String lote) {
		// TODO Auto-generated method stub
		lcopcmpRepo.actualizarLote(opcion, p_ciacon, año, lote);
	}

	@Override
	public List<Map<String, Object>> listarCuentaTipoOperacion(int opcion, String p_ciacon, lcopcmp obj) {
		// TODO Auto-generated method stub
		return lcopcmpRepo.listComTipo(opcion, p_ciacon,obj.getPk_ID().getCl_tipcmp(),obj.getPk_ID().getCl_parcmp(), obj.getCl_itmp1(), obj.getCl_itmp2(), obj.getCl_itmp3(),
		obj.getCl_itmp4(), obj.getCl_itmp5(), obj.getCl_itmp6(), obj.getCl_itmp7(), obj.getCl_usrcrea(), 
		obj.getCl_feccrea(), obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public List<lcopcmp> swListarPrmCmpXml(int opcion, String cia, String cl_tipo, String cl_tipcmp,
		String cl_parcmp, String cl_itmp1, String cl_itmp2, String cl_itmp3, String cl_itmp4, String mnd) {
		// TODO Auto-generated method stub
		return lcopcmpRepo.swListarPrmCmpXml(opcion, cia, cl_tipo, cl_tipcmp, cl_parcmp, cl_itmp1, cl_itmp2, cl_itmp3, cl_itmp4, mnd);
	}

	@Override
	public List<Map<String, Object>> swListarPrmCmpCtaMnd(int opcion, String cia, String cl_tipo, String cl_tipcmp, 
		String cl_parcmp, String cl_itmp1, String cl_itmp2, String cl_itmp3, String cl_itmp4, String mnd) {
		// TODO Auto-generated method stub
		return lcopcmpRepo.swListarPrmCmpCtaMnd(opcion, cia, cl_tipo, cl_tipcmp, cl_parcmp, cl_itmp1, cl_itmp2, cl_itmp3, cl_itmp4, mnd);
	}

	@Override
	public List<Map<String, Object>> swURegPrmCmpXML(int opcion, String cia, String cl_tipo, String cl_tipcmp, 
		String cl_parcmp, String cl_itmp1, String cl_itmp2, String cl_itmp3, String cl_itmp4, String mnd) {
		// TODO Auto-generated method stub
		return lcopcmpRepo.swURegPrmCmpXML(opcion, cia, cl_tipo, cl_tipcmp, cl_parcmp, cl_itmp1, cl_itmp2, cl_itmp3, cl_itmp4, mnd);
	}

	@Override
	public List<Map<String, Object>> swPrmCmpVarXml(int opcion, String cia, String cl_tipo, String cl_tipcmp, 
		String cl_parcmp, String cl_itmp1, String cl_itmp2, String cl_itmp3, String cl_itmp4, String mnd) {
		// TODO Auto-generated method stub
		return lcopcmpRepo.swPrmCmpVarXml(opcion, cia, cl_tipo, cl_tipcmp, cl_parcmp, cl_itmp1, cl_itmp2, cl_itmp3, cl_itmp4, mnd);
	}

}
