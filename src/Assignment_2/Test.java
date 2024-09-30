package Assignment_2;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test { // Renamed class to "Test"
    public static void main(String[] args) {
        Test test = new Test();
        test.inputAnswer();
    }

    private String[] questions = {
            "What is the capital of France?",
            "Which programming language is this?",
            "What is the result of 3 + 5?",
            "Which keyword is used to define a class in Java?",
            "Which data type is used to store text in Java?"
    };

    private String[][] options = {
            {"Berlin", "Madrid", "Paris", "Rome"},
            {"Python", "Java", "C#", "Ruby"},
            {"5", "7", "8", "9"},
            {"function", "define", "class", "public"},
            {"int", "String", "double", "boolean"}
    };

    private int[] correctAnswers = {2, 1, 2, 3, 1};  // correct option indexes

    private int correctCount = 0;
    private int incorrectCount = 0;

    private Random random = new Random();

    public void inputAnswer() {
        for (int i = 0; i < questions.length; i++) {
            simulateQuestion(i);
        }
        showResults();
    }

    private void simulateQuestion(int questionIndex) {
        String question = questions[questionIndex];
        String[] questionOptions = options[questionIndex];

        // Create the question string to display
        StringBuilder questionBuilder = new StringBuilder(question + "\n");
        for (int i = 0; i < questionOptions.length; i++) {
            questionBuilder.append((i + 1) + ": " + questionOptions[i] + "\n");
        }

        // Input answer from user
        String input = JOptionPane.showInputDialog(null, questionBuilder.toString());
        int userAnswer = Integer.parseInt(input) - 1;

        // Check if answer is correct
        checkAnswer(userAnswer, correctAnswers[questionIndex], questionIndex);
    }

    private void checkAnswer(int userAnswer, int correctAnswer, int questionIndex) {
        if (userAnswer == correctAnswer) {
            correctCount++;
            JOptionPane.showMessageDialog(null, generateMessage(true));
        } else {
            incorrectCount++;
            JOptionPane.showMessageDialog(null, generateMessage(false) +
                    "\nThe correct answer was: " + (correctAnswer + 1) + ". " + options[questionIndex][correctAnswer]);
        }
    }

    private String generateMessage(boolean isCorrect) {
        int messageIndex = random.nextInt(4);
        String message = "";
        if (isCorrect) {
            switch (messageIndex) {
                case 0: message = "Excellent!"; break;
                case 1: message = "Good!"; break;
                case 2: message = "Keep up the good work!"; break;
                case 3: message = "Nice work!"; break;
            }
        } else {
            switch (messageIndex) {
                case 0: message = "No. Please try again."; break;
                case 1: message = "Wrong. Try once more."; break;
                case 2: message = "Don't give up!"; break;
                case 3: message = "No. Keep trying."; break;
            }
        }
        return message;
    }

    private void showResults() {
        int totalQuestions = questions.length;
        double percentage = ((double) correctCount / totalQuestions) * 100;

        String resultMessage = "Test Completed!\n"
                + "Correct Answers: " + correctCount + "\n"
                + "Incorrect Answers: " + incorrectCount + "\n"
                + "Percentage: " + percentage + "%";

        JOptionPane.showMessageDialog(null, resultMessage);
    }
}
