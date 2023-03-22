package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        int i = a % b;

        return getGcd(b, i);
    }

    public static void findGcd() {
        String condition = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[Engine.MAX_ROUNDS];
        String[] answers = new String[Engine.MAX_ROUNDS];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int number1 = Utils.getNextRandom();
            int number2 = Utils.getNextRandom();

            questions[i] = number1 + " " + number2;
            answers[i] = Integer.toString(getGcd(number1, number2));
        }

        Engine.doCommonLogic(questions, answers, condition);
    }
}
