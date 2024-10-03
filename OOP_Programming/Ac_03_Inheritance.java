package JAVA_Programs.OOP_Programming;

public class Ac_03_Inheritance {
    public static void main(String[] args){
        Fish shark = new Fish();
        shark.eat();

//        MULTILEVEL INHERITANCE
        Dog puppy = new Dog();
        puppy.eat();
        puppy.breed = "Rotwiller" ;
        System.out.println(puppy.breed);

    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats ");
    }
    void breathe(){
        System.out.println("Breathe ");
    }
}

// Single Level Inheritance
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in the water ");
    }
}


//Multilevel Inheritance

class Mammels extends Animal{
    int legs;
}
class Dog extends Mammels{
    String breed;
}
