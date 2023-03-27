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

    public static String[][] createArrayUseBoolean(String property) {
        String[][] questionsAnswers = new String[Engine.MAX_ROUNDS][2];

        if (property.equals("even")) {
            for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
                int number = Utils.getNextRandom();

                questionsAnswers[i][Engine.COLUMN_FOR_QUESTIONS] = Integer.toString(number);
                questionsAnswers[i][Engine.COLUMN_FOR_ANSWERS] = (isEven(number)) ? "yes" : "no";
            }
        } else {
            for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
                int number = Utils.getNextRandom();

                questionsAnswers[i][Engine.COLUMN_FOR_QUESTIONS] = Integer.toString(number);
                questionsAnswers[i][Engine.COLUMN_FOR_ANSWERS] = (isPrime(number)) ? "yes" : "no";
            }
        }

        return  questionsAnswers;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }

        }

        return true;
    }
}
