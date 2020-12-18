package Intermediary.ObjectOrientedProgramming.Order;


public class Order extends AbstractOrder {
    @Override
    public void showProduct() {
        super.showProduct();

        System.out.println("-------------------------------------------------");
        System.out.println("Total amount of product: " + products.size());
    }
}
