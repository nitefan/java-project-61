package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Even {
    public static final String GAME_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int UPPER_BORDER_FOR_NUMBER = 99;
    public static void playEven() {
        Engine.runGame(GAME_QUESTION, generateQuestionsAndAnswers());
    }
    public static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = Utils.getRandomNumber(1, UPPER_BORDER_FOR_NUMBER);
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = String.valueOf(randomNumber);
            questionsAndAnswers[i][Engine.ANSWER_INDEX] = isEven(randomNumber) ? "yes" : "no";
        }
        return questionsAndAnswers;
    }
    public static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}
