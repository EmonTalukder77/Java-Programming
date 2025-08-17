import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();
        
        String cleanInput = input.replaceAll(" ", "").toLowerCase();
        
        String reversed = new StringBuilder(cleanInput).reverse().toString();
        
        if (cleanInput.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
        
        scanner.close();
    }
}