package JAVA_Programs.Recursion;

public class rec_04_GCD {
    public static int brute_force(int a , int b){
        int gcd = 0;
        for (int i= 1;i<= Math.min(a , b);i++){
            if (a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static int Division_method(int a , int b){
        while(a % b != 0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return b;
    }
    public static int Euclid_method(int x , int y){
        if(y == 0){
            return x;
        }
        return Euclid_method(y,x%y);
    }
    public static void main(String args[]){
        int a = 24;
        int b = 15;
        System.out.println("The Brute Force result is : " + brute_force(a,b));
        System.out.println("The Long Division Method  result is : " + Division_method(a,b));
        System.out.println("The Recursion Method  result is : " + Euclid_method(a,b));


    }
}
