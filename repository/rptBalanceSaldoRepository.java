package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoTasa;
import com.empresa.entity.lcoTasaPk;

public interface rptBalanceSaldoRepository extends JpaRepository<lcoTasa, lcoTasaPk> {
    @Query(value="{call SP_BalanceSaldo(:Cia, :ejercicio, :PER, :N)}"
    , nativeQuery = true)
    List<Map<String,Object[]>> swBalSaldo (@Param("Cia")String Cia,
                            @Param("ejercicio")String ejercicio,
                            @Param("PER")String PER,
                            @Param("N")String N);
}
