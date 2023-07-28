package JAVA_Programs;
import java.util.*;

public class divisible_by_5 {
    public static void main(String[] args) {
        System.out.println("===== PROGRAM FOR DIVISIBLE BY 5 OR NOT ");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Number :");
        int Num = input.nextInt();
        if (Num%5 == 0){
            System.out.println(Num + " is divisible by 5 !");
        }else{
            System.out.println(Num + " is not  divisible by 5 !");
        }
    }
}
