package JAVA_Programs.Arrays;

import java.util.Scanner;

public class suffix_sum_array {
    static int[] suffix_array(int[] arr) {
        int n = arr.length;
        int[] suffix_arr = new int[n];
        suffix_arr[n - 1] = arr[n - 1]; // Initialize the last element

        for (int i = n - 2; i >= 0; i--) {
            suffix_arr[i] = arr[i] + suffix_arr[i + 1];
        }
        return suffix_arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSuffix sum array: ");
        int[] result = suffix_array(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
