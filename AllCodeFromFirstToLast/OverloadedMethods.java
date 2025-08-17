public class OverloadedMethods {
    public static void main(String[] args) {

        String pizza = bakePizza("flat bread ", "mozzarella", "pepperonig");

        System.out.println(pizza);

    }

    static String bakePizza(String bread) {
        return bread + "pizza ";

    }

    static String bakePizza(String bread, String chese) {
        return chese + " " + bread + "pizza ";
    }

    static String bakePizza(String bread, String chese, String topping) {
        return topping + " " + chese + " " + bread + "pizza ";
    }
}
