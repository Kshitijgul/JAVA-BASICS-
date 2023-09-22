package JAVA_Programs.Arrays;

public class reverse_array {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void reverse_arr(int arr[]){
        int j=arr.length - 1;
        for (int i=0;i<=j;i++){
            swap(arr,i,j);
//            i++;
            j--;
        }

    }
    public static void main(String[] args){
        System.out.println("Reverse a Array :");
        int[] arr={1,2,3,4,5};
//        int n= arr.length;
//        int j=0;
//        int[] ans=new int[n];
//        for(int i=n-1;i>=0;i--){
//            ans[j++]=arr[i];
//        }
//        for (int i=0;i< ans.length;i++){
//            System.out.print( ans[i]+" ");
//        }
        reverse_arr(arr);
        for (int element:arr) {
            System.out.print(element + " ");
        }
    }
}
