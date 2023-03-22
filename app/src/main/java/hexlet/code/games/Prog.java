package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Method;
import hexlet.code.Utils;

public class Prog {
    static final int TEN = 10; // количество элементов прогресси для игры "Progression"

    public static void findMissElement() {
        String condition = "What number is missing in the progression?";
        String[][] questionsAnswers = new String[Engine.ROWS][Engine.MAX_ROUNDS];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int firstNumber = Utils.getNextRandom();
            int step = (int) (Math.random() * TEN);

            String[] progression = Method.getArrayOfProgression(firstNumber, step, TEN);
            int a = (int) (Math.random() * TEN);
            String element = progression[a];
            progression[a] = "..";

            questionsAnswers[Engine.ROW_FOR_QUESTIONS][i] = String.join(" ", progression);
            questionsAnswers[Engine.ROW_FOR_ANSWERS][i] = element;
        }

        Engine.doCommonLogic(questionsAnswers, condition);
    }
}
