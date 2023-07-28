package JAVA_Programs;

import java.util.Scanner;

public class sum_of_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n= sc.nextInt();
        int sum=0;
        for (int i=0;i<=n;i++){
            sum = sum +i;
        }
        System.out.println("Sum of First " + n +"  natural Numbers is " + sum );


    }
}
