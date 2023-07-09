package JAVA_Programs;
import java.util.*;

public class find_reminder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of Dividend :");
        int divd = sc.nextInt();
         System.out.print("Enter the value of Diviser :");
        int divs = sc.nextInt();

        int quo = divd/divs;
        System.out.println("The value of Quotient is :" + quo);

        int remi = divd - divs * quo;
        System.out.println("The value of Reminder is  :" + remi);
        System.out.println("-------------WITH MODULO OPERATOR--------------");
        int remi2 = divd%divs;
        System.out.println("The value of reminder with Modulo is : " + remi2);


    }
}
