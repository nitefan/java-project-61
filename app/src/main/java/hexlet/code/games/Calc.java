package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Calc {
    public static final String GAME_QUESTION = "What is the result of the expression?";
    private static final int LOWER_BORDER_FOR_NUMBER = 1;
    private static final int UPPER_BORDER_FOR_NUMBER = 20;
    private static final int UPPER_BORDER_FOR_OPERATOR = 2;
    private static final String[] OPERATORS_LIST = {"+", "-", "*"};
    public static void playCalc() {
        Engine.runGame(GAME_QUESTION, generateQuestionsAndAnswers());
    }
    private static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber1 = Utils.getRandomNumber(LOWER_BORDER_FOR_NUMBER, UPPER_BORDER_FOR_NUMBER);
            int randomNumber2 = Utils.getRandomNumber(LOWER_BORDER_FOR_NUMBER, UPPER_BORDER_FOR_NUMBER);
            int randomOperatorIndex = Utils.getRandomNumber(0, UPPER_BORDER_FOR_OPERATOR);
            String randomOperator = OPERATORS_LIST[randomOperatorIndex];
            int expressionResult = calculateExpressionResult(randomNumber1, randomNumber2, randomOperator);
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = randomNumber1 + " " + randomOperator + " " + randomNumber2;
            questionsAndAnswers[i][Engine.ANSWER_INDEX] = String.valueOf(expressionResult);
        }
        return questionsAndAnswers;
    }
    private static int calculateExpressionResult(int num1, int num2, String operator) {
        switch (operator) {
            case "+" -> {
                return (num1 + num2);
            }
            case "-" -> {
                return (num1 - num2);
            }
            case "*" -> {
                return (num1 * num2);
            }
            default -> throw new IllegalStateException("Unexpected value");
        }
    }
}
