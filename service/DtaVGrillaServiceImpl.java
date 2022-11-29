package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoDetV;

import com.empresa.repository.lcoDtaVGrilllaRepository;

@Service
public class DtaVGrillaServiceImpl implements DtaVGrillaService {

	@Autowired
	lcoDtaVGrilllaRepository repository;

	public List<Map<String, Object>> listaFacturaReferencia(String opcion, String cia, String ejer) {
		return repository.listaFacturaReferencia(opcion, cia, ejer);
	}

	@Override
	public void extornaAsiento(String subdia, String compro, String cia, String ejer) {
		repository.extornaAsiento(subdia, compro, cia, ejer);
	}

	@Override
	public void finalizarAsiento(String subdia, String compro, String cia, String ejer, String usu) {
		repository.finalizarAsiento(subdia, compro, cia, ejer, usu);
	}

	@Override
	public List<lcoDetV> listaGrilla(int opcion, String p_ciacont, String año, lcoDetV obj) {
		// TODO Auto-generated method stub
		return repository.listAll(opcion, p_ciacont, año, obj.getPk().getDl_subdia(), obj.getPk().getDl_compro(),
				obj.getPk().getDl_secue(), obj.getDl_feccom(), obj.getDl_cuenta(), obj.getDl_tpanex(),
				obj.getDl_cdanex(), obj.getDl_cencst(), obj.getDl_dh(), obj.getDl_tpdoc(), obj.getDl_nmdoc(),
				obj.getDl_fecdoc(), obj.getDl_fecven(),
				obj.getDl_tipcam(), obj.getDl_glosa(), obj.getDl_codmnd(), obj.getDl_importe(), obj.getDl_impmn(),
				obj.getDl_impbme(), obj.getDl_tpanex2(),
				obj.getDl_cdanex2(), obj.getDl_medpag(), obj.getDl_tpdocrf(), obj.getDl_nmdocrf(), obj.getDl_fecdocrf(),
				obj.getDl_tptasa(), obj.getDl_imptas(),
				obj.getDl_impbmn(), obj.getDl_impbme(), obj.getDl_area(), obj.getDl_ctaorig(), obj.getDl_tipcmp(),
				obj.getDl_flag(), obj.getDl_mndcc(),
				obj.getDl_colcc(), obj.getDl_impbicc(), obj.getDl_inafcc(), obj.getDl_igvcc(), obj.getDl_tpcnvcc(),
				obj.getDl_flagcc(), obj.getDl_cdanexcc(),
				obj.getDl_tpanexcc(), obj.getDl_numdocc(), obj.getDl_estdc(), obj.getDl_cantc(), obj.getDl_cdmonc(),
				obj.getDl_impc(), obj.getDl_fecconc(),
				obj.getDl_nroconc(), obj.getDl_proconc(), obj.getDl_nunest(), obj.getDl_itemc(), obj.getDl_imptbc(),
				obj.getDl_anioc(), obj.getDl_usrcrea(),
				obj.getDl_fecCrea(), obj.getDl_hracrea(), obj.getDl_usract(), obj.getDl_fecact(), obj.getDl_hraact(),
				obj.getDl_datref(), obj.getDl_docser(), obj.getDl_docnum(), obj.getDl_docserf(), obj.getDl_docnumf(),
				obj.getDl_fluefec());
	}
	// kirby

