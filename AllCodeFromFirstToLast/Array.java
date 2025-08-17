import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking array size from the user
        System.out.print("Enter the number of foods: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Clear the newline

        String[] foods = new String[size];

        // Taking input for each food
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter the food: ");
            foods[i] = scanner.nextLine();
        }

        // Displaying all foods
        System.out.println("\nYou entered:");
        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
