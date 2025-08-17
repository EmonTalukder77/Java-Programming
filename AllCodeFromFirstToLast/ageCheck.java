import java.util.Scanner;

public class ageCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.print("Enter your age :");
        age = scanner.nextInt();

        while (age < 0) {
            System.out.println("Your age can't be negative !!");
            System.out.print("Enter your age :");

            age = scanner.nextInt();

        }

        System.out.println("Your age is :" + age);

    }
}