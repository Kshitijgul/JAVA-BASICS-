package JAVA_Programs.Arrays;

import java.util.Scanner;

public class Kth_largest_L215 {
    public static void print_array(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int findKthLargest(int[] nums, int k) {
        int max=max_element(nums);
        int i=1;
        while( i < k){
            for (i = 0; i < nums.length; i++) {
                if (max == nums[i]) {
                    nums[i] = Integer.MIN_VALUE;
                }
                max = max_element(nums);
            }
        }
        return max;
    }
    public static int max_element(int[] arr){
        int n= arr.length;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Size of an Array : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter the elements : ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print_array(arr);
        int ans=findKthLargest(arr,4);
        System.out.println(ans);

    }
}
