public class Solution {
    public int reverse(int x) {
        int reversed_num = 0;
        
        while (x != 0) {
            int lastDigit = x % 10;  // Get the last digit
            x = x / 10;  // Remove the last digit
            
            // Check for overflow before updating reversed_num
            if (reversed_num > Integer.MAX_VALUE / 10 || 
                (reversed_num == Integer.MAX_VALUE / 10 && lastDigit > Integer.MAX_VALUE % 10)) {
                return 0;  // Overflow condition
            }
            
            if (reversed_num < Integer.MIN_VALUE / 10 || 
                (reversed_num == Integer.MIN_VALUE / 10 && lastDigit < Integer.MIN_VALUE % 10)) {
                return 0;  // Underflow condition
            }
            
            reversed_num = reversed_num * 10 + lastDigit;  // Update reversed_num
        }
        
        return reversed_num;
    }
}
