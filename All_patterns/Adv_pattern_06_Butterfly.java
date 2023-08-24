package JAVA_Programs.ALL_Patterns;

import java.util.Scanner;

public class Adv_pattern_06_Butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            //Stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Space
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //Stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        2nd Half
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Space
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //Stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
