package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static void greeting() {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner1.next();
        System.out.println("Hello, " + userName + "!");

        scanner1.close();
    }
}
