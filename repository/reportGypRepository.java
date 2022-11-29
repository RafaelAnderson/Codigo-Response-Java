package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.lcoCabV;
import com.empresa.entity.lcoCabVPk;

import java.util.List;
import java.util.Map;

@Repository
public interface reportGypRepository extends JpaRepository<lcoCabV, lcoCabVPk> {

    @Query(value = "{call SP_Reporte_GyP(:xcia, :xejer, :xmodelo, :xfecsaldo, :xcodrbr)}", nativeQuery = true)
    List<Map<String, Object>> swReporte_GyP(
            @Param("xcia") String xcia,
            @Param("xejer") String xejer,
            @Param("xmodelo") int xmodelo,
            @Param("xfecsaldo") String xfecsaldo,
            @Param("xcodrbr") String xcodrbr);
}
