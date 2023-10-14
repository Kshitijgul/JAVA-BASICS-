package JAVA_Programs.Multi_DArrays;

import java.util.Scanner;

public class Arrays2D_01_Intilization {
    public static void print2D_array(int arr[][]){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter Number of Columns : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter " + r * c + " Elements :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print the entire 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }

        System.out.println("********************************************");
//        int[][] arr2={{1,2,3},{4,5,6},{7,8,9}};
////        System.out.println(arr2[2][2]);
//        print2D_array(arr2);
    }
}
