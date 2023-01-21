package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner scanUserChoice = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int userChoice = scanUserChoice.nextInt();

        switch (userChoice) {
            case GREET:
                Cli.main();
            case EVEN:
                Even.main();
            case CALC:
                Calc.main();
            case GCD:
                Gcd.main();
            case PROGRESSION:
                Progression.main();
            case PRIME:
                Prime.main();
            case EXIT:
                System.exit(0);
            default:
                System.out.println("No such game! Choose again.");
        }
    }
}
