import java.util.Scanner;

public class CompundInterestCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double princple;
        double rate;
        int timesCompounded;
        int year;
        double amount;

        System.out.print("Enter the Principal amount:");
        princple = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %)");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number to times compounded per year :");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years :");
        year = scanner.nextInt();

        amount = princple * Math.pow(1 + rate / timesCompounded, timesCompounded * year);

        System.out.print("The amount after " + year + " is : $" + amount);
        System.out.printf("\nThe amount after %d  years is %.2f ", year, amount);

        scanner.close();
    }
}
