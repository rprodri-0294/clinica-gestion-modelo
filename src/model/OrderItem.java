package model;

public abstract class OrderItem {

    protected int itemNumber;
    protected String name;
    protected double cost;

    public OrderItem(int itemNumber, String name, double cost) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.cost = cost;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
