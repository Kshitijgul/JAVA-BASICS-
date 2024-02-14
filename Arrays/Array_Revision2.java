package JAVA_Programs.Arrays;
import java.util.Scanner;
import java.util.*;

public class Array_Revision2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n =sc.nextInt();
        int arr[][] = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }      for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
