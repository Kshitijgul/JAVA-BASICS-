package  JAVA_Programs;
import java.util.Scanner;
public class calculating_percentage_of_five_subject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the marks of five subjects from the user.
        System.out.println("Enter the marks of the first subject:");
        int mark1 = scanner.nextInt();
        System.out.println("Enter the marks of the second subject:");
        int mark2 = scanner.nextInt();
        System.out.println("Enter the marks of the third subject:");
        int mark3 = scanner.nextInt();
        System.out.println("Enter the marks of the fourth subject:");
        int mark4 = scanner.nextInt();
        System.out.println("Enter the marks of the fifth subject:");
        int mark5 = scanner.nextInt();
        // Calculate the total marks.
        int totalMarks = mark1 + mark2 + mark3 + mark4 + mark5;
        // Calculate the average marks.
        float averageMarks = totalMarks / 5.0f;
        // Display the total marks and average marks to the user.
        System.out.println("The total marks are " + totalMarks);
        System.out.println("The average marks are " + averageMarks);
    }
}


