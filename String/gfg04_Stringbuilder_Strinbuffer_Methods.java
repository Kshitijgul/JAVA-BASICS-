package JAVA_Programs.String;

public class gfg04_Stringbuilder_Strinbuffer_Methods {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);

    }
}
