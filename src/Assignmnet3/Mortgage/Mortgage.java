package Assignmnet3.Mortgage;

public abstract class Mortgage implements MortgageConstants {
    protected String mortgageNumber;
    protected String customerName;
    protected double amount;
    protected double interestRate;
    protected int term;

    // Constructor
    public Mortgage(String mortgageNumber, String customerName, double amount, double interestRate, int term) {
        if (amount > MAX_MORTGAGE_AMOUNT) {
            System.out.println("Mortgage amount exceeds the maximum limit of $" + MAX_MORTGAGE_AMOUNT + ". Setting to maximum.");
            this.amount = MAX_MORTGAGE_AMOUNT;
        } else {
            this.amount = amount;
        }

        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.interestRate = interestRate;

        // Ensure the term is valid (short, medium, or long term), default to SHORT_TERM if invalid
        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            System.out.println("Invalid mortgage term. Setting to short-term (1 year).");
            this.term = SHORT_TERM;
        } else {
            this.term = term;
        }
    }

    // Abstract method to get mortgage info (to be implemented by subclasses)
    public abstract String getMortgageInfo();

    // Method to calculate the total amount owed
    public double calculateTotalAmountOwed() {
        return amount + (amount * (interestRate / 100) * term);
    }
}
