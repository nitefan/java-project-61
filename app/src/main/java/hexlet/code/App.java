package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;
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
            case GREET -> Cli.greet();
            case EVEN -> Even.playEven();
            case CALC -> Calc.playCalc();
            case GCD -> Gcd.playGcd();
            case PROGRESSION -> Progression.playProgression();
            case PRIME -> Prime.playPrime();
            case EXIT -> System.exit(0);
            default -> System.out.println("No such game! Choose again.");
        }
    }
}
