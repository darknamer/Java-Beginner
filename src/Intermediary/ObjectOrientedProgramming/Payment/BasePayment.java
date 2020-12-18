package Intermediary.ObjectOrientedProgramming.Payment;

import Intermediary.ObjectOrientedProgramming.Order.Order;

import java.util.Scanner;

public class BasePayment implements Payment{
    @Override
    public void PayByCash(Order order) {
        int totalPrice = order.calculateTotalPrice();
        System.out.println("Total price is " + totalPrice);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much is you pay?");
        int price = scanner.nextInt();

        while (price < totalPrice) {
            System.out.println("Try again.");
            price = scanner.nextInt();
        }

        int change = Math.abs(totalPrice - price);
        System.out.println("Your change is " + change);
        System.out.println("Thank you");
    }

    @Override
    public void PayByCreditCard(Order order) {
        System.out.println("Not support.");
    }
}
