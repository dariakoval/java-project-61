package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static void findGcd() {
        String condition = "Find the greatest common divisor of given numbers.";
        String[][] questionsAnswers = createArrayForGame();

        Engine.doCommonLogic(questionsAnswers, condition);
    }

    public static String[][] createArrayForGame() {
        String[][] questionsAnswers = new String[Engine.MAX_ROUNDS][2];
        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int number1 = Utils.getNextRandom();
            int number2 = Utils.getNextRandom();

            questionsAnswers[i][Engine.COLUMN_FOR_QUESTIONS] = number1 + " " + number2;
            questionsAnswers[i][Engine.COLUMN_FOR_ANSWERS] = Integer.toString(getGcd(number1, number2));
        }
        return  questionsAnswers;
    }

    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        int i = a % b;

        return getGcd(b, i);
    }
}
