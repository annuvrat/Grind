public class Main {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;  

        
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; 

            
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i]; 
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {21, 3, 5, 34},
            {2, 32, 15, 4},
            {2, 33, 51, 4},
            {22, 3, 5, 43}
        };

     
        int result = diagonalSum(matrix);
        System.out.println("The sum of the diagonals is: " + result);
    }
}
