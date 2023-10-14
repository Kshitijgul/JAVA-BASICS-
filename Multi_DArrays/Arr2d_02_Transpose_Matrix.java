package JAVA_Programs.Multi_DArrays;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Arr2d_02_Transpose_Matrix {
    static void printmatrix(@NotNull int[][] matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }
    static int[][] Find_transpose(int[][] arr,int r ,int c){
        int[][] ans=new int[c][r];
        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Information for First Matrix : ");
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
        System.out.println("Output is : ");
int[][] ans = Find_transpose(matrix1,r1,c1);
printmatrix(ans);


    }
}
