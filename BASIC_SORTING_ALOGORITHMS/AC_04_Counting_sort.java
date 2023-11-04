package JAVA_Programs.BASIC_SORTING_ALOGORITHMS;

public class AC_04_Counting_sort {
    public static void counting_sort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for (int i=0;i< arr.length;i++){
            count[arr[i]]++;
        }
        // SOrting
        int j=0;
        for (int i=0;i< arr.length;i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={9,8,4,5,63,57,85,14,1,48,8,9,48};
        counting_sort(arr);
        for (int i:arr) {
            System.out.print(i + " ");
        }

    }
}
