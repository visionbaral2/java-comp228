package Assignmnet3.Exercise1;

public class Health extends Insurance {

    // Constructor
    public Health() {
        super("Health Insurance");
    }

    // Implement setInsuranceCost method
    @Override
    public void setInsuranceCost(double cost) {
        this.monthlyCost = cost;
    }

    // Implement displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("Insurance Type: " + getInsuranceType());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}