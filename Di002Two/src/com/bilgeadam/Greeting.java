package com.bilgeadam;
//
public class Greeting {
    public static void main(String[] args) {

        Print print = new Print();
        print.getMessage(MessageType.ERROR);
        print.getMessage(MessageType.STANDART);
    }
}
