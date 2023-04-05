package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final int FIRST_INDEX = 0;
    private static final int PROGRESSSION_LENGTH = 10;
    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void findMissElement() {
        String[][] questionsAnswers = createArrayForGame();
        Engine.doCommonLogic(questionsAnswers, DESCRIPTION);
    }

    public static String[][] createArrayForGame() {
        String[][] questionsAnswers = new String[Engine.MAX_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int firstNumber = Utils.generateNumber(MIN, MAX);
            int step = Utils.generateNumber(MIN, PROGRESSSION_LENGTH);

            String[] progression = getArrayOfProgression(firstNumber, step, PROGRESSSION_LENGTH);
            int j = Utils.generateNumber(FIRST_INDEX, PROGRESSSION_LENGTH - 1);
            String element = progression[j];
            progression[j] = "..";

            questionsAnswers[i][Engine.COLUMN_FOR_QUESTIONS] = String.join(" ", progression);
            questionsAnswers[i][Engine.COLUMN_FOR_ANSWERS] = element;
        }

        return  questionsAnswers;
    }

    public static String[] getArrayOfProgression(int firstNumber, int step, int length) {
        String[] progression = new String[length];
        progression[0] = Integer.toString(firstNumber);

        for (int i = 1; i < length; i++) {
            progression[i] = Integer.toString(Integer.parseInt(progression[i - 1]) + step);
        }

        return  progression;
    }
}
