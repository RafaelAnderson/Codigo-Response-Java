package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.credcliedb;

@Repository("credclierepository")
public interface CredClieRepository extends JpaRepository<credcliedb , Void> {
    @Query(value = "{CALL SP_CredClie(:_CodCli,:_CodUser)}", nativeQuery = true)
    List<credcliedb> findAllCredClie(@Param("_CodCli") String _CodCli, @Param("_CodUser") String _CodUser);
}
