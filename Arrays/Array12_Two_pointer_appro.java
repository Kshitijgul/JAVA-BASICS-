package JAVA_Programs.Arrays;

import java.util.Scanner;
// Two Pointers Approach
// Sort an array Consisting of only 0s and 1s

public class Array12_Two_pointer_appro {
    public static void zeros_and_ones(int[] arr){
        int n=arr.length;
        int zeroes=0; // for count the number of Zeros
        for (int i=0;i<n;i++){
            if (arr[i] == 0){
                zeroes++;
            }
        }
//        zeroes to zeros - 1 : zeroes to n-1 : 1
        for (int i =0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
    }
    public static void print_array(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " " );
        }
        System.out.println();
    }
    public static void swap_array(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){
        System.out.println("enter the Size Of Elements : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array :");
        print_array(arr);
        zeros_and_ones(arr);
        print_array(arr);
    }
}
