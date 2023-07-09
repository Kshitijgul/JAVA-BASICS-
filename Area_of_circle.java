package JAVA_Programs;
import  java.util.*;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The radius Of Circle :  ");
        double radius = sc.nextDouble();

        double pi = 3.14;
        double Area=pi*radius*radius;
        double circum = 2*pi*radius;
        System.out.println("The Area Of Circle Is : " + Area);
        System.out.println("The Circumference Of a Circle is :" + circum);

    }
}
