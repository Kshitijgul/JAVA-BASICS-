package JAVA_Programs.Arrays;

import java.util.Scanner;

public class Array_Revision {
    public static void average(int arr[]){
        int sum = 0;
        int arr_len = arr.length;
        int average =0 ;
        for (int items:arr) {
            sum += items;
            average = sum / arr_len;
        }
        System.out.println(average);
        System.out.println(sum);
    }
    public static void _count_distinct(int arr[]){
        int n=arr.length;
        boolean is_distinct = true;
        int count = 0;
        for(int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                if (arr[i] == arr[j]){
                    is_distinct = false;
                    break;
                }
            }
            if(is_distinct){
                count++;
            }
        }
        System.out.println("The Total distinct Numbers is : " +count);
    }
    public static boolean is_sorted(int arr[]){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the Elements :  ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        average(arr);
        _count_distinct(arr);

        System.out.println(is_sorted(arr));

    }
}
