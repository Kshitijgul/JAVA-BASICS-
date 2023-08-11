package JAVA_Programs.ALL_Patterns;
import java.util.*;
//         x  x  x  x  x
//         x  x  x  x
//         x  x  x
//         x  x
//         x

public class pattern_7 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a No. of Lines : ");
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j= 1; j <=n + 1 - i;j++){
                System.out.print(" x ");

            }
            System.out.println();
        }


    }
}
