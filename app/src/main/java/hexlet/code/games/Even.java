package hexlet.code.games;
import hexlet.code.Utils;
import hexlet.code.Number;
import java.util.Scanner;
public class Even {
    public static void parityCheck() {
        var question1 = Utils.getNext();
        var question2 = Utils.getNext();
        var question3 = Utils.getNext();
        int[] numbers = new int[3];
        numbers[0] = question1;
        numbers[1] = question2;
        numbers[2] = question3;

        String correctAnswer1 = Number.getEven(question1);
        String correctAnswer2 = Number.getEven(question2);
        String correctAnswer3 = Number.getEven(question3);
        String[] answers = new String[3];
        answers[0] = correctAnswer1;
        answers[1] = correctAnswer2;
        answers[2] = correctAnswer3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var i = 0;
        var j = 0;
        while (i < 3) {
            System.out.println("Question: " + numbers[i]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(answers[2]) && i == 2) {
                System.out.println("Correct!\nCongratulations, userName!");
                i++;
            } else if (answer.equals(answers[j])) {
                System.out.println("Correct!");
                i++;
                j++;
            } else {
                System.out.println("'"
                        + answer
                        + "' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, userName!");
                i += 3;
                j += 3;
            }
        }
        scanner.close();
    }
}

