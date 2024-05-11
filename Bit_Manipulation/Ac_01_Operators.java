package JAVA_Programs.Bit_Manipulation;

import java.util.Scanner;

public class Ac_01_Operators {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        int num1, num2;
        while(true){
            System.out.println("Enter the Two Numbers : ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("Choose the Below Options : ");
            System.out.println("1 . And ");
            System.out.println("2. OR");
            System.out.println("3. XOR");
            System.out.println("4. Left Shift");
            System.out.println("5. Right Shift");
            System.out.println("6. Exit");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Result of AND operation: " + (num1 & num2));
                    break;
                case 2:
                    System.out.println("Result of OR operation: " + (num1 | num2));
                    break;
                case 3:
                    System.out.println("Result of XOR operation: " + (num1 ^ num2));
                    break;
                case 4:
                    System.out.println("Enter the number of bits to left shift:");
                    int shiftLeft = sc.nextInt();
                    System.out.println("Result of left shift operation: " + (num1 << shiftLeft));
                    break;
                case 5:
                    System.out.println("Enter the number of bits to right shift:");
                    int shiftRight = sc.nextInt();
                    System.out.println("Result of right shift operation: " + (num1 >> shiftRight));
                    break;
                case 6:
                    System.out.println("Exit the Progam ");
                    System.exit(0);
                default:
                    System.out.println("Invalid Option ! Please Choose Again");
            }

        }
    }
}
