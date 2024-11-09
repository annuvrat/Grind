public class Main {
    public static String upper(String Str) {
        StringBuilder sb = new StringBuilder("");

        // Capitalize the first character
        char ch = Character.toUpperCase(Str.charAt(0));
        sb.append(ch);

        // Loop through the rest of the string
        for (int i = 1; i < Str.length(); i++) {
            if (Str.charAt(i) == ' ') {
                sb.append(Str.charAt(i));  // Add the space as is
                i++;  // Skip the next character after space
                if (i < Str.length()) {
                    sb.append(Character.toUpperCase(Str.charAt(i)));  // Capitalize next character
                }
            } else {
                sb.append(Str.charAt(i));  // Add the character as is
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi wassup";  // Declare str
        System.out.println(upper(str));
    }
}
