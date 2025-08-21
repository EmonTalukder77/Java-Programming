import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attemps = 0;
        int randomNumber = random.nextInt(1, 111);

        System.out.println("##########  Number Guessing GAME ########");
        System.out.println("Guess a number between 1 - 100 :");

        do {
            System.out.print("Enter a guess number :");
            guess = scanner.nextInt();
            attemps++;

            if (guess < randomNumber) {
                System.out.println("Too Low ! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too High ! Try Again ");

            } else {
                System.out.println("Correct !! The number was " + randomNumber);
                System.out.println("# of attemps :" + attemps);
            }

        } while (guess != randomNumber);

    }
}