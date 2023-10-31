package JAVA_Programs.Arrays;

import java.util.ArrayList;
import java.util.Collections;

// Write a Program to sort an Array list of strings in descending Order
public class Array_list_Programme2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(10);
        arr.add(3);
        arr.add(5);
        arr.add(22);
        arr.add(10);
        System.out.println("Original Array is :  " + arr);
        Collections.sort(arr);
        System.out.println("In Ascending Order :  " + arr);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println("In descending Order : " + arr);


        ArrayList<String> l1= new ArrayList<>();
        l1.add("Power Rangers ");
        l1.add("Super Ninja  ");
        l1.add("samurai ");
        l1.add(" SPD");
        l1.add(" Megaforce ");
        Collections.sort(l1);
        System.out.println(l1);
    }

}
