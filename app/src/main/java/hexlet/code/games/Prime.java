package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String GAME_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int UPPER_BORDER_FOR_NUMBER = 99;
    private static final int PRIME_CHECK_START = 3;
    public static void playPrime() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = Utils.getRandomNumber(1, UPPER_BORDER_FOR_NUMBER);
            String questionForm = String.valueOf(randomNumber);
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = questionForm;
            boolean randomNumberPrimality = isPrime(randomNumber);
            if (randomNumberPrimality) {
                questionsAndAnswers[i][Engine.ANSWER_INDEX] = "yes";
            } else if (!randomNumberPrimality) {
                questionsAndAnswers[i][Engine.ANSWER_INDEX] = "no";
            }
        }
        Engine.runGame(GAME_QUESTION, questionsAndAnswers);
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
}
