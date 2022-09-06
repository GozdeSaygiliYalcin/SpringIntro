package com.bilgeadam;

public class App {
    public static void main(String[] args) {
        MyFramework myFramework = new MyFramework();
        IProvider provider = (IProvider) myFramework.getObjectInstance("com.bilgeadam.MessageProviderTR");
        IPrinter printer = (IPrinter) myFramework.getObjectInstance("com.bilgeadam.StandardPrinter");
        printer.setProvider(provider);
        printer.print();
    }
}
