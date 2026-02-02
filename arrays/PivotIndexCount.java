// AIM: To write a Java program that finds the pivot index of an array, where the sum of elements on the left side of the index is equal to the sum of elements on the right side.

// OBSERVATION: An array of size n is taken as input from the user. For each index i in the array: The sum of elements before index i is calculated as leftSum. The sum of elements after index i is calculated as rightSum.
// If leftSum is equal to rightSum, then index i is a pivot index. If the sums are not equal, -1 is printed.  The program checks every index to find possible pivot indices.

// Pseudo Code:
// 1. Read the size of the array.
// 2. Read the elements of the array.
// 3. For each index of the array:
//    a. Calculate the sum of elements on the left side.
//    b. Calculate the sum of elements on the right side.
// 4. Compare left sum and right sum.
// 5. If both sums are equal, print the pivot index.
// 6. Otherwise, print -1.

package arrays;

import java.util.*;

public class PivotIndexCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int k = i + 1; k < n; k++) {
                rightSum += arr[k];
            }

            if (leftSum == rightSum) {
                System.out.println("Pivot index is: " + i);
            } else {
                System.out.println(-1);
            }
        }
    }
}
