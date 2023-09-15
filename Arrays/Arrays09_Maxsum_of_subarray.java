package JAVA_Programs.Arrays;

public class Arrays09_Maxsum_of_subarray {
    public static void max_sumarray(int numbers[]){
        int Curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for (int i=0;i< numbers.length;i++){
            int start=i;
            for (int j=i;j< numbers.length;j++){
                int end=j;
                Curr_sum=0;
                for (int k=start;k<=end;k++){
                    Curr_sum +=numbers[k];
                }
                System.out.println(Curr_sum);
                if (Curr_sum > max_sum){
                    max_sum=Curr_sum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum Sum is : "+max_sum);
    }
    public static void main(String[] args) {
//        int numbers[]={1,-2,6,-1,3};
        int numbers[]={2,4,6,8,10};
        max_sumarray(numbers);
    }
}
