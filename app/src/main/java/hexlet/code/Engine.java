package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;

    public static void doCommonLogic(String[][] questions, String[][] answers, String condition) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(condition);

        for (int i = 0; i < MAX_ROUNDS; i++) {
            System.out.println("Question: " + questions[i][i]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(answers[MAX_ROUNDS][MAX_ROUNDS])) {
                System.out.println("Correct!");
                System.out.println("Congratulations, " + userName + "!");
                break;
            } else if (answer.equals(answers[i][i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + answers[i][i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        scanner.close();
    }
}
