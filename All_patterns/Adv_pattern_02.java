package JAVA_Programs.ALL_Patterns;

import java.util.Scanner;

public class Adv_pattern_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =1;i<=n;i++){
//            spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//            Stars
            for (int j=1;j<=i;j++){
                System.out.print("x");
            }
            System.out.println();
        }


    }

}
