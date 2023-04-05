package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MIN = 1;
    private static final int MAX = 20;
    private static final int FIRST_INDEX = 0;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void calculateExpression() {
        String[][] questionsAnswers = createArrayForGame();
        Engine.doCommonLogic(questionsAnswers, DESCRIPTION);
    }

    public static String[][] createArrayForGame() {
        String[][] questionsAnswers = new String[Engine.MAX_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int number1 = Utils.generateNumber(MIN, MAX);
            int number2 = Utils.generateNumber(MIN, MAX);
            char operator = generateOperator();

            questionsAnswers[i][Engine.COLUMN_FOR_QUESTIONS] = number1 + " " + operator + " " + number2;
            questionsAnswers[i][Engine.COLUMN_FOR_ANSWERS] = Integer.toString(calcResult(number1, number2, operator));
        }

        return  questionsAnswers;
    }

    public static char generateOperator() {
        int lastIndex = OPERATORS.length - 1;
        int i = Utils.generateNumber(FIRST_INDEX, lastIndex);
        return OPERATORS[i];
    }

    public static int calcResult(int num1, int num2, char operator) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> throw new RuntimeException("Unknown input: " + operator);
        };
    }
}
