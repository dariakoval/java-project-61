package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static void findGcd() {
        String condition = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[Engine.MAX_ROUNDS];
        String[] answers = new String[Engine.MAX_ROUNDS];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int number1 = Utils.getNextRandom();
            int number2 = Utils.getNextRandom();
            questions[i] = Integer.toString(number1) + " " + Integer.toString(number2);
            answers[i] = Integer.toString(Utils.getGcd(number1, number2));
        }
        Engine.doCommonLogic(questions, answers, condition);
    }
}
