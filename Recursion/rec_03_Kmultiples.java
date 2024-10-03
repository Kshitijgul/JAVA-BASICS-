package JAVA_Programs.Recursion;

import java.util.Scanner;

public class rec_03_Kmultiples {

    public static void PrintMultiples(int n,int k){
        if(k == 1){
            System.out.println(n);
            return;
        }
        PrintMultiples(n,k-1);
        System.out.println(n * k);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        PrintMultiples(n,k);
    }
}
