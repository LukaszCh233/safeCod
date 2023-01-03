import java.util.Random;
import java.util.Scanner;

public class FindCode {
    public static void main(String[] args) {
        int trials = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("HELLO GUESS THE SAFE CODE");
        System.out.println("CODE HAVE 5 DIGIT");
        Random rcod = new Random();
        int find = rcod.nextInt(89999) + 10000;

        System.out.println("*****");
        String myNumber;
        String l = find+ "";

        do {
            trials++;
            System.out.println("GIVE A NUMBER:");
            myNumber = scanner.nextLine();
            if (myNumber.substring(0,1).equals(l.substring(0,1))) {
                System.out.println("the first number is correct");
            }
            if (myNumber.substring(1,2).equals(l.substring(1,2))) {
                System.out.println("the second number is correct");
            }
            if (myNumber.substring(2,3).equals(l.substring(2,3))) {
                System.out.println("the third number is correct");
            }
            if (myNumber.substring(3,4).equals(l.substring(3,4))) {
                System.out.println("the fourth number is correct");
            }
            if (myNumber.substring(4,5).equals(l.substring(4,5))) {
                System.out.println("the fifth number is correct");
            }
        } while (!myNumber.equals(l));
        System.out.println("GOOD YOU WIN");
        System.out.println("NUMBER OF ATTEMTS: "+ trials);
    }
}
