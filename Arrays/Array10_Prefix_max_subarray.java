package JAVA_Programs.Arrays;

public class Array10_Prefix_max_subarray {
    public static void Max_subarray(int numbers[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] =new int[numbers.length];
        prefix[0]=numbers[0];
        for (int i=1;i< prefix.length;i++){
            prefix[i]=prefix[i-1] - numbers[i];
        }

        for (int i=0;i<numbers.length;i++){
            int start =i;
            for (int j =0;j< numbers.length;j++){
                int end=j;
                curr_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (max_sum<curr_sum){
                    max_sum=curr_sum;
                }
            }
        }
        System.out.println("Max sum is : " + max_sum);

    }
    public static void main(String[] args) {
        int numbers[]={4,9,7,8,6,-9,-2,-3};
        Max_subarray(numbers);

    }
}
