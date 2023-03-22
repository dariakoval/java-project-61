package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }

        }

        return true;
    }

    public static void checkNumber() {
        String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAnswers = new String[Engine.ROWS][Engine.MAX_ROUNDS];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int number = Utils.getNextRandom();

            questionsAnswers[Engine.ROW_FOR_QUESTIONS][i] = Integer.toString(number);
            questionsAnswers[Engine.ROW_FOR_ANSWERS][i] = (isPrime(number)) ? "yes" : "no";
        }

        Engine.doCommonLogic(questionsAnswers, condition);
    }
}
