package model;

public class MedicationOrder extends OrderItem {

    private String dose;
    private String duration;

    public MedicationOrder(int itemNumber, String name, double cost,
                           String dose, String duration) {

        super(itemNumber, name, cost);
        this.dose = dose;
        this.duration = duration;
    }

    public String getDose() {
        return dose;
    }

    public String getDuration() {
        return duration;
    }
}
