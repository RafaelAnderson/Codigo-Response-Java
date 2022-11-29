package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.repository.loginCiaEjerRepository;

@Service
public class loginCiaEjerServiceImpl implements loginCiaEjerService {

    @Autowired
    loginCiaEjerRepository repository;

    @Override
    public List<Map<String, Object[]>> ListarEjer(int opcion, String _codcia, String _nrodoc){
        return repository.ListarEjer(opcion, _codcia, _nrodoc);
    }
    
    @Override
    public List<Map<String, Object[]>> ListarCias(int opcion, String _coduser, String _idbd){
        return repository.ListarCias(opcion, _coduser, _idbd);
    }
}