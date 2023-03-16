package hexlet.code;
public class Random {
    private int seed;

    Random(int seed) {
        this.seed = seed;
    }
    public int getNext() {
        return seed + (int) (Math.random() * 100);
    }

}
