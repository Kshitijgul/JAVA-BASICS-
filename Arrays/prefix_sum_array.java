package JAVA_Programs.Arrays;

import java.util.Scanner;

public class prefix_sum_array {
    public static int[] prefix_array(int[] arr){
        int n= arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for (int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    public static int[] without_new_array(int[] arr){
        int n = arr.length;
        for (int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of Array : ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        int[] ans=prefix_array(arr);
        for (int i=0;i<n;i++){
            System.out.print(" "+ans[i]);
        }
        System.out.println();
        int[] ans2 = without_new_array(arr);
        for (int i=0;i<n;i++){
            System.out.print(" "+ans2[i]);
        }

    }
}
