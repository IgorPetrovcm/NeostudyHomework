package com.igorpetrovcm.neohomework;

public class Cafe {

    public void cupOfCoffee(CoffeeType coffeeType){
        Coffee coffee = CoffeeFactory.pickCoffee(coffeeType);

        makeCoffee(coffee);

        System.out.println(coffee.toString());
    }

    private void makeCoffee(Coffee coffee){
        System.out.println("Make a " + coffee.getName());
    }
}
