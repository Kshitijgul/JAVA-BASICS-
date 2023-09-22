package JAVA_Programs.Arrays;

import java.util.Scanner;

// Rotate the given array a by k steps , where k is a non-negative
// k can be greater than n

public class Rotate_by_arraY_k {
    public static int[] rotate_array(int[] arr,int k){
        int n=arr.length;
        int j=0;
        int[] ans=new int[n];

        for (int i=n-k;i<n;i++){
            ans[j++]=arr[i];  // Jo value hai voh Used kArega
        }
        for (int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;

    }
    public static void main(String[] args){
        System.out.println("enter the Size of array :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the Elements : ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
        System.out.println("Enter the value of K : ");
        int k = sc.nextInt();
        int[] rotatedArr = rotate_array(arr, k);

        // Now you can work with the rotated array
        for (int i = 0; i < rotatedArr.length; i++) {
            System.out.print(rotatedArr[i] + " ");
        }

    }


}
