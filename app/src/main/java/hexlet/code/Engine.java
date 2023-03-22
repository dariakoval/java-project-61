package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;
    public static final int ROWS = 2;
    public static final int ROW_FOR_QUESTIONS = 0;
    public static final int ROW_FOR_ANSWERS = 1;

    public static void doCommonLogic(String[][] questionsAnswers, String condition) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(condition);

        int roundsCount = 0;

        for (int i = 0; i < MAX_ROUNDS; i++) {
            System.out.println("Question: " + questionsAnswers[ROW_FOR_QUESTIONS][i]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(questionsAnswers[ROW_FOR_ANSWERS][i])) {
                System.out.println("Correct!");
                roundsCount++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAnswers[ROW_FOR_ANSWERS][i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (roundsCount == MAX_ROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
        }

        scanner.close();
    }
}
