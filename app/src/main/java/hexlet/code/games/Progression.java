package hexlet.code.games;
import java.util.Scanner;
import java.util.Arrays;
import hexlet.code.Engine;
public class Progression {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        int progressionLength1 = Engine.getRandomNumber(5, 10);
        int progressionStep1 = Engine.getRandomNumber(2, 5);
        int progressionStart1 = Engine.getRandomNumber(1, 20);
        int hiddenPosition1 = Engine.getRandomNumber(0, progressionLength1);
        int[] fullProgression1 = createFullProgression(progressionLength1, progressionStart1, progressionStep1);
        int hiddenElement1 = fullProgression1[hiddenPosition1];
        String displayProgression1 = createDisplayProgression(fullProgression1, hiddenPosition1);

        int progressionLength2 = Engine.getRandomNumber(5, 10);
        int progressionStep2 = Engine.getRandomNumber(2, 5);
        int progressionStart2 = Engine.getRandomNumber(1, 20);
        int hiddenPosition2 = Engine.getRandomNumber(0, progressionLength2);
        int[] fullProgression2 = createFullProgression(progressionLength2, progressionStart2, progressionStep2);
        int hiddenElement2 = fullProgression2[hiddenPosition2];
        String displayProgression2 = createDisplayProgression(fullProgression2, hiddenPosition2);

        int progressionLength3 = Engine.getRandomNumber(5, 10);
        int progressionStep3 = Engine.getRandomNumber(2, 5);
        int progressionStart3 = Engine.getRandomNumber(1, 20);
        int hiddenPosition3 = Engine.getRandomNumber(0, progressionLength3);
        int[] fullProgression3 = createFullProgression(progressionLength3, progressionStart3, progressionStep3);
        int hiddenElement3 = fullProgression3[hiddenPosition3];
        String displayProgression3 = createDisplayProgression(fullProgression3, hiddenPosition3);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scan.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What number is missing in the progression?");
        System.out.println("Question: " + displayProgression1);
        System.out.print("Your answer: ");
        int userAnswer1 = Integer.parseInt(scan.next());
//1st question
        if (userAnswer1 == hiddenElement1) {
            System.out.println("Correct!");
        }
        if (userAnswer1 != hiddenElement1) {
            System.out.println("'" + userAnswer1 + "'" + " is wrong answer ;(. Correct answer was " + "'" + hiddenElement1 + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }

//2nd question
        System.out.println("Question: " + displayProgression2);
        System.out.print("Your answer: ");
        int userAnswer2 = Integer.parseInt(scan.next());
        if (userAnswer2 == hiddenElement2) {
            System.out.println("Correct!");
        }
        if (userAnswer2 != hiddenElement2) {
            System.out.println("'" + userAnswer2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + hiddenElement2 + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }

//3rd question
        System.out.println("Question: " + displayProgression3);
        System.out.print("Your answer: ");
        int userAnswer3 = Integer.parseInt(scan.next());
        if (userAnswer3 == hiddenElement3) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
        if (userAnswer3 != hiddenElement3) {
            System.out.println("'" + userAnswer3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + hiddenElement3 + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }

    }
    public static int[] createFullProgression (int fullProgressionLength, int fullProgressionStart, int fullProgressionStep){
        int[] fullProgression = new int[fullProgressionLength];
        fullProgression[0] = fullProgressionStart;

        for (int i = 1; i < fullProgressionLength; i++) {
            int nextElement = fullProgressionStart + (fullProgressionStep * i);
            fullProgression[i] = nextElement;
        }
        return fullProgression;
    }
    public static String createDisplayProgression (int[] progressionLine, int hiddenElementPosition){
        String[] progressionToProcess = new String[progressionLine.length];
        for (int j = 0; j < progressionLine.length; j++) {
            progressionToProcess[j] = String.valueOf(progressionLine[j]);
        }
        progressionToProcess[hiddenElementPosition] = "..";
        String displayProgression = Arrays.toString(progressionToProcess).replace(",", "").replace("[", "").replace("]", "");
        return displayProgression;
    }
}