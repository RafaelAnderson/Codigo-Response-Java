package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.repository.rptBalanceSaldoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class rptBalanceSaldoServiceImpl implements rptBalanceSaldoService{
    @Autowired
    rptBalanceSaldoRepository repositoryBalanceSaldo;

    @Override
    public List<Map<String, Object[]>> swBalSaldo(String Cia, String ejercicio, String PER, String N) {
        // TODO Auto-generated method stub
            return repositoryBalanceSaldo.swBalSaldo(Cia,ejercicio,PER,N);
        
    }

   
}
