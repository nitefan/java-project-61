package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;
public class Even {
    public static void main() {
        int randomNumber1 = Engine.getRandomNumber(1, 20);;
        int randomNumber2 = Engine.getRandomNumber(1, 20);;
        int randomNumber3 = Engine.getRandomNumber(1, 20);;
        Scanner scan = new Scanner(System.in);
//intro
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scan.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Question: " + randomNumber1);
        System.out.print("Your answer: ");
        String userAnswer1 = scan.next();

//1st question
        if (userAnswer1.equalsIgnoreCase("Yes") && randomNumber1 % 2 == 0) {
            System.out.println("Correct!");
        }
        if (userAnswer1.equalsIgnoreCase("No") && randomNumber1 % 2 != 0) {
            System.out.println("Correct!");
        }
        if (userAnswer1.equalsIgnoreCase("No") && randomNumber1 % 2 == 0) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        if (userAnswer1.equalsIgnoreCase("Yes") && randomNumber1 % 2 != 0) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        if (!userAnswer1.equalsIgnoreCase("yes") && !userAnswer1.equalsIgnoreCase("no")) {
            System.out.println(userAnswer1 + " is wrong answer ;(.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }

//2nd question
        System.out.println("Question: " + randomNumber2);
        System.out.print("Your answer: ");
        String userAnswer2 = scan.next();

        if (userAnswer2.equalsIgnoreCase("Yes") && randomNumber2 % 2 == 0) {
            System.out.println("Correct!");
        }
        if (userAnswer2.equalsIgnoreCase("No") && randomNumber2 % 2 != 0) {
            System.out.println("Correct!");
        }
        if (userAnswer2.equalsIgnoreCase("No") && randomNumber2 % 2 == 0) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        if (userAnswer2.equalsIgnoreCase("Yes") && randomNumber2 % 2 != 0) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        if (!userAnswer2.equalsIgnoreCase("yes") && !userAnswer2.equalsIgnoreCase("no")) {
            System.out.println(userAnswer2 + " is wrong answer ;(.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }

//3d question
        System.out.println("Question: " + randomNumber3);
        System.out.print("Your answer: ");
        String userAnswer3 = scan.next();

        if (userAnswer3.equalsIgnoreCase("Yes") && randomNumber3 % 2 == 0) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
        if (userAnswer3.equalsIgnoreCase("No") && randomNumber3 % 2 != 0) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
        if (userAnswer3.equalsIgnoreCase("No") && randomNumber3 % 2 == 0) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        if (userAnswer3.equalsIgnoreCase("Yes") && randomNumber3 % 2 != 0) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        if (!userAnswer3.equalsIgnoreCase("yes") && !userAnswer3.equalsIgnoreCase("no")) {
            System.out.println(userAnswer3 + " is wrong answer ;(.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }

    }
}
