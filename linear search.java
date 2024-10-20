import java.util.*;

public class Main {
    
    public static int array(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = {12, 43, 343, 43, 66, 11, 3, 4, 56, 6, 5};
        int key = 3;

        int index = array(num, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key is at index " + index);
        }
    }
}
