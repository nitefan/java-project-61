package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Even {
    public static final String GAME_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void main() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = Utils.getRandomNumber(1, 99);
            String questionForm = String.valueOf(randomNumber);
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = questionForm;
            boolean randomNumberParity = Utils.isEven(randomNumber);
            if (randomNumberParity == true) {
                questionsAndAnswers[i][Engine.ANSWER_INDEX] = "yes";
            } else if (randomNumberParity == false) {
                questionsAndAnswers[i][Engine.ANSWER_INDEX] = "no";
            }
        }
        Engine.runGame(GAME_QUESTION, questionsAndAnswers);
    }
}