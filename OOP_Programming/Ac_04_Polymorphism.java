package JAVA_Programs.OOP_Programming;

public class Ac_04_Polymorphism {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5,6));
        System.out.println(calc.sum(5.2f,6.6f));
        System.out.println(calc.sum(5,6,7));

        India indi = new India();
        indi.print();
        Country con = new Country();
        con .print();

    }
}

class Country{
    void print(){
        System.out.println("India is the Baap of Pakistan ");
    }
}
class India extends Country{
    void print(){
        System.out.println("Yesss , Iam Father of Pakistan  ");
    }
}
class Calculator{  // Method OverLoading
    int sum(int a , int b){
        return a+b;
    }
    float sum(float a , float b){
        return a+b;
    }

    int sum(int a , int b, int c){
        return a+b+c;
    }
}
