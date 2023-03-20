package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Calc {
    static final int MAX_OPERATIONS = 3;
    public static void calculateExpression(String[] operations) {
        String condition = "What is the result of the expression?";
        String[] questions = new String[Engine.MAX_ROUNDS];
        String[] answers = new String[Engine.MAX_ROUNDS];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int number1 = Utils.getNextRandom();
            int number2 = Utils.getNextRandom();

            questions[i] = Integer.toString(number1) + " " + operations[i] + " " + Integer.toString(number2);
            answers[i] = Integer.toString(Utils.calcResult(number1, number2, operations[i]));
        }
        Engine.doCommonLogic(questions, answers, condition);
    }
}