	@Override
	public void transaccion(int opcion, String p_ciacont, String año, lcoDetV obj) {
		repository.transaccional(
				opcion,
				p_ciacont,
				año,
				obj.getPk().getDl_subdia(),
				obj.getPk().getDl_compro(),
				obj.getPk().getDl_secue(),
				obj.getDl_feccom(),
				obj.getDl_cuenta(),
				obj.getDl_tpanex(),
				obj.getDl_cdanex(),
				obj.getDl_cencst(),
				obj.getDl_dh(),
				obj.getDl_tpdoc(),
				obj.getDl_nmdoc(),
				obj.getDl_fecdoc(),
				obj.getDl_fecven(),
				obj.getDl_tipcam(),
				obj.getDl_glosa(),
				obj.getDl_codmnd(),
				obj.getDl_importe(),
				obj.getDl_impmn(),
				obj.getDl_impme(),
				obj.getDl_tpanex2(),
				obj.getDl_cdanex2(),
				obj.getDl_medpag(),
				obj.getDl_tpdocrf(),
				obj.getDl_nmdocrf(),
				obj.getDl_fecdocrf(),
				obj.getDl_tptasa(),
				obj.getDl_imptas(),
				obj.getDl_impbmn(),
				obj.getDl_impbme(),
				obj.getDl_area(),
				obj.getDl_ctaorig(),
				obj.getDl_tipcmp(),
				obj.getDl_flag(),
				obj.getDl_mndcc(),
				obj.getDl_colcc(),
				obj.getDl_impbicc(),
				obj.getDl_inafcc(),
				obj.getDl_igvcc(),
				obj.getDl_tpcnvcc(),
				obj.getDl_flagcc(),
				obj.getDl_cdanexcc(),
				obj.getDl_tpanexcc(),
				obj.getDl_numdocc(),
				obj.getDl_estdc(),
				obj.getDl_cantc(),
				obj.getDl_cdmonc(),
				obj.getDl_impc(),
				obj.getDl_fecconc(),
				obj.getDl_nroconc(),
				obj.getDl_proconc(),
				obj.getDl_nunest(),
				obj.getDl_itemc(),
				obj.getDl_imptbc(),
				obj.getDl_anioc(),
				obj.getDl_usrcrea(),
				obj.getDl_fecCrea(),
				obj.getDl_hracrea(),
				obj.getDl_usract(),
				obj.getDl_fecact(),
				obj.getDl_hraact(),
				obj.getDl_datref(),
				obj.getDl_docser(),
				obj.getDl_docnum(),
				obj.getDl_docserf(),
				obj.getDl_docnumf(),
				obj.getDl_fluefec());
	}

	@Override
	public List<Object> listaTotal(int opcion, String p_ciacont, String año, lcoDetV obj) {
		// TODO Auto-generated method stub
		return repository.getTotal(opcion, p_ciacont, año, obj.getPk().getDl_subdia(), obj.getPk().getDl_compro(),
				obj.getPk().getDl_secue(), obj.getDl_feccom(), obj.getDl_cuenta(), obj.getDl_tpanex(),
				obj.getDl_cdanex(), obj.getDl_cencst(), obj.getDl_dh(), obj.getDl_tpdoc(), obj.getDl_nmdoc(),
				obj.getDl_fecdoc(), obj.getDl_fecven(),
				obj.getDl_tipcam(), obj.getDl_glosa(), obj.getDl_codmnd(), obj.getDl_importe(), obj.getDl_impmn(),
				obj.getDl_impbme(), obj.getDl_tpanex2(),
				obj.getDl_cdanex2(), obj.getDl_medpag(), obj.getDl_tpdocrf(), obj.getDl_nmdocrf(), obj.getDl_fecdocrf(),
				obj.getDl_tptasa(), obj.getDl_imptas(),
				obj.getDl_impbmn(), obj.getDl_impbme(), obj.getDl_area(), obj.getDl_ctaorig(), obj.getDl_tipcmp(),
				obj.getDl_flag(), obj.getDl_mndcc(),
				obj.getDl_colcc(), obj.getDl_impbicc(), obj.getDl_inafcc(), obj.getDl_igvcc(), obj.getDl_tpcnvcc(),
				obj.getDl_flagcc(), obj.getDl_cdanexcc(),
				obj.getDl_tpanexcc(), obj.getDl_numdocc(), obj.getDl_estdc(), obj.getDl_cantc(), obj.getDl_cdmonc(),
				obj.getDl_impc(), obj.getDl_fecconc(),
				obj.getDl_nroconc(), obj.getDl_proconc(), obj.getDl_nunest(), obj.getDl_itemc(), obj.getDl_imptbc(),
				obj.getDl_anioc(), obj.getDl_usrcrea(),
				obj.getDl_fecCrea(), obj.getDl_hracrea(), obj.getDl_usract(), obj.getDl_fecact(), obj.getDl_hraact(),
				obj.getDl_datref(), obj.getDl_docser(), obj.getDl_docnum(), obj.getDl_docserf(), obj.getDl_docnumf(),
				obj.getDl_fluefec());
	}

