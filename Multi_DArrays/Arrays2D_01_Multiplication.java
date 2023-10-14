package JAVA_Programs.Multi_DArrays;

import java.util.Scanner;

public class Arrays2D_01_Multiplication {
    public static void Multiplication(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        if(c1 != r2){
            System.out.println("Multiplication cannot be Done !");
            return;
        }
        int[][] mult=new int[r1][c2];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<c1;k++){
                    mult[i][j] += (arr1[i][k]*arr2[k][j]);
                }
            }
        }
        System.out.println("Multiplication of 2 Matrices is : ");
        print2d_array(mult,r1,c2);
    }
    public static void print2d_array(int[][] arr,int r,int c){
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Information for First Matrix : ");
        System.out.println("Enter the Number of rows : ");
        int r1=sc.nextInt();
        System.out.println("Enter the Number of Columns : ");
        int c1=sc.nextInt();
        int[][] matrix1=new int[r1][c1];
        System.out.println("Enter Elements : ");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                matrix1[i][j]= sc.nextInt();
            }
        }
        print2d_array(matrix1,r1,c1);
        System.out.println(" ***************************** ");
        System.out.println("Enter the Information for second  Matrix : ");
        System.out.println("Enter the Number of rows : ");
        int r2=sc.nextInt();
        System.out.println("Enter the Number of Columns : ");
        int c2=sc.nextInt();
        int[][] matrix2=new int[r2][c2];
        System.out.println("Enter Elemnts : ");
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                matrix2[i][j]= sc.nextInt();
            }
        }
        print2d_array(matrix2,r2,c2);
        System.out.println("*************************************");
        Multiplication(matrix1,r1,c1,matrix2,r2,c2);
    }
}
