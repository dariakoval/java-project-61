package hexlet.code;

public class Utils {
    static final int HUNDRED = 100; // ограничивает диапазон случайных чисел до 100

    public static int getNextRandom() { // возвращает случайное целое число
        return (int) (Math.random() * HUNDRED);
    }

    public static String getRandomOperation() {  // возвращает рандомную операцию
        String[] operations = {"+", "-", "*"};
        int a = (int) (Math.random() * operations.length);
        return operations[a];
    }
}
