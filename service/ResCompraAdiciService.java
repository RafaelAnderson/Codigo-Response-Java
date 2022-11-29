package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcocmpa;

public interface ResCompraAdiciService {
    //Lista los detalles de las omisiones y/o rectificaciones para el periodo del registro de compras
    List<Map<String,Object[]>> swListarRecCmp(int opcion, String cia ,String ejercicio,String PER,String SD, String ASIENTO,lcocmpa obj);

     //Lista comprobante solicitado del registro de compras
    List<Map<String,Object[]>> swBscRecCmp  (int opcion, String cia ,String ejercicio,String PER, String SD, String ASIENTO,lcocmpa obj);

    //Lista comprobante solicitado del registro de compras
    List<Map<String,Object[]>> swConRecCmp (int opcion, String cia ,String ejercicio,String PER,String SD,String ASIENTO,lcocmpa obj);

    //Elimina registro de rectificación del registro de compra
   void swEliRecCmp (int opcion, String cia ,String ejercicio,String PER,String SD, String ASIENTO, lcocmpa obj);

    //Permite adicionar nuevos registros en la tabla de rectificaciones del registro de compras
   void swCrearRecCmp(int opcion, String cia ,String ejercicio,String PER,String SD, String ASIENTO, lcocmpa obj);

    //Actualizar una omisión o rectificación para el registro de ventas
    void swActRecCmp(int opcion, String cia ,String ejercicio,String PER, String SD, String ASIENTO, lcocmpa obj);

    //Lista los detalles para el formulario de ayuda de los asientos, para el proceso de omisión o rectificación
    List<Map<String,Object[]>> swListarAyuOmi (int opcion, String cia ,String ejercicio,String PER,String SD,String ASIENTO ,lcocmpa obj);
 //Permite adicionar nuevos registros en la tabla de rectificaciones del registro de compras

}