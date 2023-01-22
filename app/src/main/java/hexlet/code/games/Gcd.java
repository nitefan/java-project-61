package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static final String GAME_QUESTION = "Find the greatest common divisor of given numbers.";
    public static void main() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber1 = Utils.getRandomNumber(1, 99);
            int randomNumber2 = Utils.getRandomNumber(1, 99);
            String questionForm = randomNumber1 + " " + randomNumber2;
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = questionForm;
            int answer = Utils.findGCD(randomNumber1, randomNumber2);
            questionsAndAnswers[i][Engine.ANSWER_INDEX] = String.valueOf(answer);
        }
        Engine.runGame(GAME_QUESTION, questionsAndAnswers);
    }
}
