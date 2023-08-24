package org.example.Model;

public class Water extends Product{

    private boolean gas;

    public Water(String name, float price, boolean gas) {
        super(name, price);
        this.gas = gas;
    }

    public boolean isGas() {
        return gas;
    }

    public void setGas(boolean gas) {
        this.gas = gas;
    }
}
