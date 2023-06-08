package com.SOLID;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coche cocheM = new CocheMotor("Ford", 2020, true, 2);
        Coche cocheE = new CocheElectrico("Susuki", 2022, false,4);
        System.out.println(cocheE.getTipo());
        Coche cocheH = new CocheHibrido("Toyota", 2023, true, 4);
        System.out.println(cocheH.getTipo());
        Coche coche = new Coche();
        System.out.println(coche.getTipo());

        CochesDB cochesDB = new CochesDBimpl();
        cochesDB.meterCoche(cocheM);
        cochesDB.meterCoche(cocheE);
        cochesDB.meterCoche(cocheH);
        System.out.println(cochesDB.getAll());
        cochesDB.delete(cocheE);



    }
}
