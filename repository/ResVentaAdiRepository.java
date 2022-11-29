package com.empresa.repository;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.lcoTblaVenta;
import com.empresa.entity.lcoTblaVentaPk;

@Repository
public interface ResVentaAdiRepository extends JpaRepository<lcoTblaVenta, lcoTblaVentaPk> {
    @Query(value = "{call SP_Regis_Adi_Venta(:opcion,:cia,:ejercicio,:PER,:SD,:asiento,:av_codper,:av_subdia,:av_compro,:av_feccom,:av_fecdoc,:av_fecven,:av_tipdoc,:av_docser,:av_docnum,:av_numdoc,:av_tipane,:av_codane,:av_tipide,:av_numide,:av_nomane,:av_codmon,:av_afemn,:av_inamn,"
            + ":av_iscmn,:av_exomn,:av_igvmn,:av_ivamn,:av_otrmn,:av_desmn,:av_idemn,:av_expmn,:av_icbpmn,:av_importmn,:av_afeme,:av_iname,:av_iscme,:av_exome,:av_igvme,:av_ivame,:av_otrme,:av_desme,:av_ideme,:av_expme,:av_icbpme,:av_importme,:av_tctipo,:av_tipcamb,:av_porcigv,:av_fecdocref,:av_tipdocref,"
            + ":av_docserref,:av_docnumref,:av_usrcrea,:av_feccrea,:av_hracrea,:av_usract,:av_fecact,:av_hraact,:av_secuen,:av_cuenta,:av_perrec,:av_medpag,:av_estado,:av_cencos,:av_proy)}", nativeQuery = true)
    List<Map<String, Object[]>> swListarRecVnt(
            @Param("opcion") int opcion,
            @Param("cia") String cia,
            @Param("ejercicio") String ejercicio,
            @Param("PER") String PER,
            @Param("SD") String SD,
            @Param("asiento") String asiento,
            @Param("av_codper") String av_codper,
            @Param("av_subdia") String av_subdia,
            @Param("av_compro") String av_compro,
            @Param("av_feccom") LocalDate av_feccom,
            @Param("av_fecdoc") LocalDate av_fecdoc,
            @Param("av_fecven") LocalDate av_fecven,
            @Param("av_tipdoc") String av_tipdoc,
            @Param("av_docser") String av_docser,
            @Param("av_docnum") String av_docnum,
            @Param("av_numdoc") String av_numdoc,
            @Param("av_tipane") String av_tipane,
            @Param("av_codane") String av_codane,
            @Param("av_tipide") String av_tipide,
            @Param("av_numide") String av_numide,
            @Param("av_nomane") String av_nomane,
            @Param("av_codmon") String av_codmon,
            @Param("av_afemn") Double av_afemn,
            @Param("av_inamn") Double av_inamn,
            @Param("av_iscmn") Double av_iscmn,
            @Param("av_exomn") Double av_exomn,
            @Param("av_igvmn") Double av_igvmn,
            @Param("av_ivamn") Double av_ivamn,
            @Param("av_otrmn") Double av_otrmn,
            @Param("av_desmn") Double av_desmn,
            @Param("av_idemn") Double av_idemn,
            @Param("av_expmn") Double av_expmn,
            @Param("av_icbpmn") Double av_icbpmn,
            @Param("av_importmn") Double av_importmn,
            @Param("av_afeme") Double av_afeme,
            @Param("av_iname") Double av_iname,
            @Param("av_iscme") Double av_iscme,
            @Param("av_exome") Double av_exome,
            @Param("av_igvme") Double av_igvme,
            @Param("av_ivame") Double av_ivame,
            @Param("av_otrme") Double av_otrme,
            @Param("av_desme") Double av_desme,
            @Param("av_ideme") Double av_ideme,
            @Param("av_expme") Double av_expme,
            @Param("av_icbpme") Double av_icbpme,
            @Param("av_importme") Double av_importme,
            @Param("av_tctipo") String av_tctipo,
            @Param("av_tipcamb") Double av_tipcamb,
            @Param("av_porcigv") Double av_porcigv,
            @Param("av_fecdocref") LocalDate av_fecdocref,
            @Param("av_tipdocref") String av_tipdocref,
            @Param("av_docserref") String av_docserref,
            @Param("av_docnumref") String av_docnumref,
            @Param("av_usrcrea") String av_usrcrea,
            @Param("av_feccrea") LocalDate av_feccrea,
            @Param("av_hracrea") LocalTime av_hracrea,
            @Param("av_usract") String av_usract,
            @Param("av_fecact") LocalDate av_fecact,
            @Param("av_hraact") LocalTime av_hraact,
            @Param("av_secuen") String av_secuen,
            @Param("av_cuenta") String av_cuenta,
            @Param("av_perrec") String av_perrec,
            @Param("av_medpag") String av_medpag,
            @Param("av_estado") String av_estado,
            @Param("av_cencos") String av_cencos,
            @Param("av_proy") String av_proy);

