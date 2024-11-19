package com.igorpetrovcm.neohomework;

public abstract class CoffeeFactory {
    public void cupOfCoffee(){
        Coffee coffee = makeCoffee();

        System.out.println(coffee.toString());
    }

    protected abstract Coffee makeCoffee();
}
