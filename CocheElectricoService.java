package com.example.demo.services;

import com.example.demo.models.Coche;
import com.example.demo.models.CocheCombustion;
import com.example.demo.models.CocheElectrico;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface CocheElectricoService  {
     ArrayList<CocheElectrico> cochesElectricos = new ArrayList<>();

     List<CocheElectrico> getAll();



     void add(CocheElectrico cocheE);
}
