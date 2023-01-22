package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String GAME_QUESTION = "What number is missing in the progression?";
    private static final int LOWER_LENGTH_LIMIT = 5;
    private static final int UPPER_LENGTH_LIMIT = 10;
    private static final int LOWER_STEP_LIMIT = 2;
    private static final int UPPER_STEP_LIMIT = 5;
    private static final int UPPER_BORDER_FOR_START = 20;
    public static void main() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int progressionLength = Utils.getRandomNumber(LOWER_LENGTH_LIMIT, UPPER_LENGTH_LIMIT);
            int progressionStep = Utils.getRandomNumber(LOWER_STEP_LIMIT, UPPER_STEP_LIMIT);
            int progressionStart = Utils.getRandomNumber(1, UPPER_BORDER_FOR_START);
            int[] fullProgression = Utils.createFullProgression(progressionLength, progressionStart, progressionStep);
            int hiddenPosition = Utils.getRandomNumber(0, progressionLength);
            int hiddenElement = fullProgression[hiddenPosition];
            String displayProgression = Utils.createDisplayProgression(fullProgression, hiddenPosition);
            String questionForm = "Question: " + displayProgression;
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = questionForm;
            questionsAndAnswers[i][Engine.ANSWER_INDEX] = String.valueOf(hiddenElement);
        }
        Engine.runGame(GAME_QUESTION, questionsAndAnswers);
    }
}
