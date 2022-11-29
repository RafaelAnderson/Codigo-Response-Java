package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.detraccion;
import com.empresa.entity.detraccionPK;

@Repository
public interface detraccionRepository extends JpaRepository<detraccion, detraccionPK>{
    @Query(value = "{call SP_Lcotasd(:opcion, :cia, :tipope, :codbser, :td_dsctasa, :td_tasa, :td_valref1, :td_valref2, :td_flabas, :td_usrcrea, :td_feccrea, :td_hracrea, :td_usract, :td_fecact, :td_hraact)}"
    , nativeQuery = true)
    List<detraccion> listarTASD(
        @Param("opcion") int opcion,
        @Param("cia") String cia,
        @Param("tipope") String tipope,
        @Param("codbser") String codbser,
        @Param("td_dsctasa") String td_dsctasa,
        @Param("td_tasa") Double td_tasa,
        @Param("td_valref1") Double td_valref1,
        @Param("td_valref2") Double td_valref2,
        @Param("td_flabas") String td_flabas,
        @Param("td_usrcrea") String td_usrcrea,
        @Param("td_feccrea") LocalDate td_feccrea,
        @Param("td_hracrea") LocalTime td_hracrea,
        @Param("td_usract") String td_usract,
        @Param("td_fecact") LocalDate td_fecact,
        @Param("td_hraact") LocalTime td_hraact
    );

    @Query(value = "{call SP_Lcotasd(:opcion, :cia, :tipope, :codbser, :td_dsctasa, :td_tasa, :td_valref1, :td_valref2, :td_flabas, :td_usrcrea, :td_feccrea, :td_hracrea, :td_usract, :td_fecact, :td_hraact)}"
    , nativeQuery = true)
    @Transactional
    @Modifying
    void creaTASD(        
    @Param("opcion") int opcion,
    @Param("cia") String cia,
    @Param("tipope") String tipope,
    @Param("codbser") String codbser,
    @Param("td_dsctasa") String td_dsctasa,
    @Param("td_tasa") Double td_tasa,
    @Param("td_valref1") Double td_valref1,
    @Param("td_valref2") Double td_valref2,
    @Param("td_flabas") String td_flabas,
    @Param("td_usrcrea") String td_usrcrea,
    @Param("td_feccrea") LocalDate td_feccrea,
    @Param("td_hracrea") LocalTime td_hracrea,
    @Param("td_usract") String td_usract,
    @Param("td_fecact") LocalDate td_fecact,
    @Param("td_hraact") LocalTime td_hraact
    );

    @Query(value = "{call SP_Lcotasd(:opcion, :cia, :tipope, :codbser, :td_dsctasa, :td_tasa, :td_valref1, :td_valref2, :td_flabas, :td_usrcrea, :td_feccrea, :td_hracrea, :td_usract, :td_fecact, :td_hraact)}"
    , nativeQuery = true)
    @Transactional
    @Modifying
    void actuTASD(        
    @Param("opcion") int opcion,
    @Param("cia") String cia,
    @Param("tipope") String tipope,
    @Param("codbser") String codbser,
    @Param("td_dsctasa") String td_dsctasa,
    @Param("td_tasa") Double td_tasa,
    @Param("td_valref1") Double td_valref1,
    @Param("td_valref2") Double td_valref2,
    @Param("td_flabas") String td_flabas,
    @Param("td_usrcrea") String td_usrcrea,
    @Param("td_feccrea") LocalDate td_feccrea,
    @Param("td_hracrea") LocalTime td_hracrea,
    @Param("td_usract") String td_usract,
    @Param("td_fecact") LocalDate td_fecact,
    @Param("td_hraact") LocalTime td_hraact
    );

    @Query(value = "{call SP_Lcotasd(:opcion, :cia, :tipope, :codbser, :td_dsctasa, :td_tasa, :td_valref1, :td_valref2, :td_flabas, :td_usrcrea, :td_feccrea, :td_hracrea, :td_usract, :td_fecact, :td_hraact)}"
    , nativeQuery = true)
    @Transactional
    @Modifying
    void eliminaTASD(        
    @Param("opcion") int opcion,
    @Param("cia") String cia,
    @Param("tipope") String tipope,
    @Param("codbser") String codbser,
    @Param("td_dsctasa") String td_dsctasa,
    @Param("td_tasa") Double td_tasa,
    @Param("td_valref1") Double td_valref1,
    @Param("td_valref2") Double td_valref2,
    @Param("td_flabas") String td_flabas,
    @Param("td_usrcrea") String td_usrcrea,
    @Param("td_feccrea") LocalDate td_feccrea,
    @Param("td_hracrea") LocalTime td_hracrea,
    @Param("td_usract") String td_usract,
    @Param("td_fecact") LocalDate td_fecact,
    @Param("td_hraact") LocalTime td_hraact
    );
}

