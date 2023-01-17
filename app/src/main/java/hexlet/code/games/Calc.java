package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
public class Calc {
    public static void main() {
        int randomNumber1 = Engine.getRandomNumber(1, 20);;
        int randomNumber2 = Engine.getRandomNumber(1, 20);;
        int randomNumber3 = Engine.getRandomNumber(1, 20);;
        int randomNumber4 = Engine.getRandomNumber(1, 20);;
        int randomNumber5 = Engine.getRandomNumber(1, 20);;
        int randomNumber6 = Engine.getRandomNumber(1, 20);;
        Scanner scan = new Scanner(System.in);
        String[] operatorsList = new String[]{"+", "-", "*"};
        int n1 = Engine.getRandomNumber(0, 2);;
        int n2 = Engine.getRandomNumber(0, 2);;
        int n3 = Engine.getRandomNumber(0, 2);;
        String randomOperator1 = operatorsList[n1];
        String randomOperator2 = operatorsList[n2];
        String randomOperator3 = operatorsList[n3];
//intro
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scan.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + randomNumber1 + " " + randomOperator1 + " " + randomNumber2);
        System.out.print("Your answer: ");
        int userAnswer1 = Integer.parseInt(scan.next());

//1st question
        //if +
        if (randomOperator1.equals("+") && userAnswer1 == randomNumber1 + randomNumber2) {
            System.out.println("Correct!");
        }
        if (randomOperator1.equals("+") && userAnswer1 != randomNumber1 + randomNumber2) {
            System.out.println("'" + userAnswer1 + "'" + " is wrong answer ;(. Correct answer was " + "'" + (randomNumber1 + randomNumber2) + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        // if -
        if (randomOperator1.equals("-") && userAnswer1 == randomNumber1 - randomNumber2) {
            System.out.println("Correct!");
        }
        if (randomOperator1.equals("-") && userAnswer1 != randomNumber1 - randomNumber2) {
            System.out.println("'" + userAnswer1 + "'" + " is wrong answer ;(. Correct answer was " + "'" + (randomNumber1 - randomNumber2) + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        //if *
        if (randomOperator1.equals("*") && userAnswer1 == randomNumber1 * randomNumber2) {
            System.out.println("Correct!");
        }
        if (randomOperator1.equals("*") && userAnswer1 != randomNumber1 * randomNumber2) {
            System.out.println("'" + userAnswer1 + "'" + " is wrong answer ;(. Correct answer was " + "'" + (randomNumber1 * randomNumber2) + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }

//2nd question
        System.out.println("Question: " + randomNumber3 + " " + randomOperator2 + " " + randomNumber4);
        System.out.print("Your answer: ");
        int userAnswer2 = Integer.parseInt(scan.next());

        //if +
        if (randomOperator2.equals("+") && userAnswer2 == randomNumber3 + randomNumber4) {
            System.out.println("Correct!");
        }
        if (randomOperator2.equals("+") && userAnswer2 != randomNumber3 + randomNumber4) {
            System.out.println("'" + userAnswer2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + (randomNumber3 + randomNumber4) + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        // if -
        if (randomOperator2.equals("-") && userAnswer2 == randomNumber3 - randomNumber4) {
            System.out.println("Correct!");
        }
        if (randomOperator2.equals("-") && userAnswer2 != randomNumber3 - randomNumber4) {
            System.out.println("'" + userAnswer2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + (randomNumber3 - randomNumber4) + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        //if *
        if (randomOperator2.equals("*") && userAnswer2 == randomNumber3 * randomNumber4) {
            System.out.println("Correct!");
        }
        if (randomOperator2.equals("*") && userAnswer2 != randomNumber3 * randomNumber4) {
            System.out.println("'" + userAnswer2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + (randomNumber3 * randomNumber4) + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }

//3d question
        System.out.println("Question: " + randomNumber5 + " " + randomOperator3 + " " + randomNumber6);
        System.out.print("Your answer: ");
        int userAnswer3 = Integer.parseInt(scan.next());

        //if +
        if (randomOperator3.equals("+") && userAnswer3 == randomNumber5 + randomNumber6) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
        if (randomOperator3.equals("+") && userAnswer3 != randomNumber5 + randomNumber6) {
            System.out.println("'" + userAnswer3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + (randomNumber5 + randomNumber6) + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        // if -
        if (randomOperator3.equals("-") && userAnswer3 == randomNumber5 - randomNumber6) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
        if (randomOperator3.equals("-") && userAnswer3 != randomNumber5 - randomNumber6) {
            System.out.println("'" + userAnswer3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + (randomNumber5 - randomNumber6) + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        //if *
        if (randomOperator3.equals("*") && userAnswer3 == randomNumber5 * randomNumber6) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
        if (randomOperator3.equals("*") && userAnswer3 != randomNumber5 * randomNumber6) {
            System.out.println("'" + userAnswer3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + (randomNumber5 * randomNumber6) + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
    }
}
