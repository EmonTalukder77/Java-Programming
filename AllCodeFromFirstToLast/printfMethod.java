public class printfMethod {
    public static void main(String[] args) {
        double price1 = 9.99;
        double price2 = 100.21;
        double price3 = -211.02;

        System.out.printf("%.4f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.1f\n", price3);

        System.out.printf("%+.1f\n", price1);
        System.out.printf("%,.1f\n", price1);

    }

}
