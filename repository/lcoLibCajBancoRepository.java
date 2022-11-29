package com.empresa.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.lcoCabV;

@Repository
public interface lcoLibCajBancoRepository extends JpaRepository<lcoCabV, String>{
    
    @Query(value = "{call SP_LibCajBanco(:opcion, :cia, :ejer, :periodo)}", nativeQuery = true)
    List<Map<String, Object[]>> swLibCajBanco(
                                    @Param("opcion") int opcion,
                                    @Param("cia") String cia,
                                    @Param("ejer") String ejer,
                                    @Param("periodo") String periodo);
    
    @Query(value = "{call SP_LibCajBancoFrmCab(:opcion, :cia, :ejer, :periodo, :ctaInicial, :ctaFinal, :tipoAnexo, :codAnexo, :flagAstCie)}", nativeQuery = true)
    List<Map<String, Object[]>> swLibCajBancoFrmCab(
                                    @Param("opcion") int opcion,
                                    @Param("cia") String cia,
                                    @Param("ejer") String ejer,
                                    @Param("periodo") String periodo,
                                    @Param("ctaInicial") String ctaInicial,
                                    @Param("ctaFinal") String ctaFinal,
                                    @Param("tipoAnexo") String tipoAnexo,
                                    @Param("codAnexo") String codAnexo,
                                    @Param("flagAstCie") String flagAstCie);
    
    @Query(value = "{call SP_LibCajBancoFrmDet(:opcion, :cia, :ejer, :periodo, :cta, :codAnexo, :flagAstCie, :flagAstAjs)}", nativeQuery = true)
    List<Map<String, Object[]>> swLibCajBancoFrmDet(
                                    @Param("opcion") int opcion,
                                    @Param("cia") String cia,
                                    @Param("ejer") String ejer,
                                    @Param("periodo") String periodo,
                                    @Param("cta") String cta,
                                    @Param("codAnexo") String codAnexo,
                                    @Param("flagAstCie") String flagAstCie,
                                    @Param("flagAstAjs") String flagAstAjs);
}
