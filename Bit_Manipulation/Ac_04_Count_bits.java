package JAVA_Programs.Bit_Manipulation;

public class Ac_04_Count_bits {
    public static int countBits(int n ){
        int count = 0;
        while(n>0){
            if((n&1) != 0 ){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(        countBits(10));;


    }
}
