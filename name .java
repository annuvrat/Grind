 class Main {

    public static void printName(String name, int i, int n) {
        // Base case: stop when i > n
        if (n==1) {
            pr
            return;
        }
        // Print the name
        System.out.println(name);
        // Recursive call with incremented i
        printName(name, i + 1, n);
    }

    public static void main(String[] args) {
        // Example usage
        String name = "John"; // Name to be printed
        int i = 1;            // Starting index
        int n = 5;            // End condition

        printName(name, i, n);
    } 
}
