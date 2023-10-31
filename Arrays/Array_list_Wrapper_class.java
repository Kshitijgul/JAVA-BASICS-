package JAVA_Programs.Arrays;
import java.util.ArrayList;

public class Array_list_Wrapper_class  {
    public static void main(String[] args) {
        Integer num=new Integer(4); // This is a Old Method
        Integer num1 =Integer.valueOf(8);
        System.out.println(num);
        System.out.println(num1);

        // ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
//        ArrayList<Boolean> bool = new ArrayList<>();
//        ArrayList<Float> l3 = new ArrayList<>();

        // Adding The Elements :
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);

        // GET and element  at the Index :
        System.out.println("Arr Element at First Index is :  "+arr.get(1));

        // Print The Elements with Loop
        System.out.println("Printing The ELements :  ");
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        System.out.println("Printing the Array List Directly :  ");

        // Printing The Array List Directly
        System.out.println(arr);

        // Adding Element at some Index :
        arr.add(1,12);
        System.out.println(arr);

        // Modifying The Element :
        arr.set(1,45);
        System.out.println(arr);

        // Remobing An Element :
        arr.remove(1);
        System.out.println(arr);

        // Checking IF and Element is Exist Or Not

        boolean ans = arr.contains(Integer.valueOf(6));
        System.out.println(ans);

        // If You Dont Specify class You can put anything

        ArrayList l1=new ArrayList();
        l1.add(5);
        l1.add("Happy Birthday Tannu ");
        l1.add(true);
        System.out.println(l1);


    }

}
