package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.empresa.entity.lcoDetV;

import com.empresa.entity.lcoDetVPk;

@Repository
public interface lcoDtaVGrilllaRepository extends JpaRepository<lcoDetV, lcoDetVPk> {

	@Query(value = "{call SP_extornaAsiento( :subdia, :compro,"
			+ ":cia, "
			+ ":ejer)}", nativeQuery = true)
	void extornaAsiento(
			@Param("subdia") String subdia,
			@Param("compro") String compro,
			@Param("cia") String cia,
			@Param("ejer") String ejer);

	@Query(value = "{call SP_finalAsiento( :subdia, :compro,"
			+ ":cia, "
			+ ":ejer, :usu)}", nativeQuery = true)
	void finalizarAsiento(
			@Param("subdia") String subdia,
			@Param("compro") String compro,
			@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("usu") String usu);

	@Query(value = "{call SP_FacturaReferencia(:opcion, :cia, :ejer)}", nativeQuery = true)
	public List<Map<String, Object>> listaFacturaReferencia(
			@Param("opcion") String opcion,
			@Param("cia") String cia,
			@Param("ejer") String ejer);

	@Query(value = "{call SP_CrudDetV(:opcion, :p_ciacont, :año, :dl_subdia,:dl_compro, :dl_secue, :dl_feccom, :dl_cuenta, :dl_tpanex,:dl_cdanex, "
			+ ":dl_cencst, :dl_dh, :dl_tpdoc, :dl_nmdoc,:dl_fecdoc, :dl_fecven, :dl_tipcam, :dl_glosa,:dl_codmnd, "
			+ ":dl_importe, :dl_impmn, :dl_impme, :dl_tpanex2,:dl_cdanex2, :dl_medpag, :dl_tpdocrf, :dl_nmdocrf, :dl_fecdocrf,:dl_tptasa, "
			+ ":dl_imptas, :dl_impbmn, :dl_impbme, :dl_area,:dl_ctaorig, :dl_tipcmp, :dl_flag, :dl_mndcc, :dl_colcc,:dl_impbicc, "
			+ ":dl_inafcc, :dl_igvcc, :dl_tpcnvcc, :dl_flagcc,:dl_cdanexcc, :dl_tpanexcc, :dl_numdocc, :dl_estdc, :dl_cantc,:dl_cdmonc, "
			+ ":dl_impc, :dl_fecconc, :dl_nroconc, :dl_proconc,:dl_nunest, :dl_itemc, :dl_imptbc, :dl_anioc, :dl_usrcrea,:dl_fecCrea, "
			+ ":dl_hracrea, :dl_usract, :dl_fecact, :dl_hraact,:dl_datref,:dl_docser,:dl_docnum,:dl_docserf,:dl_docnumf,:dl_fluefec)}", nativeQuery = true)
	List<lcoDetV> listAll(
			@Param("opcion") int opcion, @Param("p_ciacont") String p_ciacont, @Param("año") String año,
			@Param("dl_subdia") String dl_subdia,
			@Param("dl_compro") String dl_compro, @Param("dl_secue") String dl_secue,
			@Param("dl_feccom") LocalDate dl_feccom,
			@Param("dl_cuenta") String dl_cuenta, @Param("dl_tpanex") String dl_tpanex,
			@Param("dl_cdanex") String dl_cdanex, @Param("dl_cencst") String dl_cencst,
			@Param("dl_dh") String dl_dh, @Param("dl_tpdoc") String dl_tpdoc, @Param("dl_nmdoc") String dl_nmdoc,
			@Param("dl_fecdoc") LocalDate dl_fecdoc,
			@Param("dl_fecven") LocalDate dl_fecven, @Param("dl_tipcam") Double dl_tipcam,
			@Param("dl_glosa") String dl_glosa, @Param("dl_codmnd") String dl_codmnd,
			@Param("dl_importe") Double dl_importe, @Param("dl_impmn") Double dl_impmn,
			@Param("dl_impme") Double dl_impme,
			@Param("dl_tpanex2") String dl_tpanex2,
			@Param("dl_cdanex2") String dl_cdanex2,
			@Param("dl_medpag") String dl_medpag,
			@Param("dl_tpdocrf") String dl_tpdocrf,
			@Param("dl_nmdocrf") String dl_nmdocrf,
			@Param("dl_fecdocrf") LocalDate dl_fecdocrf,
			@Param("dl_tptasa") String cl_itmp1,
			@Param("dl_imptas") Double dl_imptas,
			@Param("dl_impbmn") Double dl_impbmn,
			@Param("dl_impbme") Double dl_impbme,
			@Param("dl_area") String dl_area,
			@Param("dl_ctaorig") String dl_ctaorig,
			@Param("dl_tipcmp") String dl_tipcmp,
			@Param("dl_flag") String dl_flag,
			@Param("dl_mndcc") String dl_mndcc,
			@Param("dl_colcc") String dl_colcc,
			@Param("dl_impbicc") Double cl_tipcmp,
			@Param("dl_inafcc") Double dl_inafcc,
			@Param("dl_igvcc") Double dl_igvcc,
			@Param("dl_tpcnvcc") String dl_tpcnvcc,
			@Param("dl_flagcc") String dl_flagcc,
			@Param("dl_cdanexcc") String dl_cdanexcc,
			@Param("dl_tpanexcc") String dl_tpanexcc,
			@Param("dl_numdocc") String dl_numdocc,
			@Param("dl_estdc") String dl_estdc,
			@Param("dl_cantc") Double dl_cantc,
			@Param("dl_cdmonc") String dl_cdmonc,
			@Param("dl_impc") Double dl_impc,
			@Param("dl_fecconc") LocalDate dl_fecconc,
			@Param("dl_nroconc") String dl_nroconc,
			@Param("dl_proconc") LocalDate dl_proconc,
			@Param("dl_nunest") String dl_nunest,
			@Param("dl_itemc") String dl_itemc,
			@Param("dl_imptbc") Double dl_imptbc,
			@Param("dl_anioc") String dl_anioc,
			@Param("dl_usrcrea") String dl_usrcrea,
			@Param("dl_fecCrea") LocalDate dl_fecCrea,
			@Param("dl_hracrea") LocalTime dl_hracrea,
			@Param("dl_usract") String dl_usract,
			@Param("dl_fecact") LocalDate dl_fecact,
			@Param("dl_hraact") LocalTime dl_hraact,
			@Param("dl_datref") String dl_datref,
			@Param("dl_docser") String dl_docser,
			@Param("dl_docnum") String dl_docnum,
			@Param("dl_docserf") String dl_docserf,
			@Param("dl_docnumf") String dl_docnumf,
			@Param("dl_fluefec") String dl_fluefec);

