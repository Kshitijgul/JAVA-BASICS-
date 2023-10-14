package JAVA_Programs.Arrays;

import java.util.Scanner;

public class prefix_sum_array_1_based_indexing {
    public static void print_array(int[] arr){
        int n= arr.length;
        for (int i=0;i<n;i++){
            System.out.println(" "+arr[i]);
        }
    }
    public static int prefix_sum_brute(int[] arr,int l,int r){
        int n=arr.length;
        int sum=0;
        for (int i=l;i<r;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int[] Make_prefix_sum(int[] arr){
        for (int i=1;i< arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args ){
        System.out.println("Enter The Size Of an Array : ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Size of an Elements : ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print_array(arr);
//        System.out.println("Enter the value of l ");
//        int l= sc.nextInt();
//        System.out.println("enter the value of r ");
//        int r= sc.nextInt();
//        int sum = prefix_sum_brute(arr,l,r);
//        System.out.println(sum);
        System.out.println("Enter the Number of Queries :  ");
        int q=sc.nextInt();
        int[] pre_arr=Make_prefix_sum(arr);
        while(q-- > 0){
            System.out.println();
            System.out.println("Enter the value of l ");
            int l= sc.nextInt();
            System.out.println("enter the value of r ");
            int r= sc.nextInt();
            int ans = pre_arr[r]-pre_arr[l-1];
            System.out.println("Answer is : " + ans);
            System.out.println("******************************************");
        }
    }
}
