package com.empresa.repository;

import com.empresa.entity.lcoAnex;
import com.empresa.entity.lcoAnexPk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface lcoSaldoAnexRepository extends JpaRepository<lcoAnex, lcoAnexPk>{

    @Query(value = "{call SP_ConsultaSaldosPorAnexos(:opcion, :cia, :ejer, :dl_cuenta, :dl_tpanex, :dl_cdanex, :periodo, :opciones, :dl_tpdoc, :dl_nmdoc)}"
            , nativeQuery = true)
    List<Map<String, Object[]>> swListarSaldoAnex(@Param("opcion") int opcion,
                                    @Param("cia") String cia,
                                    @Param("ejer") String ejer,
                                    @Param("dl_cuenta") String dl_cuenta,
                                    @Param("dl_tpanex") String dl_tpanex,
                                    @Param("dl_cdanex") String dl_cdanex,
                                    @Param("periodo") String periodo,
                                    @Param("opciones") String opciones,
                                    @Param("dl_tpdoc") String dl_tpdoc,
                                    @Param("dl_nmdoc") String dl_nmdoc);
    
    @Query(value = "{call SP_ConsultaSaldosPorAnexos(:opcion, :cia, :ejer, :dl_cuenta, :dl_tpanex, :dl_cdanex, :periodo, :opciones, :dl_tpdoc, :dl_nmdoc)}"
            , nativeQuery = true)
    List<Map<String, Object[]>> swListaSalDoc(@Param("opcion") int opcion,
                                @Param("cia") String cia,
                                @Param("ejer") String ejer,
                                @Param("dl_cuenta") String dl_cuenta,
                                @Param("dl_tpanex") String dl_tpanex,
                                @Param("dl_cdanex") String dl_cdanex,
                                @Param("periodo") String periodo,
                                @Param("opciones") String opciones,
                                @Param("dl_tpdoc") String dl_tpdoc,
                                @Param("dl_nmdoc") String dl_nmdoc);                                 
    
    @Query(value = "{call SP_ConsultaSaldosPorAnexos(:opcion, :cia, :ejer, :dl_cuenta, :dl_tpanex, :dl_cdanex, :periodo, :opciones, :dl_tpdoc, :dl_nmdoc)}"
            , nativeQuery = true)
    List<Map<String, Object[]>> swListaDetSal(@Param("opcion") int opcion,
                                @Param("cia") String cia,
                                @Param("ejer") String ejer,
                                @Param("dl_cuenta") String dl_cuenta,
                                @Param("dl_tpanex") String dl_tpanex,
                                @Param("dl_cdanex") String dl_cdanex,
                                @Param("periodo") String periodo,
                                @Param("opciones") String opciones,
                                @Param("dl_tpdoc") String dl_tpdoc,
                                @Param("dl_nmdoc") String dl_nmdoc); 
}
