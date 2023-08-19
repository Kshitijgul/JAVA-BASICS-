package JAVA_Programs.ALL_Patterns;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j =i;j<=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
