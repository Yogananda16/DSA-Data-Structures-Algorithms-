package Java.Collections;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> cart = new ArrayList<>();

        cart.add("Milk");
        cart.add("Bread");
        cart.add("Eggs");
        cart.add("Rice");
        System.out.println("Cart: " + cart);

        cart.remove("Eggs");
        if (cart.contains("Eggs")) {
            System.out.println("Eggs in cart? true");
        } else {
            System.out.println("Eggs in cart? false");
        }
        System.out.println("Numbers of items left:" + cart);

    }
}