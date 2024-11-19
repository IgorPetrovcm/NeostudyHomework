package com.igorpetrovcm.neohomework;

import java.lang.reflect.Proxy;

public class App
{
    private static final NeoDBClient client = new NeoDBClient("mydb");

    public static void main( String[] args ){
        DBClient proxyClient = (DBClient) Proxy.newProxyInstance(
                client.getClass().getClassLoader(),
                client.getClass().getInterfaces(),
                new ProxyDBClient(client)
        );

        System.out.println(proxyClient.connect());
    }
}
