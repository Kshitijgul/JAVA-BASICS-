package JAVA_Programs.ALL_Patterns;
//        x
//        x x
//        x x x
//        x x x x
//        x x x x x
//        x x x x
//        x x x
//        x x
//        x

import java.util.Scanner;

public class pattern_13 {
    public static void main(String[] args) {
        System.out.println("Lets Print the pattern :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        for (int i= 1;i<=2*n-1;i++){
            int stars=i;
            if(i>n){
                stars = 2*n-i;
            }
            for (int j=1;j<=stars;j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
