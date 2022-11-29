package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoUcia;

public interface confiUsuarioService {
public List<Map<String, Object[]>> swListarUsr(int opcion);
public List<Map<String, Object[]>> swListUsrCia(int opcion, lcoUcia obj);
void swLimpiarUsrCia(int opcion, lcoUcia obj);
void swGrabarUsrCia (int opcion, lcoUcia obj);

}
