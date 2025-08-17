import java.util.Scanner;

public class TarnaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int time;
        
        System.out.print("Enter the number for checking even or odd:");
        number = scanner.nextInt();
        System.out.println("Enter the time o clock (between 1 to 24 :)");
        time = scanner.nextInt();

        String amOrpm = (time < 12) ? "A.M" : "P.M";

        String evenOrodd = (number % 2 == 0) ? "The number is EVEN" : "The number is ODD";

        System.out.println(evenOrodd);
        System.out.println(amOrpm);
    }
}
