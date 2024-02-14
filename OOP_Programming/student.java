package JAVA_Programs.OOP_Programming;
public class student{
    // We can have only one Public class in java Program 
    String name = "Kshitij ";
    int roll = 15;
}
 class program_01 {
    public static void main(String[] args){
        student student1 = new student();
        System.out.println(student1.name);
        System.out.println(student1.roll);
    }
}
