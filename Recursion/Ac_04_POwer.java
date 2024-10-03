package JAVA_Programs.Recursion;

public class Ac_04_POwer {
    public static int HalfpowerSQ(int x,int n){
        if( n== 0){
            return 1;
        }
        int halfPower = HalfpowerSQ( x, n/2);
        int OptHalfpower = halfPower * halfPower ;

        // n is Odd
        if(n % 2 != 0){
            OptHalfpower = x * OptHalfpower;
        }
        return OptHalfpower;
    }
    public static int power(int x,int n){
        if(n == 0){
            return 1;
        }
        return x * power(x , n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
        System.out.println(HalfpowerSQ(2,10));

    }
}
