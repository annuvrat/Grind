public class Main {
    public static void main(String[] args) {

        int[] arr = {0, 2, 5, 0, 6};

        int index = 0; // tracks where to place non-zero elements
 
        // Step 1: Move all non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Step 2: Fill the remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        // Print result
        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
