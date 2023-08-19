package JAVA_Programs;

import java.util.Scanner;

public class Avg_of_three {
    public static void average(int a , int b,int c ){
        int sum=a+b+c;
        int avg=sum/3;
        System.out.println("The Average of three Numbers is : " + avg);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a three NUmbers : ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        average(a,b,c);

    }
}
