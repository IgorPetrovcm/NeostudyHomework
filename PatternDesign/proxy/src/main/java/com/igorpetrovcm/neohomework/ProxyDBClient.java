package com.igorpetrovcm.neohomework;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@AllArgsConstructor
public class ProxyDBClient implements InvocationHandler{
    private final DBClient client;
    private static String urlPathToHost = "localhost:5432";

    @Override
    public Object invoke(Object proxy, Method method, Object[] args){
        String dbName = new String();

        try {
            dbName = (String)method.invoke(client, args);
        }
        catch (Exception ex){
            ex.printStackTrace(System.err);
        }

        return urlPathToHost + "/" + dbName;
    }
}
