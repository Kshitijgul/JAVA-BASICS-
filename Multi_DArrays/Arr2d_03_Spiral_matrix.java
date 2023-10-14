package JAVA_Programs.Multi_DArrays;

import java.util.Scanner;

public class Arr2d_03_Spiral_matrix {
    public static void print_array(int[][] matrix ){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void printspiralOrder(int[][] matrix , int r , int c){
        int topRow=0;int bottomrow = r-1;int leftCol=0;int rightCol=c-1;
        int totalElements =0;
        while(totalElements < r * c){
            // First Row Print
            for (int i=leftCol;i<=rightCol && totalElements<r*c;i++ ){
                System.out.print(matrix[topRow][i]+" ");  // Here row is Fixed
                totalElements++;
            }
            topRow++;
            // Last column is Print from top row to bottom row
            for (int j=topRow;j<=bottomrow && totalElements<r*c;j++){
                System.out.print(matrix[j][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            for (int k=rightCol;k >= leftCol && totalElements<r*c;k--){
                System.out.print(matrix[bottomrow][k]+" ") ;
                totalElements++;
            }
            bottomrow--;
            for (int l=bottomrow;l>=topRow && totalElements<r*c;l--){
                System.out.print(matrix[l][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Information of Matrix : ");
        System.out.println("Enter the Number of row : ");
        int r= sc.nextInt();
        System.out.println("Enter the Number of Column : ");
        int c = sc.nextInt();
        int[][] matrix=new int[r][c];
        System.out.println("Enter the Elements : ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("INput Matrix is : ");
        print_array(matrix);
        System.out.println("Output Matrix is   : ");
        printspiralOrder(matrix,r,c);
        print_array(matrix);
    }
}
