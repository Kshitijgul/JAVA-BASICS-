package JAVA_Programs.Arrays;

import java.util.Scanner;

public class two_sum {
    static void print_array(int[] arr){
        int n= arr.length;;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static void two_sum(int[] arr,int target){
        int n= arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("["+i + ","+ j+"]");
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Size of An Array  : ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements of Array : ");
        for (int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }
        print_array(arr);
        System.out.println("Enter target");
        int target= input.nextInt();
        two_sum(arr,target);

    }
}
