import java.util.Scanner;

public class quizGameProject {
    public static void main(String[] args) {

        String[] questions = { "What is the main function of a router ?",
                "Which part of the computer is consider the brain ?",
                "What year has Facebook launched ?",
                "Who is knows as the father of computer ?",
                "What was the first programming language ?" };

        String[][] options = {
                { "1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing Password" },
                { "1. CPU", "2. Hard Drive", "3. RAM", "4. GPU" },
                { "1. 2000", "2. 2004", "3. 2006", "4. 2008" },
                { "1. Steve  Jobs", "2. Bill Gates", "3. alan Turing", "4. Charles babges" },
                { "1. COBOL", "2. C", "3. Fortan", "4. Assembly" } };

        int[] answer = { 3, 1, 2, 4, 3 };
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("_______________________________");
        System.out.println("WELCOME to the JAVA Quiz GAME !");
        System.out.println("_______________________________");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your guess :");
            guess = scanner.nextInt();
            if (guess == answer[i]) {
                System.out.println("---------------");
                System.out.println("__CORRECT__");
                System.out.println("---------------");
                score++;
            } else {
                System.out.println("-------------");
                System.out.println("__WRONG__");
                System.out.println("-------------");
            }

        }
        System.out.println("Your final score is :" + score + " out of " + questions.length);
        scanner.close();

    }
}
