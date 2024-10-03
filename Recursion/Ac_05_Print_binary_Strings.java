package JAVA_Programs.Recursion;

public class Ac_05_Print_binary_Strings {
    public static void print_binary(int n , int lastplace , String str){
        if(n == 0){
            System.out.println(str);
            return;
        }

        print_binary(n-1,0,str + "0");

        if(lastplace == 0){
            print_binary(n-1,1,str + "1");
        }
    }
    public static void main(String[] args) {
        System.out.println();
        print_binary(3,0,"");


    }
}
