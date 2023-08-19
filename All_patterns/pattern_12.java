package JAVA_Programs.ALL_Patterns;

import java.util.Scanner;

public class pattern_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        for (int i =0;i<n;i++){
//            space
//            for (int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
            for (int j=0;j<n-i*1;j++){      //First Logic for Space
                System.out.print(" ");
            }
//            Star
            for (int j=0;j< 2*i+1;j++){
                System.out.print("*");
            }
//            space
            for (int j=0;j<n-i-1;j++){       // Second Logic For Space
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
//NOtes:
//--> First we have to draw a rectangle of n
//--> We have to Observe the outer Loop
//--> For Inner Loop there are three elements are print
//    That is space , star , space
//--> for space formula is column = n-i-1
//        for star 2*i+1
