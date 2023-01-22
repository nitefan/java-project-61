package hexlet.code;
import java.util.Arrays;

public class Utils {
    public static int getRandomNumber(int lowerBorder, int upperBorder) {
        return lowerBorder + (int) (Math.random() * upperBorder);
    }
    public static String getRandomOperator(int randomIndex) {
        int add = 1;
        int substraction = 2;
        int multiply = 3;
        if (randomIndex == add) {
            return "+";
        } else if (randomIndex == substraction) {
            return "-";
        } else if (randomIndex == multiply) {
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
        for (int i = 3; i * i <= randomNumber; i += 2) {
            if (randomNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int[] createFullProgression (int fullProgressionLength, int fullProgressionStart,
                                               int fullProgressionStep) {
        int[] fullProgression = new int[fullProgressionLength];
        fullProgression[0] = fullProgressionStart;

        for (int i = 1; i < fullProgressionLength; i++) {
            int nextElement = fullProgressionStart + (fullProgressionStep * i);
            fullProgression[i] = nextElement;
        }
        return fullProgression;
    }
    public static String createDisplayProgression (int[] progressionLine, int hiddenElementPosition) {
        String[] progressionToProcess = new String[progressionLine.length];
        for (int j = 0; j < progressionLine.length; j++) {
            progressionToProcess[j] = String.valueOf(progressionLine[j]);
        }
        progressionToProcess[hiddenElementPosition] = "..";
        return Arrays.toString(progressionToProcess).replace(",", "").replace("[", "")
                .replace("]", "");
    }
}
