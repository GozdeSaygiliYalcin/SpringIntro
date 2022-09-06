package com.bilgeadam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FactoryBuilder implements Factory {

    private IProvider provider;
    private IPrinter printer;

    private static FactoryBuilder instance;

    private Properties properties;

    public static  FactoryBuilder getInstance() {
        return instance;
    }
    {
        properties = new Properties();
        try{
            properties.load(new FileInputStream("/Users/gozde/spring-workspace/SpringDI_Sample/Di005Five/application.properties"));
            String printerClass = properties.getProperty("printer");
            String providerClass = properties.getProperty("provider");
            provider = (IProvider) Class.forName(providerClass).newInstance();
            printer = (IPrinter) Class.forName(printerClass).newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public IProvider getProvider() {
        return provider;
    }

    @Override
    public IPrinter getPrinter() {
        return printer;
    }
}
