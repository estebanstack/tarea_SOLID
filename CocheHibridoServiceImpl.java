package com.example.demo.services;

import com.example.demo.models.Coche;
import com.example.demo.models.CocheCombustion;
import com.example.demo.models.CocheHibrido;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CocheHibridoServiceImpl implements CocheHibridoService{


    @Override
    public List<CocheHibrido> getAll() {
        return cochesHibridos;
    }

    @Override
    public void add(CocheHibrido cocheH) {
        cochesHibridos.add(cocheH);
    }




}
