
package com.example.demo.services;

import com.example.demo.models.Coche;
import com.example.demo.models.CocheCombustion;
import com.example.demo.models.CocheHibrido;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public interface CocheHibridoService {

      ArrayList<CocheHibrido> cochesHibridos = new ArrayList<>();
     List<CocheHibrido> getAll() ;
     void add(CocheHibrido cocheH) ;



}
