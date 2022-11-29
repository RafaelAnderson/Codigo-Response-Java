package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoComp;

public interface lcoCompService {
	public List<Map<String,Object>> swValRegCmp(String cia, String ejer, String per,String option);
	public List<Map<String,Object>> swRegCmpTbl(String cia, String ejer, String per,String option);
	public List<Map<String,Object>> swRegCmpPLE(String cia, String ejer, String per,String option);
	public List<Map<String,Object>> Listar_p(String cia, String ejer, String per,String option);
	public List<Map<String,Object>> swLisRecCmp(String cia, String ejer, String per,String option);
	public void swGrabaCompras(String cia, String per, String opcion, lcoComp lcoComp);
}
