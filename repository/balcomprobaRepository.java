package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoTasa;
import com.empresa.entity.lcoTasaPk;



public interface balcomprobaRepository extends JpaRepository<lcoTasa, lcoTasaPk> {
    @Query(value="{call SP_balance_comprobacion(:opcion ,:Cia, :ejercicio, :PER, :Nd, :pCta, :tipRep)}"
    , nativeQuery = true)
    List<Map<String,Object[]>> swBalComp (@Param("opcion")Integer opcion,@Param("Cia")String Cia,
                            @Param("ejercicio")String ejercicio,
                            @Param("PER")String PER,
                            @Param("Nd")String Nd,
                            @Param("pCta")String pCta,
                            @Param("tipRep")String tipRep);

}