    @Query(value = "{call SP_Regis_Adi_Venta(:opcion,:cia,:ejercicio,:PER,:SD,:asiento,:av_codper,:av_subdia,:av_compro,:av_feccom,:av_fecdoc,:av_fecven,:av_tipdoc,:av_docser,:av_docnum,:av_numdoc,:av_tipane,:av_codane,:av_tipide,:av_numide,:av_nomane,:av_codmon,:av_afemn,:av_inamn,"
            + ":av_iscmn,:av_exomn,:av_igvmn,:av_ivamn,:av_otrmn,:av_desmn,:av_idemn,:av_expmn,:av_icbpmn,:av_importmn,:av_afeme,:av_iname,:av_iscme,:av_exome,:av_igvme,:av_ivame,:av_otrme,:av_desme,:av_ideme,:av_expme,:av_icbpme,:av_importme,:av_tctipo,:av_tipcamb,:av_porcigv,:av_fecdocref,:av_tipdocref,"
            + ":av_docserref,:av_docnumref,:av_usrcrea,:av_feccrea,:av_hracrea,:av_usract,:av_fecact,:av_hraact,:av_secuen,:av_cuenta,:av_perrec,:av_medpag,:av_estado,:av_cencos,:av_proy)}", nativeQuery = true)
    List<Map<String, Object[]>> swBscRecVnt(
            @Param("opcion") int opcion,
            @Param("cia") String cia,
            @Param("ejercicio") String ejercicio,
            @Param("PER") String PER,
            @Param("SD") String SD,
            @Param("asiento") String asiento,
            @Param("av_codper") String av_codper,
            @Param("av_subdia") String av_subdia,
            @Param("av_compro") String av_compro,
            @Param("av_feccom") LocalDate av_feccom,
            @Param("av_fecdoc") LocalDate av_fecdoc,
            @Param("av_fecven") LocalDate av_fecven,
            @Param("av_tipdoc") String av_tipdoc,
            @Param("av_docser") String av_docser,
            @Param("av_docnum") String av_docnum,
            @Param("av_numdoc") String av_numdoc,
            @Param("av_tipane") String av_tipane,
            @Param("av_codane") String av_codane,
            @Param("av_tipide") String av_tipide,
            @Param("av_numide") String av_numide,
            @Param("av_nomane") String av_nomane,
            @Param("av_codmon") String av_codmon,
            @Param("av_afemn") Double av_afemn,
            @Param("av_inamn") Double av_inamn,
            @Param("av_iscmn") Double av_iscmn,
            @Param("av_exomn") Double av_exomn,
            @Param("av_igvmn") Double av_igvmn,
            @Param("av_ivamn") Double av_ivamn,
            @Param("av_otrmn") Double av_otrmn,
            @Param("av_desmn") Double av_desmn,
            @Param("av_idemn") Double av_idemn,
            @Param("av_expmn") Double av_expmn,
            @Param("av_icbpmn") Double av_icbpmn,
            @Param("av_importmn") Double av_importmn,
            @Param("av_afeme") Double av_afeme,
            @Param("av_iname") Double av_iname,
            @Param("av_iscme") Double av_iscme,
            @Param("av_exome") Double av_exome,
            @Param("av_igvme") Double av_igvme,
            @Param("av_ivame") Double av_ivame,
            @Param("av_otrme") Double av_otrme,
            @Param("av_desme") Double av_desme,
            @Param("av_ideme") Double av_ideme,
            @Param("av_expme") Double av_expme,
            @Param("av_icbpme") Double av_icbpme,
            @Param("av_importme") Double av_importme,
            @Param("av_tctipo") String av_tctipo,
            @Param("av_tipcamb") Double av_tipcamb,
            @Param("av_porcigv") Double av_porcigv,
            @Param("av_fecdocref") LocalDate av_fecdocref,
            @Param("av_tipdocref") String av_tipdocref,
            @Param("av_docserref") String av_docserref,
            @Param("av_docnumref") String av_docnumref,
            @Param("av_usrcrea") String av_usrcrea,
            @Param("av_feccrea") LocalDate av_feccrea,
            @Param("av_hracrea") LocalTime av_hracrea,
            @Param("av_usract") String av_usract,
            @Param("av_fecact") LocalDate av_fecact,
            @Param("av_hraact") LocalTime av_hraact,
            @Param("av_secuen") String av_secuen,
            @Param("av_cuenta") String av_cuenta,
            @Param("av_perrec") String av_perrec,
            @Param("av_medpag") String av_medpag,
            @Param("av_estado") String av_estado,
            @Param("av_cencos") String av_cencos,
            @Param("av_proy") String av_proy);

