package hexlet.code;
import hexlet.code.games.Even;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner0 = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice: ");
        String choice = scanner0.next();
        if (choice.equals("1")) {
            Cli.greeting();
        } else if (choice.equals("2")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            String userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
            Even.parityCheck(userName);
        }
    }
}
