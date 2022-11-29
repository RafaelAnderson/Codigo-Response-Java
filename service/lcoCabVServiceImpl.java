package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoCabV;
import com.empresa.entity.lcoDetV;
import com.empresa.repository.lcoCabVRepository;

@Service
public class lcoCabVServiceImpl implements lcoCabVService {

	@Autowired
	lcoCabVRepository repository;

	@Override
	public void transaccional(int opcion, String cia, String año, lcoCabV obj) {
		// TODO Auto-generated method stub
		repository.transaccional(opcion, cia, año, obj.getPk().getCl_subdia(), obj.getPk().getCl_compro(),
				obj.getCl_tipo(), obj.getCl_feccom(), obj.getCl_moneda(), obj.getCl_tctipo(), obj.getCl_tcimporte(),
				obj.getCl_tcfecha(), obj.getCl_glosa(), obj.getCl_estado(), obj.getCl_totvouc(), obj.getCl_origen(),
				obj.getCl_flagconv(), obj.getCl_form(), obj.getCl_extor(), obj.getCl_usrcrea(), obj.getCl_fecCrea(),
				obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public List<lcoCabV> listar(int opcion, String cia, String año, lcoCabV obj) {
		// TODO Auto-generated method stub
		return repository.lista(opcion, cia, año, obj.getPk().getCl_subdia(), obj.getPk().getCl_compro(),
				obj.getCl_tipo(), obj.getCl_feccom(), obj.getCl_moneda(), obj.getCl_tctipo(), obj.getCl_tcimporte(),
				obj.getCl_tcfecha(), obj.getCl_glosa(), obj.getCl_estado(), obj.getCl_totvouc(), obj.getCl_origen(),
				obj.getCl_flagconv(), obj.getCl_form(), obj.getCl_extor(), obj.getCl_usrcrea(), obj.getCl_fecCrea(),
				obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public List<Object[]> listUltimoNumReaV2(int opcion, String p_ciacont, String Año, String Mes, String ejercicio,
			lcoCabV obj) {
		// TODO Auto-generated method stub
		return repository.listUltimoNumReaV2(opcion, p_ciacont, Año, Mes, ejercicio, obj.getPk().getCl_subdia(),
				obj.getPk().getCl_compro(), obj.getCl_tipo(),
				obj.getCl_feccom(), obj.getCl_moneda(), obj.getCl_tctipo(), obj.getCl_tcimporte(), obj.getCl_tcfecha(),
				obj.getCl_glosa(),
				obj.getCl_estado(), obj.getCl_totvouc(), obj.getCl_origen(),
				obj.getCl_flagconv(), obj.getCl_form(), obj.getCl_extor(), obj.getCl_usrcrea(), obj.getCl_fecCrea(),
				obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public List<Object[]> listar2(int opcion, String cia, String año, lcoCabV obj, lcoDetV obj2) {
		// TODO Auto-generated method stub
		return repository.listar2(opcion, cia, año, obj.getPk().getCl_subdia(),
				obj.getPk().getCl_compro(), obj.getCl_tipo(),
				obj.getCl_feccom(), obj.getCl_moneda(), obj.getCl_tctipo(), obj.getCl_tcimporte(), obj.getCl_tcfecha(),
				obj.getCl_glosa(),
				obj.getCl_estado(), obj.getCl_totvouc(), obj.getCl_origen(),
				obj.getCl_flagconv(), obj.getCl_form(), obj.getCl_extor(), obj.getCl_usrcrea(), obj.getCl_fecCrea(),
				obj.getCl_hracrea(), obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact(),
				obj2.getPk().getDl_subdia(), obj2.getPk().getDl_compro(), obj2.getPk().getDl_secue(),
				obj2.getDl_feccom(), obj2.getDl_cuenta(), obj2.getDl_tpanex(), obj2.getDl_cdanex(), obj2.getDl_cencst(),
				obj2.getDl_dh(), obj2.getDl_tpdoc(), obj2.getDl_nmdoc(), obj2.getDl_fecdoc(), obj2.getDl_fecven(),
				obj2.getDl_tipcam(), obj2.getDl_glosa(), obj2.getDl_codmnd(), obj2.getDl_importe(), obj2.getDl_impmn(),
				obj2.getDl_impbme(), obj2.getDl_tpanex2(),
				obj2.getDl_cdanex2(), obj2.getDl_medpag(), obj2.getDl_tpdocrf(), obj2.getDl_nmdocrf(),
				obj2.getDl_fecdocrf(), obj2.getDl_tptasa(), obj2.getDl_imptas(),
				obj2.getDl_impbmn(), obj2.getDl_impbme(), obj2.getDl_area(), obj2.getDl_ctaorig(), obj2.getDl_tipcmp(),
				obj2.getDl_flag(), obj2.getDl_mndcc(),
				obj2.getDl_colcc(), obj2.getDl_impbicc(), obj2.getDl_inafcc(), obj2.getDl_igvcc(), obj2.getDl_tpcnvcc(),
				obj2.getDl_flagcc(), obj2.getDl_cdanexcc(),
				obj2.getDl_tpanexcc(), obj2.getDl_numdocc(), obj2.getDl_estdc(), obj2.getDl_cantc(),
				obj2.getDl_cdmonc(), obj2.getDl_impc(), obj2.getDl_fecconc(),
				obj2.getDl_nroconc(), obj2.getDl_proconc(), obj2.getDl_nunest(), obj2.getDl_itemc(),
				obj2.getDl_imptbc(), obj2.getDl_anioc(), obj2.getDl_usrcrea(),
				obj2.getDl_fecCrea(), obj2.getDl_hracrea(), obj2.getDl_usract(), obj2.getDl_fecact(),
				obj2.getDl_hraact(), obj2.getDl_datref(), obj2.getDl_docser(), obj2.getDl_docnum(),
				obj2.getDl_docserf(), obj2.getDl_docnumf());
	}

	@Override
	public List<Object[]> listar3(int opcion, String cia, String año, String cl_subdia, String cl_compro) {
		// TODO Auto-generated method stub
		return repository.listar3(opcion, cia, año, cl_subdia, cl_compro);
	}

	public List<lcoCabV> EntreAsientos(int opcion, String p_ciacont, String año, String cl_subdia, String cl_compro,
			String cl_compro2, String estado) {
		// TODO Auto-generated method stub
		return repository.EntreAsientos(opcion, p_ciacont, año, cl_subdia, cl_compro, cl_compro2, estado);
	}

	public List<Object[]> TotalImporte(String p_ciacont, String año, String dl_subdia, String dl_compro) {
		// TODO Auto-generated method stub
		return repository.TotalImporte(p_ciacont, año, dl_subdia, dl_compro);
	}

	@Override
	public List<Map<String, Object>> ListarLibroMayor(String cia, String ejer, String per, String CTAINI, String CTAFIN,
			String option) {
		// TODO Auto-generated method stub
		return repository.ListarLibroMayor(cia, ejer, per, CTAINI, CTAFIN, option);
	}

	@Override
	public List<Map<String, Object>> generarAsiento(String cia, String ejer, String pSD, String pMes, String pAnio) {
		// TODO Auto-generated method stub
		return repository.generarAsiento(cia, ejer, pSD, pMes, pAnio);
	}

	@Override
	public void actualizarBalance(String mes, String cia, String periodo, String ejercicio){
		repository.actualizarBalance(mes, cia, periodo, ejercicio);
	}
}