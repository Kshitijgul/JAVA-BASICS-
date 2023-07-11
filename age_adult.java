package JAVA_Programs;
import java.util.*;

public class age_adult {
    public static void main(String[] args) {
        System.out.println("This Program Will Show the You are Adult or Not ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        if (age<18){
            System.out.println("YOu are Not Adult !" );

        }else{
            System.out.println("wow Your Adult ! ");
        }


    }
}
