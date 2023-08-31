package JAVA_Programs.Arrays;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class Even_digits_L1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(digits(-458974));



    }
    public int findNumbers(int[] nums) {
        int count=0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;

    }
    static boolean even(int num){
        int Number_of_digits=digits(num);
//        if (Number_of_digits % 2 ==0){
//            return true;
//        }
        return Number_of_digits % 2 ==0; // This will return true or false
    }
    static int digits(int num){
//        for Negative Number
        if (num<0){
            num=num*-1;
        }
        if (num == 0){
            return 1;
        }

        int count=0;
        while (num>0){
            count++;
            num= num/10;
        }
        return count;
    }

}
