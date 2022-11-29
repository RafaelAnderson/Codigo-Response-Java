package com.empresa.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.lcoNdom;
import com.empresa.entity.lcoNdomPk;

@Repository
public interface lcoNdomRepository extends JpaRepository<lcoNdom, lcoNdomPk>{

	
	@Query(value="{call SP_CrudlcoNdom(:opcion ,:cia ,:año ,\r\n"
			+ ":nd_periodo ,:nd_subdia ,:nd_compro ,:nd_tipreg ,\r\n"
			+ ":nd_feccom ,:nd_moneda,:nd_cencst ,:nd_tpanex ,:nd_cdanex ,\r\n"
			+ ":nd_tpanex2 ,:nd_cdanex2 ,:nd_tpdoc ,:nd_nmdoc ,:nd_docser ,:nd_docnum ,\r\n"
			+ ":nd_fecdoc ,:nd_fecven ,:nd_impadq ,:nd_impadqmn ,:nd_impaqdme ,:nd_codtrib ,\r\n"
			+ ":nd_impotrib ,:nd_impotribmn ,:nd_impotribme ,:nd_impvalor ,:nd_impvalormn ,\r\n"
			+ ":nd_impvalorme ,:nd_tprenta ,:nd_impdeduc ,:nd_impdeducmn ,\r\n"
			+ ":nd_impdeducme ,:nd_imprentab ,:nd_imprentabmn ,:nd_imprentabme ,:nd_tpreten ,\r\n"
			+ ":nd_tasareten ,:nd_impreten ,:nd_impretenmn ,:nd_impretenme ,\r\n"
			+ ":nd_cdexonapli ,:nd_tasaigv ,:nd_impigv ,:nd_impigvmn ,:nd_impigvme ,\r\n"
			+ ":nd_tipcam ,:nd_tpdua ,:nd_cddua ,:nd_nrodua ,:nd_tpanexbene ,:nd_cdanexbene ,\r\n"
			+ ":nd_boltigv ,:nd_nroform ,:nd_modserv ,:nd_aplicapa ,:nd_monref ,:nd_tpcamref )}"
			, nativeQuery = true)
	List<lcoNdom>Listar( @Param("opcion") int opcion, @Param("cia") String cia,@Param("año") String año, 
	@Param("nd_periodo") String nd_periodo, @Param("nd_subdia") String nd_subdia, @Param("nd_compro") String nd_compro,
	@Param("nd_tipreg") String nd_tipreg, @Param("nd_feccom") Date nd_feccom, @Param("nd_moneda") String nd_moneda,
	@Param("nd_cencst") String nd_cencst,@Param("nd_tpanex") String nd_tpanex,@Param("nd_cdanex") String nd_cdanex,
	@Param("nd_tpanex2") String nd_tpanex2,@Param("nd_cdanex2") String nd_cdanex2,@Param("nd_tpdoc") String nd_tpdoc,
	@Param("nd_nmdoc") String nd_nmdoc,@Param("nd_docser") String nd_docser,@Param("nd_docnum") String nd_docnum,
	@Param("nd_fecdoc") Date nd_fecdoc,@Param("nd_fecven") Date nd_fecven,@Param("nd_impadq") double nd_impadq,
	@Param("nd_impadqmn") double nd_impadqmn,@Param("nd_impaqdme") double nd_impaqdme,@Param("nd_codtrib") String nd_codtrib,
	@Param("nd_impotrib") double nd_impotrib,@Param("nd_impotribmn") double nd_impotribmn,@Param("nd_impotribme") double nd_impotribme,
	@Param("nd_impvalor") double nd_impvalor,@Param("nd_impvalormn") double nd_impvalormn,@Param("nd_impvalorme") double nd_impvalorme,
	@Param("nd_tprenta") String nd_tprenta,@Param("nd_impdeduc") double nd_impdeduc,@Param("nd_impdeducmn") double nd_impdeducmn,
	@Param("nd_impdeducme") double nd_impdeducme,@Param("nd_imprentab") double nd_imprentab,@Param("nd_imprentabmn") double nd_imprentabmn,
	@Param("nd_imprentabme") double nd_imprentabme,@Param("nd_tpreten") String nd_tpreten,@Param("nd_tasareten") double nd_tasareten,
	@Param("nd_impreten") double nd_impreten,@Param("nd_impretenmn") double nd_impretenmn,@Param("nd_impretenme") double nd_impretenme,
	@Param("nd_cdexonapli") String nd_cdexonapli,@Param("nd_tasaigv") double nd_tasaigv,@Param("nd_impigv") double nd_impigv,
	@Param("nd_impigvmn") double nd_impigvmn,@Param("nd_impigvme") double nd_impigvme,@Param("nd_tipcam") double nd_tipcam,
	@Param("nd_tpdua") String nd_tpdua,@Param("nd_cddua") String nd_cddua,@Param("nd_nrodua") String nd_nrodua,
	@Param("nd_tpanexbene") String nd_tpanexbene,@Param("nd_cdanexbene") String nd_cdanexbene,
	@Param("nd_boltigv") String nd_boltigv,@Param("nd_nroform") String nd_nroform,@Param("nd_modserv") String nd_modserv,
	@Param("nd_aplicapa") String nd_aplicapa,@Param("nd_monref") String nd_monref,@Param("nd_tpcamref") double nd_tpcamref
	);
	
	
	@Query(value="{call SP_CrudlcoNdom(:opcion ,:cia ,:año ,\r\n"
			+ ":nd_periodo ,:nd_subdia ,:nd_compro ,:nd_tipreg ,\r\n"
			+ ":nd_feccom ,:nd_moneda,:nd_cencst ,:nd_tpanex ,:nd_cdanex ,\r\n"
			+ ":nd_tpanex2 ,:nd_cdanex2 ,:nd_tpdoc ,:nd_nmdoc ,:nd_docser ,:nd_docnum ,\r\n"
			+ ":nd_fecdoc ,:nd_fecven ,:nd_impadq ,:nd_impadqmn ,:nd_impaqdme ,:nd_codtrib ,\r\n"
			+ ":nd_impotrib ,:nd_impotribmn ,:nd_impotribme ,:nd_impvalor ,:nd_impvalormn ,\r\n"
			+ ":nd_impvalorme ,:nd_tprenta ,:nd_impdeduc ,:nd_impdeducmn ,\r\n"
			+ ":nd_impdeducme ,:nd_imprentab ,:nd_imprentabmn ,:nd_imprentabme ,:nd_tpreten ,\r\n"
			+ ":nd_tasareten ,:nd_impreten ,:nd_impretenmn ,:nd_impretenme ,\r\n"
			+ ":nd_cdexonapli ,:nd_tasaigv ,:nd_impigv ,:nd_impigvmn ,:nd_impigvme ,\r\n"
			+ ":nd_tipcam ,:nd_tpdua ,:nd_cddua ,:nd_nrodua ,:nd_tpanexbene ,:nd_cdanexbene ,\r\n"
			+ ":nd_boltigv ,:nd_nroform ,:nd_modserv ,:nd_aplicapa ,:nd_monref ,:nd_tpcamref )}"
			, nativeQuery = true)
	@Modifying
	@Transactional
	void transaccion( @Param("opcion") int opcion, @Param("cia") String cia,@Param("año") String año, 
	@Param("nd_periodo") String nd_periodo, @Param("nd_subdia") String nd_subdia, @Param("nd_compro") String nd_compro,
	@Param("nd_tipreg") String nd_tipreg, @Param("nd_feccom") Date nd_feccom, @Param("nd_moneda") String nd_moneda,
	@Param("nd_cencst") String nd_cencst,@Param("nd_tpanex") String nd_tpanex,@Param("nd_cdanex") String nd_cdanex,
	@Param("nd_tpanex2") String nd_tpanex2,@Param("nd_cdanex2") String nd_cdanex2,@Param("nd_tpdoc") String nd_tpdoc,
	@Param("nd_nmdoc") String nd_nmdoc,@Param("nd_docser") String nd_docser,@Param("nd_docnum") String nd_docnum,
	@Param("nd_fecdoc") Date nd_fecdoc,@Param("nd_fecven") Date nd_fecven,@Param("nd_impadq") double nd_impadq,
	@Param("nd_impadqmn") double nd_impadqmn,@Param("nd_impaqdme") double nd_impaqdme,@Param("nd_codtrib") String nd_codtrib,
	@Param("nd_impotrib") double nd_impotrib,@Param("nd_impotribmn") double nd_impotribmn,@Param("nd_impotribme") double nd_impotribme,
	@Param("nd_impvalor") double nd_impvalor,@Param("nd_impvalormn") double nd_impvalormn,@Param("nd_impvalorme") double nd_impvalorme,
	@Param("nd_tprenta") String nd_tprenta,@Param("nd_impdeduc") double nd_impdeduc,@Param("nd_impdeducmn") double nd_impdeducmn,
	@Param("nd_impdeducme") double nd_impdeducme,@Param("nd_imprentab") double nd_imprentab,@Param("nd_imprentabmn") double nd_imprentabmn,
	@Param("nd_imprentabme") double nd_imprentabme,@Param("nd_tpreten") String nd_tpreten,@Param("nd_tasareten") double nd_tasareten,
	@Param("nd_impreten") double nd_impreten,@Param("nd_impretenmn") double nd_impretenmn,@Param("nd_impretenme") double nd_impretenme,
	@Param("nd_cdexonapli") String nd_cdexonapli,@Param("nd_tasaigv") double nd_tasaigv,@Param("nd_impigv") double nd_impigv,
	@Param("nd_impigvmn") double nd_impigvmn,@Param("nd_impigvme") double nd_impigvme,@Param("nd_tipcam") double nd_tipcam,
	@Param("nd_tpdua") String nd_tpdua,@Param("nd_cddua") String nd_cddua,@Param("nd_nrodua") String nd_nrodua,
	@Param("nd_tpanexbene") String nd_tpanexbene,@Param("nd_cdanexbene") String nd_cdanexbene,
	@Param("nd_boltigv") String nd_boltigv,@Param("nd_nroform") String nd_nroform,@Param("nd_modserv") String nd_modserv,
	@Param("nd_aplicapa") String nd_aplicapa,@Param("nd_monref") String nd_monref,@Param("nd_tpcamref") double nd_tpcamref
	);
}
