package org.example.View;

import org.example.Controller.VendingMachine;
import org.example.Controller.VendingMachineImpl;
import org.example.Model.Product;

import java.util.List;

public class UserView {
    public VendingMachine vendingMachine = new VendingMachineImpl();

    public void UserInitProduct(List<Product> list){
        vendingMachine.initProduct(list);
    }

    public Product UserGetProduct(String name){
        return vendingMachine.getProduct(name);
    }

}
