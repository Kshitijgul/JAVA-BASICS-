package JAVA_Programs.Recursion;

public class Ac_03_First_occurance {
    public static int First_occurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return First_occurance(arr, key, i + 1);
    }
    public static int Last_occurance(int arr[], int key, int i) {
        if(i == arr.length){
            return -1;
        }
        int isFound = Last_occurance(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return  i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(First_occurance(arr, 5, 0));
    }
}