            @Query(value = "{call SP_Regis_Adi_Venta(:opcion,:cia,:ejercicio,:PER,:SD,:asiento,:av_codper,:av_subdia,:av_compro,:av_feccom,:av_fecdoc,:av_fecven,:av_tipdoc,:av_docser,:av_docnum,:av_numdoc,:av_tipane,:av_codane,:av_tipide,:av_numide,:av_nomane,:av_codmon,:av_afemn,:av_inamn,"
            + ":av_iscmn,:av_exomn,:av_igvmn,:av_ivamn,:av_otrmn,:av_desmn,:av_idemn,:av_expmn,:av_icbpmn,:av_importmn,:av_afeme,:av_iname,:av_iscme,:av_exome,:av_igvme,:av_ivame,:av_otrme,:av_desme,:av_ideme,:av_expme,:av_icbpme,:av_importme,:av_tctipo,:av_tipcamb,:av_porcigv,:av_fecdocref,:av_tipdocref,"
            + ":av_docserref,:av_docnumref,:av_usrcrea,:av_feccrea,:av_hracrea,:av_usract,:av_fecact,:av_hraact,:av_secuen,:av_cuenta,:av_perrec,:av_medpag,:av_estado,:av_cencos,:av_proy)}", nativeQuery = true)
    List<Map<String, Object[]>> swConRecVnt(
            @Param("opcion") int opcion,
            @Param("cia") String cia,
            @Param("ejercicio") String ejercicio,
            @Param("PER") String PER,
            @Param("SD") String SD,
            @Param("asiento") String asiento,
            @Param("av_codper") String av_codper,
            @Param("av_subdia") String av_subdia,
            @Param("av_compro") String av_compro,
            @Param("av_feccom") LocalDate av_feccom,
            @Param("av_fecdoc") LocalDate av_fecdoc,
            @Param("av_fecven") LocalDate av_fecven,
            @Param("av_tipdoc") String av_tipdoc,
            @Param("av_docser") String av_docser,
            @Param("av_docnum") String av_docnum,
            @Param("av_numdoc") String av_numdoc,
            @Param("av_tipane") String av_tipane,
            @Param("av_codane") String av_codane,
            @Param("av_tipide") String av_tipide,
            @Param("av_numide") String av_numide,
            @Param("av_nomane") String av_nomane,
            @Param("av_codmon") String av_codmon,
            @Param("av_afemn") Double av_afemn,
            @Param("av_inamn") Double av_inamn,
            @Param("av_iscmn") Double av_iscmn,
            @Param("av_exomn") Double av_exomn,
            @Param("av_igvmn") Double av_igvmn,
            @Param("av_ivamn") Double av_ivamn,
            @Param("av_otrmn") Double av_otrmn,
            @Param("av_desmn") Double av_desmn,
            @Param("av_idemn") Double av_idemn,
            @Param("av_expmn") Double av_expmn,
            @Param("av_icbpmn") Double av_icbpmn,
            @Param("av_importmn") Double av_importmn,
            @Param("av_afeme") Double av_afeme,
            @Param("av_iname") Double av_iname,
            @Param("av_iscme") Double av_iscme,
            @Param("av_exome") Double av_exome,
            @Param("av_igvme") Double av_igvme,
            @Param("av_ivame") Double av_ivame,
            @Param("av_otrme") Double av_otrme,
            @Param("av_desme") Double av_desme,
            @Param("av_ideme") Double av_ideme,
            @Param("av_expme") Double av_expme,
            @Param("av_icbpme") Double av_icbpme,
            @Param("av_importme") Double av_importme,
            @Param("av_tctipo") String av_tctipo,
            @Param("av_tipcamb") Double av_tipcamb,
            @Param("av_porcigv") Double av_porcigv,
            @Param("av_fecdocref") LocalDate av_fecdocref,
            @Param("av_tipdocref") String av_tipdocref,
            @Param("av_docserref") String av_docserref,
            @Param("av_docnumref") String av_docnumref,
            @Param("av_usrcrea") String av_usrcrea,
            @Param("av_feccrea") LocalDate av_feccrea,
            @Param("av_hracrea") LocalTime av_hracrea,
            @Param("av_usract") String av_usract,
            @Param("av_fecact") LocalDate av_fecact,
            @Param("av_hraact") LocalTime av_hraact,
            @Param("av_secuen") String av_secuen,
            @Param("av_cuenta") String av_cuenta,
            @Param("av_perrec") String av_perrec,
            @Param("av_medpag") String av_medpag,
            @Param("av_estado") String av_estado,
            @Param("av_cencos") String av_cencos,
            @Param("av_proy") String av_proy);