	@Query(value = "{call SP_CrudDetV(:opcion, :p_ciacont, :año, :dl_subdia,:dl_compro, :dl_secue, :dl_feccom, :dl_cuenta, :dl_tpanex,:dl_cdanex, "
			+ ":dl_cencst, :dl_dh, :dl_tpdoc, :dl_nmdoc,:dl_fecdoc, :dl_fecven, :dl_tipcam, :dl_glosa,:dl_codmnd, "// 19
			+ ":dl_importe, :dl_impmn, :dl_impme, :dl_tpanex2,:dl_cdanex2, :dl_medpag, :dl_tpdocrf, :dl_nmdocrf, :dl_fecdocrf,:dl_tptasa, "// 29
			+ ":dl_imptas, :dl_impbmn, :dl_impbme, :dl_area,:dl_ctaorig, :dl_tipcmp, :dl_flag, :dl_mndcc, :dl_colcc,:dl_impbicc, "// 39
			+ ":dl_inafcc, :dl_igvcc, :dl_tpcnvcc, :dl_flagcc,:dl_cdanexcc, :dl_tpanexcc, :dl_numdocc, :dl_estdc, :dl_cantc,:dl_cdmonc, "
			+ ":dl_impc, :dl_fecconc, :dl_nroconc, :dl_proconc,:dl_nunest, :dl_itemc, :dl_imptbc, :dl_anioc, :dl_usrcrea,:dl_fecCrea, "
			+ ":dl_hracrea, :dl_usract, :dl_fecact, :dl_hraact,:dl_datref,:dl_docser,:dl_docnum,:dl_docserf,:dl_docnumf,:dl_fluefec)}", nativeQuery = true)
	@Transactional
	@Modifying
	void transaccional(
			@Param("opcion") int opcion,
			@Param("p_ciacont") String p_ciacont,
			@Param("año") String año,
			@Param("dl_subdia") String dl_subdia,
			@Param("dl_compro") String dl_compro,
			@Param("dl_secue") String dl_secue,
			@Param("dl_feccom") LocalDate dl_feccom,
			@Param("dl_cuenta") String dl_cuenta,
			@Param("dl_tpanex") String dl_tpanex,
			@Param("dl_cdanex") String dl_cdanex,
			@Param("dl_cencst") String dl_cencst,
			@Param("dl_dh") String dl_dh,
			@Param("dl_tpdoc") String dl_tpdoc,
			@Param("dl_nmdoc") String dl_nmdoc,
			@Param("dl_fecdoc") LocalDate dl_fecdoc,
			@Param("dl_fecven") LocalDate dl_fecven,
			@Param("dl_tipcam") Double dl_tipcam,
			@Param("dl_glosa") String dl_glosa,
			@Param("dl_codmnd") String dl_codmnd,
			@Param("dl_importe") Double dl_importe,
			@Param("dl_impmn") Double dl_impmn,
			@Param("dl_impme") Double dl_impme,
			@Param("dl_tpanex2") String dl_tpanex2,
			@Param("dl_cdanex2") String dl_cdanex2,
			@Param("dl_medpag") String dl_medpag,
			@Param("dl_tpdocrf") String dl_tpdocrf,
			@Param("dl_nmdocrf") String dl_nmdocrf,
			@Param("dl_fecdocrf") LocalDate dl_fecdocrf,
			@Param("dl_tptasa") String cl_itmp1,
			@Param("dl_imptas") Double dl_imptas,
			@Param("dl_impbmn") Double dl_impbmn,
			@Param("dl_impbme") Double dl_impbme,
			@Param("dl_area") String dl_area,
			@Param("dl_ctaorig") String dl_ctaorig,
			@Param("dl_tipcmp") String dl_tipcmp,
			@Param("dl_flag") String dl_flag,
			@Param("dl_mndcc") String dl_mndcc,
			@Param("dl_colcc") String dl_colcc,
			@Param("dl_impbicc") Double cl_tipcmp,
			@Param("dl_inafcc") Double dl_inafcc,
			@Param("dl_igvcc") Double dl_igvcc,
			@Param("dl_tpcnvcc") String dl_tpcnvcc,
			@Param("dl_flagcc") String dl_flagcc,
			@Param("dl_cdanexcc") String dl_cdanexcc,
			@Param("dl_tpanexcc") String dl_tpanexcc,
			@Param("dl_numdocc") String dl_numdocc,
			@Param("dl_estdc") String dl_estdc,
			@Param("dl_cantc") Double dl_cantc,
			@Param("dl_cdmonc") String dl_cdmonc,
			@Param("dl_impc") Double dl_impc,
			@Param("dl_fecconc") LocalDate dl_fecconc,
			@Param("dl_nroconc") String dl_nroconc,
			@Param("dl_proconc") LocalDate dl_proconc,
			@Param("dl_nunest") String dl_nunest,
			@Param("dl_itemc") String dl_itemc,
			@Param("dl_imptbc") Double dl_imptbc,
			@Param("dl_anioc") String dl_anioc,
			@Param("dl_usrcrea") String dl_usrcrea,
			@Param("dl_fecCrea") LocalDate dl_fecCrea,
			@Param("dl_hracrea") LocalTime dl_hracrea,
			@Param("dl_usract") String dl_usract,
			@Param("dl_fecact") LocalDate dl_fecact,
			@Param("dl_hraact") LocalTime dl_hraact,
			@Param("dl_datref") String dl_datref,
			@Param("dl_docser") String dl_docser,
			@Param("dl_docnum") String dl_docnum,
			@Param("dl_docserf") String dl_docserf,
			@Param("dl_docnumf") String dl_docnumf,
			@Param("dl_fluefec") String dl_fluefec);

