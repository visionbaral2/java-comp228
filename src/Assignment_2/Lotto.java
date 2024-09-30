package Assignment_2;

import javax.swing.JOptionPane;
import java.util.Random;

public class Lotto {
    private int[] lottoNumbers = new int[3]; // Array to hold three random integers
    private Random random = new Random();

    public static void main(String[] args) {
        // Prompt the user to input a number between 3 and 27
        String input = JOptionPane.showInputDialog(null, "Enter a number between 3 and 27:");
        int userGuess = Integer.parseInt(input);

        // Create a Lotto object and start the game
        Lotto lotto = new Lotto();
        boolean userWins = false;

        // Allow up to 5 attempts
        for (int i = 0; i < 5; i++) {
            int[] lottoNumbers = lotto.getLottoNumbers(); // Get random lotto numbers
            int sum = 0;

            // Calculate the sum of the lotto numbers
            for (int num : lottoNumbers) {
                sum += num;
            }

            // Display the lotto numbers and the sum
            JOptionPane.showMessageDialog(null, "Lotto numbers: " + lottoNumbers[0] + ", " + lottoNumbers[1] + ", " + lottoNumbers[2] + "\nSum: " + sum);

            // Check if the user’s guess matches the sum
            if (userGuess == sum) {
                JOptionPane.showMessageDialog(null, "Congratulations! You won the game!");
                userWins = true;
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect guess. Try again.");
            }
        }

        // If the user hasn't won in 5 attempts, the computer wins
        if (!userWins) {
            JOptionPane.showMessageDialog(null, "Sorry, the computer wins. Better luck next time!");
        }
    }

    // Constructor that populates the array with random numbers between 1 and 9
    public Lotto() {
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random.nextInt(9) + 1; // Generates numbers between 1 and 9
        }
    }

    // Method to return the lotto numbers and generate new random numbers each time
    public int[] getLottoNumbers() {
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random.nextInt(9) + 1; // Generate new random numbers on each call
        }
        return lottoNumbers;
    }
}

