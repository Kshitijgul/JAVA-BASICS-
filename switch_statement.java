package JAVA_Programs;
import java.util.*;

public class switch_statement {
//    =====================THis is a Very Hard technique===============
//    public static void main(String[] args) {
//        System.out.println("Choose Your Language : ");
//        System.out.println("For English Press 1 ");
//        System.out.println("For Marathi Press 2 ");
//        System.out.println("For Hindi Press 3 ");
//        System.out.println("For Japanese Press 4 ");
//        System.out.println("------------------------------------------------");
//        Scanner sc = new Scanner(System.in);
//        int button = sc.nextInt();
//        if (button == 1){
//            System.out.println("Hello My Freind ! ");
//        }else if (button == 2){
//            System.out.println("Namskar Mazya Mitrano ! ");
//        } else if (button == 3) {
//            System.out.println("Namste Mere Dosto ! ");
//        } else if (button == 4) {
//            System.out.println("\n" +
//                    "こんにちは、私の友達");
//        }else{
//            System.out.println("Invalid Button ! ");
//        }
//    }
public static void main(String[] args) {
    System.out.println("To simply things we can use Switch Statements . ");
    System.out.println("Choose Your Language : ");
        System.out.println("For English Press 1 ");
        System.out.println("For Marathi Press 2 ");
        System.out.println("For Hindi Press 3 ");
        System.out.println("For Japanese Press 4 ");
        System.out.println("------------------------------------------------");
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();
    switch (button){
        case 1 :
            System.out.println("Hello My Freind ");
            break;
        case 2:
            System.out.println("Namskar Mazya Mitrano ");
            break;
        case 3:
            System.out.println("Namste Mere Dost  ");
            break;
        case 4:
            System.out.println(
                    "こんにちは、私の友達");
            break;
        default:
            System.out.println("Invalid button ! ");



    }
}
}
