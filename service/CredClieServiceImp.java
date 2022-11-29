package com.empresa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.credcliedb;
import com.empresa.repository.CredClieRepository;

@Transactional
@Service("credclieService")
public class CredClieServiceImp implements CredClieService {

    @Autowired
    CredClieRepository credclierepository;
    
    @Override
    public List<credcliedb> findAllCredClie(String _CodCli, String _CodUser){
        return credclierepository.findAllCredClie(_CodCli, _CodUser);
    }
}
