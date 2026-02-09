package arrays;

import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");

        int n = sc.nextInt();
        System.out.println("Enter k: ");

        int k = sc.nextInt();
        int[] arr = new int[n];
        String ans = "no";

        System.out.println("Enter array elements: ");

        for (int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0;i<n;i++) {
            for (int j = 1; j<n;j++) {
                if (arr[i]+arr[j] == k && i !=j) {
                    ans = "yes";
                }
            }
        }

        System.out.println(ans);
    }
}
