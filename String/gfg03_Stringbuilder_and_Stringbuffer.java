package JAVA_Programs.String;

public class gfg03_Stringbuilder_and_Stringbuffer {
    public static void main(String[] args){
        String s1 = "Aadi";
        String s2 = s1;
        s1 = s1 + "Aaadi";
        if(s1 == s2){
            System.out.println("This is same ");
        }
        else{
            System.out.println("This is not Same ");
        }
        StringBuilder str = new StringBuilder("Aaadi");
        StringBuilder str2 = str;
        str = str.append(" is my name ");
        if( str == str2){
            System.out.println("Same ");
        }else{
            System.out.println("This is Not same ");
        }
    }
}
