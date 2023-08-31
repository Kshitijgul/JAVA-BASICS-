package JAVA_Programs.Arrays;

public class Array06_reverse_array {
    public static void reverse_array(int numbers[]){
        int first=0,last= numbers.length-1;
        while(first< last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            last--;
            first++;
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        reverse_array(numbers);
        for (int num:numbers){
            System.out.print(num + " ");
        }

    }
}
