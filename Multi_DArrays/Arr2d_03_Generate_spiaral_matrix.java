package JAVA_Programs.Multi_DArrays;

import java.util.Scanner;

public class Arr2d_03_Generate_spiaral_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of N : ");
        int n=sc.nextInt();
        int ans[][] = Generate_Spiral(n);
     print_array(ans);
    }
    public static void print_array(int[][] matrix ){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static int[][] Generate_Spiral(int n){
        int topRow=0;int bottomrow = n-1;int leftCol=0;int rightCol=n-1;
        int curr=1;
        int[][] matrix=new int[n][n];
        while(curr <= n*n){
            // First Row Print
            for (int i=leftCol;i<=rightCol && curr<=n*n;i++ ){
                matrix[topRow][i]=  curr++; // Here row is Fixe
            }
            topRow++;
            // Last column is Print from top row to bottom row
            for (int j=topRow;j<=bottomrow && curr<=n*n;j++){
                matrix[j][rightCol]=curr++;
            }
            rightCol--;
            for (int k=rightCol;k >= leftCol && curr<=n*n;k--){
                matrix[bottomrow][k]=curr++;
            }
            bottomrow--;
            for (int l=bottomrow;l>=topRow && curr<=n*n;l--){
                matrix[l][leftCol]=curr++;
            }
            leftCol++;
        }
        return matrix;
    }
}
