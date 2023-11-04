package JAVA_Programs.BASIC_SORTING_ALOGORITHMS;
import java.util.Arrays;

public class AC_01_Bubble_sort_inbuilt_sort {
    static void bubblesort(int[] a){
        int n=a.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
//                last i elements are correct in that place so
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a= {7,6,5,4,3};
        bubblesort(a);
        for (int i:a){
            System.out.print(i + " ");
        }
        Arrays.sort(a);
        System.out.println();
        System.out.println("Arryays using Sort Method");
        for (int i:a){
            System.out.print(i + " ");
        }
        
    }
}
