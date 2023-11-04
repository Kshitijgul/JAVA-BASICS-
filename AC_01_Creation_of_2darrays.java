package JAVA_Programs;

import java.util.Scanner;

public class AC_01_Creation_of_2darrays {
    public static boolean search(int key,int[][] matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[0].length;j++){
                if(key == matrix[i][j]){
                    System.out.println("Found at "+ " ( "+ i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key Not Found ");
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int n=arr.length, m= arr[0].length;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Output is :  ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        search(6,arr);
    }
}
