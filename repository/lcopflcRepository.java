package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.lcopflc;
import com.empresa.entity.lcopflcPk;

public interface lcopflcRepository extends JpaRepository<lcopflc, lcopflcPk>{
	
	
	@Query(value="call SP_CrudLcoPflc(:opcion, :p_ciacont, :fl_tipFrmt, :fl_modelfrmt, :fl_codfrmt, :fl_grpfrmt, "
			+ ":fl_descri1, :fl_descri2, :descrgrp, :fl_rubrobal, :fl_rubrores, :fl_formula, :fl_tipDto,"
			+ ":fl_rubeeff, :fl_orden, :fl_usrcrea, :fl_feccrea, :fl_hracrea, :fl_usract, :fl_fecact, :fl_hraact)", nativeQuery = true)
	List<lcopflc> listar(@Param("opcion") int opcion,
						 @Param("p_ciacont") String p_ciacont,
						 @Param("fl_tipFrmt") String fl_tipFrmt,
						 @Param("fl_modelfrmt") String fl_modelfrmt,
						 @Param("fl_codfrmt") String fl_codfrmt,
						 @Param("fl_grpfrmt") String fl_grpfrmt,
						 @Param("fl_descri1") String fl_descri1,
						 @Param("fl_descri2") String fl_descri2,
						 @Param("descrgrp") String descrgrp,
						 @Param("fl_rubrobal") String fl_rubrobal,
						 @Param("fl_rubrores") String fl_rubrores,
						 @Param("fl_formula") String fl_formula,
						 @Param("fl_tipDto") String fl_tipDto,
						 @Param("fl_rubeeff") String fl_rubeeff,
						 @Param("fl_orden") int fl_orden,
						 @Param("fl_usrcrea") String fl_usrcrea,
						 @Param("fl_feccrea") LocalDate fl_feccrea,
						 @Param("fl_hracrea") LocalTime fl_hracrea,
						 @Param("fl_usract") String fl_usract,
						 @Param("fl_fecact") LocalDate fl_fecact,
						 @Param("fl_hraact") LocalTime fl_hraact);
	
