package com.bilgeadam;

public interface Factory {
    IProvider getProvider();
    IPrinter getPrinter();
}
