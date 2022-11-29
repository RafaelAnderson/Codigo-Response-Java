package com.empresa.service;

import java.util.List;

import com.empresa.entity.detraccion;

public interface detraccionService {
    public List<detraccion> listarTASD(int opcion, String cia, detraccion obj);

    void creaTASD(int opcion, String cia, detraccion obj);
    void actuTASD(int opcion, String cia, detraccion obj);
    void eliminaTASD(int opcion, String cia, detraccion obj);
}
