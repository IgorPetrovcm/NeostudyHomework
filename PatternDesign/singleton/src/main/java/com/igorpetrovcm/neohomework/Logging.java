package com.igorpetrovcm.neohomework;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Прочитав про Double-checking locking и volatile здесь: https://habr.com/ru/companies/pvs-studio/articles/819625/
 * поменял реализации
 */

public class Logging {
    private static Logging logging;

    private static DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("HH:mm:ss");

    private Logging(){

    }

    public static synchronized Logging getInstance(){
        if (logging == null){
            logging = new Logging();
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
