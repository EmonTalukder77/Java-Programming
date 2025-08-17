import java.util.Random;
import java.util.Scanner;

public class rockPaperScissorsProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };
        String playerChoice;
        String computerChoice;
        String PlayAgain = "yes";

        do {
            System.out.print("Enter your move (rock ,paper , scissors ): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                !playerChoice.equals("paper") &&
                !playerChoice.equals("scissors")) {
                System.out.println("INVALID CHOICE !");

                continue;
            }
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice : " + computerChoice);
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie !!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
                    || (playerChoice.equals("paper") && computerChoice.equals("rock"))
                    || (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You WIN___");
            } else {
                System.out.println("You LOSE !");
            }
            System.out.print("Play again (yes/no):");
            PlayAgain = scanner.nextLine().toLowerCase();

        } while (PlayAgain.equals("yes"));
        System.out.println("Thanks for Playing...");

        scanner.close();
    }
}
