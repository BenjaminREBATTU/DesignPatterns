package com.factory;

public class Client {

    public static void runFactory(){
        System.out.println(SoldierFactory.createSoldier("Infantryman").toString());
        System.out.println(SoldierFactory.createSoldier("Gunner").toString());
        System.out.println(SoldierFactory.createSoldier("Cavalier").toString());
    }
}
