package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoDetV;

public interface DtaVGrillaService {

	public List<Map<String, Object>> listaFacturaReferencia(String opcion, String cia, String ejer);

	public List<lcoDetV> listaGrilla(int opcion, String p_ciacont, String año, lcoDetV obj);

	public List<Object> listaTotal(int opcion, String p_ciacont, String año, lcoDetV obj);

	public List<Object> Saldos(String cia, String ejer, String cuenta, String cdanex, String tpdoc, String feccom,
			String nmdoc);

	// HUR 1065 RP
	public List<Map<String, Object>> SaldosDocumento(int _opcion, String cia, String ejer, String cuenta, String tpane,
			String codane, String periodo, String opcion, String tipodoc, String numdoc);

	void transaccion(int opcion, String p_ciacont, String año, lcoDetV obj);

	// Lenin
	void finalizarAsiento(String subdia, String compro, String cia, String ejer, String usu);

	void extornaAsiento(String subdia, String compro, String cia, String ejer);

	// nick
	public List<Map<String, Object>> ListGrilla(String option, String cia, String ejer, String feini, String fefin);

	// kirby
	public List<Map<String, Object>> ListGrillaActualizada(String option, String cia, String ejer, String feini,
			String fefin);

	public List<Map<String, Object>> GenArchivo(String option, String cia, String ejer, String feini, String fefin);

	public void actualizarDocDetra(String p_ciacont, String año, lcoDetV obj);

	// Joseph
	public List<Map<String, Object>> saldoDocumentoPorAnexo(int opcion, String cia,
			String ejercicio,
			String cuenta, String tipo,
			String anexo,
			String tpdoc,
			String numdoc);

	// Christian
	public List<Map<String, Object>> saldoDocumentoCobranza(int opcion, String cia,
			String ejercicio,
			String cuenta, String tipo,
			String anexo,
			String tpdoc,
			String numdoc);

	// Procedimiento de SP_EliminancionXMovimiento
	public List<Map<String, Object[]>> eliminacionXmovimientoAnexo(int opcion,
			String cia,
			String ejercicio,
			String TipAnex,
			String CodAnexo);

	public List<Map<String, Object>> DocReferencia(int opcion, String cia, String ejercicio, String subdiario,
			String comprobante, String secuencia);

	public void EliminarRef(int opcion, String cia, String ejercicio, String subdiario,
			String comprobante, String secuencia);

	// Lista documentos de referencia
	public List<Map<String, Object>> listarDocumentosReferencia(
			String cia,
			String ejer,
			String tipcmp,
			String cuenta,
			String dh,
			String tpanex,
			String cdanex);

}
