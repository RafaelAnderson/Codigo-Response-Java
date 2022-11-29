package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import com.empresa.entity.lcoumnu;
import com.empresa.entity.lcoumnuPk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface perfilUserRepository extends JpaRepository<lcoumnu, lcoumnuPk> {

        @Query(value = "{call SP_PerfilUser( :opcion, :CodUser, :um_id, :um_id0, :um_id1, :um_id2, :um_usrcrea,"
                        + " :um_feccrea, :um_hracrea, :um_usrcact, :um_fecact, :um_hraact)}", nativeQuery = true)
        List<Map<String, Object>> swListarMnuSel(
                        @Param("opcion") int opcion,
                        @Param("CodUser") String CodUser,
                        @Param("um_id") String um_id,
                        @Param("um_id0") int um_id0,
                        @Param("um_id1") int um_id1,
                        @Param("um_id2") int um_id2,
                        @Param("um_usrcrea") String um_usrcrea,
                        @Param("um_feccrea") LocalDate um_feccrea,
                        @Param("um_hracrea") LocalTime um_hracrea,
                        @Param("um_usrcact") String um_usrcact,
                        @Param("um_fecact") LocalDate um_fecact,
                        @Param("um_hraact") LocalTime um_hraact);

        @Query(value = "{call SP_PerfilUser( :opcion, :CodUser, :um_id, :um_id0, :um_id1, :um_id2, :um_usrcrea,"
                        + " :um_feccrea, :um_hracrea, :um_usrcact, :um_fecact, :um_hraact)}", nativeQuery = true)
        List<Map<String, Object>> swListarMnu(
                        @Param("opcion") int opcion,
                        @Param("CodUser") String CodUser,
                        @Param("um_id") String um_id,
                        @Param("um_id0") int um_id0,
                        @Param("um_id1") int um_id1,
                        @Param("um_id2") int um_id2,
                        @Param("um_usrcrea") String um_usrcrea,
                        @Param("um_feccrea") LocalDate um_feccrea,
                        @Param("um_hracrea") LocalTime um_hracrea,
                        @Param("um_usrcact") String um_usrcact,
                        @Param("um_fecact") LocalDate um_fecact,
                        @Param("um_hraact") LocalTime um_hraact);

        @Query(value = "{call SP_PerfilUser( :opcion, :CodUser, :um_id, :um_id0, :um_id1, :um_id2, :um_usrcrea,"
                        + " :um_feccrea, :um_hracrea, :um_usrcact, :um_fecact, :um_hraact)}", nativeQuery = true)
        @Modifying
        @Transactional
        void swGrabarUsrMnu(
                        @Param("opcion") int opcion,
                        @Param("CodUser") String CodUser,
                        @Param("um_id") String um_id,
                        @Param("um_id0") int um_id0,
                        @Param("um_id1") int um_id1,
                        @Param("um_id2") int um_id2,
                        @Param("um_usrcrea") String um_usrcrea,
                        @Param("um_feccrea") LocalDate um_feccrea,
                        @Param("um_hracrea") LocalTime um_hracrea,
                        @Param("um_usrcact") String um_usrcact,
                        @Param("um_fecact") LocalDate um_fecact,
                        @Param("um_hraact") LocalTime um_hraact);

        @Query(value = "{call SP_PerfilUser( :opcion, :CodUser, :um_id, :um_id0, :um_id1, :um_id2, :um_usrcrea,"
                        + " :um_feccrea, :um_hracrea, :um_usrcact, :um_fecact, :um_hraact)}", nativeQuery = true)
        List<lcoumnu> listarUmnu(
                        @Param("opcion") int opcion,
                        @Param("CodUser") String CodUser,
                        @Param("um_id") String um_id,
                        @Param("um_id0") int um_id0,
                        @Param("um_id1") int um_id1,
                        @Param("um_id2") int um_id2,
                        @Param("um_usrcrea") String um_usrcrea,
                        @Param("um_feccrea") LocalDate um_feccrea,
                        @Param("um_hracrea") LocalTime um_hracrea,
                        @Param("um_usrcact") String um_usrcact,
                        @Param("um_fecact") LocalDate um_fecact,
                        @Param("um_hraact") LocalTime um_hraact);

        @Query(value = "{call SP_PerfilUser( :opcion, :CodUser, :um_id, :um_id0, :um_id1, :um_id2, :um_usrcrea,"
                        + " :um_feccrea, :um_hracrea, :um_usrcact, :um_fecact, :um_hraact)}", nativeQuery = true)
        @Modifying
        @Transactional
        void swLimpiarUsrMnu(
                        @Param("opcion") int opcion,
                        @Param("CodUser") String CodUser,
                        @Param("um_id") String um_id,
                        @Param("um_id0") int um_id0,
                        @Param("um_id1") int um_id1,
                        @Param("um_id2") int um_id2,
                        @Param("um_usrcrea") String um_usrcrea,
                        @Param("um_feccrea") LocalDate um_feccrea,
                        @Param("um_hracrea") LocalTime um_hracrea,
                        @Param("um_usrcact") String um_usrcact,
                        @Param("um_fecact") LocalDate um_fecact,
                        @Param("um_hraact") LocalTime um_hraact);
}