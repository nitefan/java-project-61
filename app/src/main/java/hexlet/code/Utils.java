package hexlet.code;
import java.util.Arrays;

public class Utils {
    private static final int PRIME_CHECK_START = 3;
    private static final int ADD = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLY = 3;
    public static int getRandomNumber(int lowerBorder, int upperBorder) {
        return lowerBorder + (int) (Math.random() * upperBorder);
    }
    public static String getRandomOperator(int randomIndex) {
        if (randomIndex == ADD) {
            return "+";
        } else if (randomIndex == SUBTRACTION) {
            return "-";
        } else if (randomIndex == MULTIPLY) {
            return "*";
        }
        return null;
    }
    public static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
    public static int findGCD(int firstNumber, int secondNumber) {
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber - secondNumber;
            } else {
                secondNumber = secondNumber - firstNumber;
            }
        }
        return firstNumber;
    }
    public static boolean isPrime(int randomNumber) {
        if (randomNumber % 2 == 0) {
            return false;
        }
        for (int i = PRIME_CHECK_START; i * i <= randomNumber; i += 2) {
            if (randomNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int[] createFullProgression(int fullProgressionLength, int fullProgressionStart,
                                               int fullProgressionStep) {
        int[] fullProgression = new int[fullProgressionLength];
        fullProgression[0] = fullProgressionStart;

        for (int i = 1; i < fullProgressionLength; i++) {
            int nextElement = fullProgressionStart + (fullProgressionStep * i);
            fullProgression[i] = nextElement;
        }
        return fullProgression;
    }
    public static String createDisplayProgression(int[] progressionLine, int hiddenElementPosition) {
        String[] progressionToProcess = new String[progressionLine.length];
        for (int j = 0; j < progressionLine.length; j++) {
            progressionToProcess[j] = String.valueOf(progressionLine[j]);
        }
        progressionToProcess[hiddenElementPosition] = "..";
        return Arrays.toString(progressionToProcess).replace(",", "").replace("[", "")
                .replace("]", "");
    }
}
