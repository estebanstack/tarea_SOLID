package com.example.demo.services;

import com.example.demo.models.Coche;
import com.example.demo.models.CocheCombustion;
import com.example.demo.models.CocheElectrico;
import com.example.demo.models.CocheHibrido;

public class CochesFacade {
    private CochesFacade() {}

    public static Coche CrearCocheMotor(){

        return new CocheCombustion("Ford", "Mustang", 2020, 2,true, "Boss",
                400,"4000cc" );
    }
    public static Coche CrearCocheElectrico(){
        return new CocheElectrico("Renault", "Spark", 2019, 4, true,
                "Mack", 2000 );
    }
    public static Coche CrearCocheHibrido(){
        CocheHibrido cocheh = new CocheHibrido("Toyota", "Corolla", 2018, 4, false, "Mack",
                true);;
        return cocheh;
    }
}
