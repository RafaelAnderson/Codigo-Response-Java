package com.empresa.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;

import com.empresa.entity.lcoCabV;
import com.empresa.entity.lcoCabVPk;

public interface LibroDiarioAdicionalesRepository extends JpaRepository<lcoCabV, lcoCabVPk> {
	@Query(value = "{call SP_LibroDiario_Adicionales(:base,:opcion,:cia,:ejercicio,:Periodo,:SD,:Asiento,:cl_fecret,:cl_tipret,:cl_perrea,:cl_perpre)}", nativeQuery = true)
	List<Map<String, Object[]>> swListarOmi(@Param("base") String base,
			@Param("opcion") int opcion,
			@Param("cia") String cia,
			@Param("ejercicio") String ejercicio,
			@Param("Periodo") String Periodo,
			@Param("SD") String SD,
			@Param("Asiento") String Asiento,
			@Param("cl_fecret") LocalDate cl_fecret,
			@Param("cl_tipret") String cl_tipret,
			@Param("cl_perrea") String cl_perrea,
			@Param("cl_perpre") String cl_perpre);

	@Query(value = "{call SP_LibroDiario_Adicionales(:base,:opcion,:cia,:ejercicio,:Periodo,:SD,:Asiento,:cl_fecret,:cl_tipret,:cl_perrea,:cl_perpre)}", nativeQuery = true)
	@Transactional
	@Modifying
	void swEliOmi(@Param("base") String base,
			@Param("opcion") int opcion,
			@Param("cia") String cia,
			@Param("ejercicio") String ejercicio,
			@Param("Periodo") String Periodo,
			@Param("SD") String SD,
			@Param("Asiento") String Asiento,
			@Param("cl_fecret") LocalDate cl_fecret,
			@Param("cl_tipret") String cl_tipret,
			@Param("cl_perrea") String cl_perrea,
			@Param("cl_perpre") String cl_perpre);

	// ********************************************************************************
	// */
	@Query(value = "{call SP_LibroDiario_Adicionales(:base,:opcion,:cia,:ejercicio,:Periodo,:SD,:Asiento,:cl_fecret,:cl_tipret,:cl_perrea,:cl_perpre)}", nativeQuery = true)
	@Transactional
	@Modifying
	void swCrearOmi(@Param("base") String base,
			@Param("opcion") int opcion,
			@Param("cia") String cia,
			@Param("ejercicio") String ejercicio,
			@Param("Periodo") String Periodo,
			@Param("SD") String SD,
			@Param("Asiento") String Asiento,
			@Param("cl_fecret") LocalDate cl_fecret,
			@Param("cl_tipret") String cl_tipret,
			@Param("cl_perrea") String cl_perrea,
			@Param("cl_perpre") String cl_perpre);

	@Query(value = "{call SP_LibroDiario_Adicionales(:base,:opcion,:cia,:ejercicio,:Periodo,:SD,:Asiento,:cl_fecret,:cl_tipret,:cl_perrea,:cl_perpre)}", nativeQuery = true)
	List<Map<String, Object[]>> swListarAyuOmi(@Param("base") String base,
			@Param("opcion") int opcion,
			@Param("cia") String cia,
			@Param("ejercicio") String ejercicio,
			@Param("Periodo") String Periodo,
			@Param("SD") String SD,
			@Param("Asiento") String Asiento,
			@Param("cl_fecret") LocalDate cl_fecret,
			@Param("cl_tipret") String cl_tipret,
			@Param("cl_perrea") String cl_perrea,
			@Param("cl_perpre") String cl_perpre);

}