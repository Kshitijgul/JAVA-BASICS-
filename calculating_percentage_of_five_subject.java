package JAVA_Programs;
import java.util.*;

/**
 * calculating_percentage_of_five_subject
 */
public class calculating_percentage_of_five_subject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Subject 1 mark is: " );
        int s1 = sc.nextInt();
        System.out.print("Subject 2 mark is: " );
        int s2 = sc.nextInt();
        System.out.print("Subject 3 mark is: " );
        int s3 = sc.nextInt();
        System.out.print("Subject 4 mark is: " );
        int s4 = sc.nextInt();
        System.out.print("Subject 5 mark is: " );
        int s5 = sc.nextInt();
        int percentage = 5*100;
        System.out.println("The Percentage is : " + percentage);
    }

    
}