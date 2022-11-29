package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcomenu;
import com.empresa.repository.lcomenuRepository;

@Service
public class lcomenuServiceImpl implements lcomenuService {
    @Autowired
    lcomenuRepository repository;


    @Override
    public List<lcomenu> swListarMenu(String puser) {
        return repository.listarMenu(puser);
    }
}
