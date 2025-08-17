public class Method {
    public static void main(String[] args) {

        String name = "BroCode";
        int age = 25;

        happyBirthday(name, age);
        double result = square(3);
        System.out.println(result);

        if (ageCheck(age)) {
            System.out.println("You may sign up !");
        } else {
            System.out.println("You must be 18+ to sign up ");
        }

    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you !");
        System.out.println("Happy Birthday to you " + name);
    }

    static double square(double number) {
        return number * number;

    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
