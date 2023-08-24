package org.example.Model;

public class Product <T>{
    protected String name;
    protected float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Напиток " + name + " " + "цена " + price;
    }
}
