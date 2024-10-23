public class Main {

    public static void array(int num[]) {
        int sum;
       int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible value
        int minSum = Integer.MAX_VALUE;
        // Declare sum variable
        for (int i = 0; i < num.length; i++) {
            
            for (int j = i; j < num.length; j++) {
                sum=0;
                // Reset sum for each subarray
                for (int k = i; k <= j; k++) {
                     
                    System.out.print(num[k] + " ");
                    sum += num[k];
                       if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
                    
                }
                System.out.println(" -> Sum: " + sum);
                
            }
            System.out.println();
        }
        System.out.print("largest is "+maxSum+" smallest is " +minSum);
    }

    public static void main(String[] args) {
        int num[] = {2, 3, 4, 5, 6, 8, 9};
        array(num);
    }
}public class Main {

    public static void array(int num[]) {
        int sum;
       int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible value
        int minSum = Integer.MAX_VALUE;
        // Declare sum variable
        for (int i = 0; i < num.length; i++) {
            
            for (int j = i; j < num.length; j++) {
                sum=0;
                // Reset sum for each subarray
                for (int k = i; k <= j; k++) {
                     
                    System.out.print(num[k] + " ");
                    sum += num[k];
                       if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
                    
                }
                System.out.println(" -> Sum: " + sum);
                
            }
            System.out.println();
        }
        System.out.print("largest is "+maxSum+" smallest is " +minSum);
    }

    public static void main(String[] args) {
        int num[] = {2, 3, 4, 5, 6, 8, 9};
        array(num);
    }
}
