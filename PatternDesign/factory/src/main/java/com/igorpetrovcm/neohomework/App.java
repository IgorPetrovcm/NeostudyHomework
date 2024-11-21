package com.igorpetrovcm.neohomework;

public class App
{
    public static void main( String[] args ){
        Cafe cafe = new Cafe();

        cafe.cupOfCoffee(CoffeeType.AMERICANO);
        cafe.cupOfCoffee(CoffeeType.ESPRESSO);
    }
}
