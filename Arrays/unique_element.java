package JAVA_Programs.Arrays;

import java.util.Scanner;

public class unique_element {
    public static int unique_num(int[] arr){
        int n = arr.length;
        for (int i =0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=0;
        for (int i=0;i<n;i++){

            if (arr[i]>0){
                ans =  arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println("Enter the Size of Array : ");

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter The Elements : ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int ans=unique_num(arr);
        System.out.println("The Unique Number is :  " + ans);

    }
}
