package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Prime {
    public static final String GAME_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int UPPER_BORDER_FOR_NUMBER = 99;
    private static final int PRIME_CHECK_START = 2;
    public static void playPrime() {
        Engine.runGame(GAME_QUESTION, generateQuestionsAndAnswers());
    }
    public static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = Utils.getRandomNumber(1, UPPER_BORDER_FOR_NUMBER);
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = String.valueOf(randomNumber);
            questionsAndAnswers[i][Engine.ANSWER_INDEX] = isPrime(randomNumber) ? "yes" : "no";
        }
        return questionsAndAnswers;
    }
    public static boolean isPrime(int randomNumber) {
        if (randomNumber < 2) {
            return false;
        }
        for (int i = PRIME_CHECK_START; i * i <= randomNumber; i++) {
            if (randomNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
