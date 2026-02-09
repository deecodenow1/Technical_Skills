package arrays;

import java.util.Scanner;

public class PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows and cols: ");

        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("Enter number of elements of matrix: ");

        int[][] matrix = new int[row][col];

        for (int i = 0;i<row;i++) {
            for (int j = 0; j<col;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is: ");

        for (int i = 0;i<row;i++) {
            for(int j =0; j <col ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
