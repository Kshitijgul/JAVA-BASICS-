package JAVA_Programs.Recursion;

public class Ac_04_Tiling_problem {
    public static int TilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fnm1 = TilingProblem(n-1); // For Vertical
        int fnm2 = TilingProblem(n-2); // For Horizontal

        int totways = fnm1 + fnm2;
        return totways;
    }
    public static void main(String[] args) {
        System.out.println(TilingProblem(4));

    }
}
