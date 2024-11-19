package com.igorpetrovcm.neohomework;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Logging {
    private static Logging logging;

    private static DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("HH:mm:ss");

    public Logging(){

    }

    public static Logging getInstance(){
        if (logging == null){
            synchronized (Logging.class){
                if (logging == null){
                    logging = new Logging();
                }
            }
        }

        return logging;
    }

    public void classInfo(Object obj, String info){
        System.out.printf("Log info: %s - %s - %s\n",
                LocalTime.now()
                        .format(formatter)
                        .toString(),
                obj.toString(),
                info);
    }
}
