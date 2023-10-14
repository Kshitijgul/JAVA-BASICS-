package JAVA_Programs.Multi_DArrays;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Arr2d_02_Rotate_Array {
    static void Transpose_inplace(int[][] matrix,int r , int c ){
        System.out.println("****This will Only run for square Matrix ! Beacuse it bases on The diagonals : ");
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void reverse_arr(int[] arr){
        int i=0;int j= arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][] matrix, int n){// int n beacuse rows and columns is same
// Transpose
        // Reverse each row
         Transpose_inplace(matrix,n,n);
         for (int i=0;i<n;i++){
             reverse_arr(matrix[i]);
         }
    }
    static void printmatrix(@NotNull int[][] matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Information for First Matrix This matrix will be squared  : ");
        System.out.println("Enter the Number of rows : ");
        int r1=sc.nextInt();
        System.out.println("Enter the Number of Columns : ");
        int c1=sc.nextInt();
        int[][] matrix1=new int[r1][c1];
        int elements=r1*c1;
        System.out.println("Enter "+ elements +" Elements : ");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                matrix1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input Matrix is : ");
        printmatrix(matrix1);
        System.out.println("Rotate Matrix will be :  ");
        rotate(matrix1,r1);
        printmatrix(matrix1);
    }
}
