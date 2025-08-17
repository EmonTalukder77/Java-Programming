
import java.util.Scanner;

public class NastedForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows;
        int column;
        char symbol;

        System.out.print("Enter the rows : ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of column : ");
        column = scanner.nextInt();

        System.out.print("Ente the symbol to use :");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(symbol+" ");
            }
            System.out.println();
        }

    }
}