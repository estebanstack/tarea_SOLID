package com.example.demo.services;

import com.example.demo.models.Coche;
import com.example.demo.models.CocheCombustion;

public class CochesFactory {

    private static final String COCHE_MOTOR = "CocheMotor";
    private static final String COCHE_ELECTRICO = "CocheElectrico";
    private static final String COCHE_HIBRIDO = "CocheHibrido";

    private CochesFactory(){ }

    public static Coche crearPorTipo(String tipo){
       return switch (tipo){
           case COCHE_MOTOR -> CochesFacade.CrearCocheMotor();
            case COCHE_ELECTRICO -> CochesFacade.CrearCocheElectrico();
            case COCHE_HIBRIDO -> CochesFacade.CrearCocheHibrido();
           default -> throw new IllegalStateException("Unexpected value: " + tipo);
       };

    }


}
