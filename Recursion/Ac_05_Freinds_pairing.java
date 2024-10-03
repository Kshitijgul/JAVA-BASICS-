package JAVA_Programs.Recursion;

public class Ac_05_Freinds_pairing {
    public static int freinds_pairing(int n){
        if ( n== 1 || n == 2){
            return n;
        }
        int fnm1 = freinds_pairing(n-1);

        int fnm2 = freinds_pairing(n-2);
        int pairWays = (n-1) * fnm2;

        int tot_ways = pairWays + fnm1;
        return tot_ways;
    }
    public static void main(String[] args) {
        System.out.println(freinds_pairing(3));

    }
}
