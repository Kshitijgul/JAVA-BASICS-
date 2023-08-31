package JAVA_Programs.Arrays;

public class Array03_Linear_Search {
    public static int Linearsearch(int numbers[], int key){
        for (int i =0;i<= numbers.length;i++){
            if (numbers[i]==key){
                return i;
            }
        }
        return -1; // Means Key is not Present
    }
    public static void main(String[] args) {
        System.out.println("Lets search the Element : ");
        int numbers[]={2,4,6,8,10,12,14,16};
        int index= Linearsearch(numbers,10);
        if (index == -1){
            System.out.println("Element is not Found ! ");
        }else{
            System.out.println("Element is found at "+ index);
        }

    }
}
