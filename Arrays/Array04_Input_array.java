package JAVA_Programs.Arrays;

import java.util.Scanner;

public class Array04_Input_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int marks[]=new int[size];
        // For Input the Elements of the array
        for (int i = 0;i<size;i++){
            marks[i]=sc.nextInt();

        }
        for (int i = 0;i<size;i++){
            System.out.print(" " + marks[i]);

        }


    }
}
