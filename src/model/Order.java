package model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderNumber;
    private Patient patient;
    private Employee doctor;
    private List<OrderItem> items;

    public Order(int orderNumber, Patient patient, Employee doctor) {
        this.orderNumber = orderNumber;
        this.patient = patient;
        this.doctor = doctor;
        this.items = new ArrayList<>();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Patient getPatient() {
        return patient;
    }

    public Employee getDoctor() {
        return doctor;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getCost();
        }
        return total;
    }
}
