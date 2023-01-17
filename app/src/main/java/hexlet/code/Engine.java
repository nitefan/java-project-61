package hexlet.code;
import java.util.Random;
public class Engine {
    public static int getRandomNumber(int lowerBorder, int upperBorder) {
        return lowerBorder + (int) (Math.random() * upperBorder);
    }
}
