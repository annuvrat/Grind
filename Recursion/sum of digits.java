public class  Main{

    // Recursive method to calculate the sum of digits
    public static int sumOfDigits(int n) {
        // Base case: if n is a single digit, return n
        if (n < 10) {
            return n;
        } else {
            // Recursive case: add the last digit to the sum of the rest
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        int n = 123; // Example input
        System.out.println("Sum of digits of " + n + " is: " + sumOfDigits(n));
    }
}
