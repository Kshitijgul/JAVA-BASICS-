package JAVA_Programs.ALL_Patterns;

import java.util.Scanner;

public class pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No. Of Lines :");
        int n = sc.nextInt();
        System.out.println("Enter a No. of Columns : ");
        int m = sc.nextInt();
        for (int i= 1 ;i<=m;i++){
            for (int j=1;j<=n;j++){
                System.out.print(" x ");
            }
            System.out.println();
        }

    }
}
