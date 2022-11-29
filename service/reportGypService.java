package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface reportGypService {
    List<Map<String, Object>> swReporte_GyP(String xcia, String xejer, int xmodelo, String xfecsaldo, String xcodrbr);
}
