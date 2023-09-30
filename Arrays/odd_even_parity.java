package JAVA_Programs.Arrays;
//Given an Array of Integers 'a', move all the even integers at the begining of the array
// followed by the all odd integers. The relative order of odd or even integers does not matter .
// Return any array that satisfies the condition .

import java.util.Scanner;

public class odd_even_parity {
    public static void swap_array(int[] arr, int i , int j ){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sort_array(int[] arr){
        int n= arr.length;
        int left=0,right=n-1;
        while(left<right){
            if (arr[left]%2==1 && arr[right]%2==0){
                swap_array(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]%2==0){
                left++;
            }
            if (arr[right]%2==1){
                right--;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements : ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("After Function : ");
        sort_array(arr);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
