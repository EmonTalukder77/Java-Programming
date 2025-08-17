import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.print("Enter your name:");
        String name = scanner.nextLine();

        System.out.print("Enter your age :");
        int age= scanner.nextInt();

        System.out.print("What is your GPA :");
        double gpa= scanner.nextDouble();

        System.out.println("Are you student or not (True / False)");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello "+ name);
        System.out.println("You are "+age+" years old.");
        System.out.println("Your GPA is :"+gpa);
        System.out.println("Student : "+isStudent);
        System.out.println(" ");
        
        if(isStudent){
            System.out.println("Your are enrolled as a student.");
        }else{
            System.out.println("You are not in enrolled as a student.");
        }
     
     // lets do task
     System.out.println("#############################");
     System.out.println("Now do this rectangle math------");
     
     double height;
     double width;
     double area;

     System.out.print("Please Enter the height : ");
     height =scanner.nextDouble();

    System.out.print("Please Enter the width :");
    width= scanner.nextDouble();
    area = height * width;

    System.out.println("The area is : "+area +" cm_squre");




    }
}
