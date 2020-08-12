package com.factory;

import com.factory.model.*;

/**
 * The Factory will create the Object corresponding to the parameter passed TYPE
 */
public class SoldierFactory {

    public static Soldier createSoldier(String type){

        switch (type){

            case "Cavalier":
                return new Cavalier();

            case "Infantryman":
                return new Infantryman();

            case "Gunner":
                return new Gunner();

            default:
                return null;
        }
    }
}
