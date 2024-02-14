package JAVA_Programs.String;

public class gfg01_intialize_string {
    public static void main(String[] args){
        String name = "Aditya";
        String name2 = "Aditya";
        String name3 = new String("Aditya");
        String name4 = "AdityaGuladhe";

        System.out.println(name.length());
        System.out.println(name.charAt(2)); // It Returns a Character and we cannot use this on left side
        System.out.println(name.substring(2)); // Substring from the right of the index 2
        System.out.println(name.substring(2,5));

        if(name == name2){
            System.out.println("It is same ! ");
        }else{
            System.out.println("This is not same ");
        }
        if(name == name3){
            System.out.println("It is same ! ");
        }else{
            System.out.println("This is not same ");
        }
        System.out.println(name4.contains(name));
        System.out.println(name3.equals(name));
        System.out.println(name4.indexOf(name)); // If I passed the wrong value then we will get Negative value

    }
}
