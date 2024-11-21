package com.igorpetrovcm.neohomework;

public abstract class Coffee {
    private String name;

    public Coffee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "This is " + name;
    }
}
