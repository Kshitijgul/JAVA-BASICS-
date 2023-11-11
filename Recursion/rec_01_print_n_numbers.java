package JAVA_Programs.Recursion;

import java.util.Scanner;

public class rec_01_print_n_numbers {
    public static void print_numbers(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        print_numbers(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        System.out.println("Write a Program to Print Numbers  from 1  to n using Recursion");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        print_numbers(n);
    }
}
