package Intermediary.ObjectOrientedProgramming.Products;

public abstract class AbstractProduct {
    public String Name;
    public int Price;
    public int Amount;

    public AbstractProduct(String name, int price, int amount) {
        Name = name;
        Price = price;
        Amount = amount;
    }

    public int getPrice() {
        return Price * Amount;
    }
}
