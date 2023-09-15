package JAVA_Programs.Arrays;

import java.util.Scanner;

public class repeat_first_element {
    public static int first_repeat(int arr[]){
        int repeat_element = 0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    repeat_element=arr[i];
                    return repeat_element;
                }
            }
        }
        return repeat_element;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Element : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Elements : ");
        for (int i=0;i< arr.length;i++){
           arr[i]=sc.nextInt();
        }
        for (int i=0;i< arr.length;i++){
            System.out.print("  "+ arr[i]);

        }
        System.out.println();
        int result=first_repeat(arr);
        System.out.println(result);
    }
}
