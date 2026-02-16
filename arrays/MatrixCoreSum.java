package arrays;

// Write a program to print sum of core elements of the matrix.

import java.util.Scanner;

public class MatrixCoreSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and cols: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j<col; j++) {
                if (i != 0 && j != 0 && i != row-1 && j != col-1) {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of core elements is: " + sum);
    }
}
