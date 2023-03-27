package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static int calcResult(int num1, int num2, String operation) {
        return switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            default -> num1 * num2;
        };
    }

    public static void calculateExpression() {
        String condition = "What is the result of the expression?";
        String[][] questions = new String[Engine.MAX_ROUNDS][Engine.MAX_ROUNDS];
        String[][] answers = new String[Engine.MAX_ROUNDS][Engine.MAX_ROUNDS];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int number1 = Utils.getNextRandom();
            int number2 = Utils.getNextRandom();
            String operation = Utils.getRandomOperation();

            questions[i][i] = number1 + " " + operation + " " + number2;
            answers[i][i] = Integer.toString(calcResult(number1, number2, operation));
        }

        Engine.doCommonLogic(questions, answers, condition);
    }
}
