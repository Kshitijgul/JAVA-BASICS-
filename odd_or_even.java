package JAVA_Programs;
import java.util.*;
public class odd_or_even {
    public static void main(String[] args) {
        System.out.println("Tis program Will Show you the Number is odd or Not ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The NUmber : ");
        int Num = sc.nextInt();
        if (Num % 2 == 0){
            System.out.println(Num +" number is Even !");
        }else{
            System.out.println(Num + "  number is Odd !");
        }

    }
}
