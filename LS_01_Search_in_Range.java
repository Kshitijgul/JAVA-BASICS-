package JAVA_Programs;

import java.util.Scanner;

public class LS_01_Search_in_Range {
    public static void main(String[] args) {
//        int arr[]={1,2,3,45,6,89,74};
//       int result= Linear_search(arr,6,0,0);
//        if (result==1){
//            System.out.println("element is Found ! ");
//        }else {
//            System.out.println("Element is not Found !");
//        }
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Elements of Array : ");
        for (int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }  for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println("enter The target :");
        int target=sc.nextInt();

        int res1=Linear_search(arr,target);
        if (res1==1){
            System.out.println("element is Found ! ");
        }else {
            System.out.println("Element is not Found !");
        }

        System.out.print("Enter the second Target :");
        int sec_target=sc.nextInt();
        System.out.print("Enter the Starting range :");
        int start=sc.nextInt();
        System.out.print("Enter the Ending range element : ");
        int end=sc.nextInt();
        int res_range=Linear_search_in_range(arr,sec_target,start,end);
        if (res_range==-1){
            System.out.println("Element is not found ");
        }else {
            System.out.println("element is Found at index " + res_range);
        }

    }
    public static int Linear_search(int arr[],int target){
        if (arr.length==0){
            return -1;
        }
        for (int index=0;index<arr.length;index++){
            if (target==arr[index]){
                return 1;
            }
        }
        return -1;
    }
    public static int Linear_search_in_range(int arr[],int target,int start,int end){
        if (arr.length==0){
            return -1;
        }
        for (int index=0;index<arr.length;index++){
            if (target==arr[index]){
                return index;
            }
        }
        return -1;
    }
}
