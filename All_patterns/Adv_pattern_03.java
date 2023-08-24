package JAVA_Programs.ALL_Patterns;

import java.util.Scanner;

public class Adv_pattern_03 {
    public static void main(String[] args) {
        System.out.println("enter  a Number :  ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
