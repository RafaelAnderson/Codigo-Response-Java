package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.lcoCias;

@Repository
public interface lcoCiasRepository extends JpaRepository<lcoCias, String> {

	@Query(value = "{call SP_CrudLcocias(:opcion, :cl_codcia, :cl_desc1, :cl_desc2, :cl_tipdoc, :cl_nrodoc, :cl_telef, :cl_email, :cl_host, :cl_tipreg, "
			+ ":cl_estado, :cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract, :cl_fecact, :cl_hraact)}", nativeQuery = true)
	List<lcoCias> listar(
			@Param("opcion") int option,
			@Param("cl_codcia") String cl_codcia,
			@Param("cl_desc1") String cl_desc1,
			@Param("cl_desc2") String cl_desc2,
			@Param("cl_tipdoc") String cl_tipdoc,
			@Param("cl_nrodoc") String cl_nrodoc,
			@Param("cl_telef") String cl_telef,
			@Param("cl_email") String cl_email,
			@Param("cl_host") String cl_host,
			@Param("cl_tipreg") String cl_tipreg,
			@Param("cl_estado") String cl_estado,
			@Param("cl_usrcrea") String cl_usrcrea,
			@Param("cl_feccrea") LocalDate cl_feccrea,
			@Param("cl_hracrea") LocalTime cl_hracrea,
			@Param("cl_usract") String cl_usract,
			@Param("cl_fecact") LocalDate cl_fecact,
			@Param("cl_hraact") LocalTime cl_hraact);

	@Query(value = "{call SP_ConfiguracionCompañias_Cia(:opcion, :cl_codcia, :cl_desc1, :cl_desc2, :cl_tipdoc, :cl_nrodoc, :cl_telef, :cl_email, :cl_host, :cl_tipreg, "
			+ ":cl_estado, :cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract, :cl_fecact, :cl_hraact)}", nativeQuery = true)
	@Transactional
	@Modifying
	void Registrar(
			@Param("opcion") int option,
			@Param("cl_codcia") String cl_codcia,
			@Param("cl_desc1") String cl_desc1,
			@Param("cl_desc2") String cl_desc2,
			@Param("cl_tipdoc") String cl_tipdoc,
			@Param("cl_nrodoc") String cl_nrodoc,
			@Param("cl_telef") String cl_telef,
			@Param("cl_email") String cl_email,
			@Param("cl_host") String cl_host,
			@Param("cl_tipreg") String cl_tipreg,
			@Param("cl_estado") String cl_estado,
			@Param("cl_usrcrea") String cl_usrcrea,
			@Param("cl_feccrea") LocalDate cl_feccrea,
			@Param("cl_hracrea") LocalTime cl_hracrea,
			@Param("cl_usract") String cl_usract,
			@Param("cl_fecact") LocalDate cl_fecact,
			@Param("cl_hraact") LocalTime cl_hraact);

	@Query(value = "{call SP_ConfiguracionCompañias_Cia(:opcion, :cl_codcia, :cl_desc1, :cl_desc2, :cl_tipdoc, :cl_nrodoc, :cl_telef, :cl_email, :cl_host, :cl_tipreg, "
			+ ":cl_estado, :cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract, :cl_fecact, :cl_hraact)}", nativeQuery = true)
	@Transactional
	@Modifying
	List<lcoCias> swBscCia(
			@Param("opcion") int option,
			@Param("cl_codcia") String cl_codcia,
			@Param("cl_desc1") String cl_desc1,
			@Param("cl_desc2") String cl_desc2,
			@Param("cl_tipdoc") String cl_tipdoc,
			@Param("cl_nrodoc") String cl_nrodoc,
			@Param("cl_telef") String cl_telef,
			@Param("cl_email") String cl_email,
			@Param("cl_host") String cl_host,
			@Param("cl_tipreg") String cl_tipreg,
			@Param("cl_estado") String cl_estado,
			@Param("cl_usrcrea") String cl_usrcrea,
			@Param("cl_feccrea") LocalDate cl_feccrea,
			@Param("cl_hracrea") LocalTime cl_hracrea,
			@Param("cl_usract") String cl_usract,
			@Param("cl_fecact") LocalDate cl_fecact,
			@Param("cl_hraact") LocalTime cl_hraact);

	@Query(value = "{call SP_ConfiguracionCompañias_Cia(:opcion, :cl_codcia, :cl_desc1, :cl_desc2, :cl_tipdoc, :cl_nrodoc, :cl_telef, :cl_email, :cl_host, :cl_tipreg, "
			+ ":cl_estado, :cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract, :cl_fecact, :cl_hraact)}", nativeQuery = true)
	@Transactional
	@Modifying
	void swActualizarCias(
			@Param("opcion") int option,
			@Param("cl_codcia") String cl_codcia,
			@Param("cl_desc1") String cl_desc1,
			@Param("cl_desc2") String cl_desc2,
			@Param("cl_tipdoc") String cl_tipdoc,
			@Param("cl_nrodoc") String cl_nrodoc,
			@Param("cl_telef") String cl_telef,
			@Param("cl_email") String cl_email,
			@Param("cl_host") String cl_host,
			@Param("cl_tipreg") String cl_tipreg,
			@Param("cl_estado") String cl_estado,
			@Param("cl_usrcrea") String cl_usrcrea,
			@Param("cl_feccrea") LocalDate cl_feccrea,
			@Param("cl_hracrea") LocalTime cl_hracrea,
			@Param("cl_usract") String cl_usract,
			@Param("cl_fecact") LocalDate cl_fecact,
			@Param("cl_hraact") LocalTime cl_hraact);

	@Query(value = "{call SP_TablasporCias(:pCias,:pCiaOrg)}", nativeQuery = true)
	@Transactional
	@Modifying
	void swCreaTablasCias(@Param("pCias") String pCias,@Param("pCiaOrg") String pCiaOrg);

	@Query(value = "{call SP_TablasporCiayEjer(:pCias, :pEjer,:pCiasOrg,:pEjerO)}", nativeQuery = true)
	@Transactional
	@Modifying
	void swCreaTablasCiasEjer(@Param("pCias") String pCias,
			@Param("pEjer") String pEjer, @Param("pCiasOrg") String pCiasOrg, @Param("pEjerO") String pEjerO);

	@Query(value = "{call SP_TransferenciaTablas(:pCiaOrig, :pEjerOrig, :pCiaDst, :pEjerDst, :pfCta, :pfTbl, :pfCmp, :pfEst, :pfAnx, :pfCaj, :pfCie, :pfCst)}", nativeQuery = true)
	@Transactional
	@Modifying
	void swTransferTablas(@Param("pCiaOrig") String pCiaOrig,
			@Param("pEjerOrig") String pEjerOrig,
			@Param("pCiaDst") String pCiaDst,
			@Param("pEjerDst") String pEjerDst,
			@Param("pfCta") String pfCta,
			@Param("pfTbl") String pfTbl,
			@Param("pfCmp") String pfCmp,
			@Param("pfEst") String pfEst,
			@Param("pfAnx") String pfAnx,
			@Param("pfCaj") String pfCaj,
			@Param("pfCie") String pfCie,
			@Param("pfCst") String pfCst);
}
