// Given an array of integer a, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array of the array.

// array = [1, 2, 3, 4]
// product array = [1*2*3*4/1,1*2*3*4/2, 1*2*3*4/3, 1*2*3*4/4]
//               = [24, 12, 8, 6]

// Observation: Calculate product of all elements of the array and then divide them with the array elements one by one to get the product array.

// Pseudo Code:
// 1. Read the size of the array.
// 2. Take the array elements from the user.
// 3. Calculate the product of all the array elements.
// 4. For product array, divide the total product with each array elements and store it in product array.

package arrays;
import java.util.*;

public class ProductArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] productArr = new int[n];
        int prod = 1;

        System.out.println("Enter array elements: ");

        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
            prod = prod * arr[i];
        }

        for (int i = 0;i<n;i++) {
            productArr[i] = prod/arr[i];
        }

        for (int i = 0;i<n;i++) {
            System.out.print(productArr[i] + " ");
        }
 
    }
}
