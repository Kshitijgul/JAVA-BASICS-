package JAVA_Programs;
import java.util.*;

public class Simple_Intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal value :");
        double p = sc.nextDouble();
        System.out.println("Enter the Rate value :");
        double r = sc.nextDouble();
        System.out.println("Enter the Time  value :");
        double t = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("Simple Intrest Is : "+si);


    }
}
