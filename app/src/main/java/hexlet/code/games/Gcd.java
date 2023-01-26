package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static final String GAME_QUESTION = "Find the greatest common divisor of given numbers.";
    private static final int UPPER_BORDER_FOR_NUMBER = 99;
    public static void playGcd() {
        Engine.runGame(GAME_QUESTION, generateQuestionsAndAnswers());
    }
    public static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber1 = Utils.getRandomNumber(1, UPPER_BORDER_FOR_NUMBER);
            int randomNumber2 = Utils.getRandomNumber(1, UPPER_BORDER_FOR_NUMBER);
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = randomNumber1 + " " + randomNumber2;
            questionsAndAnswers[i][Engine.ANSWER_INDEX] = String.valueOf(findGCD(randomNumber1, randomNumber2));
        }
        return questionsAndAnswers;
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
}
