package JAVA_Programs.Arrays;

import java.util.Scanner;

public class Array12_Two_pointer_appro {
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


    }
}
