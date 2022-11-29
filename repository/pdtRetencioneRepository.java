package com.empresa.repository;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.lcoCabV;
import com.empresa.entity.lcoCabVPk;

public interface pdtRetencioneRepository extends JpaRepository<lcoCabV, lcoCabVPk> {
  @Query(value = "{call SP_PDT_Retenciones(:base, :opcion, :cia, :ejer, :periodo)}", nativeQuery = true)
  @Modifying
  @Transactional
  List<Map<String, Object[]>> swCargaRetenciones(
      @Param("base") String base,
      @Param("opcion") int opcion,
      @Param("cia") String cia,
      @Param("ejer") String ejer,
      @Param("periodo") String periodo);
}