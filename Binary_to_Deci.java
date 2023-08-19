package JAVA_Programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Binary_to_Deci {
    public static void Bin_to_dec(int Binary_num){
        int my_num = Binary_num;
        int dec=0;
        int pow=0;
        while(Binary_num>0){
            int last_digit=Binary_num%10;
            dec = dec + (last_digit * (int) Math.pow(2, pow));


            pow++;
            Binary_num=Binary_num/10;
        }
        System.out.println("Decimal of "+ my_num + "  is  "+ dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary Number :");
        int n= sc.nextInt();
        Bin_to_dec(n);

    }
}
