package org.example;
import org.example.Controller.VendingMachineImpl;
import org.example.Model.Coffee;
import org.example.Model.Product;
import org.example.Model.Water;
import org.example.View.UserView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserView userView = new UserView();

        List<Product> productList = new ArrayList<>(Arrays.asList(
                new Water("кола", 23, true),
                new Water("пепси", 23, true),
                new Water("миниралка", 19, false),
                new Coffee("нескафе", 35, 60),
                new Coffee("джакобс", 40, 80)));

        userView.UserInitProduct(productList);
        System.out.println(userView.UserGetProduct("нескафе"));

    }
}