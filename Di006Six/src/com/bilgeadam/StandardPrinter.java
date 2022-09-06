package com.bilgeadam;

public class StandardPrinter implements IPrinter {
    private IProvider provider;

    @Override
    public void setProvider(IProvider provider) {
    this.provider = provider;
    }

    @Override
    public void print() {
        if(this.provider == null)
            throw new RuntimeException("Provider is null");
        System.out.println(provider.getMessage());
    }
}
