package JAVA_Programs.Arrays;

public class Array02_create {
    public static void array_output(int marks[]){
        int non_changable = 10;
        for (int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Lets Create Array By Function : ");
        int marks[]={87,89,91};
        int non_changable=15; // Proof of Call by Reference 

        array_output(marks);
        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i]+"  ");
        }
        System.out.println();
        System.out.println(non_changable);


    }
}
