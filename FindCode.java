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
        String f = Integer.toString(find);
        String myNumber;

        String asterisk = "";
        for (int i = 0; i < f.length();i++){
            asterisk = asterisk +"*";
        }
        System.out.println(asterisk);

        do {
            trials++;
            System.out.println("GIVE A NUMBER:");
            myNumber = scanner.nextLine();

            int iterator = 0;
            char[] player = myNumber.toCharArray();
            for (char gueesNumber : f.toCharArray())
            {
                if (player[iterator] == gueesNumber) {
                    System.out.println("Number of position "+( iterator+ 1) +" is correcct");
                }
                iterator++;
            }
        } while (!myNumber.equals(f));
        System.out.println("GOOD YOU WIN");
        System.out.println("NUMBER OF ATTEMTS: "+ trials);
    }
}
