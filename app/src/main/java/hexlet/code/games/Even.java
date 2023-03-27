package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void checkParity() {
        String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String property = "even";
        String[][] questionsAnswers = Utils.createArrayUseBoolean(property);

        Engine.doCommonLogic(questionsAnswers, condition);
    }
}
