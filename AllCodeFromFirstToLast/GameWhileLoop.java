import java.util.Scanner;

public class GameWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("You  are playing a game .....");
            System.out.print("press Q to quit!!   ");
            response = scanner.nextLine().toUpperCase();
        }
        System.out.println("You have to Quit the game .");
        scanner.close();
    }
}