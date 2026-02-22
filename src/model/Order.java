package model;

import java.util.List;

public class Order {

    private String id;
    private Patient patient;
    private Employee doctor;
    private List<OrderItem> items;

    public Order(String id, Patient patient, Employee doctor, List<OrderItem> items) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public Employee getDoctor() {
        return doctor;
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
