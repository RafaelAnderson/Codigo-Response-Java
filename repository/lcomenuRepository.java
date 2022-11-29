package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.empresa.entity.lcomenu;

@Repository
public interface lcomenuRepository extends JpaRepository<lcomenu, String> {
    
    @Query(value = "{call SP_ListarMenu(:pUser)}", nativeQuery = true)
    List<lcomenu> listarMenu(@Param("pUser") String pUser);

}
