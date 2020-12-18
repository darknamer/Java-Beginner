package Intermediary.ObjectOrientedProgramming.Order;

import Intermediary.ObjectOrientedProgramming.Products.AbstractProduct;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractOrder {
    public List<AbstractProduct> products;

    public AbstractOrder() {
        products = new ArrayList<>();
    }

    public void addProduct(AbstractProduct product) {
        products.add(product);
    }

    public int calculateTotalPrice() {
        int price = 0;
        for (AbstractProduct product:  products) {
            price += product.getPrice();
        }
        return price;
    }

    public void showProduct() {
        int row = 1;
        for (AbstractProduct product :
                products) {
            System.out.format("[%d] -------------------------------------------------\n", row);
            System.out.println("Product Name:" + product.Name);
            System.out.println("Product Price:" + product.Price);
            System.out.println("Product Amount:" + product.Amount);
            row++;
        }
    }
}
