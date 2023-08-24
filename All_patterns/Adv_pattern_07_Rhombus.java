package JAVA_Programs.ALL_Patterns;

import java.util.Scanner;

public class Adv_pattern_07_Rhombus {
    public static void solid_rhombus(int n){
        for (int i =1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    public static void hollow_rhombus(int n ){
        for (int i =1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                if (i==1 || i==n || j==1 || j==n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        solid_rhombus(n);
        hollow_rhombus(n);


    }
}
