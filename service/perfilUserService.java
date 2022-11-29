package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoumnu;

public interface perfilUserService {
    
    public abstract List<Map<String, Object>> swListarMnuSel(int opcion, lcoumnu obj);

    public abstract List<Map<String, Object>> swListarMnu(int opcion, lcoumnu obj);
    
    public abstract List<lcoumnu> listarUmnu(int opcion, lcoumnu obj);

    void swGrabarUsrMnu(int opcion, lcoumnu obj);
    
    void swLimpiarUsrMnu(int opcion, lcoumnu obj);
}