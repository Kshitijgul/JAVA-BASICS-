package JAVA_Programs.Arrays;

import java.util.Scanner;

public class Rotate_array_opt {
    public static void swap_array(int[] arr,int i, int j) {// Here i is start and j is end
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void reverse_array(int[] arr, int i, int j) {
        while (i < j) {
            swap_array(arr, i, j);
            i++;
            j--;
        }
    }

    public static void rotate_in_place(int[] arr,int k){
        int n= arr.length;
        k=k%n;
        reverse_array(arr,0,n-k-1);
        reverse_array(arr,n-k,n-1);
        reverse_array(arr,0,n-1);

        for (int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

    }
    public static void main(String[] args){
        System.out.println("Enter the size of an Array : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the Elements :");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("Enter the value of K :");
        int k =sc.nextInt();

        System.out.println("After Rotation :");
        rotate_in_place(arr,k);


    }
}
