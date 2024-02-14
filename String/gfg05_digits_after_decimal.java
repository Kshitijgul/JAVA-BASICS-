package JAVA_Programs.String;

public class gfg05_digits_after_decimal {
    public static void main(String[] args){
        String no = "12.385";
        int pos = no.indexOf(".");
        if(pos < 0){
            System.out.println(" ");
        }else{
            System.out.println(no.substring(pos+1));
        }
    }
}
