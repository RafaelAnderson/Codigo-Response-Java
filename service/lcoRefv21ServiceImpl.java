package com.empresa.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoRefv21;
import com.empresa.repository.lcoRefv21Repository;

@Service
public class lcoRefv21ServiceImpl implements lcoRefv21Service {

	@Autowired
	private lcoRefv21Repository lcorefv21Repository;

	@Override
	public List<Map<String, Object>> listDetaDocRef(String cia, String anio, lcoRefv21 lcorefv21) {
		return lcorefv21Repository.listDetaDocRef("1", cia, anio, lcorefv21.getRf_tpanex(), lcorefv21.getRf_cdanex(),
				lcorefv21.getLcoRefv21pk().getrf_subdia(), lcorefv21.getLcoRefv21pk().getrf_compro(),
				lcorefv21.getLcoRefv21pk().getrf_secue(), lcorefv21.getRf_tipdocr(), lcorefv21.getRf_nmdocr(),
				lcorefv21.getRf_serdoc(), lcorefv21.getRf_numdoc(), lcorefv21.getRf_fecdoc(), lcorefv21.getRf_base(),
				lcorefv21.getRf_basemn(), lcorefv21.getRf_baseme(), lcorefv21.getRf_igv(), lcorefv21.getRf_igvmn(),
				lcorefv21.getRf_igvme());
	}

	@Override
	public void registrarDetaRef(String cia, String anio, lcoRefv21 lcorefv21) {
		lcorefv21Repository.crearDetaRef("2", cia, anio, lcorefv21.getRf_tpanex(), lcorefv21.getRf_cdanex(),
			lcorefv21.getLcoRefv21pk().getrf_subdia(), lcorefv21.getLcoRefv21pk().getrf_compro(),
			lcorefv21.getLcoRefv21pk().getrf_secue(), lcorefv21.getRf_tipdocr(), lcorefv21.getRf_nmdocr(),
			lcorefv21.getRf_serdoc(), lcorefv21.getRf_numdoc(), lcorefv21.getRf_fecdoc(), lcorefv21.getRf_base(),
			lcorefv21.getRf_basemn(), lcorefv21.getRf_baseme(), lcorefv21.getRf_igv(), lcorefv21.getRf_igvmn(),
			lcorefv21.getRf_igvme());
		
	}

	@Override
	public void eliminarDetaRef(String cia, String anio, lcoRefv21 lcorefv21) {
		lcorefv21Repository.eliminarDetaRef("3", cia, anio, lcorefv21.getRf_tpanex(), lcorefv21.getRf_cdanex(),
		lcorefv21.getLcoRefv21pk().getrf_subdia(), lcorefv21.getLcoRefv21pk().getrf_compro(),
		lcorefv21.getLcoRefv21pk().getrf_secue(), lcorefv21.getRf_tipdocr(), lcorefv21.getRf_nmdocr(),
		lcorefv21.getRf_serdoc(), lcorefv21.getRf_numdoc(), lcorefv21.getRf_fecdoc(), lcorefv21.getRf_base(),
		lcorefv21.getRf_basemn(), lcorefv21.getRf_baseme(), lcorefv21.getRf_igv(), lcorefv21.getRf_igvmn(),
		lcorefv21.getRf_igvme());
		
	}

	@Override
	public void limpiarDetaRef(String cia, String anio, lcoRefv21 lcorefv21) {
		lcorefv21Repository.eliminarDetaRef("4", cia, anio, lcorefv21.getRf_tpanex(), lcorefv21.getRf_cdanex(),
		lcorefv21.getLcoRefv21pk().getrf_subdia(), lcorefv21.getLcoRefv21pk().getrf_compro(),
		lcorefv21.getLcoRefv21pk().getrf_secue(), lcorefv21.getRf_tipdocr(), lcorefv21.getRf_nmdocr(),
		lcorefv21.getRf_serdoc(), lcorefv21.getRf_numdoc(), lcorefv21.getRf_fecdoc(), lcorefv21.getRf_base(),
		lcorefv21.getRf_basemn(), lcorefv21.getRf_baseme(), lcorefv21.getRf_igv(), lcorefv21.getRf_igvmn(),
		lcorefv21.getRf_igvme());
		
	}

	@Override
	public void eliminarRefByDetalle(String cia, String anio, lcoRefv21 lcorefv21) {
		lcorefv21Repository.eliminarDetaRef("5", cia, anio, lcorefv21.getRf_tpanex(), lcorefv21.getRf_cdanex(),
		lcorefv21.getLcoRefv21pk().getrf_subdia(), lcorefv21.getLcoRefv21pk().getrf_compro(),
		lcorefv21.getLcoRefv21pk().getrf_secue(), lcorefv21.getRf_tipdocr(), lcorefv21.getRf_nmdocr(),
		lcorefv21.getRf_serdoc(), lcorefv21.getRf_numdoc(), lcorefv21.getRf_fecdoc(), lcorefv21.getRf_base(),
		lcorefv21.getRf_basemn(), lcorefv21.getRf_baseme(), lcorefv21.getRf_igv(), lcorefv21.getRf_igvmn(),
		lcorefv21.getRf_igvme());
		
	}

	

}
