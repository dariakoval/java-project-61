package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    private static final String CHOICE_FOR_GREET = "1";
    private static final String CHOICE_FOR_EVEN = "2";
    private static final String CHOICE_FOR_CALC = "3";
    private static final String CHOICE_FOR_GCD = "4";
    private static final String CHOICE_FOR_PROG = "5";
    private static final String CHOICE_FOR_PRIME = "6";
    private static final String CHOICE_FOR_EXIT = "0";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String choice = scanner.next();

        switch (choice) {
            case CHOICE_FOR_GREET -> Cli.greeting();
            case CHOICE_FOR_EVEN -> Even.checkParity();
            case CHOICE_FOR_CALC -> Calc.calculateExpression();
            case CHOICE_FOR_GCD -> Gcd.findGcd();
            case CHOICE_FOR_PROG -> Progression.findMissElement();
            case CHOICE_FOR_PRIME -> Prime.checkNumber();
            case CHOICE_FOR_EXIT -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice. Try again.");
        }

    }
}
