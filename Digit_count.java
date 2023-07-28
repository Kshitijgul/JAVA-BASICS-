package JAVA_Programs;
import java.util.*;

public class Digit_count {
    public static void main(String[] args) {
        System.out.println("================  Digit Count ===============");
        Scanner sc= new Scanner(System.in);
        int Num= sc.nextInt();
        if (Num>9 && Num<99){
            System.out.println(Num + "  The Number is two Digit !");
        } else if (Num>99 && Num<1000){
            System.out.println(Num + " The Number is Three digit !");
        }

    }
}
