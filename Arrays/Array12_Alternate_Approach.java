package JAVA_Programs.Arrays;

import java.util.Scanner;

public class Array12_Alternate_Approach {
    public static void swap(int[] arr,int i,int j ){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sort_zero_sand_ones(int[] arr){
        int n= arr.length;
        int left=0, right=n-1;  // This are the two Pinters
        while(left < right){
            if (arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Size of an Array : ");
        int n=sc.nextInt();
      int[] arr=new int[n];
        System.out.println("Enter Elements : ");
      for (int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
        System.out.println();
      for (int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
        }
      sort_zero_sand_ones(arr);
        System.out.println("result : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
