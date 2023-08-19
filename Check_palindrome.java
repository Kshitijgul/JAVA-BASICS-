package JAVA_Programs;

import java.util.Scanner;

public class Check_palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int rev=0;
        while(n>0){
            int last_digit=n%10;
             rev= (rev *10)+last_digit;
            n=n/10;
        }
        System.out.println(rev);
//        Now check for Palindrome
        if (original==rev){
            System.out.println("It is Palindrome Number !");
        }else{
            System.out.println("It is not palindrome Number");
        }

    }
}
