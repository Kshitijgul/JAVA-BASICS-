package JAVA_Programs;

public class AC_02_Diagonal_sum {
    public static void diagonal_sum(int[][] arr){
        int sum=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[0].length;j++){
                if (i == j){
                  sum +=arr[i][j];
                }
                if (i + j == arr.length-1){
                    sum +=arr[i][j];
                }
            }
        }
        System.out.println("the sum is :  " + sum);
    }
    public static void optimize_diagonal_sum(int[][] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
//            primary
            sum+=arr[i][i];
            if(i != arr.length-1-i){
                sum += arr[i][arr.length-i-1];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[][] array2D = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        diagonal_sum(array2D);
        optimize_diagonal_sum(array2D);
    }
}
