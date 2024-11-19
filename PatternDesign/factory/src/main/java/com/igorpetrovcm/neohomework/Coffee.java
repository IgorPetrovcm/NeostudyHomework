package com.igorpetrovcm.neohomework;

public class Coffee {
    private String name;

    public Coffee(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "This is " + name;
    }
}
