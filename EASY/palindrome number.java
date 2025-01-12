class Solution {
    public boolean isPalindrome(int x) {
        // Check for negative numbers and numbers ending with 0 (except 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false; // Not a palindrome
        }

        int reverse = 0; // Variable to store the reversed number
        int temp = x;    // Temporary variable to manipulate the original number

        // Reverse the number
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10); // Build the reversed number
            temp = temp / 10;                       // Remove the last digit from temp
        }

        // Return true if the original number is equal to its reversed version
        return x == reverse; // True if palindrome, false otherwise
    }
}
