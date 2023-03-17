package hexlet.code;
import hexlet.code.games.Even;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner0 = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        System.out.print("Your choice: ");
        String choice = scanner0.next();
        switch (choice) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.parityCheck();
                break;
           // case "3":
                //Calc.calculateExpression();
               // break;
            default:
                scanner0.close();
        }
    }
}
