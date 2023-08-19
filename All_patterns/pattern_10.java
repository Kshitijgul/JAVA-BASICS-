package JAVA_Programs.ALL_Patterns;

import java.util.Scanner;
// 1 2 3 4 5
//         1 2 3 4 5
//         1 2 3 4 5
//         1 2 3 4 5
//         1 2 3 4 5

public class pattern_10 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            int a =1;
            for (int j=1;j<=n;j++){
                System.out.print(" " +a);
                a++;
            }
            System.out.println();
        }
    }
}
