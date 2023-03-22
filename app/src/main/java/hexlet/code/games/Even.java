package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void checkParity() {
        String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAnswers = new String[Engine.ROWS][Engine.MAX_ROUNDS];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int number = Utils.getNextRandom();

            questionsAnswers[Engine.ROW_FOR_QUESTIONS][i] = Integer.toString(number);
            questionsAnswers[Engine.ROW_FOR_ANSWERS][i] = (isEven(number)) ? "yes" : "no";
        }

        Engine.doCommonLogic(questionsAnswers, condition);
    }
}
