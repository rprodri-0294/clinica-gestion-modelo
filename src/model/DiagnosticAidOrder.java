package model;

public class DiagnosticAidOrder extends OrderItem {

    private int quantity;
    private boolean requiresSpecialist;

    public DiagnosticAidOrder(int itemNumber, String name, double cost,
                              int quantity, boolean requiresSpecialist) {

        super(itemNumber, name, cost);
        this.quantity = quantity;
        this.requiresSpecialist = requiresSpecialist;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isRequiresSpecialist() {
        return requiresSpecialist;
    }
}
