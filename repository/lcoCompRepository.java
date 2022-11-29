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

import com.empresa.entity.lcoComp;
import com.empresa.entity.lcoCompPk;


public interface lcoCompRepository extends JpaRepository<lcoComp, lcoCompPk>{
	@Query(value="{call SP_CRUD_compras( :cia, :ejer, :per, :opcion )}", nativeQuery=true)
	List<Map<String,Object>> swValRegCmp(
			@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("per") String per,
			@Param("opcion") String option
			);
	
	@Query(value="{call SP_CRUD_compras(:cia, :ejer, :per, :opcion)}", nativeQuery=true)
	List<Map<String,Object>> swRegCmpTbl(
			@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("per") String per,
			@Param("opcion") String option
			);
	
	@Query(value="{call SP_CRUD_compras(:cia, :ejer, :per, :opcion)}", nativeQuery=true)
	List<Map<String,Object>> swRegCmpPLE(
			@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("per") String per,
			@Param("opcion") String option
			);
	
	@Query(value="{call SP_CRUD_compras(:cia, :ejer, :per, :opcion)}", nativeQuery=true)
	List<Map<String,Object>> Listar_p(
			@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("per") String per,
			@Param("opcion") String option
			);
	 
	@Query(value="{call SP_CRUD_compras(:cia, :ejer, :per, :opcion)}", nativeQuery=true)
	List<Map<String,Object>> swLisRecCmp(
			@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("per") String per,
			@Param("opcion") String option
			);
	
	@Query(value="{call SP_crearTablaLcoCOMP("
			+ " :cia, :per, :rc_subdia, "
			+ " :rc_compro, :rc_feccom, :rc_fecdoc, :rc_fecven, :rc_tipdoc,"
			+ " :rc_serdoc, :rc_nrodoc, :rc_numdoc, :rc_tipane, :rc_codane, :rc_rucane,"
			+ " :rc_nomane, :rc_codmon, :rc_afemn, :rc_inamn, :rc_igvmn,"
			+ " :rc_impomn, :rc_iscmn, :rc_otrmn, :rc_detemn, :rc_afeme, :rc_iname,"
			+ " :rc_igvme, :rc_impome, :rc_iscme, :rc_otrme, :rc_deteme,"
			+ " :rc_numdet, :rc_fecdet, :rc_tipcam, :rc_fedore, :rc_tidore, :rc_sedore, :rc_nudore,"
			+ " :rc_feccre, :rc_horcre, :rc_usucre, :rc_fecact, :rc_hraact,"
			+ " :rc_usuact, :rc_recmn, :rc_recme, :rc_codcla, :rc_secuen, :rc_cuenta,"
			+ " :rc_perrec, :rc_medpag, :rc_estado, :rc_datadi, :rc_coddet, :rc_bolmn, :rc_tipdocide, :rc_anodua, :opcion)}", nativeQuery=true)
	@Transactional
	@Modifying
	void swGrabaCompras(
			@Param("cia") String cia, @Param("per") String per,
			@Param("rc_subdia") String rc_subdia, @Param("rc_compro") String rc_compro, @Param("rc_feccom") LocalDate rc_feccom, 
			@Param("rc_fecdoc") LocalDate rc_fecdoc, @Param("rc_fecven") LocalDate rc_fecven, @Param("rc_tipdoc") String rc_tipdoc, 
			@Param("rc_serdoc") String rc_serdoc, @Param("rc_nrodoc") String rc_nrodoc, @Param("rc_numdoc") String rc_numdoc, 
			@Param("rc_tipane") String rc_tipane, @Param("rc_codane") String rc_codane, @Param("rc_rucane") String rc_rucane, 
			@Param("rc_nomane") String rc_nomane, @Param("rc_codmon") String rc_codmon, @Param("rc_afemn") Double rc_afemn, 
			@Param("rc_inamn") Double rc_inamn, @Param("rc_igvmn") Double rc_igvmn, @Param("rc_impomn") Double rc_impomn, 
			@Param("rc_iscmn") Double rc_iscmn, @Param("rc_otrmn") Double rc_otrmn, @Param("rc_detemn") Double rc_detemn, 
			@Param("rc_afeme") Double rc_afeme,
			@Param("rc_iname") Double rc_iname, @Param("rc_igvme") Double rc_igvme, @Param("rc_impome") Double rc_impome, 
			@Param("rc_iscme") Double rc_iscme, @Param("rc_otrme") Double rc_otrme, @Param("rc_deteme") Double rc_deteme, 
			@Param("rc_numdet") String rc_numdet, @Param("rc_fecdet") LocalDate rc_fecdet, @Param("rc_tipcam") Double rc_tipcam, 
			@Param("rc_fedore") LocalDate rc_fedore, @Param("rc_tidore") String rc_tidore, @Param("rc_sedore") String rc_sedore, 
			@Param("rc_nudore") String rc_nudore, @Param("rc_feccre") LocalDate rc_feccre, @Param("rc_horcre") LocalTime rc_horcre, 
			@Param("rc_usucre") String rc_usucre, @Param("rc_fecact") LocalDate rc_fecact, @Param("rc_hraact") LocalTime rc_hraact, 
			@Param("rc_usuact") String rc_usuact, @Param("rc_recmn") Double rc_recmn,@Param("rc_recme") Double rc_recme,
			@Param("rc_codcla") String rc_codcla,@Param("rc_secuen") String rc_secuen, @Param("rc_cuenta") String rc_cuenta,
			@Param("rc_perrec") String rc_perrec, @Param("rc_medpag") String rc_medpag, @Param("rc_estado") String rc_estado,
			@Param("rc_datadi") String rc_datadi, @Param("rc_coddet") String rc_coddet, @Param("rc_bolmn") Double rc_bolmn,
			@Param("rc_tipdocide") String rc_tipdocide, @Param("rc_anodua") String rc_anodua, @Param("opcion") String opcion);


	}
