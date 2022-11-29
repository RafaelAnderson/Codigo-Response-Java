package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.repository.lcoCabVRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CentroCostoDetalladoImpl implements CentroCostoDetalladoService {
    @Autowired
    lcoCabVRepository repositoryCentroCostoDetallado;

    @Override
    public List<Map<String, Object[]>> swRepCst(String _ejer, String _cia,  String periodo_ini, String periodo_fin,
            String _mnd, String codCstIni, String codCstFin, String tpAnx, String cdAnx, String _quie1, String _quie2,
            String _quie3) {
        return repositoryCentroCostoDetallado.swRepCst(_ejer, _cia, periodo_ini,  periodo_fin, _mnd,  codCstIni,  codCstFin,  tpAnx,  cdAnx,  _quie1,  _quie2, _quie3);
    }
    
}
