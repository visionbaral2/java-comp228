package Assignmnet3.Exercise2;

import java.util.Scanner;

public class GameTesterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter game tester's name: ");
        String name = scanner.nextLine();

        System.out.print("Is the game tester full-time? (yes/no): ");
        String isFullTimeResponse = scanner.nextLine().toLowerCase();

        GameTester tester;

        // Check if full-time or part-time and create the appropriate object
        if (isFullTimeResponse.equals("yes")) {
            tester = new FullTimeGameTester(name);
        } else {
            System.out.print("Enter the number of hours worked: ");
            int hoursWorked = scanner.nextInt();
            tester = new PartTimeGameTester(name, hoursWorked);
        }

        // Display the tester's details and salary
        System.out.println("\n--- Game Tester Information ---");
        if (tester instanceof FullTimeGameTester) {
            ((FullTimeGameTester) tester).displayInfo();
        } else if (tester instanceof PartTimeGameTester) {
            ((PartTimeGameTester) tester).displayInfo();
        }

        scanner.close();
    }
}