    @Query(value = "{call SP_Regis_Adi_Venta(:opcion,:cia,:ejercicio,:PER,:SD,:asiento,:av_codper,:av_subdia,:av_compro,:av_feccom,:av_fecdoc,:av_fecven,:av_tipdoc,:av_docser,:av_docnum,:av_numdoc,:av_tipane,:av_codane,:av_tipide,:av_numide,:av_nomane,:av_codmon,:av_afemn,:av_inamn,"
            + ":av_iscmn,:av_exomn,:av_igvmn,:av_ivamn,:av_otrmn,:av_desmn,:av_idemn,:av_expmn,:av_icbpmn,:av_importmn,:av_afeme,:av_iname,:av_iscme,:av_exome,:av_igvme,:av_ivame,:av_otrme,:av_desme,:av_ideme,:av_expme,:av_icbpme,:av_importme,:av_tctipo,:av_tipcamb,:av_porcigv,:av_fecdocref,:av_tipdocref,"
            + ":av_docserref,:av_docnumref,:av_usrcrea,:av_feccrea,:av_hracrea,:av_usract,:av_fecact,:av_hraact,:av_secuen,:av_cuenta,:av_perrec,:av_medpag,:av_estado,:av_cencos,:av_proy)}", nativeQuery = true)
    @Transactional
    @Modifying
    void swEliRecVnt(
            @Param("opcion") int opcion,
            @Param("cia") String cia,
            @Param("ejercicio") String ejercicio,
            @Param("PER") String PER,
            @Param("SD") String SD,
            @Param("asiento") String asiento,
            @Param("av_codper") String av_codper,
            @Param("av_subdia") String av_subdia,
            @Param("av_compro") String av_compro,
            @Param("av_feccom") LocalDate av_feccom,
            @Param("av_fecdoc") LocalDate av_fecdoc,
            @Param("av_fecven") LocalDate av_fecven,
            @Param("av_tipdoc") String av_tipdoc,
            @Param("av_docser") String av_docser,
            @Param("av_docnum") String av_docnum,
            @Param("av_numdoc") String av_numdoc,
            @Param("av_tipane") String av_tipane,
            @Param("av_codane") String av_codane,
            @Param("av_tipide") String av_tipide,
            @Param("av_numide") String av_numide,
            @Param("av_nomane") String av_nomane,
            @Param("av_codmon") String av_codmon,
            @Param("av_afemn") Double av_afemn,
            @Param("av_inamn") Double av_inamn,
            @Param("av_iscmn") Double av_iscmn,
            @Param("av_exomn") Double av_exomn,
            @Param("av_igvmn") Double av_igvmn,
            @Param("av_ivamn") Double av_ivamn,
            @Param("av_otrmn") Double av_otrmn,
            @Param("av_desmn") Double av_desmn,
            @Param("av_idemn") Double av_idemn,
            @Param("av_expmn") Double av_expmn,
            @Param("av_icbpmn") Double av_icbpmn,
            @Param("av_importmn") Double av_importmn,
            @Param("av_afeme") Double av_afeme,
            @Param("av_iname") Double av_iname,
            @Param("av_iscme") Double av_iscme,
            @Param("av_exome") Double av_exome,
            @Param("av_igvme") Double av_igvme,
            @Param("av_ivame") Double av_ivame,
            @Param("av_otrme") Double av_otrme,
            @Param("av_desme") Double av_desme,
            @Param("av_ideme") Double av_ideme,
            @Param("av_expme") Double av_expme,
            @Param("av_icbpme") Double av_icbpme,
            @Param("av_importme") Double av_importme,
            @Param("av_tctipo") String av_tctipo,
            @Param("av_tipcamb") Double av_tipcamb,
            @Param("av_porcigv") Double av_porcigv,
            @Param("av_fecdocref") LocalDate av_fecdocref,
            @Param("av_tipdocref") String av_tipdocref,
            @Param("av_docserref") String av_docserref,
            @Param("av_docnumref") String av_docnumref,
            @Param("av_usrcrea") String av_usrcrea,
            @Param("av_feccrea") LocalDate av_feccrea,
            @Param("av_hracrea") LocalTime av_hracrea,
            @Param("av_usract") String av_usract,
            @Param("av_fecact") LocalDate av_fecact,
            @Param("av_hraact") LocalTime av_hraact,
            @Param("av_secuen") String av_secuen,
            @Param("av_cuenta") String av_cuenta,
            @Param("av_perrec") String av_perrec,
            @Param("av_medpag") String av_medpag,
            @Param("av_estado") String av_estado,
            @Param("av_cencos") String av_cencos,
            @Param("av_proy") String av_proy);

