package JAVA_Programs;

import java.util.Scanner;

public class Optimized_prime_number {
    public static void main(String[] args) {
        System.out.println("Enter a Number :");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(is_prime(n));
        prime_range(n);


    }
    public static boolean is_prime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void prime_range(int n) {
        for (int i = 2; i <= n; i++) {
            if (is_prime(i)) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
    }

