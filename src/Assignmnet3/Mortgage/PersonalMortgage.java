package Assignmnet3.Mortgage;

public class PersonalMortgage extends Mortgage {

    // Constructor that sets the interest rate to 2% over the current prime rate
    public PersonalMortgage(String mortgageNumber, String customerName, double amount, double primeInterestRate, int term) {
        super(mortgageNumber, customerName, amount, primeInterestRate + 2, term);
    }

    @Override
    public String getMortgageInfo() {
        return "Personal Mortgage:\n" +
                "Mortgage Number: " + mortgageNumber + "\n" +
                "Customer Name: " + customerName + "\n" +
                "Amount: $" + amount + "\n" +
                "Interest Rate: " + interestRate + "%\n" +
                "Term: " + term + " year(s)\n" +
                "Total Amount Owed: $" + calculateTotalAmountOwed();
    }
}
