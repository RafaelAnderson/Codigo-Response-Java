package com.empresa.service;

import com.empresa.entity.lcobanc;

import java.util.List;
import java.util.Map;

public interface lcobancService {

    public abstract List<Map<String,Object[]>> listarBco(int opcion, String p_ciacont, lcobanc obj);
    
    public abstract List<Map<String, Object[]>> listarCaj(int opcion, String p_ciacont, lcobanc obj);
    
    public abstract List<lcobanc> listarCajUnica(int opcion, String p_ciacont, lcobanc obj);
    
    public abstract List<lcobanc> listarBcoUnica(int opcion, String p_ciacont, lcobanc obj);
    
    //Registrar banco o caja
    void registrarBco(int opcion, String p_ciacont, lcobanc obj);
    
    //Editar banco o caja
    void actualizarBco(int opcion, String p_ciacont, lcobanc obj);
    
    //Eliminar caja o banco
    void eliminarBco(int opcion, String p_ciacont, lcobanc obj);
    

    // Modificar correlación de chequera
    void modificarChequera(int opcion, String cia, String codigo, String nro_chequera, String cheque);
}

