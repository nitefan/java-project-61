package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String GAME_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int UPPER_BORDER_FOR_NUMBER = 99;
    public static void main() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = Utils.getRandomNumber(1, UPPER_BORDER_FOR_NUMBER);
            String questionForm = String.valueOf(randomNumber);
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = questionForm;
            boolean randomNumberPrimality = Utils.isPrime(randomNumber);
            if (randomNumberPrimality) {
                questionsAndAnswers[i][Engine.ANSWER_INDEX] = "yes";
            } else if (!randomNumberPrimality) {
                questionsAndAnswers[i][Engine.ANSWER_INDEX] = "no";
            }
        }
        Engine.runGame(GAME_QUESTION, questionsAndAnswers);
    }
}
