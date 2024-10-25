public class Main {
    public static void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) { // Start from the second element
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                // Swap elements
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                
                j--; // Move to the previous element
            }
        }
    }

    public static void print(int arr[]) {
        System.out.print("Insertion sort result: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 6, 3, 4, 5,2 };
        insertion(arr);
        print(arr);
    }
}
