public class Main {
    public static boolean letter(String str) {  
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false; 
            }
        }
        return true;  
    }

    public static void main(String[] args) {
        String name = "noon";
        System.out.println(letter(name));  
    }
}
