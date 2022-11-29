package com.empresa.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.lcoEjer;
import com.empresa.entity.lcoEjerPk;

@Repository
public interface loginCiaEjerRepository extends JpaRepository<lcoEjer, lcoEjerPk>{

    @Query(value = "{call SP_LoginEjer(:opcion, :_codcia, :_nrodoc)}", nativeQuery = true)
    List<Map<String, Object[]>> ListarEjer(
        @Param("opcion") int opcion,
        @Param("_codcia") String _codcia,
        @Param("_nrodoc") String _nrodoc
    );

    @Query(value = "{call SP_LoginLcias(:opcion, :_coduser, :_idbd)}", nativeQuery = true)
    List<Map<String, Object[]>> ListarCias(
        @Param("opcion") int opcion,
        @Param("_coduser") String _coduser,
        @Param("_idbd") String _idbd
    );
}
