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

import com.empresa.entity.lcoUcia;
import com.empresa.entity.lcoUciaPk;

@Repository
public interface confiUsuarioRepositorio extends JpaRepository<lcoUcia, lcoUciaPk> {
	// Proceso que lista los usuarios por compañía

	@Query(value = "{call SP_users(:opcion,:ul_codusr,:ul_codcia,:ul_usrcrea,:ul_feccrea,:ul_hracrea,:ul_usract,:ul_fecact,:ul_hraact)}  ", nativeQuery = true)
	List<Map<String, Object[]>> swListUsrCia(
			@Param("opcion") int opcion, 
			@Param("ul_codusr") String ul_codusr,
			@Param("ul_codcia") String ul_codcia, 
			@Param("ul_usrcrea") String ul_usrcrea,
			@Param("ul_feccrea") LocalDate ul_feccrea, 
			@Param("ul_hracrea") LocalTime ul_hracrea,
			@Param("ul_usract") String ul_usract, 
			@Param("ul_fecact") LocalDate ul_fecact,
			@Param("ul_hraact") LocalTime ul_hraact);

	// Proceso que actualiza un registro de la tabla usuario por compañías
	@Query(value = "{call SP_users(:opcion,:ul_codusr,:ul_codcia,:ul_usrcrea,:ul_feccrea,:ul_hracrea,:ul_usract,:ul_fecact,:ul_hraact)}  ", nativeQuery = true)
	@Transactional
	@Modifying
	void swLimpiarUsrCia(
			@Param("opcion") int opcion, @Param("ul_codusr") String ul_codusr,
			@Param("ul_codcia") String ul_codcia, @Param("ul_usrcrea") String ul_usrcrea,
			@Param("ul_feccrea") LocalDate ul_feccrea, @Param("ul_hracrea") LocalTime ul_hracrea,
			@Param("ul_usract") String ul_usract, @Param("ul_fecact") LocalDate ul_fecact,
			@Param("ul_hraact") LocalTime ul_hraact);

	// Proceso que actualiza un registro de la tabla usuario por compañías
	@Query(value = "{call SP_users(:opcion,:ul_codusr,:ul_codcia,:ul_usrcrea,:ul_feccrea,:ul_hracrea,:ul_usract,:ul_fecact,:ul_hraact)}  ", nativeQuery = true)
	@Transactional
	@Modifying
	void swGrabarUsrCia(
			@Param("opcion") int opcion,
			@Param("ul_codusr") String ul_codusr,
			@Param("ul_codcia") String ul_codcia,
			@Param("ul_usrcrea") String ul_usrcrea,
			@Param("ul_feccrea") LocalDate ul_feccrea,
			@Param("ul_hracrea") LocalTime ul_hracrea,
			@Param("ul_usract") String ul_usract,
			@Param("ul_fecact") LocalDate ul_fecact,
			@Param("ul_hraact") LocalTime ul_hraact);
}