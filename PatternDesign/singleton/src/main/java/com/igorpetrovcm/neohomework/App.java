package com.igorpetrovcm.neohomework;

public class App
{
    public static void main( String[] args ){
        Logging logging = Logging.getInstance();

        for (int i = 0; i < 100; i++){
            logging = Logging.getInstance();
            logging.classInfo(App.class, "Case " + i);
        }
    }
}