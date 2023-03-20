package hexlet.code;
public class Utils {
    static final int HUNDRED = 100; // ограничивает диапазон случайных чисел до десятков
    public static int getNextRandom() {
        return (int) (Math.random() * HUNDRED);
    }

}
