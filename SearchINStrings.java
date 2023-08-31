package JAVA_Programs;

import java.util.Scanner;

public class SearchINStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=sc.next();
//        String str="Kshitij";
        System.out.print("Enter a tartget Variable : ");
        char target=sc.next().charAt(0);
//        char target='j';
        System.out.println(search(str,target));

    }
    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i =0;i< str.length();i++){

            if (target== str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
