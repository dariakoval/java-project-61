package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void calculateExpression() {
        String condition = "What is the result of the expression?";
        String[][] questionsAnswers = createArrayForGame();

        Engine.doCommonLogic(questionsAnswers, condition);
    }

    public static String[][] createArrayForGame() {
        String[][] questionsAnswers = new String[Engine.MAX_ROUNDS][2];
        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int number1 = Utils.getNextRandom();
            int number2 = Utils.getNextRandom();
            String operation = Utils.getRandomOperation();

            questionsAnswers[i][Engine.COLUMN_FOR_QUESTIONS] = number1 + " " + operation + " " + number2;
            questionsAnswers[i][Engine.COLUMN_FOR_ANSWERS] = Integer.toString(calcResult(number1, number2, operation));
        }
        return  questionsAnswers;
    }

    public static int calcResult(int num1, int num2, String operation) {
        return switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            default -> num1 * num2;
        };
    }
}
