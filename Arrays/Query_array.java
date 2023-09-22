package JAVA_Programs.Arrays;

import java.util.Scanner;

public class Query_array {
    public static int[] Make_freq_array(int[] arr){
       int[] freq=new int[10005];
       for (int i=0;i < arr.length;i++){
           freq[arr[i]]++;
       }
return freq;
    }
    public static void main(String[] args){
        System.out.println("Enter the Size of Elements  : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements of Array : ");
        for (int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        int[] freq=Make_freq_array(arr);
        System.out.println("Enter the Number of Queries : ");
        int q = sc.nextInt();


        while(q>0){
            System.out.println("Enter the Searched Element : ");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No ");
            }
             q--;
        }


    }
}
