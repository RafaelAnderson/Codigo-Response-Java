package com.empresa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.Map;
import com.empresa.entity.lcoDetV;
import com.empresa.entity.lcoDetVPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaSaldosXCuentaRepository extends JpaRepository<lcoDetV, lcoDetVPk> {
    @Query(value = "{call SP_ConsultaSaldosXCuenta(:opcion,:cia, :ejer, :periodo, :cta, :codane, :tpanex, :tpdoc, :nmdoc)}", nativeQuery = true)
    List<Map<String, Object[]>> swListarSaldoCtaDet(
            @Param("opcion") int opcion,
            @Param("cia") String cia,
            @Param("ejer") String ejer,
            @Param("periodo") String periodo,
            @Param("cta") String cta,
            @Param("codane") String codane,
            @Param("tpanex") String tpanex,
            @Param("tpdoc") String tpdoc,
            @Param("nmdoc") String nmdoc);

    @Query(value = "{call SP_ConsultaSaldosXCuenta(:opcion,:cia, :ejer, :periodo, :cta, :codane, :tpanex, :tpdoc, :nmdoc)}", nativeQuery = true)
    List<Map<String, Object[]>> swListarDetaSaldCta(
            @Param("opcion") int opcion,
            @Param("cia") String cia,
            @Param("ejer") String ejer,
            @Param("periodo") String periodo,
            @Param("cta") String cta,
            @Param("codane") String codane,
            @Param("tpanex") String tpanex,
            @Param("tpdoc") String tpdoc,
            @Param("nmdoc") String nmdoc);
}
