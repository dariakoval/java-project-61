package hexlet.code;
import hexlet.code.games.Even;

import java.util.Scanner;
public class App {
    static final String CHOICE_FOR_GREET = "1";
    static final String CHOICE_FOR_EVEN = "2";
   // static final String CHOICE_FOR_CALC = "3";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String choice = scanner.next();
        switch (choice) {
            case CHOICE_FOR_GREET:
                Cli.greeting();
                break;
            case CHOICE_FOR_EVEN:
                Even.parityCheck();
                break;
           // case "CHOICE_FOR_CALC":
                //Calc.calculateExpression();
               // break;
            default:
                scanner.close();
        }
    }
}
