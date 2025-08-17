import java.util.Scanner;

public class enhance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day;
        System.out.print("Enter a day :");
        day = scanner.nextLine();

        switch (day) {
            case "Monday" -> System.out.println("It is weekday!");
            case "Tuesday" -> System.out.println("It is weekday!");
            case "Wednesday" -> System.out.println("It is weekday!");
            case "Thursday" -> System.out.println("It is weekday!");
            case "Friday" -> System.out.println("It is weekday!");
            case "Saturday" -> System.out.println("It is weekend!");
            case "Sunday" -> System.out.println("It is weekend!");
            default -> System.out.println("Its not a day.");
        }
    }
}