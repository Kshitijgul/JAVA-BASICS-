package JAVA_Programs.OOP_Programming;

import java.sql.SQLOutput;

public class Ac_06_Static_Keyword {
public static void main(String[] args){
    Student3 s1 = new Student3();
    s1.School_name = "K JOhn ";

    Student3 s2 = new Student3();
    System.out.println(s2.School_name); // It is Not defined but it will Printed
}
}
class Student3{
    int roll_no;
    String name;

    static String School_name;

    void name(String name){
        this.name = name;
    }
    String  get_name(){
        return this.name;
    }

}
