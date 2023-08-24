package org.example.Model;

public class Coffee extends Product{

    private float temperature;

    public Coffee(String name, float price, float temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }

}
