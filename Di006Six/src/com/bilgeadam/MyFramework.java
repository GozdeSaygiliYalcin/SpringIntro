package com.bilgeadam;

public class MyFramework {
    public MyFramework() {

    }
    public Object getObjectInstance(String className) {
        try {
            return Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
