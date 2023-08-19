package JAVA_Programs.ALL_Patterns;

import java.sql.SQLOutput;
import java.util.Scanner;

public class pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            //Numbers
            for (int j =1;j<=n;j++){
                System.out.print(j+" ");
            }
            //Space

//            Numbers
            for (int j =i;j<=1;j--){
                System.out.print(j+" ");
            }
        }
    }


}
