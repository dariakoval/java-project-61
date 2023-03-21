package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Prog {
    public static void findMissElement() {
        String condition = "What number is missing in the progression?";
        String[] questions = new String[Engine.MAX_ROUNDS];
        String[] answers = new String[Engine.MAX_ROUNDS];



        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int a = (int) (Math.random() * Utils.TEN);
            String[] progression = Utils.getArrayOfProgression();
            String element = progression[a];
            progression[a] = "..";

            var result = new StringBuilder();
            for (var number: progression) {
                result.append(number);
                result.append(" ");
            }

            questions[i] = result.toString();
            answers[i] = element;
        }

        Engine.doCommonLogic(questions, answers, condition);
    }
}
