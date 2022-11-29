package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.repository.reportGypRepository;

@Service
public class reportGypServiceImpl implements reportGypService {

    @Autowired
    private reportGypRepository repository;

    @Override
    public List<Map<String, Object>> swReporte_GyP(String xcia, String xejer, int xmodelo, String xfecsaldo,
            String xcodrbr) {
        return repository.swReporte_GyP(xcia, xejer, xmodelo, xfecsaldo, xcodrbr);
    }
}