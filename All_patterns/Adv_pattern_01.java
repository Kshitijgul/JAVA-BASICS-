package JAVA_Programs.ALL_Patterns;

import java.util.Scanner;

public class Adv_pattern_01 {
    public static void Hollow_rectangle(int Total_rows,int Total_columns){
        for (int i=1;i<=Total_rows;i++){ //Outer Loop
            for (int j=1;j<=Total_columns;j++){
//                Condition for Boundaries
                if (i==1 || i==Total_rows || j==1 || j==Total_columns){
                    System.out.print("x");
                }else {
                    System.out.print(" ");
                }
            }System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the Value of Total Rows and Total Columns : ");
        Scanner sc=new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        Hollow_rectangle(rows,columns);

    }
}
