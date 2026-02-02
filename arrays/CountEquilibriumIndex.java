// Given an array of n elements count the number of equilibrium indices. An equilibrium index is an index such that the sum of elements at lower indices is equal to the sum of elements at higher indices.

// eg1: arr = [-3, 2, 4, -1]
// leftSum = [0, -3, -1, 3]
// rightSum = [5, 3, -1, 0]
// Ans = total count of equilibrium index = 1

// eg2: arr = [-7, 1, 5, 2, -4, 3, 0]
// leftSum = [0, -7, -6, -1, 1, -3, 0]
// rightSum = [7, 6, 1, -1, 3, 0, 0]
// Ans = total count of equilibrium index = 2

// arr = [3, -2, 2]
// l = [0, 3, 1]
// r = [0, 2, 0]

// arr = [3, -1, 2, -1, 1, 2, 1]
// l  = [0, 3, 2, 4, 3, 4, 6, 6]

// Algorithm
// 1: Create Prefix array.
// 2: Create leftSum and rightSum with the help of prefix array.
// 3: leftSum = PrefixSum[i-1] and rightSum = PrefixSum[n-1] - PrefixSum[i]
// 4: then compare leftSum and rightSum and if rightSum is equal leftSum then count.

package arrays;

import java.util.*;

public class CountEquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int leftSum;
            int rightSum;

            if (i == 0) {
                leftSum = 0;
            } else {
                leftSum = prefixSum[i - 1];
            }

            rightSum = prefixSum[n - 1] - prefixSum[i];

            if (leftSum == rightSum) {
                count++;
            }
        }

        System.out.println("Total equilibrium indices: " + count);

    }
}
