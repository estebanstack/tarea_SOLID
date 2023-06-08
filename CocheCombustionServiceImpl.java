package com.example.demo.services;

import com.example.demo.models.Coche;
import com.example.demo.models.CocheCombustion;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public class CocheCombustionServiceImpl implements CocheCombustionService {

    @Override
    public List<CocheCombustion> getAll() {
        return cochesCombustion;
    }

    @Override
    public void add(CocheCombustion cocheC) {
        cochesCombustion.add(cocheC);
    }


}
