package JAVA_Programs.Arrays;

public class swapping_values {
    public static void without_temp(int a , int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The value of a is :"+ a);
        System.out.println("The value of b is :"+ b);

    }
    public static void main(String[] args) {
        System.out.println("Program for Swapping two Values using temp :");
        int a=9;
        int b=3;
        int temp = a;
        a = b;
        b= temp;
        System.out.println("The value of a is : " + a);
        System.out.println("The value of b is : " + b);
        without_temp(a,b);

    }
}
