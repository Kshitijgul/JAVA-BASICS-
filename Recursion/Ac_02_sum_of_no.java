package JAVA_Programs.Recursion;

public class Ac_02_sum_of_no {
    public static int Sum_of_n(int n){
        if (n ==1 ){
            return 1;
        }
        int sumnm1 = Sum_of_n(n-1);
        int sum = n + sumnm1;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(Sum_of_n(10));
    }
}
