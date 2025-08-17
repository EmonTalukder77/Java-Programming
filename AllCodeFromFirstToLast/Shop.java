import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantuty;
        char currency = '$';
        double total;
        System.out.println("What item would you like to buy?");
        item = scanner.nextLine();

        System.out.println("What is the price for each ?");
        price = scanner.nextDouble();
 
        System.out.println("How many would you like ?");
        quantuty = scanner.nextInt();

        total = price * quantuty;
        System.out.println("\nYou have bought " + quantuty + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

    }

}
