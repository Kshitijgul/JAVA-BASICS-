package JAVA_Programs.OOP_Programming;

import java.util.Scanner;

class Algebra1{
    int a ;
    int b;
    Algebra1(int x , int y ){
        System.out.println("Constructor of the Class is Class");
        a=x;
        b=y;
    }
    int add(){
        int ans = a+b;
        return ans;
    }

}

public class oop_02_constructor_sum {
    public static void main(String[] args){
        Algebra1 obj = new Algebra1(8,9);
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
        System.out.println("The sum of two Numbers is :  ");
        int ans = obj.add();
        System.out.println(ans);


    }

}
