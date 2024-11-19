package com.igorpetrovcm.neohomework;

public class EspressoFactory extends CoffeeFactory{
    @Override
    protected Coffee makeCoffee(){
        return new Espresso("espresso");
    }
}