	@Query(value = "{call SP_CrudDetV(:opcion, :p_ciacont, :año, :dl_subdia,:dl_compro, :dl_secue, :dl_feccom, :dl_cuenta, :dl_tpanex,:dl_cdanex, "
			+ ":dl_cencst, :dl_dh, :dl_tpdoc, :dl_nmdoc,:dl_fecdoc, :dl_fecven, :dl_tipcam, :dl_glosa,:dl_codmnd, "
			+ ":dl_importe, :dl_impmn, :dl_impme, :dl_tpanex2,:dl_cdanex2, :dl_medpag, :dl_tpdocrf, :dl_nmdocrf, :dl_fecdocrf,:dl_tptasa, "
			+ ":dl_imptas, :dl_impbmn, :dl_impbme, :dl_area,:dl_ctaorig, :dl_tipcmp, :dl_flag, :dl_mndcc, :dl_colcc,:dl_impbicc, "
			+ ":dl_inafcc, :dl_igvcc, :dl_tpcnvcc, :dl_flagcc,:dl_cdanexcc, :dl_tpanexcc, :dl_numdocc, :dl_estdc, :dl_cantc,:dl_cdmonc, "
			+ ":dl_impc, :dl_fecconc, :dl_nroconc, :dl_proconc,:dl_nunest, :dl_itemc, :dl_imptbc, :dl_anioc, :dl_usrcrea,:dl_fecCrea, "
			+ ":dl_hracrea, :dl_usract, :dl_fecact, :dl_hraact,:dl_datref,:dl_docser,:dl_docnum,:dl_docserf,:dl_docnumf,:dl_fluefec)}", nativeQuery = true)
	List<Object> getTotal(@Param("opcion") int opcion, @Param("p_ciacont") String p_ciacont, @Param("año") String año,
			@Param("dl_subdia") String dl_subdia,
			@Param("dl_compro") String dl_compro, @Param("dl_secue") String dl_secue,
			@Param("dl_feccom") LocalDate dl_feccom,
			@Param("dl_cuenta") String dl_cuenta, @Param("dl_tpanex") String dl_tpanex,
			@Param("dl_cdanex") String dl_cdanex, @Param("dl_cencst") String dl_cencst,
			@Param("dl_dh") String dl_dh, @Param("dl_tpdoc") String dl_tpdoc, @Param("dl_nmdoc") String dl_nmdoc,
			@Param("dl_fecdoc") LocalDate dl_fecdoc,
			@Param("dl_fecven") LocalDate dl_fecven, @Param("dl_tipcam") Double dl_tipcam,
			@Param("dl_glosa") String dl_glosa, @Param("dl_codmnd") String dl_codmnd,
			@Param("dl_importe") Double dl_importe, @Param("dl_impmn") Double dl_impmn,
			@Param("dl_impme") Double dl_impme,
			@Param("dl_tpanex2") String dl_tpanex2,
			@Param("dl_cdanex2") String dl_cdanex2,
			@Param("dl_medpag") String dl_medpag,
			@Param("dl_tpdocrf") String dl_tpdocrf,
			@Param("dl_nmdocrf") String dl_nmdocrf,
			@Param("dl_fecdocrf") LocalDate dl_fecdocrf,
			@Param("dl_tptasa") String cl_itmp1,
			@Param("dl_imptas") Double dl_imptas,
			@Param("dl_impbmn") Double dl_impbmn,
			@Param("dl_impbme") Double dl_impbme,
			@Param("dl_area") String dl_area,
			@Param("dl_ctaorig") String dl_ctaorig,
			@Param("dl_tipcmp") String dl_tipcmp,
			@Param("dl_flag") String dl_flag,
			@Param("dl_mndcc") String dl_mndcc,
			@Param("dl_colcc") String dl_colcc,
			@Param("dl_impbicc") Double cl_tipcmp,
			@Param("dl_inafcc") Double dl_inafcc,
			@Param("dl_igvcc") Double dl_igvcc,
			@Param("dl_tpcnvcc") String dl_tpcnvcc,
			@Param("dl_flagcc") String dl_flagcc,
			@Param("dl_cdanexcc") String dl_cdanexcc,
			@Param("dl_tpanexcc") String dl_tpanexcc,
			@Param("dl_numdocc") String dl_numdocc,
			@Param("dl_estdc") String dl_estdc,
			@Param("dl_cantc") Double dl_cantc,
			@Param("dl_cdmonc") String dl_cdmonc,
			@Param("dl_impc") Double dl_impc,
			@Param("dl_fecconc") LocalDate dl_fecconc,
			@Param("dl_nroconc") String dl_nroconc,
			@Param("dl_proconc") LocalDate dl_proconc,
			@Param("dl_nunest") String dl_nunest,
			@Param("dl_itemc") String dl_itemc,
			@Param("dl_imptbc") Double dl_imptbc,
			@Param("dl_anioc") String dl_anioc,
			@Param("dl_usrcrea") String dl_usrcrea,
			@Param("dl_fecCrea") LocalDate dl_fecCrea,
			@Param("dl_hracrea") LocalTime dl_hracrea,
			@Param("dl_usract") String dl_usract,
			@Param("dl_fecact") LocalDate dl_fecact,
			@Param("dl_hraact") LocalTime dl_hraact,
			@Param("dl_datref") String dl_datref,
			@Param("dl_docser") String dl_docser,
			@Param("dl_docnum") String dl_docnum,
			@Param("dl_docserf") String dl_docserf,
			@Param("dl_docnumf") String dl_docnumf,
			@Param("dl_fluefec") String dl_fluefec);

