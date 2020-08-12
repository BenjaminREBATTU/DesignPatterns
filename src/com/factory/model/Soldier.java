package com.factory.model;

public abstract class Soldier {

    public abstract String attack();

    @Override
    public String toString(){
        return attack();
    }
}
