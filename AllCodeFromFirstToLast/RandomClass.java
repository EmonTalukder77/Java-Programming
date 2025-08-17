import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {

        Random random = new Random();

        int number1;
        int number2;
        int number3;
        double number;
        boolean isHead;


        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1, 7);
        number = random.nextDouble();//print between 0 and 1 
        isHead=random.nextBoolean();


        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number); // print between 0 and 1 
        System.out.println(isHead);

    }
}
