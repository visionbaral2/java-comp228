package Assignmnet3.Mortgage;

public class BusinessMortgage extends Mortgage {

    // Constructor that sets the interest rate to 1% over the current prime rate
    public BusinessMortgage(String mortgageNumber, String customerName, double amount, double primeInterestRate, int term) {
        super(mortgageNumber, customerName, amount, primeInterestRate + 1, term);
    }

    @Override
    public String getMortgageInfo() {
        return "Business Mortgage:\n" +
                "Mortgage Number: " + mortgageNumber + "\n" +
                "Customer Name: " + customerName + "\n" +
                "Amount: $" + amount + "\n" +
                "Interest Rate: " + interestRate + "%\n" +
                "Term: " + term + " year(s)\n" +
                "Total Amount Owed: $" + calculateTotalAmountOwed();
    }
}