    @Query(value = "{call SP_Regis_Adi_Venta(:opcion,:cia,:ejercicio,:PER,:SD,:asiento,:av_codper,:av_subdia,:av_compro,:av_feccom,:av_fecdoc,:av_fecven,:av_tipdoc,:av_docser,:av_docnum,:av_numdoc,:av_tipane,:av_codane,:av_tipide,:av_numide,:av_nomane,:av_codmon,:av_afemn,:av_inamn,"
            + ":av_iscmn,:av_exomn,:av_igvmn,:av_ivamn,:av_otrmn,:av_desmn,:av_idemn,:av_expmn,:av_icbpmn,:av_importmn,:av_afeme,:av_iname,:av_iscme,:av_exome,:av_igvme,:av_ivame,:av_otrme,:av_desme,:av_ideme,:av_expme,:av_icbpme,:av_importme,:av_tctipo,:av_tipcamb,:av_porcigv,:av_fecdocref,:av_tipdocref,"
            + ":av_docserref,:av_docnumref,:av_usrcrea,:av_feccrea,:av_hracrea,:av_usract,:av_fecact,:av_hraact,:av_secuen,:av_cuenta,:av_perrec,:av_medpag,:av_estado,:av_cencos,:av_proy)}", nativeQuery = true)
    @Transactional
    @Modifying
    void swCrearRecVnt(
            @Param("opcion") int opcion,
            @Param("cia") String cia,
            @Param("ejercicio") String ejercicio,
            @Param("PER") String PER,
            @Param("SD") String SD,
            @Param("asiento") String asiento,
            @Param("av_codper") String av_codper,
            @Param("av_subdia") String av_subdia,
            @Param("av_compro") String av_compro,
            @Param("av_feccom") LocalDate av_feccom,
            @Param("av_fecdoc") LocalDate av_fecdoc,
            @Param("av_fecven") LocalDate av_fecven,
            @Param("av_tipdoc") String av_tipdoc,
            @Param("av_docser") String av_docser,
            @Param("av_docnum") String av_docnum,
            @Param("av_numdoc") String av_numdoc,
            @Param("av_tipane") String av_tipane,
            @Param("av_codane") String av_codane,
            @Param("av_tipide") String av_tipide,
            @Param("av_numide") String av_numide,
            @Param("av_nomane") String av_nomane,
            @Param("av_codmon") String av_codmon,
            @Param("av_afemn") Double av_afemn,
            @Param("av_inamn") Double av_inamn,
            @Param("av_iscmn") Double av_iscmn,
            @Param("av_exomn") Double av_exomn,
            @Param("av_igvmn") Double av_igvmn,
            @Param("av_ivamn") Double av_ivamn,
            @Param("av_otrmn") Double av_otrmn,
            @Param("av_desmn") Double av_desmn,
            @Param("av_idemn") Double av_idemn,
            @Param("av_expmn") Double av_expmn,
            @Param("av_icbpmn") Double av_icbpmn,
            @Param("av_importmn") Double av_importmn,
            @Param("av_afeme") Double av_afeme,
            @Param("av_iname") Double av_iname,
            @Param("av_iscme") Double av_iscme,
            @Param("av_exome") Double av_exome,
            @Param("av_igvme") Double av_igvme,
            @Param("av_ivame") Double av_ivame,
            @Param("av_otrme") Double av_otrme,
            @Param("av_desme") Double av_desme,
            @Param("av_ideme") Double av_ideme,
            @Param("av_expme") Double av_expme,
            @Param("av_icbpme") Double av_icbpme,
            @Param("av_importme") Double av_importme,
            @Param("av_tctipo") String av_tctipo,
            @Param("av_tipcamb") Double av_tipcamb,
            @Param("av_porcigv") Double av_porcigv,
            @Param("av_fecdocref") LocalDate av_fecdocref,
            @Param("av_tipdocref") String av_tipdocref,
            @Param("av_docserref") String av_docserref,
            @Param("av_docnumref") String av_docnumref,
            @Param("av_usrcrea") String av_usrcrea,
            @Param("av_feccrea") LocalDate av_feccrea,
            @Param("av_hracrea") LocalTime av_hracrea,
            @Param("av_usract") String av_usract,
            @Param("av_fecact") LocalDate av_fecact,
            @Param("av_hraact") LocalTime av_hraact,
            @Param("av_secuen") String av_secuen,
            @Param("av_cuenta") String av_cuenta,
            @Param("av_perrec") String av_perrec,
            @Param("av_medpag") String av_medpag,
            @Param("av_estado") String av_estado,
            @Param("av_cencos") String av_cencos,
            @Param("av_proy") String av_proy);

