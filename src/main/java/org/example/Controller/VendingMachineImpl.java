package org.example.Controller;

import org.example.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl<T extends Product> implements VendingMachine{
    List<Product> listProduct = new ArrayList<>();


    @Override
    public void initProduct(List<Product> list) {
        this.listProduct = list;
    }

    public Product getProduct(String name) {
        for (Product p : listProduct) {
            if(p.getName().contains(name)){
                return p;
            }
        }
        return new Product("такого продукта нет", 0);
    }
}
