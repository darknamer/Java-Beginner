package Intermediary.ObjectOrientedProgramming.Payment;

import Intermediary.ObjectOrientedProgramming.Order.Order;

public class KBankPayment extends BasePayment implements Payment {
    @Override
    public void PayByCreditCard(Order order) {
        super.PayByCreditCard(order);
    }
}
