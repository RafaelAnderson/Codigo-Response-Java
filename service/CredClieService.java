package com.empresa.service;

import java.util.List;

import com.empresa.entity.credcliedb;

public interface CredClieService {

    public List<credcliedb> findAllCredClie(String _CodCli, String _CodUser);
}