    @Query(value = "{call SP_Regis_Adi_Venta(:opcion,:cia,:ejercicio,:PER,:SD,:asiento,:av_codper,:av_subdia,:av_compro,:av_feccom,:av_fecdoc,:av_fecven,:av_tipdoc,:av_docser,:av_docnum,:av_numdoc,:av_tipane,:av_codane,:av_tipide,:av_numide,:av_nomane,:av_codmon,:av_afemn,:av_inamn,"
            + ":av_iscmn,:av_exomn,:av_igvmn,:av_ivamn,:av_otrmn,:av_desmn,:av_idemn,:av_expmn,:av_icbpmn,:av_importmn,:av_afeme,:av_iname,:av_iscme,:av_exome,:av_igvme,:av_ivame,:av_otrme,:av_desme,:av_ideme,:av_expme,:av_icbpme,:av_importme,:av_tctipo,:av_tipcamb,:av_porcigv,:av_fecdocref,:av_tipdocref,"
            + ":av_docserref,:av_docnumref,:av_usrcrea,:av_feccrea,:av_hracrea,:av_usract,:av_fecact,:av_hraact,:av_secuen,:av_cuenta,:av_perrec,:av_medpag,:av_estado,:av_cencos,:av_proy)}", nativeQuery = true)
    @Transactional
    @Modifying
    void swActRecVnt(
            @Param("opcion") int opcion,
            @Param("cia") String cia,
            @Param("ejercicio") String ejercicio,
            @Param("PER") String PER,
            @Param("SD") String SD,
            @Param("asiento") String asiento,
            @Param("av_codper") String av_codper,
            @Param("av_subdia") String av_subdia,
            @Param("av_compro") String av_compro,
            @Param("av_feccom") LocalDate av_feccom,
            @Param("av_fecdoc") LocalDate av_fecdoc,
            @Param("av_fecven") LocalDate av_fecven,
            @Param("av_tipdoc") String av_tipdoc,
            @Param("av_docser") String av_docser,
            @Param("av_docnum") String av_docnum,
            @Param("av_numdoc") String av_numdoc,
            @Param("av_tipane") String av_tipane,
            @Param("av_codane") String av_codane,
            @Param("av_tipide") String av_tipide,
            @Param("av_numide") String av_numide,
            @Param("av_nomane") String av_nomane,
            @Param("av_codmon") String av_codmon,
            @Param("av_afemn") Double av_afemn,
            @Param("av_inamn") Double av_inamn,
            @Param("av_iscmn") Double av_iscmn,
            @Param("av_exomn") Double av_exomn,
            @Param("av_igvmn") Double av_igvmn,
            @Param("av_ivamn") Double av_ivamn,
            @Param("av_otrmn") Double av_otrmn,
            @Param("av_desmn") Double av_desmn,
            @Param("av_idemn") Double av_idemn,
            @Param("av_expmn") Double av_expmn,
            @Param("av_icbpmn") Double av_icbpmn,
            @Param("av_importmn") Double av_importmn,
            @Param("av_afeme") Double av_afeme,
            @Param("av_iname") Double av_iname,
            @Param("av_iscme") Double av_iscme,
            @Param("av_exome") Double av_exome,
            @Param("av_igvme") Double av_igvme,
            @Param("av_ivame") Double av_ivame,
            @Param("av_otrme") Double av_otrme,
            @Param("av_desme") Double av_desme,
            @Param("av_ideme") Double av_ideme,
            @Param("av_expme") Double av_expme,
            @Param("av_icbpme") Double av_icbpme,
            @Param("av_importme") Double av_importme,
            @Param("av_tctipo") String av_tctipo,
            @Param("av_tipcamb") Double av_tipcamb,
            @Param("av_porcigv") Double av_porcigv,
            @Param("av_fecdocref") LocalDate av_fecdocref,
            @Param("av_tipdocref") String av_tipdocref,
            @Param("av_docserref") String av_docserref,
            @Param("av_docnumref") String av_docnumref,
            @Param("av_usrcrea") String av_usrcrea,
            @Param("av_feccrea") LocalDate av_feccrea,
            @Param("av_hracrea") LocalTime av_hracrea,
            @Param("av_usract") String av_usract,
            @Param("av_fecact") LocalDate av_fecact,
            @Param("av_hraact") LocalTime av_hraact,
            @Param("av_secuen") String av_secuen,
            @Param("av_cuenta") String av_cuenta,
            @Param("av_perrec") String av_perrec,
            @Param("av_medpag") String av_medpag,
            @Param("av_estado") String av_estado,
            @Param("av_cencos") String av_cencos,
            @Param("av_proy") String av_proy);

