package JAVA_Programs.Bit_Manipulation;

public class Ac_05_Fast_Exponentian {
    public static int fast_expo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a; // Exponentiation by squaring
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fast_expo(3, 5));
    }
}
