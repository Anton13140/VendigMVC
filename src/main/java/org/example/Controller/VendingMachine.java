package org.example.Controller;

import org.example.Model.Product;

import java.util.List;

public interface VendingMachine {

    void initProduct(List<Product> list);
    Product getProduct(String name);

}
