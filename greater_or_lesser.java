package JAVA_Programs;
import java.util.*;

public class greater_or_lesser {
    public static void main(String[] args) {
        System.out.println("This program will Tell YOu Which  Number is greater or samller");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        if (Num1 == Num2){
            System.out.println("Numbers are Equal !");
        }else{
            if (Num1>Num2){
                System.out.println(Num1 + "  Is Greater than " + Num2);
            }else{
                System.out.println(Num1 + " is Lesser than " +  Num2 );
            }
        }

    }
}
