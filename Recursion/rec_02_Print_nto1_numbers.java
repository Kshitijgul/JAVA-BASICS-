package JAVA_Programs.Recursion;

import java.util.Scanner;

public class rec_02_Print_nto1_numbers {
    public static void  print_n_to_1(int n){
        System.out.println(n);

        if( n == 1){
            return;
        }
        print_n_to_1(n-1);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        print_n_to_1(n);
    }
}
