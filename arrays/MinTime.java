// Given an integer a of an array size n, in one second you can increase the value of 1 element by 1. Find the minimum time in seconds to make all the elements of the array equal.

// arr = [2, 4, 1, 3]
// max = 4
// output = 6

// Observation: To minimize the time, make all the elements equal to the maximum element in the array.

// Pseudo code:
// Step 1: Find the maximum element in the array
// Step 2: For every element calculate how much it needs to be increased to reach the maximum.
// Step 3: Sum all those differences

package arrays;

import java.util.*;

public class MinTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int max = array[0];
        int time = 0;
        
        System.out.println("Enter array elements: ");
        for (int i = 0;i<n;i++) {
            array[i] = sc.nextInt();
            if(max<array[i]) {
                max = array[i];
            }
        } 

        for (int i = 0;i<n;i++) {
            time += (max -array[i]);
        }

        System.out.println("Total time = " + time);
    }
}
