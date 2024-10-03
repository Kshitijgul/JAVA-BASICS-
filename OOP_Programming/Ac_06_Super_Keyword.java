package JAVA_Programs.OOP_Programming;

public class Ac_06_Super_Keyword {
    public static void main(String[] args) {
        Monkey mon = new Monkey();
        System.out.println(mon.color);
    }
}
class Animal3{
    String color;
    Animal3(){
        System.out.println("Animal Constructor is Called ! ");
    }
}
class Monkey extends Animal3{

    Monkey(){

        System.out.println("Monkey Constructor Is called ");
        super.color="brown";
    }
}