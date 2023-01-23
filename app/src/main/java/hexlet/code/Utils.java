package hexlet.code;
public class Utils {
    public static int getRandomNumber(int lowerBorder, int upperBorder) {
        return lowerBorder + (int) (Math.random() * upperBorder);
    }
}
