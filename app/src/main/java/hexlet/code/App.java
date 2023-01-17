package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanUserChoice = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int userChoice = scanUserChoice.nextInt();

        if (userChoice == 1) {
            Cli.main();
        }
        if (userChoice == 2) {
            Even.main();
        }
        if (userChoice == 3) {
            Calc.main();
        }
        if (userChoice == 4) {
            Gcd.main();
        }
        if (userChoice == 5) {
            Progression.main();
        }
        if (userChoice == 0) {
            System.exit(0);
        }
    }
}
