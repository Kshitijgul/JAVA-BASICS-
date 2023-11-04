package JAVA_Programs.BASIC_SORTING_ALOGORITHMS;

public class AC_02_Selection_sort {
    public static void Selection_sort(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int min_pos=i;
            for (int j=i+1;j<n;j++){
                if (arr[min_pos] > arr[j]){ // Here we can change Ascending and descending Order
                    min_pos=j;
                }
            }
            int temp=arr[min_pos];
            arr[min_pos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args){
        int[] arr={9,6,5,8,4,2};
        Selection_sort(arr);
        for (int i:arr) {
            System.out.print(i + " ");
        }

    }
}
