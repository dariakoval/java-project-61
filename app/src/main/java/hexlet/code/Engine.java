package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;
    public static void doCommonLogic(String[] questions, String[] answers, String condition) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(condition);
        var i = 0; //индекс для массива String[] questions
        var j = 0; //индекс для массива String[] answers
        while (i < MAX_ROUNDS) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(answers[2]) && i == 2) {
                System.out.println("Correct!\nCongratulations, userName!");
                i++;
            } else if (answer.equals(answers[j])) {
                System.out.println("Correct!");
                i++;
                j++;
            } else {
                System.out.println("'"
                        + answer
                        + "' is wrong answer ;(. Correct answer was '"
                        + answers[j] + "'.\nLet's try again, userName!");
                i += 3;
                j += 3;
            }
        }
        scanner.close();
    }
}
