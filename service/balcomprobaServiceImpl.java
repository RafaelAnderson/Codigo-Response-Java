

package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.repository.balcomprobaRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class balcomprobaServiceImpl implements balcomprobaService{
    @Autowired
    balcomprobaRepository repositoryBalanceComprobacion;

    @Override
    public List<Map<String, Object[]>> swBalComp(int opcion, String Cia, String ejercicio, String PER, String Nd,String pCta,String tipRep) {
        // TODO Auto-generated method stub
            return repositoryBalanceComprobacion.swBalComp(opcion,Cia,ejercicio,PER,Nd,pCta,tipRep);
        
    }

   
}

