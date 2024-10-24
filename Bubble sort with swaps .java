public class Main {

    public static void bubble(int arr[]) {

        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap = 0;  // To keep track of swaps
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;  // Increment swap count if a swap happens
                }
            }
            
            // If no swaps happened during the current pass, break the loop
            if (swap == 0) {
                System.out.println("No swaps, exiting early on iteration " + (turn + 1));
                break;  // Exit the loop if no swaps were made
            }
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 4, 7, 11, 87 };  // Example array
        bubble(arr);
        printArr(arr);
    }
}