    @Query(value = "{call SP_Regis_Adi_Venta(:opcion,:cia,:ejercicio,:PER,:SD,:asiento,:av_codper,:av_subdia,:av_compro,:av_feccom,:av_fecdoc,:av_fecven,:av_tipdoc,:av_docser,:av_docnum,:av_numdoc,:av_tipane,:av_codane,:av_tipide,:av_numide,:av_nomane,:av_codmon,:av_afemn,:av_inamn,"
            + ":av_iscmn,:av_exomn,:av_igvmn,:av_ivamn,:av_otrmn,:av_desmn,:av_idemn,:av_expmn,:av_icbpmn,:av_importmn,:av_afeme,:av_iname,:av_iscme,:av_exome,:av_igvme,:av_ivame,:av_otrme,:av_desme,:av_ideme,:av_expme,:av_icbpme,:av_importme,:av_tctipo,:av_tipcamb,:av_porcigv,:av_fecdocref,:av_tipdocref,"
            + ":av_docserref,:av_docnumref,:av_usrcrea,:av_feccrea,:av_hracrea,:av_usract,:av_fecact,:av_hraact,:av_secuen,:av_cuenta,:av_perrec,:av_medpag,:av_estado,:av_cencos,:av_proy)}", nativeQuery = true)
    List<Map<String, Object[]>> swListarAyuOmi (
            @Param("opcion") int opcion,
            @Param("cia") String cia,
            @Param("ejercicio") String ejercicio,
            @Param("PER") String PER,
            @Param("SD") String SD,
            @Param("asiento") String asiento,
            @Param("av_codper") String av_codper,
            @Param("av_subdia") String av_subdia,
            @Param("av_compro") String av_compro,
            @Param("av_feccom") LocalDate av_feccom,
            @Param("av_fecdoc") LocalDate av_fecdoc,
            @Param("av_fecven") LocalDate av_fecven,
            @Param("av_tipdoc") String av_tipdoc,
            @Param("av_docser") String av_docser,
            @Param("av_docnum") String av_docnum,
            @Param("av_numdoc") String av_numdoc,
            @Param("av_tipane") String av_tipane,
            @Param("av_codane") String av_codane,
            @Param("av_tipide") String av_tipide,
            @Param("av_numide") String av_numide,
            @Param("av_nomane") String av_nomane,
            @Param("av_codmon") String av_codmon,
            @Param("av_afemn") Double av_afemn,
            @Param("av_inamn") Double av_inamn,
            @Param("av_iscmn") Double av_iscmn,
            @Param("av_exomn") Double av_exomn,
            @Param("av_igvmn") Double av_igvmn,
            @Param("av_ivamn") Double av_ivamn,
            @Param("av_otrmn") Double av_otrmn,
            @Param("av_desmn") Double av_desmn,
            @Param("av_idemn") Double av_idemn,
            @Param("av_expmn") Double av_expmn,
            @Param("av_icbpmn") Double av_icbpmn,
            @Param("av_importmn") Double av_importmn,
            @Param("av_afeme") Double av_afeme,
            @Param("av_iname") Double av_iname,
            @Param("av_iscme") Double av_iscme,
            @Param("av_exome") Double av_exome,
            @Param("av_igvme") Double av_igvme,
            @Param("av_ivame") Double av_ivame,
            @Param("av_otrme") Double av_otrme,
            @Param("av_desme") Double av_desme,
            @Param("av_ideme") Double av_ideme,
            @Param("av_expme") Double av_expme,
            @Param("av_icbpme") Double av_icbpme,
            @Param("av_importme") Double av_importme,
            @Param("av_tctipo") String av_tctipo,
            @Param("av_tipcamb") Double av_tipcamb,
            @Param("av_porcigv") Double av_porcigv,
            @Param("av_fecdocref") LocalDate av_fecdocref,
            @Param("av_tipdocref") String av_tipdocref,
            @Param("av_docserref") String av_docserref,
            @Param("av_docnumref") String av_docnumref,
            @Param("av_usrcrea") String av_usrcrea,
            @Param("av_feccrea") LocalDate av_feccrea,
            @Param("av_hracrea") LocalTime av_hracrea,
            @Param("av_usract") String av_usract,
            @Param("av_fecact") LocalDate av_fecact,
            @Param("av_hraact") LocalTime av_hraact,
            @Param("av_secuen") String av_secuen,
            @Param("av_cuenta") String av_cuenta,
            @Param("av_perrec") String av_perrec,
            @Param("av_medpag") String av_medpag,
            @Param("av_estado") String av_estado,
            @Param("av_cencos") String av_cencos,
            @Param("av_proy") String av_proy);
        }