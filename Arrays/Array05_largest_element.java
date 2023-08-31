package JAVA_Programs.Arrays;

import java.util.*;

public class Array05_largest_element {
    public static int Large_small(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smaller=Integer.MAX_VALUE;
        for (int i = 0;i<numbers.length;i++){
            if (numbers[i]>largest){
                largest=numbers[i];
            }
            if (numbers[i]<smaller){
                smaller=numbers[i];
            }
        }
        System.out.println("The Samllest Element is : " + smaller);
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int numbers[]={2,3,4,5,78,96,13,45,61};

int largest = Large_small(numbers);
        System.out.println("Largest Value is :  " + largest);

    }


}
