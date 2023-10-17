package JAVA_Programs.Multi_DArrays;

import java.util.Scanner;

public class Arr2d_03_Third_approach_rectangle_sum {
    // calculate Row-wise and Column wise Sum
    // Matrix(i,j) = sumRectangle ((0,0) , (i,j))
    public static void find_prefixsum(int[][] arr){
        int r= arr.length;
        int c=arr[0].length;
        for (int i=0;i<r;i++){
            for(int j=1;j<c;j++){
               arr[i][j] += arr[i][j-1];
            }
        }

        // Traverse Vertically to to find the Columns Wise Probelems
        for (int j=0;j<c;j++){
            for (int i=1;i<r;i++){
                arr[i][j] += arr[i-1][j];
            }
        }
    }
    public static int find_sum(int[][] matrix , int l1,int r1,int l2,int r2){
        int ans=0;
        find_prefixsum(matrix);
        int sum=0;int up=0;int left=0;int leftup=0;
        sum = matrix[l2][r2];
        if (l1>1) {
            left = matrix[l2][r1 - 1];
        }
        if (l1>1) {
            up = matrix[l1 - 1][r2];
        }
        if (l1 >= 1 && r1 >= 1) {
            leftup = matrix[l1 - 1][r1 - 1];
        }
        ans = sum - up - left + leftup ;
        return sum;
    }
    public static void print_array(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length ;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows and Columns of Matrix : ");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter The " + r*c +" Elements ");
        for (int i=0;i<c;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Output Array  is : ");
        print_array(arr);
        System.out.println("Enter Rectangle Boundries : ");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2= sc.nextInt();
        int r2= sc.nextInt();
        System.out.println("The Final Sum is :  "  + find_sum(arr,l1,r1,l2,r2));
    }
}
