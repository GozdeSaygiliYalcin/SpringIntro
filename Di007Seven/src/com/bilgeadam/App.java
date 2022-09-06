package com.bilgeadam;

public class App {
    public static void main(String[] args) {

        MyFramework myFramework = new MyFramework();
        IPrinter printer = (IPrinter) myFramework
                .getObjectInstance("bilgeadam.MessageProviderEN",
                        "bilgeadam.StandartPrinter");
        printer.print();
    }



}
