package com.example.demo.services;

import com.example.demo.models.Coche;
import com.example.demo.models.CocheElectrico;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CocheElectricoServiceImpl implements CocheElectricoService {

    @Override
    public List<CocheElectrico> getAll() {
        return cochesElectricos;
    }

    @Override
    public void add(CocheElectrico cocheE) {
        cochesElectricos.add(cocheE);
    }


}
