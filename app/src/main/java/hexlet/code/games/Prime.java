package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void checkNumber() {
        String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String property = "prime";
        String[][] questionsAnswers = Utils.createArrayUseBoolean(property);

        Engine.doCommonLogic(questionsAnswers, condition);
    }
}
