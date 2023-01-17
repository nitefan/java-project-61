package hexlet.code.games;
import java.util.Scanner;
import hexlet.code.Engine;
public class Gcd {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        int randomNumber1 = Engine.getRandomNumber(1, 50);
        int randomNumber2 = Engine.getRandomNumber(1, 50);
        int randomNumber3 = Engine.getRandomNumber(1, 50);
        int randomNumber4 = Engine.getRandomNumber(1, 50);
        int randomNumber5 = Engine.getRandomNumber(1, 50);
        int randomNumber6 = Engine.getRandomNumber(1, 50);
//intro
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scan.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
        System.out.print("Your answer: ");
        int userAnswer1 = Integer.parseInt(scan.next());
//1st question
        if (userAnswer1 == findGCD(randomNumber1, randomNumber2)) {
            System.out.println("Correct!");
        }
        if (userAnswer1 != findGCD(randomNumber1, randomNumber2)) {
            System.out.println("'" + userAnswer1 + "'" + " is wrong answer ;(. Correct answer was " + "'" + findGCD(randomNumber1, randomNumber2) + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }

//2nd question
        System.out.println("Question: " + randomNumber3 + " " + randomNumber4);
        System.out.print("Your answer: ");
        int userAnswer2 = Integer.parseInt(scan.next());
        if (userAnswer2 == findGCD(randomNumber3, randomNumber4)) {
            System.out.println("Correct!");
        }
        if (userAnswer2 != findGCD(randomNumber3, randomNumber4)) {
            System.out.println("'" + userAnswer2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + findGCD(randomNumber3, randomNumber4) + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }

//3rd question
        System.out.println("Question: " + randomNumber5 + " " + randomNumber6);
        System.out.print("Your answer: ");
        int userAnswer3 = Integer.parseInt(scan.next());
        if (userAnswer3 == findGCD(randomNumber5, randomNumber6)) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
        if (userAnswer3 != findGCD(randomNumber5, randomNumber6)) {
            System.out.println("'" + userAnswer3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + findGCD(randomNumber5, randomNumber6) + "'");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
    }
    public static int findGCD(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return x;
    }
}
