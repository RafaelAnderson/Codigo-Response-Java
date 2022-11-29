package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcordif21;
import com.empresa.entity.lcordif21Pk;

public interface lcordif21Repository extends JpaRepository<lcordif21, lcordif21Pk> {

	@Query(value = "{call SP_asieReguDifeCamb(:cia,:ejer,:periodo, :usu)}", nativeQuery = true)
	@Transactional
	@Modifying
	void asieReguDifeCamb(@Param("cia") String cia,
			@Param("ejer") String ejer,
			@Param("periodo") String periodo,
			@Param("usu") String usu

	);

	@Query(value = " {call SP_lcoRdif21(:opcion,:cia, :ejer, :periodo,:clave,:codane,:tipdoc,:numdoc)}", nativeQuery = true)
	List<Map<String, Object>> listarlcordif21(
			@Param("opcion") Integer opcion,
			@Param("cia") String cia,
			@Param("ejer") String ejercicio,
			@Param("periodo") String periodo,
			@Param("clave") String clave,
			@Param("codane") String codane,
			@Param("tipdoc") String tipdoc,
			@Param("numdoc") String numdoc);

	@Query(value = " {call SP_lcoRdif21(:opcion,:cia, :ejer, :periodo, :clave,:codane,:tipdoc,:numdoc)}", nativeQuery = true)
	@Transactional
	@Modifying
	void eliminarlcordif21(
			@Param("opcion") Integer opcion,
			@Param("cia") String cia,
			@Param("ejer") String ejercicio,
			@Param("periodo") String periodo,
			@Param("clave") String clave,
			@Param("codane") String codane,
			@Param("tipdoc") String tipdoc,
			@Param("numdoc") String numdoc);

	@Query(value = " {call SP_consultarAsiento(:cia, :ejer, :periodo,:cuenta ,:cdanex ,:tpanex ,:numdoc)}", nativeQuery = true)
	List<Map<String, Object>> listarDetallelcordif21(
			@Param("cia") String cia,
			@Param("ejer") String ejercicio,
			@Param("periodo") String periodo,
			@Param("cuenta") String cuenta,
			@Param("cdanex") String cdanex,
			@Param("tpanex") String tpanex,
			@Param("numdoc") String numdoc

	);
}
