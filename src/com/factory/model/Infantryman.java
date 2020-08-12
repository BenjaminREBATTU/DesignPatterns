package com.factory.model;

public class Infantryman extends Soldier{

    public Infantryman(){
        attack();
    }

    @Override
    public String attack() {
        return "Le soldat d'Infantrie tire avec son fusil d'assaut !";
    }
}
