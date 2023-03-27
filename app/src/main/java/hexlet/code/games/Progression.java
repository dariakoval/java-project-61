package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final int PROGRESSSION_LENGTH = 10;

    public static String[] getArrayOfProgression(int firstNumber, int step, int length) {
        String[] progression = new String[length];
        progression[0] = Integer.toString(firstNumber);

        for (int i = 1; i < length; i++) {
            progression[i] = Integer.toString(Integer.parseInt(progression[i - 1]) + step);
        }

        return  progression;
    }

    public static void findMissElement() {
        String condition = "What number is missing in the progression?";
        String[][] questions = new String[Engine.MAX_ROUNDS][Engine.MAX_ROUNDS];
        String[][] answers = new String[Engine.MAX_ROUNDS][Engine.MAX_ROUNDS];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int firstNumber = Utils.getNextRandom();
            int step = (int) (Math.random() * PROGRESSSION_LENGTH);

            String[] progression = getArrayOfProgression(firstNumber, step, PROGRESSSION_LENGTH);
            int a = (int) (Math.random() * PROGRESSSION_LENGTH);
            String element = progression[a];
            progression[a] = "..";

            questions[i][i] = String.join(" ", progression);
            answers[i][i] = element;
        }

        Engine.doCommonLogic(questions, answers, condition);
    }
}
