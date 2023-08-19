package JAVA_Programs;

import java.util.Scanner;

public class function_product {
    public static int multiply(int m,int n){
        int product = m*n;
        return product;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Two Numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = multiply(a,b);

        System.out.println("Product of two Numbers is : " + product);
        product = multiply(8,9);
        System.out.println("Product of two Numbers is : " + product);
    }
}