	@Query(value="call SP_Bal(:opcion, :p_ciacont,:año, :per, :N, :inc0, :no0, "
			+ ":aper)", nativeQuery = true)
	List<Object> listarBalance(@Param("opcion") int opcion,
						 @Param("p_ciacont") String p_ciacont,
						 @Param("año") String año,
						 @Param("per") String fl_tipFrmt,
						 @Param("N") String fl_modelfrmt,
						 @Param("inc0") String fl_codfrmt,
						 @Param("no0") String fl_grpfrmt,
						 @Param("aper") String fl_descri1
						 );
	
	
	@Query(value="call SP_CrudLcoPflc(:opcion, :p_ciacont, :fl_tipFrmt, :fl_modelfrmt, :fl_codfrmt, :fl_grpfrmt, "
			+ ":fl_descri1, :fl_descri2, :descrgrp, :fl_rubrobal, :fl_rubrores, :fl_formula, :fl_tipDto,"
			+ ":fl_rubeeff, :fl_orden, :fl_usrcrea, :fl_feccrea, :fl_hracrea, :fl_usract, :fl_fecact, :fl_hraact)", nativeQuery = true)
	@Transactional
	@Modifying
	void registrar(@Param("opcion") int opcion,
			 @Param("p_ciacont") String p_ciacont,
			 @Param("fl_tipFrmt") String fl_tipFrmt,
			 @Param("fl_modelfrmt") String fl_modelfrmt,
			 @Param("fl_codfrmt") String fl_codfrmt,
			 @Param("fl_grpfrmt") String fl_grpfrmt,
			 @Param("fl_descri1") String fl_descri1,
			 @Param("fl_descri2") String fl_descri2,
			 @Param("descrgrp") String descrgrp,
			 @Param("fl_rubrobal") String fl_rubrobal,
			 @Param("fl_rubrores") String fl_rubrores,
			 @Param("fl_formula") String fl_formula,
			 @Param("fl_tipDto") String fl_tipDto,
			 @Param("fl_rubeeff") String fl_rubeeff,
			 @Param("fl_orden") int fl_orden,
			 @Param("fl_usrcrea") String fl_usrcrea,
			 @Param("fl_feccrea") LocalDate fl_feccrea,
			 @Param("fl_hracrea") LocalTime fl_hracrea,
			 @Param("fl_usract") String fl_usract,
			 @Param("fl_fecact") LocalDate fl_fecact,
			 @Param("fl_hraact") LocalTime fl_hraact);
	
	
	@Query(value="call SP_CrudLcoPflc(:opcion, :p_ciacont, :fl_tipFrmt, :fl_modelfrmt, :fl_codfrmt, :fl_grpfrmt, "
			+ ":fl_descri1, :fl_descri2, :descrgrp, :fl_rubrobal, :fl_rubrores, :fl_formula, :fl_tipDto,"
			+ ":fl_rubeeff, :fl_orden, :fl_usrcrea, :fl_feccrea, :fl_hracrea, :fl_usract, :fl_fecact, :fl_hraact)", nativeQuery = true)
	@Transactional
	@Modifying
	void editar(@Param("opcion") int opcion,
			 @Param("p_ciacont") String p_ciacont,
			 @Param("fl_tipFrmt") String fl_tipFrmt,
			 @Param("fl_modelfrmt") String fl_modelfrmt,
			 @Param("fl_codfrmt") String fl_codfrmt,
			 @Param("fl_grpfrmt") String fl_grpfrmt,
			 @Param("fl_descri1") String fl_descri1,
			 @Param("fl_descri2") String fl_descri2,
			 @Param("descrgrp") String descrgrp,
			 @Param("fl_rubrobal") String fl_rubrobal,
			 @Param("fl_rubrores") String fl_rubrores,
			 @Param("fl_formula") String fl_formula,
			 @Param("fl_tipDto") String fl_tipDto,
			 @Param("fl_rubeeff") String fl_rubeeff,
			 @Param("fl_orden") int fl_orden,
			 @Param("fl_usrcrea") String fl_usrcrea,
			 @Param("fl_feccrea") LocalDate fl_feccrea,
			 @Param("fl_hracrea") LocalTime fl_hracrea,
			 @Param("fl_usract") String fl_usract,
			 @Param("fl_fecact") LocalDate fl_fecact,
			 @Param("fl_hraact") LocalTime fl_hraact);
	
	
	@Query(value="call SP_CrudLcoPflc(:opcion, :p_ciacont, :fl_tipFrmt, :fl_modelfrmt, :fl_codfrmt, :fl_grpfrmt, "
			+ ":fl_descri1, :fl_descri2, :descrgrp, :fl_rubrobal, :fl_rubrores, :fl_formula, :fl_tipDto,"
			+ ":fl_rubeeff, :fl_orden, :fl_usrcrea, :fl_feccrea, :fl_hracrea, :fl_usract, :fl_fecact, :fl_hraact)", nativeQuery = true)
	@Transactional
	@Modifying
	void eliminar(@Param("opcion") int opcion,
			 @Param("p_ciacont") String p_ciacont,
			 @Param("fl_tipFrmt") String fl_tipFrmt,
			 @Param("fl_modelfrmt") String fl_modelfrmt,
			 @Param("fl_codfrmt") String fl_codfrmt,
			 @Param("fl_grpfrmt") String fl_grpfrmt,
			 @Param("fl_descri1") String fl_descri1,
			 @Param("fl_descri2") String fl_descri2,
			 @Param("descrgrp") String descrgrp,
			 @Param("fl_rubrobal") String fl_rubrobal,
			 @Param("fl_rubrores") String fl_rubrores,
			 @Param("fl_formula") String fl_formula,
			 @Param("fl_tipDto") String fl_tipDto,
			 @Param("fl_rubeeff") String fl_rubeeff,
			 @Param("fl_orden") int fl_orden,
			 @Param("fl_usrcrea") String fl_usrcrea,
			 @Param("fl_feccrea") LocalDate fl_feccrea,
			 @Param("fl_hracrea") LocalTime fl_hracrea,
			 @Param("fl_usract") String fl_usract,
			 @Param("fl_fecact") LocalDate fl_fecact,
			 @Param("fl_hraact") LocalTime fl_hraact);

	
	// Listar Todo
	@Query(value="call SP_CrudLcoPflc(:opcion, :p_ciacont, :fl_tipFrmt, :fl_modelfrmt, :fl_codfrmt, :fl_grpfrmt, "
			+ ":fl_descri1, :fl_descri2, :descrgrp, :fl_rubrobal, :fl_rubrores, :fl_formula, :fl_tipDto,"
			+ ":fl_rubeeff, :fl_orden, :fl_usrcrea, :fl_feccrea, :fl_hracrea, :fl_usract, :fl_fecact, :fl_hraact)", nativeQuery = true)
	List<lcopflc> listarLcoPflc(@Param("opcion") int opcion,
						 @Param("p_ciacont") String p_ciacont,
						 @Param("fl_tipFrmt") String fl_tipFrmt,
						 @Param("fl_modelfrmt") String fl_modelfrmt,
						 @Param("fl_codfrmt") String fl_codfrmt,
						 @Param("fl_grpfrmt") String fl_grpfrmt,
						 @Param("fl_descri1") String fl_descri1,
						 @Param("fl_descri2") String fl_descri2,
						 @Param("descrgrp") String descrgrp,
						 @Param("fl_rubrobal") String fl_rubrobal,
						 @Param("fl_rubrores") String fl_rubrores,
						 @Param("fl_formula") String fl_formula,
						 @Param("fl_tipDto") String fl_tipDto,
						 @Param("fl_rubeeff") String fl_rubeeff,
						 @Param("fl_orden") int fl_orden,
						 @Param("fl_usrcrea") String fl_usrcrea,
						 @Param("fl_feccrea") LocalDate fl_feccrea,
						 @Param("fl_hracrea") LocalTime fl_hracrea,
						 @Param("fl_usract") String fl_usract,
						 @Param("fl_fecact") LocalDate fl_fecact,
						 @Param("fl_hraact") LocalTime fl_hraact);

}
