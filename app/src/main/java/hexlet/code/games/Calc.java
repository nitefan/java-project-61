package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Calc {
    public static final String GAME_QUESTION = "What is the result of the expression?";

    public static void main() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber1 = Utils.getRandomNumber(1, 20);
            int randomNumber2 = Utils.getRandomNumber(1, 20);
            int randomOperatorIndex = Utils.getRandomNumber(1, 3);
            String randomOperator = Utils.getRandomOperator(randomOperatorIndex);
            String questionForm = randomNumber1 + " " + randomOperator + " " + randomNumber2;
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = questionForm;
            int answer;
            switch (randomOperator) {
                case "+" -> {
                    answer = randomNumber1 + randomNumber2;
                    questionsAndAnswers[i][Engine.ANSWER_INDEX] = String.valueOf(answer);
                }
                case "-" -> {
                    answer = randomNumber1 - randomNumber2;
                    questionsAndAnswers[i][Engine.ANSWER_INDEX] = String.valueOf(answer);
                }
                case "*" -> {
                    answer = randomNumber1 * randomNumber2;
                    questionsAndAnswers[i][Engine.ANSWER_INDEX] = String.valueOf(answer);
                }
            }
        }
        Engine.runGame(GAME_QUESTION, questionsAndAnswers);
    }
}