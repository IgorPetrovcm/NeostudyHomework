package com.igorpetrovcm.neohomework;

public class AmericanoFactory extends CoffeeFactory{
    @Override
    protected Coffee makeCoffee(){
        return new Americano("americano");
    }
}
