package JAVA_Programs.Recursion;

import java.util.Scanner;

public class rec_01_Fibonacci_series {
    public static int Fibbonacci(int n){
        if (n==0 || n==1){
            return n;
        }
        return Fibbonacci(n-1)+Fibbonacci(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=sc.nextInt();
        System.out.println(Fibbonacci(n));
        System.out.println("Print the Fibonacc number from 1 to 10 : ");
        for (int i=0;i<=10;i++){
            System.out.print(Fibbonacci(i) + " ");
        }
    }
}
