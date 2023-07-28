package JAVA_Programs;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("=========== CALCULATOR ===========");
        System.out.println("");
        Scanner sc= new Scanner(System.in);
        int Num1,Num2;
        System.out.println("Enter two Numbers :");
        Num1 = sc.nextInt();
        Num2 = sc.nextInt();
        System.out.println("______________________________________________________________________");
        System.out.println("Choose Following Button for Any calculation :");
        System.out.println("For Addition of two numbers choose +");
        System.out.println("For Subtraction  of two numbers choose -");
        System.out.println("For Multiplication of two numbers choose *");
        System.out.println("For Division of two numbers choose /");
        char button = sc.next().charAt(0);
        switch (button){
            case '+' :
                System.out.println("Addition of two Numbers : ");
                int sum = Num1 + Num2;
                System.out.println(sum);
                break;
            case '-':
                System.out.println("Subtraction Of two Numbers is : ");
                int sub=Num1-Num2;
                System.out.println(sub);
                break;
            case '*':
                System.out.println("Multiplication of two Numbers is :  ");
                int multi= Num1 * Num2;
                System.out.println(multi);
                break;
            case '/':
                System.out.println("Division Of two Numbers is :  ");
                int div = Num1/Num2;
                System.out.println(div);
                break;
            default:
                System.out.println("You Choose Invalid Option ! ");

        }

    }
}
