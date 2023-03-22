package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Method;
import hexlet.code.Utils;
public class Prog {
    static final int TEN = 10; // количество элементов прогресси для игры "Progression"
    public static void findMissElement() {
        String condition = "What number is missing in the progression?";
        String[] questions = new String[Engine.MAX_ROUNDS];
        String[] answers = new String[Engine.MAX_ROUNDS];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int firstNumber = Utils.getNextRandom();
            int step = (int) (Math.random() * TEN);
            int length = TEN;
            int a = (int) (Math.random() * TEN);
            String[] progression = Method.getArrayOfProgression(firstNumber, step, length);
            String element = progression[a];
            progression[a] = "..";

            questions[i] = String.join(" ", progression);
            answers[i] = element;
        }
        Engine.doCommonLogic(questions, answers, condition);
    }
}
