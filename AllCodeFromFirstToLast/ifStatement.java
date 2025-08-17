import java.util.Scanner;

public class ifStatement {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double marks;
        String name ;
        boolean isStudent;

        System.out.print("Enter your Name :");
        name = scanner.nextLine();


        System.out.print("Type your exam marks out of 100 : ");
        marks = scanner.nextDouble();

        System.out.print("Are you is a Student?(True/False) :");
        isStudent=scanner.nextBoolean();

        //Group 1
        if(name.isEmpty()){
            System.out.println("Yor didn't enter your name !");
        }
        else{
            System.out.println("Hello "+name+" !!");
        }




        //Group2

        if (marks > 100 || marks < 0) {
            System.out.println("Your provided  marks are unvalid !");
        } else {
            if (marks >= 80) {
                System.out.println("You got A+ . And its excelent work");
            } else if (marks >= 70) {
                System.out.println("You got A");
            } else if (marks >= 60) {
                System.out.println("You got A- .");
            } else if (marks >= 50) {
                System.out.println("You got B .");
            } else if (marks >= 40) {
                System.out.println("You got C .");
            } else if (marks >= 33) {
                System.out.println("You got D .");
            } else if (marks < 33) {
                System.out.println("You got FAIL , You need to study hard !!");
            }
        }

        //Group 3
        if(isStudent){
            System.out.println("You are a Student");
        }else{
            System.out.println("You are a not a Student.");
        }
        scanner.close();

    }
}
