package JAVA_Programs;

import java.util.Scanner;

public class factorial_number {
    public static int factorial(int a ){
        int f = 1;
        for (int i = 1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int factorial = factorial(n);
        System.out.println("Factorial of a Given Number is :  " + factorial);

    }
}
