package JAVA_Programs.Arrays;
import java.util.*;

import java.util.Scanner;

public class arr_intro_kunalk {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] ros;// This is the declaration Of Array
        ros = new int[5]; // Declaration and  This is actually Memory Creation
        int[] arr=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        for(int num:arr){
            System.out.print(num + " ");        // Here Num is Element
         }
//        System.out.println(arr[5]);  // Index out of Error

        System.out.println("This will convert in String : ");
        System.out.println(Arrays.toString(arr));

    }
}