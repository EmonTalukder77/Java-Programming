import java.util.Scanner;

public class NastedIfstatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isStudent;
        boolean isSenior;
        double price;

        System.out.print("Are you Student? (True/False) :");
        isStudent = scanner.nextBoolean();

        System.out.print("Are you Senior ? (True/False) :");
        isSenior = scanner.nextBoolean();

        System.out.print("Enter the amount of ticket price($) :");
        price = scanner.nextDouble();

        if (isStudent) {
            if (isSenior) {
                System.out.println("You got a senior discount of 20%");
                System.out.println("You got a student discount of 10%");
                price *= 0.7;
            } else {
                System.out.println("You got a student discount of 10%");
                price *= 0.9;
            }

        } else {
            if (isSenior) {
                System.out.println("You got a senior discout of 20%");
                price *= 0.8;
            } else {
                price *= 1;
            }

        }
        System.out.println("The price of a ticke is :" + price);
        System.out.printf("The price of your ticket is %.2f", price);

    }
}
