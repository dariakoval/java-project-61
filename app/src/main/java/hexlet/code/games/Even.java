package hexlet.code.games;
import hexlet.code.Random;

import java.util.Scanner;
public class Even {
    public static void parityCheck(String userName) {
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var number = new Random(0);
        var result1 = number.getNext();
        var result2 = number.getNext();
        var result3 = number.getNext();

        int[] numbers = new int[3];
        numbers[0] = result1;
        numbers[1] = result2;
        numbers[2] = result3;
        int i = 0;

        while (i < 3) {
            System.out.println("Question: " + numbers[i]);
            System.out.print("Your answer: ");
            String answer = scanner2.next();
            if (numbers[i] % 2 == 0) {
                if (answer.equals("yes") && i == 2) {
                    System.out.println("Congratulations, " + userName + "!");
                    i++;
                } else if (answer.equals("yes") && i != 2) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    System.out.println("'"
                            + answer
                            + "' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, " + userName + "!");
                    i += 3;
                }
            } else {
                if (answer.equals("no") && i == 2) {
                    System.out.println("Congratulations, " + userName + "!");
                    i++;
                } else if (answer.equals("no") && i != 2) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    System.out.println("'"
                            + answer
                            + "' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, " + userName + "!");
                    i += 3;
                }
            }

        }
        scanner2.close();
    }
}

