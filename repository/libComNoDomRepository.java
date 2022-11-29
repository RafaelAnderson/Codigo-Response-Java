package com.empresa.repository;

import com.empresa.entity.lcoCabV;
import com.empresa.entity.lcoCabVPk;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface libComNoDomRepository extends JpaRepository<lcoCabV, lcoCabVPk> {
    @Query(value="{call SP_LibComNoDom(:opcion, :cia, :ejercicio, :per)}" , nativeQuery = true)
    List<Map<String, Object[]>> swLiComNoDom(@Param("opcion") int opcion,
								  @Param("cia") String cia,
								  @Param("ejercicio") String ejercicio,
								  @Param("per") String per
								  );
}
