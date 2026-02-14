package model;

public class ProcedureOrder extends OrderItem {

    private int quantity;
    private String frequency;
    private boolean requiresSpecialist;

    public ProcedureOrder(int itemNumber, String name, double cost,
                          int quantity, String frequency,
                          boolean requiresSpecialist) {

        super(itemNumber, name, cost);
        this.quantity = quantity;
        this.frequency = frequency;
        this.requiresSpecialist = requiresSpecialist;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getFrequency() {
        return frequency;
    }

    public boolean isRequiresSpecialist() {
        return requiresSpecialist;
    }
}
