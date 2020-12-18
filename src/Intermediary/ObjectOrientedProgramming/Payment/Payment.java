package Intermediary.ObjectOrientedProgramming.Payment;

import Intermediary.ObjectOrientedProgramming.Order.Order;

public interface Payment {
    void PayByCash(Order order);
    void PayByCreditCard(Order order);
}
