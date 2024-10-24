public class SubarrayWithZeroSum {
    
    // Function to find and print subarray with sum 0
    public static void findSubarrayWithZeroSum(int[] arr) {
        
        // Iterate through all possible starting points
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            
            // Calculate the sum of subarray starting at i
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                
                // If sum becomes 0, we found a subarray with sum 0
                if (sum == 0) {
                    System.out.println("Subarray with sum 0 found from index " + i + " to " + j);
                    return;
                }
            }
        }
        
        // If no subarray is found
        System.out.println("No subarray with sum 0 found.");
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4}; // Example array
        findSubarrayWithZeroSum(arr);
    }
}
