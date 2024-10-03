package JAVA_Programs.Bit_Manipulation;

public class Ac_03_BIt_Operations {
    public static int Get_ith_bit(int n,int i){
        int bitmask = 1 << i;
        if ((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int Set_ith_bit(int n, int i){
        int Bitmask = 1 << i;
        return n | Bitmask;
    }
    public static int Clear_ith_bit(int n , int i){
        int Bitmask = ~(1<<i);
        return n & Bitmask;
    }
    public static int Mke_1_bit(int n , int i){
        int Bitmask = 1 <<i;
        return n ^ Bitmask;
    }
    public static int updateBit(int n , int i , int newBit){
        n = Clear_ith_bit(n,i);
        int Bitmask = newBit << i;
        return n | Bitmask;
    }
    public static int Clear_ith_last_bit(int n,int i){
        int Bitmask = ((-1)<<i);
        return Bitmask & n;
    }
    public static int Clear_bits_in_range(int n , int i,int j){
        int a = ((-1)<<j+1);
        int b = ((1<<i)-1);
        int Bitmask = a| b;
        return Bitmask & n;
    }
    public static boolean isPowerof_2(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args){
        System.out.println(" ith Bit Operations ");
        System.out.println(Get_ith_bit(10,2));
        System.out.println("Set Ith Bit  "+ Set_ith_bit(10,2));
        System.out.println("Clear Ith Bit : " + Clear_ith_bit(10,1));
        System.out.println("Make 1 Bit : " + Mke_1_bit(10,2));
        System.out.println(updateBit(10,2,1));
        System.out.println(Clear_ith_last_bit(15,2));
        System.out.println(Clear_bits_in_range(10,2,4));
        System.out.println(isPowerof_2(16));

    }
}