	@Override
	public List<Object> Saldos(String cia, String ejer, String cuenta, String cdanex, String tpdoc, String feccom,
			String nmdoc) {
		// TODO Auto-generated method stub
		return repository.Saldos(cia, ejer, cuenta, cdanex, tpdoc, feccom, nmdoc);
	}

	/* HUR 1065 */
	@Override
	public List<Map<String, Object>> SaldosDocumento(int _opcion, String cia, String ejer, String cuenta, String tpane,
			String codane, String periodo, String opcion, String tipodoc, String numdoc) {
		return repository.SaldosDoc(_opcion, cia, ejer, cuenta, tpane, codane, periodo, opcion, tipodoc, numdoc);
	}

	@Override
	public List<Map<String, Object>> ListGrilla(String option, String cia, String ejer, String feini, String fefin) {
		// TODO Auto-generated method stub
		return repository.ListGrilla(option, cia, ejer, feini, fefin);
	}

	// kirby
	@Override
	public List<Map<String, Object>> ListGrillaActualizada(String option, String cia, String ejer, String feini,
			String fefin) {
		return repository.ListGrillaActualizada(option, cia, ejer, feini, fefin);
	}

	@Override
	public void actualizarDocDetra(String p_ciacont, String año, lcoDetV obj) {
		repository.actualizarDocDetra(p_ciacont, año, obj.getDl_nrodet(), obj.getDl_fecdoc(),
				obj.getDl_cdanex(), obj.getDl_nmdoc(), obj.getDl_tpdoc(),
				obj.getPk().getDl_subdia(), obj.getPk().getDl_compro(), obj.getPk().getDl_secue());
	}

	@Override
	public List<Map<String, Object>> GenArchivo(String option, String cia, String ejer, String feini, String fefin) {
		// TODO Auto-generated method stub
		return repository.GenArchivo(option, cia, ejer, feini, fefin);
	}

	@Override
	public List<Map<String, Object>> saldoDocumentoPorAnexo(int opcion, String cia,
			String ejercicio,
			String cuenta, String tipo,
			String anexo,
			String tpdoc,
			String numdoc) {
		// TODO Auto-generated method stub
		return repository.saldoDocumentosPorAnexo(opcion, cia, ejercicio, cuenta, tipo, anexo, tpdoc, numdoc);
	}

	@Override
	public List<Map<String, Object>> saldoDocumentoCobranza(int opcion, String cia,
			String ejercicio,
			String cuenta, String tipo,
			String anexo,
			String tpdoc,
			String numdoc) {
		// TODO Auto-generated method stub
		return repository.saldoDocumentosDocPag(opcion, cia, ejercicio, cuenta, tipo, anexo, tpdoc, numdoc);
	}

	// Procedimiento de SP_EliminancionXMovimiento
	@Override
	public List<Map<String, Object[]>> eliminacionXmovimientoAnexo(int opcion,
			String cia,
			String ejercicio,
			String TipAnex,
			String CodAnexo) {
		return repository.eliminacionXmovimientoAnexo(0, cia, ejercicio, TipAnex, CodAnexo);
	}

	@Override
	public List<Map<String, Object>> DocReferencia(int opcion, String cia, String ejercicio, String subdiario,
			String comprobante, String secuencia) {
		return repository.DocReferencia(opcion, cia, ejercicio, subdiario, comprobante, secuencia);
	}

	@Override
	public void EliminarRef(int opcion, String cia, String ejercicio, String subdiario,
			String comprobante, String secuencia) {
		repository.EliminarRef(opcion, cia, ejercicio, subdiario, comprobante, secuencia);
	}

	@Override
	public List<Map<String, Object>> listarDocumentosReferencia(String cia, String ejer, String tipcmp,
			String cuenta, String dh, String tpanex, String cdanex) {
		return repository.listaDocReferencia(cia, ejer, tipcmp, cuenta, dh, tpanex, cdanex);
	}
}
