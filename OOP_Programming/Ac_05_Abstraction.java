package JAVA_Programs.OOP_Programming;

public class Ac_05_Abstraction {
    public static void main(String[] args) {
//        Animal1 anm = new Animal1();        This will givve Erropr
        Horse n = new Horse();
        n.eat();
        n.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();



    }
}
abstract class Animal1{
    String color;
    Animal1(){  // Constructors
        color = "Brown";
    }
    void eat(){
        System.out.println("Animal Eats ");
    }

    abstract void walk();
}
class Horse extends Animal1{
    void walk(){
        System.out.println("Horse walking on 4 Legs ");
    }
}
class Chicken extends Animal1{
    @Override
    void walk() {
        System.out.println("Chicken walks on 2 Legs ");
    }
}
