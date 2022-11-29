package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lconic21;
import com.empresa.entity.lconic21Pk;

public interface lconic21Repository extends JpaRepository<lconic21, lconic21Pk> {

	@Query(value = " {call SP_asientoRegularizacion(:cia, :ejer, :periodo, :tpventa, :tpcompra, :usu)}", nativeQuery = true)
	void asientoRegularizacion(
			@Param("cia") String cia,
			@Param("ejer") String ejercicio,
			@Param("periodo") String periodo,
			@Param("tpventa") double tpventa,
			@Param("tpcompra") double tpcompra,
			@Param("usu") String usu);

	@Query(value = " {call SP_lcoNic21(:opcion,:cia, :ejercicio,:ni_codper,:ni_cuenta,:ni_tipane,:ni_codane,:ni_tipdoc,:ni_numdoc)}", nativeQuery = true)
	List<Map<String, Object[]>> listarlcoNic21(
			@Param("opcion") Integer opcion,
			@Param("cia") String cia,
			@Param("ejercicio") String ejercicio,
			@Param("ni_codper") String ni_codper,
			@Param("ni_cuenta") String ni_cuenta,
			@Param("ni_tipane") String ni_tipane,
			@Param("ni_codane") String ni_codane,
			@Param("ni_tipdoc") String ni_tipdoc,
			@Param("ni_numdoc") String ni_numdoc);

	@Query(value = " {call SP_lcoNic21(:opcion,:cia, :ejercicio,:ni_codper,:ni_cuenta,:ni_tipane,:ni_codane,:ni_tipdoc,:ni_numdoc)}", nativeQuery = true)
	@Transactional
	@Modifying
	void eliminarlcoNic21(
			@Param("opcion") Integer opcion,
			@Param("cia") String cia,
			@Param("ejercicio") String ejercicio,
			@Param("ni_codper") String ni_codper,
			@Param("ni_cuenta") String ni_cuenta,
			@Param("ni_tipane") String ni_tipane,
			@Param("ni_codane") String ni_codane,
			@Param("ni_tipdoc") String ni_tipdoc,
			@Param("ni_numdoc") String ni_numdoc);

}
