package JAVA_Programs;
import java.util.*;
public class absolute_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number :");
        int Num = sc.nextInt();
        System.out.println("Absolute value of given Number is :  " );
        if (Num < 0){
            Num = Num * (-1);
            System.out.println(Num);
        }else {
            System.out.println(Num);
        }

    }
}
