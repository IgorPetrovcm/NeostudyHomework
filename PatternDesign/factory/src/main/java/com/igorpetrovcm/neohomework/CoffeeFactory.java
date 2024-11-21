package com.igorpetrovcm.neohomework;

public class CoffeeFactory {
    public static Coffee pickCoffee(CoffeeType coffeeType){
        Coffee coffee;

        switch (coffeeType){
            case ESPRESSO: coffee = new Espresso();
            break;
            case AMERICANO: coffee = new Americano();
            break;
            default: throw new IllegalArgumentException();
        }

        return coffee;
    }
}
