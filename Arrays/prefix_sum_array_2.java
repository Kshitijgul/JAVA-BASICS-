package JAVA_Programs.Arrays;

import java.util.Scanner;

// Check if we can partiotion the array into two Subarrays with Equal sum .
// More formally , Check that the preffix sum of a part of the
// array is eqaual to the suffix sum of rest of the array .
public class prefix_sum_array_2 {
    static int findarraysum(int[] arr){
        int totalsum=0;
        int n= arr.length;
        for (int i=0;i<n;i++){
            totalsum +=arr[i];
        }
        return totalsum;

    }
    static boolean equalsumPartion(int[] arr){
        int totalsum=findarraysum(arr);
        int prefix_sum=0;
        for (int i=0;i<arr.length;i++){
            prefix_sum +=arr[i];
            int suffix_sum = totalsum - prefix_sum;
            if(suffix_sum == prefix_sum){
                return true;
            }

        }
        return false;

    }
    public static void print_array(int[] arr){
        int n= arr.length;
        for (int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Array Size : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements : ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Equal partion Possible "+ equalsumPartion(arr));
    }

}
