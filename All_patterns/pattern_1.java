package JAVA_Programs.ALL_Patterns;
import java.util.*;



//****
//****
//****
//****
public class pattern_1 {
    public static void main(String[] args) {
            System.out.println();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(n);
        for (int i = 1 ; i<=n;i++){        //Outer Loop --> No. Of Lines = No. OF Rows
                for (int j = 1;j<=n;j++){  // Inner Loop --> No. Of stars In Each Line   = No. Of Columns
                    System.out.print(" * ");
                }
            System.out.println();
            }

    }
}
