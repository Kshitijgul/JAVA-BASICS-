package JAVA_Programs.Arrays;

import java.util.Scanner;

public class Array01_create {
    public static void main(String[] args) {
        System.out.println("lets Create a Array : ");
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[100];

        System.out.println("The length of array is : "+ marks.length);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("Phy Marks :" + marks[0]);
        System.out.println("Chem Marks :" + marks[1]);
        System.out.println("Maths Marks  :" + marks[2]);

        //Update Marks
        marks[2]=100;
        marks[2]=100 + 5;
        System.out.println("Maths Marks  :" + marks[2]);
    }
}
