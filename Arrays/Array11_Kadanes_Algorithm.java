package JAVA_Programs.Arrays;

public class Array11_Kadanes_Algorithm {
    public static int kadanes(int numbers[]){
        int cur_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int small_value = Integer.MIN_VALUE; // Initialize small_value to the minimum possible integer
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > small_value) {
                small_value = numbers[i]; // Update small_value if the current element is greater
            }
            cur_sum = cur_sum + numbers[i];
            if (cur_sum < 0) {
                cur_sum = 0;
            }
            max_sum = Math.max(cur_sum, max_sum);
        }
        // If all numbers are negative, return the maximum negative number
        if (max_sum == 0) {
            return small_value;
        }
        return max_sum;
    }

    public static void main(String[] args) {
        // int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int numbers[] = {-3};
        System.out.println(kadanes(numbers));
    }
}
