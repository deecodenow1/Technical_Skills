package arrays;

// 01, 11, 21
import java.util.*;

public class MatrixColSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no. of rows and cols: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int sum = 0;

        int[][] matrix = new int[row][col];

        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i<row; i++) {
            for (int j = 0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i< row; i++) {
            for (int j = 0; j <col ;j++) {
                sum += matrix[j][i];
            }
            System.out.println("Sum of column " + (i+1) + " is: " + sum);
            sum = 0;
        }
    }
    
}
