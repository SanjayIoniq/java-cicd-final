package com.demo;

public class App {
    public static double calculatePrice(double price) {
        double discount = price * 0.1;   // 10% discount
        double tax = price * 0.05;       // 5% tax
        return price - discount + tax;
    }

    public static void main(String[] args) {
        double finalPrice = calculatePrice(1000);
        System.out.println("Final Price: " + finalPrice);
    }
}