package JAVA_Programs;

import java.util.Scanner;

public class reverse_of_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Your given Number is : " + n);
        for (int i=0;n>0;i++){
            int last_num=n %10;
            n=n/10;
            System.out.print(last_num +" ");
        }
        System.out.println();
    }
}
