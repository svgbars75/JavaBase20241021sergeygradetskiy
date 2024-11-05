package com.gmail.gradetskiy.homework3;

public class OrderOnline {
    public static void main(String[] args) {
        byte order = 1;
        String product = "smartphone";
        float price = 305.99f;
        short address = 10;
        System.out.println("Order № " + order + " Client: Alice.");
        System.out.println("Product: " + product + ",");
        System.out.println("price EUR " + price + ".");
        System.out.println("Address: Moon Street, " + address + ".");
        order = 2;
        product = "laptop";
        price = 570.95f;
        address = 17;
        System.out.println("Order № " + order + " Client: Tom.");
        System.out.println("Product: " + product + ",");
        System.out.println("price EUR " + price + ".");
        System.out.println("Address: Terra Street, " + address + ".");

    }
}

