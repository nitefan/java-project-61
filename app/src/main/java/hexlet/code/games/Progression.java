package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String GAME_QUESTION = "What number is missing in the progression?";
    public static void main() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int progressionLength = Utils.getRandomNumber(5, 10);
            int progressionStep = Utils.getRandomNumber(2, 5);
            int progressionStart = Utils.getRandomNumber(1, 20);
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