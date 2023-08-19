package JAVA_Programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Binomial_coefficient {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static int Bino_coeffi(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_n_r=factorial(n-r);
        //  //Formula For Binomial Coefficient
        int Bino_coeff = fact_n/(fact_r*fact_n_r);
        return Bino_coeff;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("enter the value of r : ");
        int r = sc.nextInt();



      int Bino_coeff=Bino_coeffi(n,r);
        System.out.println("Binomial Coefficient is : " + Bino_coeff);


    }


}
