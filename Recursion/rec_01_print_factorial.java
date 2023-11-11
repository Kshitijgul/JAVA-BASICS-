package JAVA_Programs.Recursion;

import java.util.Scanner;

public class rec_01_print_factorial {
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int small_fact=factorial(n-1);
        int factorial=n * small_fact;
        return factorial;
    }

    public static void main(String[] args){
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ans = factorial(n);
        System.out.println("The factorial of "+ n + " is "+ans);
    }
}
