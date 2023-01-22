package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int QUESTIONS_INDEX = 0;
    public static final int ANSWER_INDEX = 1;

    public static void runGame(String gameQuestion, String[][] questionsAndAnswer) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String userName = scan.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameQuestion);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + questionsAndAnswer[i][QUESTIONS_INDEX]);
            System.out.print("Your answer: ");
            String userAnswer = scan.next();
            if (userAnswer.equals(questionsAndAnswer[i][ANSWER_INDEX])) {
                System.out.println("Correct!");
            }
            else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + questionsAndAnswer[i][1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        System.exit(0);
    }
}