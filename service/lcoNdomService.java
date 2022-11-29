package com.empresa.service;

import java.util.List;

import com.empresa.entity.lcoNdom;

public interface lcoNdomService {
	
	public abstract List<lcoNdom> listarTodo(int opcion, String p_ciacont,String año,lcoNdom obj);

	public void registrar (int opcion, String p_ciacont,String año,lcoNdom obj);
}
