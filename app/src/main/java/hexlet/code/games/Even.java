package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void checkParity() {
        String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questions = new String[Engine.MAX_ROUNDS][Engine.MAX_ROUNDS];
        String[][] answers = new String[Engine.MAX_ROUNDS][Engine.MAX_ROUNDS];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int number = Utils.getNextRandom();

            questions[i][i] = Integer.toString(number);
            answers[i][i] = (isEven(number)) ? "yes" : "no";
        }

        Engine.doCommonLogic(questions, answers, condition);
    }
}
