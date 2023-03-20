package hexlet.code;
import hexlet.code.games.Calc;
import org.apache.commons.lang3.ArrayUtils;
public class Utils {
    static final int HUNDRED = 100; // ограничивает диапазон случайных чисел до 100
    static final int THREE = 3; // количество операций для игры "Calc"
    public static int getNextRandom() { // возвращает случайное целое число
        return (int) (Math.random() * HUNDRED);
    }
    public static String getRandomOperation() {  // возвращает рандомную операцию
        String[] operations = {"+", "-", "*"};
        int a = (int) (Math.random() * operations.length);
        return operations[a];
    }

    public static void getArrayOfRandomOperation() { // возвращает массив рандомных уникальных операций
        String[] operations = new String[THREE];
        for (int i = 0; i < THREE; i++) {
            String operation = getRandomOperation();
            if (!ArrayUtils.contains(operations, operation)) {
                operations[i] = operation;
            } else {
                i--;
            }
        }
        Calc.calculateExpression(operations);
    }

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
}
