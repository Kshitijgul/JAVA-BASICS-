package JAVA_Programs.String;

public class gfg_06_reverse_string {
    public static void main(String[] args){
        String a = "Hello";
        String b = " ";
        int ptr = a.length()-1;
        System.out.println(ptr) ;
        while(ptr >= 0 ) {
            b = b + a.charAt(ptr);
            ptr--;
        }
        System.out.println(b);
    }
}
