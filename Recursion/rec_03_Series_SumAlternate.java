package JAVA_Programs.Recursion;

import java.util.Scanner;

public class rec_03_Series_SumAlternate {
    public static int AlternateSeries(int n){
        if (n == 0){
            return 0;
        }
        if(n % 2 == 0){
            return AlternateSeries(n-1) - n;
        }else{
            return AlternateSeries(n-1) + n;
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println(    AlternateSeries(n));



    }
}
