package com.bilgeadam;

public class App {
    public static void main(String[] args) {
        ErrorPrinter errorPrinter = new ErrorPrinter();
        StandardPrinter standardPrinter = new StandardPrinter();
        MessageProviderEN messageProviderEN = new MessageProviderEN();
        MessageProviderTR messageProviderTR = new MessageProviderTR();

        errorPrinter.setProvider(messageProviderEN);
        errorPrinter.print();
        standardPrinter.setProvider(messageProviderEN);
        standardPrinter.print();

        standardPrinter.setProvider(messageProviderTR);
        standardPrinter.print();
        errorPrinter.setProvider(messageProviderTR);
        errorPrinter.print();

    }
}
