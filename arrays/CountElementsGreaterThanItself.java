// AIM: Given an array count number of elements having atleast one element grater then itself.
// Example1: arr = [1, 2, 3, 4, 5]
// Output: 4

// Observation: All elements except the highest element will not have any element greater than itself.
// Sol1: we can get answer by getting maximum value and counting the rest of elements left.
// Sol2: we can count maximum numbers and substract the count from the array length.

// Pseudo Code:
// 1. Initialize an array with given elements.
// 2. Find the maximum element in the array.
// 3. Iterate and get the number of elements that are not equal to maximum element.
// 4. Increment the count.

// Code:

package arrays;

public class CountElementsGreaterThanItself {
    public static void main(String[] args) {
        int[] arr = { -3, 3, 2, 4, 5, 8, 2, 8 };
        int max = arr[0];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                count += 1;
            }
        }

        System.out.println("Elements having at least one greater element: " + count);
    }
}
