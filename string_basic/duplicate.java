import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate characters are:");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        }
    }
