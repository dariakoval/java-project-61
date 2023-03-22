package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Calc {
    static final int MAX_OPERATIONS = 3;
    public static int calcResult(int num1, int num2, String operation) { // считает результат выражения
        int result;
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            default:
                result = num1 * num2;
        }
        return result;
    }
    public static void calculateExpression() {
        String condition = "What is the result of the expression?";
        String[] questions = new String[Engine.MAX_ROUNDS];
        String[] answers = new String[Engine.MAX_ROUNDS];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int number1 = Utils.getNextRandom();
            int number2 = Utils.getNextRandom();
            String operation = Utils.getRandomOperation();

            questions[i] = Integer.toString(number1) + " " + operation + " " + Integer.toString(number2);
            answers[i] = Integer.toString(calcResult(number1, number2, operation));
        }
        Engine.doCommonLogic(questions, answers, condition);
    }
}
