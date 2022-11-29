package com.empresa.service;


import java.util.Map;
//import org.springframework.stereotype.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.repository.libComNoDomRepository;

import java.util.List;

@Service
public class libroComNoDomServiceImplService implements libroComNoDomService {

    //@Autowired
    libComNoDomRepository repository;

    public libroComNoDomServiceImplService(libComNoDomRepository repository){
        this.repository = repository;
    }
   
    @Override
    public List<Map<String, Object[]>> swLiComNoDom(int opcion, String cia, String ejercicio, String per) {
        System.out.println(repository.swLiComNoDom(opcion, cia, ejercicio, per));
        return repository.swLiComNoDom(opcion, cia, ejercicio, per);
    }
        
    }
