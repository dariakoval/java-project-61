package hexlet.code;
public class Method {
    public static String[] getArrayOfProgression(int firstNumber, int step, int length) {
        String[] progression = new String[length];
        progression[0] = Integer.toString(firstNumber);
        for (int i = 1; i < length; i++) {
            progression[i] = Integer.toString(Integer.parseInt(progression[i - 1]) + step);
        }
        return  progression;
    }
}
