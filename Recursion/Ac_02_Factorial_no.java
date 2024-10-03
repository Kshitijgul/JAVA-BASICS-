package JAVA_Programs.Recursion;

public class Ac_02_Factorial_no {
    public static int fact_no(int n){
        if(n == 0 ){
            return 1;
        }
        int fnm1 = fact_no(n-1);
       int  fn = n * fnm1;
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(fact_no(5));

    }

}
