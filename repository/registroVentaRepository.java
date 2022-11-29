package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import com.empresa.entity.lcoVent21;
import com.empresa.entity.lcoVent21Pk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface registroVentaRepository extends JpaRepository<lcoVent21, lcoVent21Pk>{
    @Query(value="{call SP_RegistroVentas(:opcion, :p_ciacont, :ejercicio, :per, :par)}", nativeQuery = true)
    List<Map<String, Object>> swValRegVnt(@Param("opcion") int opcion,
                                            @Param("p_ciacont") String p_ciacont,
                                            @Param("ejercicio") String ejercicio,
                                            @Param("per") String per,
                                            @Param("par") String par
                                            );

    @Query(value="{call SP_RegistroVentas(:opcion, :p_ciacont, :ejercicio, :per, :par)}", nativeQuery = true)
    List<Map<String, Object>> swRegVntTbl(@Param("opcion") int opcion,
                                            @Param("p_ciacont") String p_ciacont,
                                            @Param("ejercicio") String ejercicio,
                                            @Param("per") String per,
                                            @Param("par") String par
                                            );

    @Query(value="{call SP_RegistroVentas(:opcion, :p_ciacont, :ejercicio, :per, :par)}", nativeQuery = true)
    List<Map<String, Object>> swRegVntPLE(@Param("opcion") int opcion,
                                            @Param("p_ciacont") String p_ciacont,
                                            @Param("ejercicio") String ejercicio,
                                            @Param("per") String per,
                                            @Param("par") String par
                                            );                 
    @Query(value="{call SP_RegistroVentas(:opcion, :p_ciacont, :ejercicio, :per, :par)}", nativeQuery = true)
    List<Map<String, Object>> Listar_p(@Param("opcion") int opcion,
                                            @Param("p_ciacont") String p_ciacont,
                                            @Param("ejercicio") String ejercicio,
                                            @Param("per") String per,
                                            @Param("par") String par
                                            );       
                                            
    @Query(value="{call SP_RegistroVentas(:opcion, :p_ciacont, :ejercicio, :per, :par)}", nativeQuery = true)
    List<Map<String, Object>> swLstRecVnt(@Param("opcion") int opcion,
                                            @Param("p_ciacont") String p_ciacont,
                                            @Param("ejercicio") String ejercicio,
                                            @Param("per") String per,
                                            @Param("par") String par
                                            );     
    
    @Query(value="{call SP_TablaLcoVent(:opcion, :p_ciacont, :per, :rv_subdia, :rv_compro, :rv_secuen, :rv_feccom, :rv_fecdoc, :rv_fecven, :rv_tipdoc, :rv_serdoc, :rv_nrodoc, :rv_nrodini, :rv_nrodfin, :rv_numdoc,"
            + ":rv_tipane, :rv_codane, :rv_tpdocide, :rv_rucane, :rv_nomane, :rv_codmon, :rv_afemn, :rv_inamn, :rv_iscmn, :rv_exomn, :rv_igvmn, :rv_impomn, :rv_otrmn, :rv_detmn, :rv_expmn, :rv_afeme,"
            + ":rv_iname, :rv_iscme, :rv_exome, :rv_igvme, :rv_impome, :rv_otrme, :rv_detme, :rv_expme, :rv_tipcam, :rv_porigv, :rv_bivapmn, :rv_bivapme, :rv_fedore, :rv_tidore, :rv_sedore, :rv_nudere, :rv_feccre, :rv_horcre,"
            + ":rv_usucre, :rv_fecmod, :rv_hormod, :rv_usumod, :rv_cencos, :rv_bolmn, :rv_bolme, :rv_ivapmn, :rv_ivapme, :rv_medpag, :rv_estado, :rv_descto, :rv_impdsct)}", nativeQuery = true)
            @Modifying
            @Transactional
    void swGrabarVentas(@Param("opcion") int opcion, @Param("p_ciacont") String p_ciacont,
                                            @Param("per") String per,
                                            @Param("rv_subdia") String rv_subdia,
                                            @Param("rv_compro") String rv_compro,
                                            @Param("rv_secuen") String rv_secuen,
                                            @Param("rv_feccom") LocalDate rv_feccom,
                                            @Param("rv_fecdoc") LocalDate rv_fecdoc,
                                            @Param("rv_fecven") LocalDate rv_fecven,
                                            @Param("rv_tipdoc") String rv_tipdoc,
                                            @Param("rv_serdoc") String rv_serdoc,
                                            @Param("rv_nrodoc") String rv_nrodoc,
                                            @Param("rv_nrodini") String rv_nrodini,
                                            @Param("rv_nrodfin") String rv_nrodfin,
                                            @Param("rv_numdoc") String rv_numdoc,
                                            @Param("rv_tipane") String rv_tipane,
                                            @Param("rv_codane") String rv_codane,
                                            @Param("rv_tpdocide") String rv_tpdocide,
                                            @Param("rv_rucane") String rv_rucane,
                                            @Param("rv_nomane") String rv_nomane,
                                            @Param("rv_codmon") String rv_codmon,
                                            @Param("rv_afemn") Double rv_afemn,
                                            @Param("rv_inamn") Double rv_inamn,
                                            @Param("rv_iscmn") Double rv_iscmn,
                                            @Param("rv_exomn") Double rv_exomn,
                                            @Param("rv_igvmn") Double rv_igvmn,
                                            @Param("rv_impomn") Double rv_impomn,
                                            @Param("rv_otrmn") Double rv_otrmn,
                                            @Param("rv_detmn") Double rv_detmn,
                                            @Param("rv_expmn") Double rv_expmn,
                                            @Param("rv_afeme") Double rv_afeme,
                                            @Param("rv_iname") Double rv_iname,
                                            @Param("rv_iscme") Double rv_iscme,
                                            @Param("rv_exome") Double rv_exome,
                                            @Param("rv_igvme") Double rv_igvme,
                                            @Param("rv_impome") Double rv_impome,
                                            @Param("rv_otrme") Double rv_otrme,
                                            @Param("rv_detme") Double rv_detme,
                                            @Param("rv_expme") Double rv_expme,
                                            @Param("rv_tipcam") Double rv_tipcam,
                                            @Param("rv_porigv") Double rv_porigv,
                                            @Param("rv_bivapmn") Double rv_bivapmn,
                                            @Param("rv_bivapme") Double rv_bivapme,
                                            @Param("rv_fedore") LocalDate rv_fedore,
                                            @Param("rv_tidore") String rv_tidore,
                                            @Param("rv_sedore") String rv_sedore,
                                            @Param("rv_nudere") String rv_nudere,
                                            @Param("rv_feccre") LocalDate rv_feccre,
                                            @Param("rv_horcre") LocalTime rv_horcre,
                                            @Param("rv_usucre") String rv_usucre,
                                            @Param("rv_fecmod") LocalDate rv_fecmod,
                                            @Param("rv_hormod") LocalTime rv_hormod,
                                            @Param("rv_usumod") String rv_usumod,
                                            @Param("rv_cencos") String rv_cencos,
                                            @Param("rv_bolmn") Double rv_bolmn,
                                            @Param("rv_bolme") Double rv_bolme,
                                            @Param("rv_ivapmn") Double rv_ivapmn,
                                            @Param("rv_ivapme") Double rv_ivapme,
                                            @Param("rv_medpag") String rv_medpag,
                                            @Param("rv_estado") String rv_estado,
                                            @Param("rv_descto") Double rv_descto,
                                            @Param("rv_impdsct") Double rv_impdsct
                                            );   
}                                                                       
