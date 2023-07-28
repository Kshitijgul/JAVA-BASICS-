package JAVA_Programs;
import java.util.*;
public class Greatest_of_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Three Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c){
            System.out.println(a + " is greatest Number !");
        } else if (b>c && b>a) {
            System.out.println(b + " is greatest Number !");
        } else if (c>a && c>b) {
            System.out.println(c + " is greatest Number !");
        }
    }
}
