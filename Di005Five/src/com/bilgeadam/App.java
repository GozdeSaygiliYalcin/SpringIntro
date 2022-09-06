package com.bilgeadam;

public class App {
    public static void main(String[] args) {

        Factory factory = FactoryBuilder.getInstance();
        IProvider provider = factory.getProvider();
        IPrinter printer = factory.getPrinter();

        printer.setProvider(provider);
        printer.print();

    }
}
