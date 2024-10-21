package Assignmnet3.Exercise1;

import java.util.Scanner;

public class InsuranceTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Insurance[] insurances = new Insurance[2]; // Array to hold insurance objects

        // Loop to gather user input for insurance details
        for (int i = 0; i < insurances.length; i++) {
            System.out.print("Enter insurance type (Health/Life): ");
            String insuranceType = scanner.nextLine().toLowerCase();

            Insurance insurance;

            // Determine insurance type and create the appropriate object
            if (insuranceType.equals("health")) {
                insurance = new Health();
            } else if (insuranceType.equals("life")) {
                insurance = new Life();
            } else {
                System.out.println("Invalid insurance type. Defaulting to Health.");
                insurance = new Health();
            }

            // Prompt user for the monthly cost
            System.out.print("Enter the monthly cost for " + insurance.getInsuranceType() + ": ");
            double cost = scanner.nextDouble();
            scanner.nextLine(); // Clear the newline character

            // Set the insurance cost
            insurance.setInsuranceCost(cost);

            // Store the insurance object in the array
            insurances[i] = insurance;
        }

        // Display information for all insurance objects
        System.out.println("\n--- Insurance Details ---");
        for (Insurance insurance : insurances) {
            insurance.displayInfo();
            System.out.println(); // Print a blank line between insurances
        }

        scanner.close();
    }
}
