package Assignment_2;

public class OverLoadExample {

    // First overloaded method: Sum of two integers
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    // Second overloaded method: Sum of three integers
    public static int calculateSum(int a, int b, int c) {
        return a + b + c;
    }

    // Third overloaded method: Sum of an array of integers
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Call the first overloaded method
        int result1 = calculateSum(10, 20);
        System.out.println("Sum of two numbers (10 + 20): " + result1);

        // Call the second overloaded method
        int result2 = calculateSum(10, 20, 30);
        System.out.println("Sum of three numbers (10 + 20 + 30): " + result2);

        // Call the third overloaded method with an array
        int[] numbers = {10, 20, 30, 40};
        int result3 = calculateSum(numbers);
        System.out.println("Sum of array {10, 20, 30, 40}: " + result3);
    }
}