	@Query(value = "{call SP_SaldoDoc(:cia, :ejer,:cuenta,:cdanex, :tpdoc, :feccom, :nmdoc)}", nativeQuery = true)
	List<Object> Saldos(
			@Param("cia") String cia, @Param("ejer") String ejer, @Param("cuenta") String cuenta,
			@Param("cdanex") String cdanex,
			@Param("tpdoc") String tpdoc, @PathVariable("feccom") String feccom, @Param("nmdoc") String nmdoc);

	@Query(value = "{call SP_ConsultaSaldosDocumento(:_opcion, :cia, :ejer, :cuenta, :tpane, :codane, :periodo, :opcion, :tipodoc, :numdoc)}", nativeQuery = true)
	List<Map<String, Object>> SaldosDoc(
			@Param("_opcion") int _opcion,
			@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("cuenta") String cuenta,
			@Param("tpane") String tpane,
			@Param("codane") String codane,
			@Param("periodo") String periodo,
			@Param("opcion") String opcion,
			@Param("tipodoc") String tipodoc,
			@Param("numdoc") String numdoc);

	/// documento detraccion
	@Query(value = "{call SP_Documento_Detraccion(:cia, :ejer, :feini, :fefin, :option)}", nativeQuery = true)
	List<Map<String, Object>> ListGrilla(
			@Param("option") String option,
			@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("feini") String feini,
			@Param("fefin") String fefin);
	//kirby
	@Query(value = "{call SP_Documento_Detraccion(:cia, :ejer, :feini, :fefin, :option)}", nativeQuery = true)
	List<Map<String, Object>> ListGrillaActualizada(
			@Param("option") String option,
			@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("feini") String feini,
			@Param("fefin") String fefin);

