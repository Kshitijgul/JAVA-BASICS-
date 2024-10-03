package JAVA_Programs.OOP_Programming;

public class Constructors {
    public static void main(String[] args){
        Geeks s1 = new Geeks();
//        Geeks s1 = new Geeks("Aditya");
//        Geeks s1 = new Geeks(0015);

        s1.name = "Shraddha";
        s1.roll = 011;
        s1.password = "abcsdjks";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=70;

        Geeks s2 = new Geeks(s1);
        s1.marks[1]=85;
        s2.password = "piofhkjg";

        for (int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Geeks {
    int roll;
    String name;
    String password;
    int marks[];


    // Shallow copy Constructor
//    Geeks(Geeks s1) { // Copy Constructor
//        this.name = s1.name;
//        this.roll = s1.roll;
//        marks = new int[3];
//        this.marks = s1.marks;
//    }
//

    // DEEP COPY
        Geeks(Geeks s1) { // Copy Constructor
        this.name = s1.name;
        this.roll = s1.roll;
        marks = new int[3];
        for(int i=0;i<marks.length;i++){
                this.marks[i] = s1.marks[i];
        }
    }

    Geeks() {
        System.out.println("Constructor is called ....");
        marks = new int[3];
    }

    Geeks(String name) {
        this.name = name;
        marks = new int[3];
    }

    Geeks(int roll) {
        this.roll = roll;
        marks = new int[3];
    }
}
