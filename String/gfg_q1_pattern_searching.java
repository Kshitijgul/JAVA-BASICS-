package JAVA_Programs.String;
import java.util.*;

public class gfg_q1_pattern_searching {
    public static void search_pattern(String str,String str_pat){
        int pos = str.indexOf(str_pat);
        while(pos >= 0){
            System.out.println(pos + " ");
            pos = str.indexOf(str_pat,pos + 1);

        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Enter a String  Pattern : ");
        String str_pattern = sc.nextLine();
        search_pattern(str,str_pattern);


    }


}
