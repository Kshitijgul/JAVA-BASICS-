package JAVA_Programs.Recursion;

import java.util.Scanner;

public class Ac_01_Print_dec_no {
    public static void dec_no(int n){
        if (n == 1){
            System.out.println(n);
            return ;
        }
        System.out.print(n + " ");
        dec_no(n-1);
    }
    public static void inc_no(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        inc_no(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = sc.nextInt();
        dec_no(n);
        inc_no(n);

    }
}