	@Query(value = "{call SP_Documento_Detraccion(:cia, :ejer, :feini, :fefin, :option)}", nativeQuery = true)
	List<Map<String, Object>> GenArchivo(
			@Param("option") String option,
			@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("feini") String feini,
			@Param("fefin") String fefin);

	@Query(value = "{call SP_Actualizar_Detraccion(:cia,:ejer,:Nrodet,:Fecdoc,:Codanex,:Nrodoc,"
			+ " :Tipdoc, :Subida, :Asiento, :Secue )}", nativeQuery = true)
	@Transactional
	@Modifying
	void actualizarDocDetra(
			@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("Nrodet") String Nrodet,
			@Param("Fecdoc") LocalDate Fecdoc,
			@Param("Codanex") String Codanex,
			@Param("Nrodoc") String Nrodoc,
			@Param("Tipdoc") String Tipdoc,
			@Param("Subida") String Subida,
			@Param("Asiento") String Asiento,
			@Param("Secue") String Secue);

	/// documento final detraccion

	@Query(value = "{call SP_SaldoDocumento(:opcion, :cia, :ejer, :cuenta, :tipo, :anexo, :tpdoc, :numdoc)}", nativeQuery = true)
	List<Map<String, Object>> saldoDocumentosPorAnexo(
			@Param("opcion") int opcion,
			@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("cuenta") String cuenta,
			@Param("tipo") String tipo,
			@Param("anexo") String anexo,
			@Param("tpdoc") String tpdoc,
			@Param("numdoc") String numdoc);

