package JAVA_Programs.Multi_DArrays;

import java.util.Scanner;

public class Arr2d_03_Sum_of_rectangle {

    // Given a Matrix 'a' of dimension n*m and 2 coordinates (l1,r1) and (l2,r2).
    // Return the sum of the Rectangle from (l1,r1) to (l2,r2)
    static void find_prefix_sum(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        // Traverse Horizontally to calculate row-wise matrix
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }

    static int findsum(int[][] matrix , int l1,int r1,int l2,int r2){
        int sum=0;
        for (int i=l1;i<=l2;i++){
            for (int j=r1;j<=r2;j++){
                sum +=matrix[i][j];
            }
        }
        return sum;
    }
    static int findsum_method2(int[][] matrix , int l1,int r1,int l2,int r2){
        int sum=0;
        find_prefix_sum(matrix);
        for (int i=l1;i<=l2;i++){
            sum = r1 == 0 ? matrix[i][r2] : matrix[i][r2] - matrix[i][r1-1];
        }
        return sum;
    }
    public static void print_array(int[][] matrix ){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Rows of Matrix : ");
        int r = sc.nextInt();
        System.out.println("enter the Columns of Matrix : ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the "+ r*c + "Elements : ");

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                 arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix is : ");
        print_array(arr);

        System.out.println("enter Rectangle Boundaries : ");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2= sc.nextInt();
        int r2= sc.nextInt();

        System.out.println("sum of Rectangle is : " + findsum(arr,l1,r1,l2,r2));
        System.out.println("sum of Rectangle is : " + findsum(arr,l1,r1,l2,r2));
    }
}
