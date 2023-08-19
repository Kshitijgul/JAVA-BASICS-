package JAVA_Programs;

import java.util.Scanner;

public class Deci_to_Bin {
    public static void Decimal_to_bina(int decimal){
      int my_num = decimal;
      int pow=0;
      int Bin_num=0;
      while (decimal>0){
          int rem=decimal%2;
          Bin_num = Bin_num + (rem * (int)Math.pow(10,pow));
          pow++;
          decimal=decimal/2;

        }
        System.out.println("Decimal of "+my_num + " is " + Bin_num);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a Number :  ");
        int n = sc.nextInt();
        Decimal_to_bina(n);
    }
}
