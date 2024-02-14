package JAVA_Programs.OOP_Programming;

import java.util.Scanner;

class Algebra{
    int sum(int a , int b){
        int ans = a+b;
        return ans;
    }
}
public class sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("The sum of Number is : ");
        Algebra obj = new Algebra();
        int ans = obj.sum(x,y);
        System.out.println(ans);
    }
}
