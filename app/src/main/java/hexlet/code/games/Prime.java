package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Prime {
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
    public static void checkNumber() {
        String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[Engine.MAX_ROUNDS];
        String[] answers = new String[Engine.MAX_ROUNDS];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int number = Utils.getNextRandom();
            questions[i] = Integer.toString(number);
            answers[i] = (isPrime(number)) ? "yes" : "no";
        }
        Engine.doCommonLogic(questions, answers, condition);
    }
}
