package JAVA_Programs.BASIC_SORTING_ALOGORITHMS;

public class AC_03_Insertion_Sort {
    public static void Insertion_sort(int[] arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            while (prev >=0 && arr[prev] > curr){
                arr[prev+1] =arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args){
        int[] arr={9,5,8,6,3,4};
        Insertion_sort(arr);
        for (int i:arr) {
            System.out.print(i + " ");
        }

    }
}