	@Query(value = "{call SP_SaldoDocumento(:opcion, :cia, :ejer, :cuenta, :tipo, :anexo, :tpdoc, :numdoc)}", nativeQuery = true)
	List<Map<String, Object>> saldoDocumentosDocPag(
			@Param("opcion") int opcion,
			@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("cuenta") String cuenta,
			@Param("tipo") String tipo,
			@Param("anexo") String anexo,
			@Param("tpdoc") String tpdoc,
			@Param("numdoc") String numdoc);

	// Procedimiento de SP_EliminancionXMovimiento
	@Query(value = "{call SP_EliminancionXMovimiento(:opcion, :cia , :ejercicio, :TipAnex, :CodAnexo)}", nativeQuery = true)
	List<Map<String, Object[]>> eliminacionXmovimientoAnexo(
			@Param("opcion") int opcion,
			@Param("cia") String cia,
			@Param("ejercicio") String ejercicio,
			@Param("TipAnex") String TipAnex,
			@Param("CodAnexo") String CodAnexo);

	@Query(value = "{call SP_DocReferencia(:opcion, :cia, :ejercicio, :subdiario, :comprobante, :secuencia)}", nativeQuery = true)
	List<Map<String, Object>> DocReferencia(
			@Param("opcion") int opcion,
			@Param("cia") String cia,
			@Param("ejercicio") String ejercicio,
			@Param("subdiario") String subdiario,
			@Param("comprobante") String comprobante,
			@Param("secuencia") String secuencia);

	@Query(value = "{call SP_DocReferencia(:opcion, :cia, :ejercicio, :subdiario, :comprobante, :secuencia)}", nativeQuery = true)
	@Transactional
	@Modifying
	void EliminarRef(
			@Param("opcion") int opcion,
			@Param("cia") String cia,
			@Param("ejercicio") String ejercicio,
			@Param("subdiario") String subdiario,
			@Param("comprobante") String comprobante,
			@Param("secuencia") String secuencia);

	@Query(value = "{call SP_ListaDocReferencia(:cia, :ejer, :tipcmp, :cuenta, :dh, :tpanex, :cdanex)}", nativeQuery = true)
	List<Map<String, Object>> listaDocReferencia(
			@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("tipcmp") String tipcmp,
			@Param("cuenta") String cuenta,
			@Param("dh") String dh,
			@Param("tpanex") String tpanex,
			@Param("cdanex") String cdanex

	);
}
