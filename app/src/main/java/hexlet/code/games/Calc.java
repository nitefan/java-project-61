package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Calc {
    public static final String GAME_QUESTION = "What is the result of the expression?";
    private static final int LOWER_BORDER_FOR_NUMBER = 1;
    private static final int UPPER_BORDER_FOR_NUMBER = 20;
    private static final int UPPER_BORDER_FOR_OPERATOR = 3;

    public static void main() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber1 = Utils.getRandomNumber(LOWER_BORDER_FOR_NUMBER, UPPER_BORDER_FOR_NUMBER);
            int randomNumber2 = Utils.getRandomNumber(LOWER_BORDER_FOR_NUMBER, UPPER_BORDER_FOR_NUMBER);
            int randomOperatorIndex = Utils.getRandomNumber(1, UPPER_BORDER_FOR_OPERATOR);
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
                default -> throw new IllegalStateException("Unexpected value: " + randomOperator);
            }
        }
        Engine.runGame(GAME_QUESTION, questionsAndAnswers);
    }
}
