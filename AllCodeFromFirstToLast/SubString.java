import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email :");
        email = scanner.nextLine();

        if (email.contains("@")) {

            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Your user name is " + username);
            System.out.println("Your domain name is :" + domain);

        } else {
            System.out.println("This is not a valid email.Please retype!");
        }

    }

}