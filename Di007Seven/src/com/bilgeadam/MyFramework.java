package com.bilgeadam;

import java.lang.reflect.InvocationTargetException;

public class MyFramework {
    private IProvider provider;
    private IPrinter printer;
    private IRepository repository;
    public MyFramework(){}

    public Object getObjectInstance(String ClassNameOne, String ClassNameTwo){
        Object objectOne = null;
        Object objectTwo = null;
        try{
            objectOne =  Class.forName(ClassNameOne).getDeclaredConstructor().newInstance();
            objectTwo  =  Class.forName(ClassNameTwo).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.println("Opps birşeyler ters gitti....: "+ e.getMessage());
            throw new RuntimeException(e);
        }
        if(objectOne instanceof IProvider)
            provider = (IProvider) objectOne;
        if(objectTwo instanceof IPrinter)
            printer = (IPrinter) objectTwo;
        if(objectOne instanceof IRepository)
            repository = (IRepository) objectOne;
        printer.setProvider(provider);

        //repository.getPrinter(printer);
        return printer;
    }
}