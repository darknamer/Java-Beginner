package Intermediary.ObjectOrientedProgramming;

import Intermediary.ObjectOrientedProgramming.Order.AbstractOrder;
import Intermediary.ObjectOrientedProgramming.Order.Order;
import Intermediary.ObjectOrientedProgramming.Payment.KBankPayment;
import Intermediary.ObjectOrientedProgramming.Products.Product;

public class StoreConsole {
    public static void main(String[] args) {
        Order order = new Order();

        Product productA = new Product("Product A", 100, 1);
        Product productB = new Product("Product B", 300, 5);
        Product productC = new Product("Product C", 250, 3);
        Product productD = new Product("Product D", 700, 6);
        Product productE = new Product("Product E", 500, 9);

        order.addProduct(productA);
        order.addProduct(productB);
        order.addProduct(productC);
        order.addProduct(productD);
        order.addProduct(productE);

        order.showProduct();

        System.out.println("-------------------------------------------------");
        System.out.println("Total price: " + order.calculateTotalPrice());
        System.out.println("-------------------------------------------------");

        KBankPayment kBankPayment = new KBankPayment();
        kBankPayment.PayByCash(order);
    }
}
