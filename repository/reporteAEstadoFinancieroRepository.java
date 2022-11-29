package com.empresa.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.lcoTasa;
import com.empresa.entity.lcoTasaPk;

public interface reporteAEstadoFinancieroRepository extends JpaRepository<lcoTasa, lcoTasaPk> {
	@Query(value = "{call SP_AnalisisEstadoFinanciero(:p_ciacont, :ejercicio, :modForm, :periodo, :nSalAnt, :nSalAct, :nDebe, :nHaber)}", nativeQuery = true)
	List<Map<String, Object>> swAnaliEstFina(
			@Param("p_ciacont") String p_ciacont,
			@Param("ejercicio") String ejercicio,
			@Param("modForm") String modForm,
			@Param("periodo") String periodo,
			@Param("nSalAnt") String nSalAnt,
			@Param("nSalAct") String nSalAct,
			@Param("nDebe") String nDebe,
			@Param("nHaber") String nHaber
			);

	@Query(value = "{call SP_EstadoSituacionFinanciera(:p_ciacont, :ejercicio, :periodo, :formato, :apertura, :rubro, :cuentas, :opcion, :resultados, :saldMn, :saldMe)}", nativeQuery = true)
	List<Map<String, Object>> swBalGene(
			@Param("p_ciacont") String p_ciacont,
			@Param("ejercicio") String ejercicio,
			@Param("periodo") String periodo,
			@Param("formato") String formato,
			@Param("apertura") String apertura,
			@Param("rubro") String rubro,
			@Param("cuentas") String cuentas,
			@Param("opcion") String opcion,
			@Param("resultados") String resultados,
			@Param("saldMn") String saldMn,
			@Param("saldMe") String saldMe);
}
