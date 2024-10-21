package Assignmnet3.Mortgage;

import java.util.Scanner;

public class ProcessMortgage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mortgage[] mortgages = new Mortgage[3]; // Array to store 3 mortgages

        System.out.print("Enter the current prime interest rate: ");
        double primeInterestRate = scanner.nextDouble();
        scanner.nextLine(); // Clear the newline

        // Loop to gather mortgage data
        for (int i = 0; i < mortgages.length; i++) {
            System.out.println("\nEnter details for Mortgage #" + (i + 1));

            System.out.print("Enter mortgage number: ");
            String mortgageNumber = scanner.nextLine();

            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter mortgage amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter mortgage term (1 for Short-term, 3 for Medium-term, 5 for Long-term): ");
            int term = scanner.nextInt();

            System.out.print("Is this a business mortgage (yes/no)? ");
            scanner.nextLine();  // Clear the newline
            String mortgageType = scanner.nextLine().toLowerCase();

            // Create the appropriate mortgage object
            if (mortgageType.equals("yes")) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, amount, primeInterestRate, term);
            } else {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, amount, primeInterestRate, term);
            }
        }

        // Display all mortgages
        System.out.println("\n--- Mortgage Details ---");
        for (Mortgage mortgage : mortgages) {
            System.out.println(mortgage.getMortgageInfo());
            System.out.println();  // Add a blank line between mortgages
        }

        scanner.close();
    }
}
