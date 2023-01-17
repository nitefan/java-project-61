package hexlet.code.games;
import java.util.Scanner;
import hexlet.code.Engine;
public class Prime {
    public static void main() {
        int randomNumber1 = Engine.getRandomNumber(1, 20);
        int randomNumber2 = Engine.getRandomNumber(1, 20);
        int randomNumber3 = Engine.getRandomNumber(1, 20);
        Scanner scan = new Scanner(System.in);
//intro
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scan.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if given number is prime, otherwise answer 'no'.");
        System.out.println("Question: " + randomNumber1);
        System.out.print("Your answer: ");
        String userAnswer1 = scan.next();

//1st question
        if (userAnswer1.equalsIgnoreCase("Yes") && isPrime(randomNumber1)) {
            System.out.println("Correct!");
        }
        if (userAnswer1.equalsIgnoreCase("No") && !isPrime(randomNumber1)) {
            System.out.println("Correct!");
        }
        if (userAnswer1.equalsIgnoreCase("No") && isPrime(randomNumber1)) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        if (userAnswer1.equalsIgnoreCase("Yes") && !isPrime(randomNumber1)) {
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

        if (userAnswer2.equalsIgnoreCase("Yes") && isPrime(randomNumber2)) {
            System.out.println("Correct!");
        }
        if (userAnswer2.equalsIgnoreCase("No") && !isPrime(randomNumber2)) {
            System.out.println("Correct!");
        }
        if (userAnswer2.equalsIgnoreCase("No") && isPrime(randomNumber2)) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        if (userAnswer2.equalsIgnoreCase("Yes") && !isPrime(randomNumber2)) {
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

        if (userAnswer3.equalsIgnoreCase("Yes") && isPrime(randomNumber3)) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
        if (userAnswer3.equalsIgnoreCase("No") && !isPrime(randomNumber3)) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
        if (userAnswer3.equalsIgnoreCase("No") && isPrime(randomNumber3)) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        if (userAnswer3.equalsIgnoreCase("Yes") && !isPrime(randomNumber3)) {
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
    public static boolean isPrime(int num) {
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
