package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void checkParity() {
        String[][] questionsAnswers = createArrayForGame();
        Engine.doCommonLogic(questionsAnswers, DESCRIPTION);
    }

    public static String[][] createArrayForGame() {
        String[][] questionsAnswers = new String[Engine.MAX_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int number = Utils.generateNumber(MIN, MAX);

            questionsAnswers[i][Engine.COLUMN_FOR_QUESTIONS] = Integer.toString(number);
            questionsAnswers[i][Engine.COLUMN_FOR_ANSWERS] = (isEven(number)) ? "yes" : "no";
        }

        return  questionsAnswers;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
