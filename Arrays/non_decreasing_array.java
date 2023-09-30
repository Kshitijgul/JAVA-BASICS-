package JAVA_Programs.Arrays;

import java.util.Scanner;

public class non_decreasing_array {
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
    public static void reverse_array(int[] arr){
        int n=arr.length;
        int i=0;int j=n-1;
        while(i<j){
            swap_array(arr,i,j);
            i++;
            j--;
        }
        print_array(arr);
    }
    public static int[] sort_squares(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        int left=0,right=n-1;
        int k=0; // For traversing
        while(left <= right){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k]=arr[left]*arr[left];
                k++;
                left++;
            }else{
                ans[k]=arr[right]*arr[right];
                k++;
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println("enter the Size Of Elements : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements : ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print_array(arr);
        int[] ans=sort_squares(arr);
        print_array(ans);
        reverse_array(ans);

    }
}
