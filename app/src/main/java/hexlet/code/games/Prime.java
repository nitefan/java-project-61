package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String GAME_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void main() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = Utils.getRandomNumber(1, 99);
            String questionForm = String.valueOf(randomNumber);
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = questionForm;
            boolean randomNumberPrimality = Utils.isPrime(randomNumber);
            if (randomNumberPrimality == true) {
                questionsAndAnswers[i][Engine.ANSWER_INDEX] = "yes";
            } else if (randomNumberPrimality == false) {
                questionsAndAnswers[i][Engine.ANSWER_INDEX] = "no";
            }
        }
        Engine.runGame(GAME_QUESTION, questionsAndAnswers);
    }
}
