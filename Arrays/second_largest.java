package JAVA_Programs.Arrays;

import java.util.Scanner;

public class second_largest {
    public static int maximum(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int second_largest(int arr[]){
        int max=maximum(arr);

        for (int i=0;i< arr.length;i++){
            if (arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int second_max=maximum(arr);
        return second_max;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of element : ");
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter Elements : ");
        for (int i=0;i<size;i++){
             arr[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        int result=second_largest(arr);
        System.out.println("second largest element is :  " + result);
    }
}
