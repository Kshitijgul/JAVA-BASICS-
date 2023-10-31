package JAVA_Programs.Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist_reverse_array {
    public static void  Reverselist(ArrayList<Integer> array){
        int i=0;int j=array.size() - 1;
        while (i<j){
            // Swapping Program :
            Integer temp = Integer.valueOf(array.get(i));
            array.set(i,array.get(i));
            array.set(j,temp);

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(10);
        arr.add(3);
        arr.add(5);
        arr.add(22);
        arr.add(10);
        System.out.println("Given Array List is :  " + arr);
        Collections.reverse(arr);
//        Reverselist(arr);
        System.out.println("Reversed List is :  " +  arr);

    }
}
