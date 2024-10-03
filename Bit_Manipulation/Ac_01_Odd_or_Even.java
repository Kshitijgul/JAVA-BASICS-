package JAVA_Programs.Bit_Manipulation;

import java.util.Scanner;

public class Ac_01_Odd_or_Even {
    public static void Odd_or_even(int n){
        int bitmask = 1;
        if((bitmask & n )== 0){
            System.out.println("The Given Number is Even");
        }else{
            System.out.println("The Given Number is Odd");
        }
    }
    public static void main(String[] args){
        int a = 5;
        int b = 6;
        System.out.println(a & b);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Odd_or_even(n);
        Odd_or_even(9);

    }
}
