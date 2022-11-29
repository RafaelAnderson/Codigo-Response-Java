package com.empresa.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.empresa.entity.lcoDetV;
import com.empresa.entity.lcoDetVPk;

@Repository
public interface lcoReporteRepository extends JpaRepository<lcoDetV,lcoDetVPk> {
	
	

@Query(value="{call SP_BalanceSaldo(:cia, :anio,:per_rep,:mos_bal)}"
		, nativeQuery = true)
List<Object> balanceSaldo(
  @PathVariable("cia") String cia,
  @PathVariable("anio") String anio,
  @PathVariable("per_rep") String per_rep,
  @PathVariable("mos_bal") String mos_bal
);

}
