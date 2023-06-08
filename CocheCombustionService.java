package com.example.demo.services;

import com.example.demo.models.Coche;
import com.example.demo.models.CocheCombustion;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public interface CocheCombustionService  {

    ArrayList<CocheCombustion> cochesCombustion = new ArrayList<>();

     List<CocheCombustion> getAll() ;

    void add(CocheCombustion cocheC) ;


}
